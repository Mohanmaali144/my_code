import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class MyFrame extends Frame implements WindowListener,ActionListener
{
	Label lb1,lb2,lb3;
	TextField tf1,tf2;
	Button btn1;
	
	public MyFrame()
	{
		this.setVisible(true);
		this.setTitle("Frame");
		this.setBackground(Color.GRAY);
		this.setBounds(100,50,700,400);
		this.setLayout(null);
		
		lb1=new Label("Enter a number");
		lb1.setBounds(20,50,110,30);
		this.add(lb1);
		
		tf1=new TextField();
		tf1.setBounds(130,50,150,30);
		this.add(tf1);
		
		btn1 = new Button("SUBMIT");
		btn1.setBounds(30,100,80,30);
		btn1.setBackground(Color.orange);
		btn1.setForeground(Color.black);
		this.add(btn1);
		
		lb3=new Label("Result");
		lb3.setBounds(20,130,190,50);
		this.add(lb3);
		
		this.add(btn1);
		
		this.addWindowListener(this);
		btn1.addActionListener(this);
		
	}
	 @Override
    public void windowOpened(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e)
	{	 
		 //throw new UnsupportedOperationException("Not supported yet."); 
		 System.exit(0);
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowIconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowActivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }
	public void actionPerformed (ActionEvent e)
	{
		try{
		
		int n = Integer.parseInt(tf1.getText());
        int i=1;
        int sum=0;
        int r=n;
      
        while(i<n)
        {
			if(n%i==0)
			{
				sum=sum+i;
			}
            i++;
		}
		if(r==sum)
		lb3.setText("number is perfect");
		else   
		lb3.setText("number is not perfect");
	    }
		catch(Exception s)
		{
			lb3.setText("Enter the Number");
		}
	    tf1.setText("");
		
	}
}
class Test
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}