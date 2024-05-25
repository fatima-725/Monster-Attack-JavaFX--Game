package newgame.src.objects;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import game.Globalposition;
import game.Menu;
import game.Mygame;
import game.src.input.Controller;
public class Player extends Globalposition  {
	Linked l=new Linked();
	Menu m=new Menu();
Mygame demo=new Mygame(1);
	Time ob= new Time();
	int t1;
	public int count=0;
	public int score=0;
	public int s=0;

	private String playerimage="/images/af.png"; 
	int velx=0;
	int vely=0;
	  private LinkedList<Enemy> e=Controller.getEnemyBounds();
	public Player(int x,int y)
	{
		super(x,y);
	}
public void update() {
	x+=velx;
	y+=vely;
	//collision with outside
	if (x<0)
	{
		x=0;
	}
	if (y<0)
	{
		y=0;
	}
	if (x>1400)
	{
		x=0;
		++s;
	}
	if (y>800) {
		y=0;
	}
	Collision();	
}
public void Collision()
{
	for(int i=0;i<e.size();++i)
	{
		if(getBounds().intersects(e.get(i).getBounds()))
		{	
			++count;
			System.out.println("count "+count);
		}
		if(count>15)
		{
			ob.mytimer.cancel();
			score=(s*1400)+x;
			l.setscore(score);
			l.settime(ob.c);
			l.add();
			String st="3 lives lost";
			System.out.println(st);
			m.message(3);
			}				
	}
}
public void keyPressed(KeyEvent e)
{
	int key=e.getKeyCode();
	
	if(key==KeyEvent.VK_RIGHT)
	{
		velx=5;
	}
	else if (key==KeyEvent.VK_LEFT)
	{
		velx=-5;
	}
	else if (key==KeyEvent.VK_DOWN)
	{
		vely=5;
	}
	else if (key==KeyEvent.VK_UP)
	{
		vely=-5;
	}
}
public void keyReleased(KeyEvent e)
{
	int key=e.getKeyCode();
	
	if(key==KeyEvent.VK_RIGHT)
	{
		velx=0;
	}
	else if (key==KeyEvent.VK_LEFT)
	{
		velx=0;
	}
	else if (key==KeyEvent.VK_DOWN)
	{
		vely=0;
	}
	else if (key==KeyEvent.VK_UP)
	{
		vely=0;
	}
	}
public Rectangle getBounds()
{
	return new Rectangle (x,y,50,50);
}
public void draw(Graphics2D g2d)
{
	g2d.setColor(Color.LIGHT_GRAY);
	g2d.draw(getBounds());
	g2d.drawImage(getPlayerImage(), x,y, null);


	
}
public Image getPlayerImage()
{
	ImageIcon i=new ImageIcon(getClass().getResource(playerimage));
	return i.getImage();
}
}
