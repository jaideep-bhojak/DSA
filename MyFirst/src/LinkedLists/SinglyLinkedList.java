package LinkedLists;

import Conditional.WhileLoop;

import java.util.LinkedList;

public class SinglyLinkedList {

    //Uses:
    //implementing stack/queues
    //GPS navigations
    //music playlist

    //Disadvantages:
    //Greater memory usage
    //No random access of the elements [no index[i]]
    //Accessing/searching the elements is more time-consuming.

    //Pros:
    //Dynamic data structure
    //Insertion/deletion of nodes is easy. O(1)
    //No/low memory waste.


    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode headNode){
        ListNode current = headNode;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteFirstNode(){
        ListNode temp = head;
        head = temp.next;
        temp.next = null;
        //display();
    }

    public void deleteLastNode(){
        ListNode current = head;
        while (current.next!=null){
            ListNode temp = current.next;
            if(temp.next == null){
              current.next = null;
              break;
            }
            current = current.next;
        }
        //display();
    }

    public void deleteNodeAt(int position){
        ListNode current = head;
        ListNode previous = null;
        int count = 1;
        while (count < position){
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = current.next;
        //display();
    }

    public ListNode reverseLinkedList(){
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        sll.display(sll.head);
//        sll.deleteFirstNode();
//        sll.deleteLastNode();
//        sll.deleteNodeAt(3);
//        LinkedList<String> linkedList = new LinkedList<>();
//        sll.display(sll.reverseLinkedList());     

    }
}
