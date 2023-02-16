import java.io.*;
public class demo6 {
	// BufferedWriter
	   
	/*
	 	We can use BufferedWriter to write character data to a file.
	 	
	 	CONSTRUCTOR:-
	 	-----------
	 	1. BufferedWriter bw = new BufferedWriter(Writer w);
	 	2. BufferedWriter bw = new BufferedWriter(Writer w, int bufferSize);
	 	
NOTE:- BufferedWriter can't communicate with the file directly, it communicates via some
	   filewriter object.
	   
	   METHODS:-
	   -------
	   1. write(int ch)
	   2. write(char[] ch)
	   3. write(String s)
	   4. flush()
	   5. close()
	   6. newLine() - to insert a new line
	  
	 */

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("xyz.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("satyarth");
		bw.newLine();
		char[]c= {'a','b','c'};
		bw.write(c);
		bw.flush();
		bw.close();
		

	}

}
