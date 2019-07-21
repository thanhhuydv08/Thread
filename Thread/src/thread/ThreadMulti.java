package thread;

// tao tieeur trinh la 2 class nhe

public  class ThreadMulti {

public static void main(String[] args) {
	new Luong1().start();
	new Luong2().start();
}
	void Xuly(int a, int b) {
		for(int i=a;i<=b;i++) {	
			System.out.println(i+" ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

class Luong1 extends Thread {
	@Override
	public void run() {
		new ThreadMulti().Xuly(1,50);
	
	}
}
class Luong2 extends Thread {
	@Override
	public void run() {
		new ThreadMulti().Xuly(51,100);
	
	}
	
}