/** Performs some basic linked list tests. */
public class LinkedListDequeTest {

	/* Utility method for printing out empty checks. */
	public static boolean checkEmpty(boolean expected, boolean actual) {
		if (expected != actual) {
			System.out.println("isEmpty() returned " + actual + ", but expected: " + expected);
			return false;
		}
		return true;
	}

	/* Utility method for printing out empty checks. */
	public static boolean checkSize(int expected, int actual) {
		if (expected != actual) {
			System.out.println("size() returned " + actual + ", but expected: " + expected);
			return false;
		}
		return true;
	}

	/* Prints a nice message based on whether a test passed.
	 * The \n means newline. */
	public static void printTestStatus(boolean passed) {
		if (passed) {
			System.out.println("Test passed!\n");
		} else {
			System.out.println("Test failed!\n");
		}
	}

	/** Adds a few things to the list, checking isEmpty() and size() are correct,
	  * finally printing the results. 
	  *
	  * && is the "and" operation. */
	public static void addIsEmptySizeTest() {
		System.out.println("Running add/isEmpty/Size test.");

		LinkedListDeque<String> lld1 = new LinkedListDeque<String>();

		boolean passed = checkEmpty(true, lld1.isEmpty());

		lld1.addFirst("front");
		
		// The && operator is the same as "and" in Python.
		// It's a binary operator that returns true if both arguments true, and false otherwise.
		passed = checkSize(1, lld1.size()) && passed;
		passed = checkEmpty(false, lld1.isEmpty()) && passed;

		lld1.addLast("middle");
		passed = checkSize(2, lld1.size()) && passed;

		lld1.addLast("back");
		passed = checkSize(3, lld1.size()) && passed;

		System.out.println("Printing out deque: ");
		lld1.printDeque();

		printTestStatus(passed);

	}

	/** Adds an item, then removes an item, and ensures that dll is empty afterwards. */
	public static void addRemoveTest() {

		System.out.println("Running add/remove test.");

		System.out.println("Make sure to uncomment the lines below (and delete this print statement).");

		LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();
		// should be empty 
		boolean passed = checkEmpty(true, lld1.isEmpty());

		lld1.addFirst(10);
		// should not be empty
		passed = checkEmpty(false, lld1.isEmpty()) && passed;

		//lld1.removeFirst();
		// should be empty 
		passed = checkEmpty(true, lld1.isEmpty()) && passed;

		printTestStatus(passed);

	}

	public static void MyLinkedListTest(){
		LinkedListDeque<String> exampleLL = new LinkedListDeque<>();
		boolean passed = checkEmpty(true,exampleLL.isEmpty());
		exampleLL.removeFirst();
		exampleLL.removeLast();
		passed = (exampleLL.size()== 0) && passed;
		exampleLL.addFirst("Right");
		exampleLL.addLast("foot");
		exampleLL.addLast("up");
		exampleLL.addLast("left");
		exampleLL.addLast("foot");
		exampleLL.addLast("slide");
		exampleLL.printDeque();
		passed = (exampleLL.size() == 6) && passed;
		passed = (exampleLL.get(3) == "not") && passed;
		exampleLL.removeFirst();
		exampleLL.removeFirst();
		exampleLL.addFirst("West");
		exampleLL.addFirst("Kanye");
		exampleLL.removeLast();
		exampleLL.removeLast();
		exampleLL.addLast("GOATED.");
		exampleLL.printDeque();
		passed = (exampleLL.size() == 5) && passed;
		passed = (exampleLL.getRecursive(2) =="is") && passed;
		exampleLL = new LinkedListDeque<String>();
		exampleLL.addLast("Cheese");
		exampleLL.removeFirst();
		passed = checkEmpty(true, exampleLL.isEmpty());
		printTestStatus(passed);

	}

	public static void ArrayTest1(){
		ArrayDeque<String> exampleArray = new ArrayDeque<> ();
		boolean passed = exampleArray.isEmpty() == true;
		exampleArray.addLast("a");
		exampleArray.addLast("b");
		exampleArray.addFirst("c");
		passed = (exampleArray.size() == 3) && passed;
		exampleArray.addLast("d");
		exampleArray.addLast("e");
		exampleArray.addFirst("f");
		exampleArray.addFirst("g");
		exampleArray.addLast("h");
		exampleArray.printDeque();
		//passed = (exampleArray.get(1) == "e") && passed;
		exampleArray.addLast("i");
		exampleArray.removeLast();
		exampleArray.removeLast();
		exampleArray.removeFirst();
		exampleArray.removeLast();
		passed = (exampleArray.size() == 4) && passed;
		exampleArray.printDeque();
		printTestStatus(passed);
	}


	//public static void MyArrayTest(){
	// ArrayDeque<String> exampleA = new ArrayDeque<~>();
	// boolean passed = exampleA.isEmpty() == true;
	//
	// }

	public static void main(String[] args) {
		System.out.println("Running tests.\n");
		//addIsEmptySizeTest();
		//addRemoveTest();
		//MyLinkedListTest();
		ArrayTest1();
	}
} 