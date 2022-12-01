package Com.Question2;
public class Traffic extends Thread{

	public static void main(String[] args) {
		Thread A = new Thread();
		Thread B = new Thread();
		Thread C = new Thread();
		System.out.println("RED LIGHT IS ON");
		A.start();
		try {
			A.sleep(3000);
			System.out.println("RED LIGHT IS OFF");
			System.out.println("GREEN LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B.start();
		try {
			B.sleep(8000);
			System.out.println("GREEN LIGHT IS OFF");
			System.out.println("YELLOW LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		C.start();
		try {
			C.sleep(10000);
			System.out.println("RED LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

