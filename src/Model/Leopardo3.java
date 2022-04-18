package Model;

public class Leopardo3 extends Thread{

	public Leopardo3(String nombre) {
		super(nombre);
		
	}
	
	@Override
	public void run () {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + "corrio :"+i+" mts");
			if (i%10==0) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
