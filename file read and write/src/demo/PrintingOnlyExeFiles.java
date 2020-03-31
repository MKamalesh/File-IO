package demo;

import java.io.File;

public class PrintingOnlyExeFiles {
public static void main(String[] args) {
	File file=new File("C:\\Users\\Jayaraman\\Desktop");
	File[] list=file.listFiles();
	for(File f:list)
	{
		if(f.isFile())
		{
		String fname=f.getName();
		int i=fname.lastIndexOf(".");
		String s=fname.substring(i+1);
		if(s.equals("exe"))               //why exe?-In my desktop,there is no txt files existed.so that only i have given "exe"
		{
			//In S.O.P,we are printing file name that as ".exe" extension  
			//and also we are printing the size of each file using "f.length()" method
			System.out.println(fname+" size: "+f.length());
		}
		}
	}
}
}
