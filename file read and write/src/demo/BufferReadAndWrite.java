package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReadAndWrite {
public static void main(String[] args) {
	File file=new File("C:\\Users\\Jayaraman\\Desktop\\java\\running.txt");
	try {
		FileWriter write=new FileWriter(file,true);
		BufferedWriter bwrite=new BufferedWriter(write);
		bwrite.write("vaazhga");
		bwrite.newLine();
		bwrite.write("tamizh");
		bwrite.flush();
		bwrite.close();
		FileReader read=new FileReader(file);
		BufferedReader bread=new BufferedReader(read);
		String s=bread.readLine();
		int linesCount=0;
		int sentenceCount=0;
		while(s!=null)
		{
			String sentence[]=s.split("[.]");
			sentenceCount=sentenceCount+sentence.length;
			System.out.println(s);
			s=bread.readLine();
			linesCount++;
		}
		System.out.println("no. of lines:"+linesCount);
		System.out.println("no.of.sentences:"+sentenceCount);
		/*if i write somewhat manually in the file and then if i run this prgm,the prgm does not changes
		so that the output is also same 
		In order to take that also into the concern we have to add append(i.e) boolean value in file writer constructor.
		*/
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
