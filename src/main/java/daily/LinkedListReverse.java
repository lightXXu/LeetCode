package daily;

public class LinkedListReverse {
	static class Node{
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node reverseByLoop(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public static Node reverseByLoop2(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node curr = reverseByLoop2(head.next);
		head.next.next = head;
		head.next = null;
		return curr;
	}

	public static void main(String[] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);

		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		Node reverseNode = reverseByLoop(node1);
		System.out.println(1);

	}
}
