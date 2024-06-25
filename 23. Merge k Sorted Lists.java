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
     public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        // PriorityQueue is a sorted queue
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {
                if (a.val > b.val)
                    return 1;
                else if (a.val == b.val)
                    return 0;
                else
                    return -1;
            }
        });

        // Add first node of each list to the queue
        for (ListNode list : lists) {
            if (list != null) {
                q.add(list);
            }
        }

        ListNode head = new ListNode(0);
        ListNode p = head; // Serve as a pointer/cursor

        while (!q.isEmpty()) {
            ListNode temp = q.poll(); // poll() retrieves and removes the head of the queue - q.
            p.next = temp;

            // Keep adding next element of each list
            if (temp.next != null) {
                q.add(temp.next);
            }

            p = p.next;
        }

        return head.next;
    }
}
