package ru.liga.ppr.exam.task_5_reverse;

public class Task5 {

    public static Node<String> reverse(
            Node<String> head) {
        Node<String> temp = null;
        Node<String> current = head;

        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            head = current;
            current = temp;
        }
        return head;
    }

}
