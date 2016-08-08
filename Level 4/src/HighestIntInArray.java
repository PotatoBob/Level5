
public class HighestIntInArray {
	int[] stuff;
	public static void main(String[] args) {
		int[] arr;
		HighestIntInArray HIIA = new HighestIntInArray(arr);
	}
	HighestIntInArray(int[] arr) {
		stuff = arr;
		setHighestIntInArray(stuff);
		getHighestIntInArray(stuff);
	}
	void setHighestIntInArray(int[] i) {
		stuff = i;
	}
	int getHighestIntInArray(int[] i) {
		int count = 0;
		for (int j : stuff) {
			if(j>count) {
				count = j;
			}
		}
		return count;
	}
}
