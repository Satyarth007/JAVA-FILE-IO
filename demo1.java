import java.io.*;
public class demo1 {

	public static void main(String[] args) throws Exception{
		// java file io can be used to create the files
		File f=new File("satyarth.txt");
		System.out.println(f.exists());
		f.createNewFile(); // to make the file
		System.out.println(f.exists());

	}

}
