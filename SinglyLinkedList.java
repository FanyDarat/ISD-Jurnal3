import java.util.*;

public class SinglyLinkedList<E> {
    private ListNode<E> head;
    private ListNode<E> tail;

    public SinglyLinkedList() {
        head = tail = null;
        ListNode<E> iterator = head;
    }

    public void inserAtFront(E insertItem) {
        ListNode newNode = new ListNode<E>(insertItem);

        if (isEmpty()) {

            head = tail = new ListNode<E>(insertItem);
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void inserAtBack(E insertItem) {

        ListNode newNode = new ListNode<E>(insertItem);

        if (isEmpty()) {

            head = tail = new ListNode<E>(insertItem);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty list");
        }
        E removedItem = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            ListNode<E> iterator = head;
            while (iterator.next != tail) {
                iterator = iterator.next;
            }
            tail = iterator;
            iterator.next = null;
        }
        return removedItem;
    }

    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty List");
        }

        E removedItem = head.data;

        head = head.next;

        return removedItem;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty List");
        }

        System.out.print("Berikut List Buku \n");
        ListNode<E> iterator = head;
        while (iterator != null) {
            System.out.printf("%s ", iterator.data);
            iterator = iterator.next;
        }
        System.out.println();
    }
}
