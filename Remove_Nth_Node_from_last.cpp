/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* start = head;
        int x = 0;
        while(start!=NULL)
        {
            x++;
            start = start->next;
        }
        int y = x-n;
        if(y<0)
            return head;
        if(y==0)
            return head->next;
        x = 1;
        start = head;
        while(y!=x)
        {
            x++;
            start = start->next;
        }
        start->next = start->next->next;
        return head;
    }
};
