package h2;

public class SimpleList {

	// Attribute:

	Node head = new Node(0);

	// Konstruktoren:

	public SimpleList(Node head) {

		this.head = head;
	}

	// Methoden:

	public Node getFirst() {

		if (head.next == null) {

			return null;
		} else {
			return head.next;
		}
	}

	public Node getLast() {

		if (head.next == null) {

			return null;
		}

		Node temp = head.next;

		while (temp.next != null) {

			temp = temp.next;
		}
		return temp;
	}

	public void append(int newValue) {

		Node newNode = new Node(newValue);

		if (head.next == null) {
			head.next = newNode;
			
		}
		else {
			Node current = head.next;
			
			while (current.next != null) {
				
				current = current.next;
			}
			current.next = newNode;
		}
		
	}

	public Node findFirst(int value) {

		Node Vergleich = head.next;

		while (Vergleich != null) {

			if (Vergleich.value == value) {
				return Vergleich;
			}
			Vergleich = Vergleich.next;
		}
		return null;
	}

	public boolean insertAfter(int preValue, int newValue) {

		Node finden = findFirst(preValue);

		if (finden == null) {
			return false;
			
		} 
		else {
			Node neu = new Node(newValue);
			neu.next = finden.next;
			finden.next = neu;
			return true;
		}
	}

	public boolean delete(int value) {

		Node start = head;
		Node current = head.next;

		while (current != null) {

			if (current.value == value) {
				
				start.next = current.next;
				return true;
			}
			start = current;
			current = current.next;
		}
		return false;
	}
}
