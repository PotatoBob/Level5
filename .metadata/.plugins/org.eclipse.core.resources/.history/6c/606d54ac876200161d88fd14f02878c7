
public class Persons {
	String name = null;
	int age = 0;
	int count = 0;
	Persons(String s, int i) {
		name = s;
		age = i;
	}
	void setAge(int a) {
		age = a;
	}
	int getAge() {
		return age;
	}
	void setName(String s) {
		name = s;
	}
	String getName() {
		return name;
	}
	String getFirstName() {
		for(int i = 0; i<name.length(); i++) {
			if(name.charAt(i) == ' ') {
				count = i;
				break;
			}
		}
		
		return name.substring(0, count);
	}
	String getLastName() {
		for(int i = 0; i<name.length(); i++) {
			if(name.charAt(i) == ' ') {
				count = i+1;
				break;
			}
		}
		
		return name.substring(count, name.length());
	}
}
