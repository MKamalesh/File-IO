package demo;

import java.io.File;
import java.io.IOException;

public class PrintingFileName {
public static void main(String[] args) {
	File f=new File("C:\\Users\\Jayaraman\\Desktop\\java\\bye.txt");
	File rename=new File("C:\\Users\\Jayaraman\\Desktop\\java\\tata.txt");
	try {
		f.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	boolean changed=f.renameTo(rename);
	System.out.println(changed);
	String s=f.getName();
	System.out.println("file name is "+s);
	System.out.println(f.canExecute());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
}
}
