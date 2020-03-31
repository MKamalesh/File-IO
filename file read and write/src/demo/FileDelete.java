package demo;

import java.io.File;

public class FileDelete {
public static void main(String[] args) {
	File f=new File("C:\\Users\\Jayaraman\\Desktop\\java\\run.txt");
	boolean ans=f.exists();
	System.out.println(ans);
	if(ans==true)
	{
		f.delete();
		boolean what=f.exists();
		System.out.println(what);
	}
}
}
