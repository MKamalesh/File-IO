package demo;

import java.io.File;
import java.io.IOException;

public class ListingFiles {
public static void main(String[] args) {
	File f=new File("C:\\Users\\Jayaraman\\Desktop");
	String s[]=f.list();                  //this method prints  files 
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	System.out.println("-----------------------------------------------------");
 File[] filelist=f.listFiles();          //this method prints files and folders with their locations
 for(File f1:filelist)
 {
	 System.out.println(f1);
 }
 System.out.println("----------------------------------------------------------");
 for(File f1:filelist)                
 {
	 if(f1.isFile()) {                //isfile()-this method prints only files that as extensions
	 System.out.println(f1);
	 }
 }
 System.out.println("--------------------------------------------------------------");
 for(File f1:filelist)
 {
	 if(f1.isDirectory())             //isDirectory()-this method prints only folders
	 {
	 System.out.println(f1);
	 }
 }
}	
}
