package game;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import newgame.src.objects.Linked;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Color;
import java.awt.FlowLayout;
	public class Menu extends JFrame implements ActionListener {		
		private static final long serialVersionUID = 1L;
		public String n1;
		Mygame g=new Mygame(1);
		Linked list=new Linked();
		JButton newGame, rank, quit;
		JLabel l1;
		public Menu(){
			super("MONSTER ATTACK");
		}
			public void menu() {
				pack();
				setSize(1400,800);
				setContentPane(new JLabel(new ImageIcon("C:\\Users\\HP\\Desktop\\Bank\\Monster Attack1.png")));
				setLayout(new FlowLayout());
				l1=new JLabel();
				add(l1);
				setSize(1400,800);
				setDefaultCloseOperation(EXIT_ON_CLOSE);				
				setVisible(true);
				setFocusable(true);
				newGame = new JButton("New Game");
				rank = new JButton("Rank");
				quit = new JButton("Quit");
				newGame.setFont(new Font(Font.SERIF, Font.BOLD, 16));
				rank.setFont(new Font(Font.SERIF, Font.BOLD, 16));
				quit.setFont(new Font(Font.SERIF, Font.BOLD, 16));
				newGame.setForeground(Color.white);
				rank.setForeground(Color.white);
				quit.setForeground(Color.white);
				Color color=new Color(128,0,0);
				newGame.setBackground(color);
				rank.setBackground(color);
				quit.setBackground(color);
                newGame.setBounds(500,300,250,80);
				rank.setBounds(500,400,250,80);
				quit.setBounds(500,500,250,80);
				add(newGame);
				add(rank);
				add(quit);
				setResizable(true);
				setLayout(null);
				setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				newGame.addActionListener(this);
				rank.addActionListener(this);
				quit.addActionListener(this);
		}
			void table() {
				Color color=new Color(153,0,0);
				JFrame f=new JFrame();
				f.pack();
				DefaultTableModel model = new DefaultTableModel();
				JTable table = new JTable(model);
				table.setBackground(color);
				table.setForeground(Color.white);
				JTableHeader tableHeader = table.getTableHeader();
				tableHeader.setBackground(Color.black);
				tableHeader.setForeground(Color.white);
				tableHeader.setFont(new Font(Font.SERIF, Font.BOLD, 12));
				Linked ll=new Linked();
				Linked l1=new Linked();
				table.setBounds(30,40,200,300);
				JScrollPane sp=new JScrollPane(table);
				f.add(sp);
				f.setSize(300,400);
				f.setVisible(true);
				try {
			
				l1=ll.readFromFile();
				Node node;
				Node head = null;
				node=l1.head;
				model.addColumn("RANK");
				model.addColumn("NAME");
				model.addColumn("TIME (sec)");
				model.addColumn("SCORE");
				int rank=1;
				while(node!=null) {
				String Name=node.name;
				int t=node.timetaken;
				int s=node.totalscore;
				model.addRow(new Object[]{rank,Name,  t , s});
				rank++;
				node=node.next;
				}
				} catch (IOException e) {
				e.printStackTrace();
				}
				}
		public void message(int a)
		{
			
			if (a==3)
			{
				JOptionPane.showMessageDialog (null, "3 LIVES LOST", "RESULT", JOptionPane.INFORMATION_MESSAGE);
				menu();
				g.disappear();				
			
				
			}
		}
public static void main(String[] args) {
			// TODO Auto-generated method stub
Menu obj=new Menu();
obj.menu();
		}
@Override
public void actionPerformed(ActionEvent a) {
// TODO Auto-generated method stub
	
if(a.getSource()==newGame) {
	
n1=JOptionPane.showInputDialog("Name: ");

System.out.println("menu name "+n1);
JOptionPane.showMessageDialog (null, "1.Control your avatar with arrow keys . \n2. Maximum 3 lives. \n3. The game will end after the player's all lives are lost. \n4.The rank of the player is calculated on the basis of highest distance covered by the avatar.  ", "RULES", JOptionPane.INFORMATION_MESSAGE);
list.setname(n1);
Mygame ob=new Mygame();
dispose();
}
if(a.getSource()==rank) {
table();
}
if(a.getSource()==quit) {
dispose();
}
}
}