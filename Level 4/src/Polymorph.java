import java.awt.Color;
import java.awt.Graphics;

public class Polymorph {
    private int x;
    private int y;
    private int width = 9;
    private int height = 7;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    void setX(int i) {
    	x = i;
    }
    void setY(int i) {
    	x = i;
    }
    void setWidth(int i) {
    	width = i;
    }
    void setHeight(int i) {
    	height = i;
    }
    
    public void update(){
   	 
   	 
    }
    
    public void draw(Graphics g){
   	 g.setColor(Color.BLUE);
   	 g.fillRect(x, y, width, height);
    }
}


//1. Encapsulate the member variables of the Polymorph class.

//2. Create new member variables for the width and height of the polymorph and substitute them for the hard-coded numbers in the draw method. Make sure they are properly encapsulated.

//3. Create a new sub-class of the Polymorph class called RedMorph. Make this polymorph render red instead of blue. Create an object of RedMorph in the PolymorphWindow class and test it.

//4. Create a new sub-class of the Polymorph class called MovingMorph. Add code to the update method to make MovingMorph objects move around the screen. Create a MovingMorph object in your PolymorphWindow class and test it. Don't forget to call the update method.

//5. That was fun! Now, delete all references to Polymorphs inside your PolymorphWindow class. Create an ArrayList of Polymorphs inside your PolymorphWindow class. Initialize the ArrayList and add a bunch of different types of Polymorph objects to the array list.

//6. Use for-each loops to call the draw and update method for all the Polymorphs in the list.

//7. Let's create more Polymorphs! Create a new sub-class of Polymorphs for each of the following…
	//a) Create a Polymorph that moves in a circle. hint: Math.sin() Math.cos()
	//b) Create a Polymorph that follows your mouse.
	//c) Create a Polymorph that displays an image.
	//d) Create a Polymorph that displays a JOptionPane message dialog when clicked.
