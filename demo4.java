import java.io.*;
public class demo4 {
	// FileWriter Class 
	/*
	 * We can use FileWriter to write character data to a file.
	 
	   CONSTRUCTORS:-
	   ------------
	  1. FileWriter fw = new FileWriter(String fname);
	  2. FileWriter fw = new FileWriter(File f);
	  3. FileWriter fw = new FileWriter(String fname, boolean append);
	  4. FileWriter fw = new FileWriter(File f, boolean append);
	  
NOTE:- constructor 1 and 2 are used to override the data each time , 
	   while constructor 3 and 4 will append the the data if set TRUE.	 
	   METHODS:
	   -------
	   1. write(char c)
	   2. write(char[] c)
	   3. write(string s)
	   4. flush()- to save the data
	   5. close()
	   
	   Disadvantage:-
	   ------------
	   The main problem with FileWriter is we have to insert line separator '\n' manualy 
	   which is varied from system to system .   
	 
	 */

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.txt",true);
		fw.write('s');
		fw.write("atyarth\na good programmer.\n");
		char c[]= {'a','b','c'};
		fw.write(c);
		fw.flush();
		fw.close();
		
		// What if i want to append? => just change the constructor u mf
		
		FileWriter f=new FileWriter("abc.txt",true);
		f.write("\nI LOVE DOSA");
		f.flush();
		f.close();
		
		
		

	}

}
