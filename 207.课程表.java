import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 */

// @lc code=start
// DFS to find loop in the graph
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>> edges = new ArrayList<>();
        int[] flag = new int[numCourses];

        for(int i = 0; i < numCourses; i++)
            edges.add(new ArrayList<Integer>());

        for(int[] temp : prerequisites)
            edges.get(temp[1]).add(temp[0]);

        for(int i = 0; i < numCourses; i++)
            if(!dfs(edges, i, flag)) return false;
        return true;        
    }

    private boolean dfs(List<List<Integer>> edges, int cur, int[] flag){
        if(flag[cur] == 1) return false;
        else if(flag[cur] == -1) return true;
        flag[cur] = 1;
        for(int i : edges.get(cur))
            if(!dfs(edges, i, flag)) return false;
        flag[cur] = -1;
        return true;
    }
}

// BFS to find loop in the graph
/*
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>();
        int[] degrees = new int[numCourses];
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 0; i < numCourses; i++)
            edges.add(new ArrayList<Integer>());
        
        // Get in degree of nodes
        for(int[] temp : prerequisites){
            degrees[temp[0]]++;
            edges.get(temp[1]).add(temp[0]);
        }
        
        for(int i = 0; i < numCourses; i++)
            if(degrees[i] == 0) q.add(i);
        
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i : edges.get(temp)){
                degrees[i]--;
                if(degrees[i] == 0) q.add(i);
            }
            numCourses--;
        }
        return numCourses == 0;
    }
}
*/
// @lc code=end

