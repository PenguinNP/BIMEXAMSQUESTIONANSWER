class  ThreadA implements Runnable{
	@Override
	public void run() {
		for(int i =50;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
class  ThreadB implements Runnable{
	@Override
	public void run() {
		for(int i =100;i<=200;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}
public class TwoSixteenQ12 {
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadA(),"ThreadA");
		Thread t2=new Thread(new ThreadB(),"ThreadB");
		t1.start();
		t2.start();
	}
}
