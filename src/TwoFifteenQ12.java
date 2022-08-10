

class t2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=20;i++){
			try{
				Thread.sleep(200);
				System.out.println(i);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class TwoFifteenQ12 {
	public static void main(String[] args) {
		Thread t1=new Thread(new t2(),"Hello");
		t1.start();
	}
}
