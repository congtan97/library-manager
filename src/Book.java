
public class Book {
	private String id;
	private String title;
	private String author;
	private Boolean isBorrowed;
	
	/*
	 * Ham khoi tao Book co cac tham so ben trong (id, tieu de, tac gia, trang thai muon)
	 */
	public Book(String id, String title, String author, Boolean isBorrowed) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}
	
	//Phuong thuc lay ID sach
	public String getId() {
		return id;
	}
	
	//Phuong thuc gan ID sach
	public void setId(String id) {
		this.id = id;
	}
	
	//Phuong thuc lay tieu de sach
	public String getTitle() {
		return title;
	}
	
	//Phuong thuc gan tieu de sach
	public void setTitle(String title) {
		this.title = title;
	}
	
	//Phuong thuc lay tac gia sach
	public String getAuthor() {
		return author;
	}
	
	//Phuong thuc gan tac gia sach
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//Phuong thuc lay trang thai muon sach (true/false)
	public Boolean getBorrowed() {
		return isBorrowed;
	}
	
	//Phuong thuc gan trang thai muon sach
	public void setBorrowed(Boolean b) {
		this.isBorrowed = b;
	}
	
	//Ghi de phuong thuc toString de hien thi thong tin sach
	@Override
	public String toString() {
		return String.format("%-10s%-20s%-20s%-20b", id, title, author, isBorrowed);
	}
}
