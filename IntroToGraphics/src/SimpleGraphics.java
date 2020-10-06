
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

// we will extend JPanel (a built-in Java class). A panel will 
// have the graphics capabilities we want (namely paint).
public class SimpleGraphics extends JPanel  {
	
	// constants that are predefined and won't change 
	// don't use 'magic numbers' in your code!!!

	
	// the width/height of our window - note I set this 
	// final bc I didn't allow the window size to change
	private final int width = 800, height = 600;
 
	// this is where we do the graphics initializations
	public SimpleGraphics() {
		
		// the frame holds the panel. A frame is simply a container,
		// it does nothing but hold panels and other graphics tools
		JFrame frame = new JFrame();
		
		// set the window size - notice, no magic numbers!
		frame.setSize(width, height);
		
		// this ends the program when the close button is pressed
		// probably always a good idea to use this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add our customized panel to the container
		frame.add(this);
		
		// this line centers the window upon startup
		frame.setLocationRelativeTo(null);
		
		// decide whether the user can resize the window - 
		// sometimes this is good, sometimes bad.
		// if you choose to set this true, make sure to be 
		// careful with your height/width variables!!
		frame.setResizable(false);
		
		// we need to tell the computer to make your frame and 
		// its contents visible (I don't know why this is automatically
		// set to false...)
		frame.setVisible(true);
		
		// decide whether you will need focus in your program.
		// focus is the ability for the program to pay attention 
		// to just one component - for example, if you have multiple 
		// text input boxes, we need to know which box to focus on
		// at all times
		this.setFocusable(true);
		
		// get our functionality going (if we have any)
		run();
	}

	// This is what we want the code to do as the panel is open.
	public void run() {

		// note - I don't have anything besides graphics setup in
		// this code, so my program won't actually 'do' anything.
		// If I wanted to 'do something', this is where I would do that
	}
	
	// defines how to paint our panel - this is called 
	// note that I never call this directly.
	// If I want to update my original graphics display, I call repaint()
	public void paint(Graphics g) {
	
		// draw a red 50x50 rectangle - note I use 
		// fillRect(), not drawRect()
		// also note that I use magic numbers here, just 
		// because its an example - do not do this in a real project!
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 1000, 1000);
		
		g.setColor(Color.YELLOW);
		g.fillOval(650, 30, 150, 150);
		
		g.setColor(Color.ORANGE);
		g.fillOval(690, 70, 75, 75);
		
		g.setColor(Color.YELLOW);
		g.fillOval(500, 110, 75, 75);
		
		g.setColor(Color.ORANGE);
		g.fillOval(410, 10, 75, 75);
		
		g.setColor(Color.RED);
		g.fillOval(300, 5, 25, 25);
		
		g.setColor(Color.GREEN);
		g.fillOval(230, 3, 60, 60);
		
		g.setColor(Color.ORANGE);
		g.fillOval(140, 3, 40, 40);
		
		g.setColor(Color.YELLOW);
		g.fillOval(25, 5, 75, 75);
		
		g.setColor(Color.YELLOW);
		g.fillOval(140, 100, 60, 60);
		
		g.setColor(Color.GREEN);
		g.fillOval(240, 200, 30, 30);
		
		g.setColor(Color.WHITE);
		g.fillOval(230, 280, 125, 125);
		
		g.setColor(Color.GREEN);
		g.fillOval(100, 250, 45, 45);
		
		g.setColor(Color.WHITE);
		g.fillOval(40, 230, 20, 20);
		
		g.setColor(Color.BLACK);
		g.fillRect(130, 200, 100, 3000);
		
		g.setColor(Color.BLACK);
		g.fillRect(180, 400, 100, 200);
		
		g.setColor(Color.BLACK);
		for (int  i = 300; i < 900; i += 70)
			g.fillRect(i, 400, 50, 50);
		
		for (int  i = 300; i < 900; i += 70)
			g.fillRect(i, 480, 50, 50);
		
		for (int  i = 30; i < 900; i += 70)
			g.fillRect(i, 320, 50, 50);
		
		
		// there are tons of graphics drawing methods - check them out!
	}
	
	// very simple main method - create our graphics object
	public static void main(String[] args) {
		new SimpleGraphics(); 
	}
}


