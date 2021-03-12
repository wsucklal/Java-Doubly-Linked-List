package Warren_Lab05;
import java.util.Scanner;


public class Warren_Lab05 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		DoublyLinkedList<String> elements = new DoublyLinkedList<>();

		elements.addFirst("1");
		elements.addFirst("2");
		elements.addFirst("3");
		elements.addFirst("4");
		elements.addFirst("5");
		elements.addFirst("Apple");
		elements.addFirst("Banana");
		elements.addFirst("Pear");
		elements.addFirst("Orange");
		elements.addFirst("Strawberry");
		
		System.out.println("What would you like to search for?" + elements.getLength());
	}
	
	


}
