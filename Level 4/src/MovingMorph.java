import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		
	}
	@Override
	public void update() {
		super.setX(super.getX()+1);
	}

}
