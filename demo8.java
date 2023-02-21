import java.io.*;
public class demo8 {
	// PrintWriter
	/*
	  	It is the most enhanced writer to write character data to the file , 
	  	the main advantage of PrintWriter over FileWriter and BufferedWritter is that 
	  	we can write any type of data to the file.
	  	
	  	CONSTRUCTRS:-
	  	-----------
	  	1. PrintWriter pw = new PrintWriter(String s);
	  	2. PrintWriter pw = new PrintWriter(File f);
	  	3. PrintWriter pw = new PrintWriter(Writer w);
	  	
	  	METHODS:-
	  	-------
	  	1. write(int ch)
	  	2. write(char[] ch)
	  	3. write(String s)
	  	4. flush()
	  	5. close()
	  	6. <a> print(char ch)     <b> println(char ch)
	  	7. <a> print(int i)		  <b> println(int i)
	  	8. <a> print(boolean b)   <b> printl(boolean b)
	  	9. <a> print(String s)    <b> println(String s)
	  	
	 */

	public static void main(String[] args)throws IOException {
		FileWriter fw = new FileWriter("pqr.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println("SATYARTH - JAVA DEVELOPER");
		pw.flush();
		pw.close();
		
		// output in the text file as:- 
		//d100
		//true
		//SATYARTH - JAVA DEVELOPER

	}

}
