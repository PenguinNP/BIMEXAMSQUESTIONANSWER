
import java.io.File;

public class TwoSixteenQ15 {
	public static void main(String[] args) {
		File f0=new File("D:\\database");
		String[] str=f0.list();
		for(String newStr:str){
			System.out.println(newStr);
		}
	}
}
