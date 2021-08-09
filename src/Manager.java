import java.util.*;
public class Manager {
	public static void main(String args[]) {
		BookList bookList = new BookList();
		
		System.out.println("Welcome to the online book library.");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		
		while (true) {
			System.out.println("1. Enter a new book \n"
					 		 + "2. Search a book by book title \n"
					 		 + "3. Display books \n"
					 		 + "4. Borrow a book by book ID \n"
					 		 + "5. Exit");
			System.out.print("Your choice: ");
			int choice = in.nextInt();
			
			switch (choice) {
			case 1:
				bookList.add();
				break;
			case 2:
				bookList.search();
				break;
			case 3:
				bookList.display();
				break;
			case 4:
				bookList.borrow();
				break;
			case 5:
				bookList.exit();
				break;
			default:
				System.out.println("Please choose from 1 to 5.");
			}
		}
	}
}
