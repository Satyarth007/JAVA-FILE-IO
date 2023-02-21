// content of file1 and file2 into file3 
import java.io.*;
public class mergeFilesIntoNewFile {

	public static void main(String[] args)throws IOException {
		PrintWriter out = new PrintWriter("file3.txt");
		
		// copying content of file1
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line=br.readLine();
		while(line!=null) {
			out.println(line);
			line=br.readLine();
		}
		
		//copying content of file2
		br = new BufferedReader(new FileReader("file2.txt"));
		line=br.readLine();
		while(line!=null) {
			out.println(line);
			line=br.readLine();
		}
		out.flush();
		br.close();
		out.close();
		

	}

}
