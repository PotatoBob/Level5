import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lambdas {
	static JFrame window;
	static JPanel panel;
	static JButton b1;
	static JButton b2;
	static JButton b3;
	static JButton b4;
	static boolean name;
	public static void main(String[] args) {
		createFrame();
	}
	public static void createFrame() {
		window = new JFrame("Hi");
		name=true;
		window.setVisible(true);
		panel = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		window.add(panel);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonPress();
	}
	public static void buttonPress() {
		b1.addActionListener((e)->System.out.println(new Random().nextInt(9999)));
		b2.addActionListener((e)->System.out.println("Jangwoo Lee"));
		b3.addActionListener((e)->{
			if(name) {
				window.setTitle("Changed"); 
				name=false;
				}
			else {
				window.setTitle("Hi"); 
				name=true;
				}
		});
		b4.addActionListener((e)->System.exit(0));
	}
}
