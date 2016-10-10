
public class WhileLoopPuzzles {
	public static void main(String[] args) {
		System.out.println(millionaire());
		//zebra();
		System.out.println(pizza());
	}
	static int millionaire() {
		int count=0;
		int money=1;
		while(money<1000000) {
			count++;
			money*=2;
		}
		return count;
	}
	static void zebra() {
		String zebra="white";
		while(1==1) {
			if(zebra.equals("white")) {
				zebra="black";
			} else if(zebra.equals("black")){
				zebra="white";
			} else {
				zebra="black";
			}
			System.out.println(zebra);
		}
	}
	static int pizza() {
		int slices=1046;
		int count=0;
		while(slices>1) {
			slices/=2;
			count++;
		}
		return count;
	}
}
