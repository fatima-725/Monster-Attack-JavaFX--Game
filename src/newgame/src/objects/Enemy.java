package newgame.src.objects;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import game.Globalposition;
import game.Mygame;
public class Enemy extends Globalposition {
private String image="/images/enef.png";
int speed=5;
int speed1=5;
	public Enemy(int x,int y)
{
	super(x,y);
}
	public void update()
	{
		x+=speed;
		y+=speed1;
		if(x>Mygame.WIDTH-32)
		{
			speed=-5;
		}
		if(x<0)
		{
			speed=5;
		}
		if(y>Mygame.HEIGHT)
		{
			speed1=-5;
		}
		if(y<0)
		{
			speed1=5;
		}
	}
public void draw (Graphics2D g2d)
{
	g2d.drawImage(getEnemyImage(),x,y,null);
	
}
public Rectangle getBounds()
{
	return new Rectangle (x,y,50,50);
}
public Image getEnemyImage()
{
	ImageIcon i=new ImageIcon(getClass().getResource(image));
	return i.getImage();
}
}