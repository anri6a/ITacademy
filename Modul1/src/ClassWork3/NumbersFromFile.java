package ClassWork3;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromFile implements Serializable {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new FileReader("d:/temp/classwork.txt"))) {
			String res = in.readLine();
			String newRes=res;
			while (res != null) {
				System.out.println(res);
				res = in.readLine();
				
				Pattern pat=Pattern.compile("[-]?[0-9]+(.[0-9]+)?"); //
				Matcher matcher=pat.matcher(newRes);
				while (matcher.find()){
					System.out.printf("%s ",matcher.group());
					String writeNum=matcher.group();
					FileOutputStream fos=new FileOutputStream("d:/temp/classwork.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeChars(writeNum);
					oos.close();
				}
			}
			
		
		} /*catch (IOException e) {
			System.out.println("IOException");
		}
	*/
			}
}
