/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode node = new ListNode();
        ListNode merged = node;
        
        
        if(l1 == null && l2 == null){
            return null;
        }
        
        if(l1 == null || l2 == null){
            if(l1 == null){
                return l2;
            } else {
                return l1;
            }
        }
        
        while(l1 != null && l2 != null){
            
            if (l1.val == l2.val){
                node.next = new ListNode(l1.val);
                node = node.next;
                node.next = new ListNode(l2.val);
                node = node.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1.val < l2.val){
                node.next = new ListNode(l1.val);
                node = node.next;
                l1 = l1.next;
            }
            else if(l2.val < l1.val){
                node.next = new ListNode(l2.val);
                node = node.next;
                l2 = l2.next;
            }
            
        }
        
        while(l1 != null){
                node.next = new ListNode(l1.val);
                node = node.next;
                l1 = l1.next;
        }
        while(l2 != null){
                node.next = new ListNode(l2.val);
                node = node.next;
                l2 = l2.next;
        }
        
        return merged.next;
    }
}