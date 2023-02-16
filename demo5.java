import java.io.File;
import java.io.FileReader;
// FileReader
/*
   We can use FileReader to read character data from the file.
   
   CONSTRUCTORS:-
   ------------
   1. FileReader fr = new FileReader(String fname);
   2. FileReader fr = new FileReader(File fname);
   
   METHODS:-
   -------
   1. int read():- returns unicode value of next character, 
   				   if next character is not available then returns -1.

   2. int read(char[] ch):- It attends to read enough characters from the file into
    					    char array	and returns number of characters copied from file.
    					    
   3. close():- to close it
   
   Disadvantages:-
   -------------
   
   - We can only read data character by character which is not convinient to the programmer.
 
 */
public class demo5 {

	public static void main(String[] args) throws Exception {
		
		// Character by character reading
		FileReader fr1=new FileReader("satyarth.txt");
		int i=fr1.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr1.read();
		}
		System.out.println("\n========== SEPARATOR =====================");
		// in Character array reading 
		File f=new File("satyarth.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char e:ch) System.out.print(e);
		

	}

}
