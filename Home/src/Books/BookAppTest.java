package Books;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookAppTest {

	public static void main(String[] args) throws FileNotFoundException {
		List<Book> books = new ArrayList<Book>();
		try (Scanner newLineScann = new Scanner(new File("d:/labs/ItAcademy/files/books.txt"))) {
			while (newLineScann.hasNextLine()) {
				books.add(createBook(newLineScann.nextLine()));
			}
		}

		Menu result = new Menu();
		String resCh = result.Choice();
		System.out.println("Книги соответствующие вашему выбору: ");

		for (Book book : books) {
			if (resCh.equals(book.getAuthor())) {
				System.out.println(book);
			}
			if (resCh.equals(book.getPubHouse())) {
				System.out.println(book);
			}
			/*if (Menu.yearMenu < book.getPubYear()) {
				System.out.println(book);
			}*/
		}

	}

	private static Book createBook(String nextLine) {
		Book book = new Book();
		String[] fieldsArr = nextLine.split(",");
		if (fieldsArr != null) {
			book.setId(Integer.valueOf(fieldsArr[0]));
			book.setName(fieldsArr[1]);
			book.setAuthor(fieldsArr[2]);
			book.setPubHouse(fieldsArr[3]);
			book.setPubYear(Integer.valueOf(fieldsArr[4]));
			book.setPages(Integer.valueOf(fieldsArr[5]));
			book.setPrice(Integer.valueOf(fieldsArr[6]));
			book.setBinding(fieldsArr[7]);
		}
		//System.out.println(book);
		return book;

	}

}
