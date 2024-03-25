package com.jai;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int delete(int index) {
        if(index == 0) {
            deleteF();
        }
        if(index == size-1) {
            deleteL();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public int deleteL() {
        if(size <= 1) {
            return deleteF();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteF() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertF(val);
            return;
        }
        if(index == size) {
            insertL(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertL(int val) {
        if(tail == null) {
            insertF(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertF(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        // if node is empty
        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}
