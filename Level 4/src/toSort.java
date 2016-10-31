import javax.swing.JOptionPane;

public class toSort{
	static String text1;
	static String text2;
	static String better;
	static int count1;
	static int count2;
	public static void main(String[] args) {
		text1 = JOptionPane.showInputDialog("Input some text");
		text2 = JOptionPane.showInputDialog("Input some more text");
		//longer/shorter
		betterString(text1, text2, (s1, s2)->{
			if(s1.length()>s2.length()) {
				System.out.println(s1+" is longer");
				System.out.println(s2+" is shorter");
				return true;
			} else if(s2.length()>s1.length()) {
				System.out.println(s2+" is longer");
				System.out.println(s1+" is shorter");
				return false;
			} else {
				System.out.println("They are the same length");
				return false;
			}
			
		});
		//lexigrapically shorter
		betterString(text1, text2, (s1, s2)->{
			if(s1.compareTo(s2)<=0) {
				System.out.println(s1+" is lexigraphically smaller than "+s2);
				return true;
			} else {
				System.out.println(s2+" is lexigraphically smaller than "+s1);
				return false;
			} 
			
		});
		//more vowels
		betterString(text1, text2, (s1, s2)->{
			for(char c: s1.toCharArray()) {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count1++;
				}
			}
			for(char c: s2.toCharArray()) {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count2++;
				}
			}
			if(count1>count2) {
				System.out.println(s1+" has more vowels than "+s2);
				return true;
			} else if(count2>count1) {
				System.out.println(s2+" has more vowels than "+s1);
				return false;
			} else {
				System.out.println("They have the same number of vowels");
				return false;
			}
		});
		//more non-vowels
		betterString(text1, text2, (s1, s2)->{
			for(char c: s1.toCharArray()) {
				if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
					count1++;
				}
			}
			for(char c: s2.toCharArray()) {
				if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
					count2++;
				}
			}
			if(count1>count2) {
				System.out.println(s1+" has more consonants than "+s2);
				return true;
			} else if(count2>count1) {
				System.out.println(s2+" has more consonants than "+s1);
				return false;
			} else {
				System.out.println("They have the same number of consonants");
				return false;
			}
		});
	}
	public static String betterString(String s1, String s2, Sorter s) {
		if(s.sort(s1, s2)) {
			return s1;
		} else {
			return s2;
		}
	}

}
