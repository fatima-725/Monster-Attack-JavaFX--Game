package newgame.src.objects;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Serializable;
import game.Node;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Linked  implements Serializable {
	private static final long serialVersionUID = 1L;
	public Node head;
	public static String namef1;
	 public  String namef;
	 public int timef;
	 public int scoref;
	 Linked l;
	 Linked l2;
		void sortedInsert(String n,int s,int time)
    { 
			System.out.println("passed "+n+time);
		Node newNode= new Node();
		newNode.name=n;
	    newNode.totalscore=s;
    newNode.timetaken=time;
        Node current;
        /* Special case for head node */
        if (head == null ||  head.totalscore <= newNode.totalscore) {
            newNode.next = head;
            head = newNode;
        }
        else {
            /* Locate the node before point of insertion. */
            current = head;
            while (current.next != null 
&&  current.next.totalscore > newNode.totalscore)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }
		System.out.println("passed1 "+namef1+scoref);
    }
	public void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name+" "+temp.timetaken +" " +temp.totalscore  );
            temp = temp.next;
        }
    }
	public void add() {	
			Linked l=new Linked();
			 Linked l2=new Linked();
			 System.out.println("passed ss "+namef1+scoref);	
			l.sortedInsert(namef1,  scoref,timef);
			l.printList();
			l.callFileStore();
			try {
			l2=l.readFromFile();
			l2.printList();
			}
			catch(Exception ex) {
				 System.out.println("unsuccessful");
				 ex.printStackTrace();
				 }
	}
	public void setname(String n) {
		namef=n;
		System.out.println("namel "+namef);
		System.out.println("namels "+namef1);
		getname();	
		}
	public void getname() {
		namef1=namef;
		System.out.println("namels "+namef1);
	}
	public void settime(int t) {
		timef=t;
		System.out.println("timel "+timef);
	}
	public void setscore(int s) {
		scoref=s;
		System.out.println("scoref "+scoref);
	}
	  public Linked readFromFile() throws IOException{
		  Linked obj= new Linked();
	   Node newNode= new Node();
		   FileReader file = new FileReader("Newdata.txt");
	       try (BufferedReader buffer = new BufferedReader(file)) {
			String line= null;
			   String[] record= new String[3];
System.out.println("reading from file");
			   while((line=buffer.readLine())!=null){		     
			      record = line.split(",");
			      newNode.name = record[0];
			      newNode.totalscore = Integer.parseInt(record[1]);
			       newNode.timetaken = Integer.parseInt(record[2]);
			      
			       
			       System.out.println("1  "+newNode.name+" "+newNode.totalscore+" "+newNode.timetaken);
			       obj.sortedInsert(newNode.name, newNode.totalscore,newNode.timetaken);
			   }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       return obj;  
	   }
	 void callFileStore(){
		 try {
			 File file= new File("Newdata.txt");
			 try (FileWriter fw = new FileWriter(file, true)) {
				fw.flush();
			}
			 }
			 catch(Exception ex) {
				 System.out.println("error in filestore");
			 ex.printStackTrace();
			 }
		 System.out.println("Storing on a file");
		Node newnode=new Node();
		String record=null;
		Node current= this.head;
		 try {
				FileWriter file= new FileWriter("Newdata.txt",true);
				BufferedWriter writer= new BufferedWriter(file);	
			while(current!=null) {
				 newnode.name= current.name;
				 newnode.timetaken=current.timetaken;
				 newnode.totalscore=current.totalscore;
			record= current.name+","+current.totalscore+","+current.timetaken;
			System.out.println(record.split(","));
				writer.write(record);
				writer.newLine();
				current=current.next;
			 }
			writer.close();
			}
			catch(Exception ex) {
				 System.out.println("Stored unsuccessful");
				ex.printStackTrace();
			}
		 System.out.println("Stored successfully");
	   }
}