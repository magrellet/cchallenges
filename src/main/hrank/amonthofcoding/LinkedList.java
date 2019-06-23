package hrank.amonthofcoding;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        } else if (head.next == null){
            head.next = new Node(data);
        }else{
             insert(head.next, data);
        }
        return head;

    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {

        Node head = null;
        int N = 4;
        int[] sc = {2, 3, 4, 1};
        int i = 0;
        while (N-- > 0) {
            int ele = sc[i];
            head = insert(head, ele);
            i++;
        }
        display(head);
    }

}
