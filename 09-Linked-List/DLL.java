
public class DLL {
    private Node head;

    public void insertFirst(int val) {      // insert  node at first
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val) {           // insert node at last without tail
        Node node = new Node(val);

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        node.prev = last;
        last.next = node;

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    private class Node { // creating node
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
}
