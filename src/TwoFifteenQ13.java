import  java.io.*;
import java.util.Scanner;

public class TwoFifteenQ13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f1 = new File("test1.txt");
		System.out.println("Write In File");
		String str=sc.nextLine();

		try {
			FileWriter fw = new FileWriter(f1);
			FileReader fr = new FileReader(f1);
			fw.write(str);
			fw.close();
			int c;
			while ((c=fr.read())!=-1){
				System.out.print((char)c);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}



	}
}
