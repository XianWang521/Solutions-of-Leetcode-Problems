import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=355 lang=java
 *
 * [355] 设计推特
 */

// @lc code=start
class Twitter {
    class Post{
        int userid;
        int tweetid;
        public Post(int userid, int tweetid){
            this.userid = userid;
            this.tweetid = tweetid;
        }
    }

    List<Post> allposts;
    HashMap<Integer, Set<Integer>> follow;
    public Twitter() {
        allposts = new ArrayList<>();
        follow = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        follow(userId, userId);
        allposts.add(0, new Post(userId, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> cur = follow.get(userId) ;
        List<Integer> res = new ArrayList<>();
   
        for(Post post: allposts){
            if(cur.contains(post.userid))
                res.add(post.tweetid);
            if(res.size() == 10)
                break;
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        Set<Integer> cur = follow.getOrDefault(followerId, new HashSet<>());
        cur.add(followeeId);
        follow.put(followerId, cur);
    }
    
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> cur = follow.getOrDefault(followerId, new HashSet<>());
        cur.remove(followeeId);
        follow.put(followerId, cur);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
// @lc code=end

