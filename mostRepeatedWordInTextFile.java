import java.io.*;
import java.util.*;
public class mostRepeatedWordInTextFile {

	public static void main(String[] args) throws Exception{
		// file reader to read the text file content
		FileReader fr=new FileReader("satyarth.txt");
		BufferedReader br=new BufferedReader(fr);
		// hashmap to store the count of each word in the text file
		HashMap<String,Integer> hm=new HashMap<>();
		
		String line="";
		while((line=br.readLine())!=null) {
			String[] s=line.split(" ");
			for(String e:s)hm.put(e,hm.getOrDefault(e,0)+1);
		}
		// searching the most repeated word in the hashmap
		String mostRepeatedWord="";
		int max=Integer.MIN_VALUE;
		
		for(String e:hm.keySet()) {
			if(max<=hm.get(e)) {
				max=hm.get(e);
				mostRepeatedWord=e;
			}
			
		}
//		System.out.println(hm);
		// answer
		System.out.println("Most Repeated Word is :- "+mostRepeatedWord);
	}

}
