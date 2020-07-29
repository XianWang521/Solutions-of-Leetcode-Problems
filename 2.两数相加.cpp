/*
 * @lc app=leetcode.cn id=2 lang=cpp
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        struct ListNode *node=new struct ListNode(0);
        struct ListNode *p=l1,*q=l2,*root=node;
        int result=0,carry=0;
        while(p!=NULL||q!=NULL)
        {
            int x=(p==NULL)?0:p->val;
            int y=(q==NULL)?0:q->val;
            result=x+y+carry;
            carry=result/10;

            node->next=new struct ListNode(result%10);
            node=node->next;
            if(p!=NULL) p=p->next;
            if(q!=NULL) q=q->next;
            result=0;
        }
        if(carry>0) node->next=new struct ListNode(carry);
        return root->next;
    }
};
// @lc code=end

