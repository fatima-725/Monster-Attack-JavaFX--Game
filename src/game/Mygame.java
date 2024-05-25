package game;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;
public class Mygame {
public static final int WIDTH = 1400,HEIGHT=800;
public static JFrame myFrame;
public String name2;
public Mygame()
{
 JFrame myFrame=new JFrame("Monster Attack");
myFrame.pack();
myFrame.setSize(WIDTH,HEIGHT);
myFrame.setLocationRelativeTo(null);
myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
myFrame.setVisible(true);
myFrame.add(new Game());
}
public Mygame(int n)
{
	
}
public void disappear()
{
	try {
myFrame.dispose();
	}
	 catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}