
class rectangle{
	int length;
	int breath;
	int computeArea(int length,int breath){
		return length*breath;
	}
	void dispalyArea(int area1,int area2){
		if(area1<area2){
			System.out.println("Second has greater area");
		}
		else{
			System.out.println("First has greater area");
		}
	}
}
public class TwoFifteenQ14 {
	public static void main(String[] args) {
		rectangle r1=new rectangle();
		rectangle r2=new rectangle();
		rectangle r3=new rectangle();
		r3.dispalyArea(r1.computeArea(2,3),r2.computeArea(3,4));

	}
}
