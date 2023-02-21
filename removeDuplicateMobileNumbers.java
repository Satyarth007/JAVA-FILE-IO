import java.io.*;
public class removeDuplicateMobileNumbers {

	public static void main(String[] args)throws IOException {
		PrintWriter pw = new PrintWriter("mobOutput.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("mobInput.txt"));
		String line = br1.readLine();
		while(line!=null) {
			boolean avail = false;
			BufferedReader br2 = new BufferedReader(new FileReader("mobOutput.txt"));
			String target=br2.readLine();
			while(target!=null) {
				if(line.equals(target)) {
					avail=true;
					break;
				}
				target=br2.readLine();
				
			}
			if(avail==false) {
				pw.println(line);
				pw.flush();
			}
			line=br1.readLine();
		}
		

	}

}
