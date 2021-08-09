import java.util.*;

public class BookList {
	//Mang danh sach chua cac sach trong thu vien
	ArrayList<Book> myBooks = new ArrayList<>();
	
	//Phuong thuc them sach vao thu vien
	public void add() {
		System.out.println("Enter information for the new book:");
		Scanner in = new Scanner(System.in);
		
		//Phan nhap ID
		System.out.print("ID: ");
		String id = in.nextLine();
		
		//Phan nhap tieu de
		System.out.print("Title: ");
		String title = in.nextLine();
		
		//Phan nhap tac gia
		System.out.print("Author: ");
		String author = in.nextLine();
		
		//Phan chon trang thai muon sach
		System.out.print("Is borrowed (1 = yes, 0 = no): ");
		int choice = in.nextInt();
		Boolean isBorrowed = false;
		switch (choice) {
		case 1:
			isBorrowed = true;
			break;
		case 0:
			isBorrowed = false;
			break;
		}
		
		//Goi phuong thuc them sach vao danh sach
		addToList(id.toUpperCase(), title, author, isBorrowed);
		System.out.println("A new book has been added.");
	}
	
	//Phuong thuc them sach vao danh sach
	public void addToList(String id, String title, String author, Boolean isBorrowed) {
		Book book = new Book(id.toUpperCase(), title, author, isBorrowed);
		myBooks.add(book);
	}
	
	//Phuong thuc tim sach theo ten
	public void search() {
		System.out.println("Enter book title to search.");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Book title: ");
		
		String searchKey = in.nextLine();
		
		//Mang chua danh sach cac sach tim duoc
		ArrayList<Book> booksFound = new ArrayList<>();
		/* Duyet qua tat ca cac sach, tim kiem tu khoa trong tieu de
		Neu co thi them sach do vao mang Sach tim kiem duoc */
		for (Book book : myBooks) {
			if (book.getTitle().toUpperCase().contains(searchKey.toUpperCase())) {
				booksFound.add(book);
			}
		}
		
		//Hien thi sach tim duoc
		if (booksFound.isEmpty()) {
			System.out.println("No book is found.");
		} else {
			System.out.println(String.format("%-10s%-20s%-20s%-20b", "ID", "Title", "Author", "Is borrowed"));
			for (Book book : booksFound) {
				System.out.println(book.toString());
			}
		}
	}
	
	//Phuong thuc hien thi tat ca cac sach trong thu vien
	public void display() {
		System.out.println(String.format("%-10s%-20s%-20s%-20b", "ID", "Title", "Author", "Is borrowed"));
		for (Book book : myBooks) {
			System.out.println(book.toString());
		}
	}
	
	//Phuong thuc muon sach
	public void borrow() {
		System.out.println("Enter book ID to search.");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Book ID: ");
		
		String searchKey = in.nextLine();
		
		ArrayList<Book> booksFound = new ArrayList<>();
		
		for (Book book : myBooks) {
			if (book.getId().equalsIgnoreCase(searchKey)) {
				booksFound.add(book);
				if (book.getBorrowed()) {
					System.out.println("You can't borrow this book. The book has been borrowed.");
					return;
				} else {
					book.setBorrowed(true);//Thiet lap trang thai true cho sach duoc muon nay
					System.out.println("You have successfully borrow the book: " + book.getTitle());
					return;
				}
			}
		}
		//Neu sach khong tim thay
		if (booksFound.isEmpty()) {
			System.out.println("No book is found.");
		}
	}
	
	//Phuong thuc thoat chuong trinh
	public void exit() {
		System.exit(0);
	}
}
