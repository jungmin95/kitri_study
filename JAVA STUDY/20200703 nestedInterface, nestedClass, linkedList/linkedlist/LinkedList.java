package linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	int size = 0;

	class Node {
		Node(String data) {
			this.data = data;
		}

		String data;
		Node backNode;
	}

	void add(String input) {
		Node newNode = new Node(input);
		if (size == 0) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.backNode = newNode;
			tail = newNode;
			size++;
		}
	}

	// 출력
	void print() {
		Node printNode = head;

		if (size > 0) {
			System.out.println(printNode);

			while (printNode.backNode != null) {
					printNode = printNode.backNode;
					System.out.println(printNode.data);
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}

//		printNode = printNode.backNode;
//		System.out.println(printNode.data);
//
//		printNode = printNode.backNode;
//		System.out.println(printNode.data);

	}

	// 추출
	String pop() {
		String result = tail.data;
		tail.data = null;
		
		tail = head;
		while(tail.backNode.data != null) {
			tail = tail.backNode;
		}
		tail.backNode = null;
				
		return result;
	}

}
