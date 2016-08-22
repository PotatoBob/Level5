import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    //Polymorph p;
   // RedMorph r;
    //MovingMorph m;
    ArrayList<Polymorph> list = new ArrayList<Polymorph>();
    
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 Polymorph p = new Polymorph(50, 50);
   	 
   	 RedMorph r = new RedMorph(90, 90);
   	 
   	 MovingMorph m = new MovingMorph(20, 100);
   	 
   	 CircleMorph c = new CircleMorph(100, 60);
   	 
   	 list.add(p);
   	 list.add(r);
   	 list.add(m);
   	 list.add(c);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 for (Polymorph polymorph : list) {
		polymorph.draw(g);
	}
   	 //p.draw(g);
   	// r.draw(g);
   	 //m.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for (Polymorph polymorph : list) {
		polymorph.update();
	}
   	// p.update();
   	 //r.update();
   	 //m.update();
    }
}



