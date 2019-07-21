package thread;

public class ThreadRunable {
	
	public static void main(String[] args) {
	  Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
		Xuly(1, 50);
			
		}
	});
	  Thread thread2 = new Thread(new Runnable() {
			
		@Override
		public void run() {
		Xuly(51, 100);
			
		}
	});
	  
	  thread1.start();
	  thread2.start();
	}
	static void Xuly(int a, int b) {
		for(int i=a;i<=b;i++) {	
			System.out.print(i+" ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


