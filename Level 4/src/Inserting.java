
public class Inserting {
	public static void main(String[] args) {
		Inserting I = new Inserting();
	}
	Inserting() {
		
	}
	static int[] insertAt(int[] i, int j, int k) {
		i[j]=k;
		return i;
	}
	static String[] insertAlphabetically(String[] s, String ss) {
		String[] x = new String[s.length+1];
		for(int i = 0; i<s.length;i++) {
			x[i]=s[i]; 
		}
		for(int i = 0; i<x.length; i++) {
			if(x[i].compareTo(ss)<0) {
				for(int j = x.length-1; j>i; j--) {
					x[j]=x[j-1];
				}
				x[i]=ss;
			}
			break;
		}
		Sorting.sort(x);
		for (String string : x) {
			System.out.println(string);
		}
		return x;
	}
}
