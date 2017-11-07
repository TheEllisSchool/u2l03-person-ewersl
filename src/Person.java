import java.awt.Color;
import java.awt.Graphics;

public class Person {
	//attributes
	private Color eyeColor; 
	private Color hairColor;
	private Color dressColor; 
	private int height; 
	private int x; //top of body
	private int y; //top of body
	
	// methods 
	
	//constructor 
	public Person (Color ec, Color hc, Color dc, int h, int xin, int yin) {
		eyeColor = ec; 
		hairColor = hc;
		dressColor= dc; 
		height = h;
		x= xin; 
		y = yin;
}

	public void show(Graphics g) {
		g.setColor (Color.BLACK); 
		g.drawLine(x, y, x, y + height - 50); 
		//legs
		g.drawLine(x, y + height - 50, x - 30, y + height);
		g.drawLine(x, y + height - 50, x + 30, y + height); 
		// arms
		g.drawLine(x, y + (height - 50)/ 2, x - 15, y + (height- 50) / 2); 
		g.drawLine(x, y + (height - 50)/ 2, x + 15, y + (height- 50) / 2); 
		
	
		// hair 
		g.setColor (hairColor);
		g.fillOval(x, y- 100, 100, 100);
		g.setColor(Color.PINK);
		g.fillOval(x, y - 80, 100, 100);
		//head
		g.setColor(Color.BLACK);
		g.fillOval(x- 40,  y- 100,  80,  100);
		//eyes
		g.setColor(eyeColor);
		g.fillOval(x- 10, y- 50, 10, 10); 
		g.fillOval(x+ 10, y- 50, 10, 10);
		// dress
		g.setColor(dressColor);
		int x1 [] = {x, x- 50, x + 50}; 
		int y1 []= {y+ 30, y + 200, y + 200};
		g.fillPolygon(x1, y1, 3);

		
		
	}
	
}
