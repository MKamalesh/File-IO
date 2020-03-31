package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {
public static void main(String[] args) {
	File file=new File("C:\\Users\\Jayaraman\\Desktop\\new.txt");
	try {
		file.createNewFile();
		FileWriter write=new FileWriter(file);
		write.write(99);
		write.write("this is kamalesh!!!");
		write.flush();
		write.close();
		FileReader read=new FileReader(file);
		int output=read.read();
		while(output!=-1)
		{
			System.out.print((char)output);
			output=read.read();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
