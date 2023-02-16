import java.io.*;
public class demo7 {
// BufferedReader
	/*
	 We can use BufferedReader to read character data from the file , the main advantages of 
	 BufferedReader whe compared with FileReader is , we can read data line by line besides
	 character by character.
	 
	 CONSTRUCTOR:-
	 -----------
	 1. BufferedReader br = new BufferedReader(Reader r);
	 2. BufferedReader br = new BufferedReader(Reader r, int buffSize);
	 
NOTE:- BufferedReader can't communicate directly to the file , but it can communication via
 	   FileReader.
 	   
 	   METHODS:-
 	   -------
 	   1. int read()
 	   2. int read(char ch[])
 	   3. void close()
 	   4. String readLine();
 	   
 	   - If the next line not available then it returns null.
 	   
	 
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("satyarth.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();

	}

}
