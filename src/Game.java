import java.awt.*;

public class Game extends DrawableAdapter {
	
	static Game ga = new Game();
	static GameBoard gb = new GameBoard(ga, "Person Maker");
	
	static Color BROWN = new Color(142, 64, 4); 
	
	static Person mrsLombardi = new Person(Color.GREEN, BROWN, Color.yellow, 300, 100, 150); 
	static Person leah = new Person(Color.blue, BROWN, Color.magenta, 260, 250, 150); 
	static Person erica = new Person(Color.magenta, BROWN, Color.orange, 220, 400, 150); 
	
	
	public static void main(String[] args) {
		showGameBoard(gb);
	
	}
	
	public void draw(Graphics g) {
		mrsLombardi.show(g);
		leah.show(g);
		erica.show(g);
	}	
}
