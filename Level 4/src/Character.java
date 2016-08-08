
public class Character {
	String name = null;
	boolean Evil = true;
	Character(String s, boolean b) {
		name = s;
		Evil = b;
	}
	void setName(String s) {
		name = s;
	}
	String getName() {
		return name;
	}
	void setEvil(boolean b) {
		Evil = b;
	}
	boolean isEvil() {
		return Evil;
	}
}
