class student{
	int roll_no;

	public student(int roll_no) {
		this.roll_no = roll_no;
	}
	void display(){
		System.out.println(roll_no);
	}
}
class test extends student{
int mark1;
int mark2;

	public test(int roll_no, int mark1, int mark2) {
		super(roll_no);
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	@Override
	void display() {
		System.out.println(mark1+""+mark2);
	}
}
class result extends test{
	int total;

}
public class TwoSeventeenQ13 {
}
