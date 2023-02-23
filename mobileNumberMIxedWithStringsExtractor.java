import java.io.*;
import java.util.regex.*;
public class mobileNumberMIxedWithStringsExtractor {

	public static void main(String[] args) throws IOException{
		PrintWriter pw=new PrintWriter("mobileOutput.txt");
		Pattern p = Pattern.compile("[7-9][0-9]{9}");
		BufferedReader br=new BufferedReader(new FileReader("mobileInput.txt"));
		String line=br.readLine();
		while(line != null) {
			Matcher m=p.matcher(line);
			while(m.find()) {
				pw.println(m.group());
			}
			line=br.readLine();
		}
		pw.flush();
		

	}

}
