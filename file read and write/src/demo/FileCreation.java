package demo;

import java.io.File;
import java.io.IOException;

public class FileCreation {
public static void main(String[] args) {
	File f=new File("C:\\Users\\Jayaraman\\Desktop\\java\\run.txt");
	File crt=new File("C:\\Users\\Jayaraman\\Desktop\\java\\running.txt");
	boolean b=f.exists();
	System.out.println(b);
	boolean c=crt.exists();
	System.out.println(c);
	if(b==false)
	{
		try {
			boolean created=f.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(c==false)
	{
		try {
			boolean crte=crt.createNewFile();
			System.out.println("file created"+crte);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
