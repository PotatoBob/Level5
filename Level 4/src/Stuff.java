
public class Stuff {
	public static void main(String[] args) {
		new Thread(()->{
			for(int i = 0; i<10; i++) {
				System.out.println(i + " runs");
			}
		}).start();
		new Thread(()->{
			for(int i = 0; i<10; i++) {
				System.out.println(i + " things");
			}
		}).start();
		System.out.println("End of class.");
	}
}
