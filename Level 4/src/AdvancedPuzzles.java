import java.util.Stack;

public class AdvancedPuzzles {
	static Stack<String> stuff;
	static String list;
	static int x;
	public static void main(String[] args) {
		sequence(22);
	}
	static void sequence(int a) {
		stuff=new Stack<String>();
			stuff.push("");
		while(a>0) {
			if(a%2==0) {
				a/=2;
				stuff.push("A");
			} else {
				a--;
				a/=2;
			stuff.push("B");
			}
		}
		x=stuff.size();
		for(int i = 0; i<x; i++) {
			System.out.print(stuff.pop());
		}
	}
}
