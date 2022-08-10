//2016 Question no 13 is similar to question on 15 of 2015
public class TwoSixteenQ14 {
	public static void main(String[] args) {
		String[] str={"Ram","Taaaa","lala","lllatllla"};
		for (String newStr: str) {
			if(newStr.contains("T")||newStr.contains("t")){
				System.out.println(newStr);
			}
		}
	}
}
