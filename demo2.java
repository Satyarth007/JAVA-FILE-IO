import java.io.*;
public class demo2 {

	public static void main(String[] args) {
		// java io can be used to create directories also
		File f=new File("satya");
		System.out.println(f.exists());
		f.mkdir();  // to create the directory
		System.out.println(f.exists());
	}

}
