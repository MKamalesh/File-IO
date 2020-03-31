package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingCharArray {
public static void main(String[] args) {
	File file=new File("C:\\Users\\Jayaraman\\Desktop\\new.txt");
	try {
		FileWriter write=new FileWriter(file);
		write.write(99);
		write.write("this is kamalesh!!!");
		write.flush();
		write.close();
		FileReader read=new FileReader(file);
		char c[]=new char[(int) file.length()];
		System.out.println(c.length);
		read.read(c);
		for(char c1:c)
		{
			System.out.print(c1);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
