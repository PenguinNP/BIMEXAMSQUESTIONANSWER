//2016 question number 13 is same
interface num{
	int add(int x,int y);
	int sub(int x,int y);
}
class test implements num{
	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}
}
//End of Question NO Need to do this
public class TwoFifteenQ15 {
	public static void main(String[] args) {
		test t1 = new test();
		System.out.println(t1.add(2,3));
	}
}
