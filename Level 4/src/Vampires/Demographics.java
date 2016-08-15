package Vampires;

import java.util.ArrayList;

public class Demographics {
	int sum = 0;
	int count = 0;
	int averageAge = 0;
	Demographics() {
		
	}
	void setAverageAge(ArrayList<Integer> stu) {
		for(int i: stu) {
			sum+=i;
			count++;
		}
		averageAge = sum/count;
	}
	int getAverageAge() {
		return averageAge;
	}
}
