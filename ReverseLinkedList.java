class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReverseLinkedList {
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev;             
            prev = current;                  
            current = nextNode;            
        }
        
        return prev; 
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversed = solution.reverseListIterative(head);

        
        while (reversed != null) {
            System.out.print(reversed.val + " -> ");
            reversed = reversed.next;
        }
        System.out.println("null");
    }
}
