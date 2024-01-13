package CodePractice;

public class ThreadDemo {
	public static void main(String [] args){

		// using lambda expression
		Runnable tr1=()->{
			for (int i = 0; i <10 ; i++) {
				System.out.println(i);
				System.out.println("waiting for 1sec");
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		Thread tr=new Thread(tr1);
		tr.setName("Sachin");
		tr.start();

	}
}
