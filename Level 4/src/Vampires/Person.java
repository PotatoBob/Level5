package Vampires;

public class Person {
	String name = null;
	int age = 0;
	Person(String s, int i) {
		name = s;
		age = i;
	}
	void setName(String s) {
		name = s;
	}
	String getName() {
		return name;
	}
	void setAge(int i) {
		age = i;
	}
	int getAge() {
		return age;
	}
}
