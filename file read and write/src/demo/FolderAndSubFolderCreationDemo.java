package demo;
import java.io.File;

public class FolderAndSubFolderCreationDemo {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Jayaraman\\Desktop\\java");
		File f=new File("C:\\Users\\Jayaraman\\Desktop\\new\\string\\array");
		boolean present=file.exists();
		System.out.println(present);
		boolean yes=f.exists();
		System.out.println(yes);
		if(present==false)
		{
			file.mkdir();
		}
		if(yes==false)
		{
			f.mkdirs();
		}
	    present=file.exists();
		System.out.println(present);
		yes=f.exists();
		System.out.println(yes);
		
	}

}
