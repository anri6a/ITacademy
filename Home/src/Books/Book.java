package Books;

public class Book {
	private int id;
	private String name;
	private String author;
	private String pubHouse;
	private int pubYear;
	private int pages;
	private int price;
	private String binding;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubHouse() {
		return pubHouse;
	}

	public void setPubHouse(String pubHouse) {
		this.pubHouse = pubHouse;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {

		return "[" + author + " - " + name + ", " + pubYear + ", " + binding + " переплет" + ", " + pubHouse + "]";
	}

}

