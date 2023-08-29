

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Clock {

    public static void main(String[] args) throws IOException {
        new ClockFrame();
    }

}
class ClockFrame extends Frame implements WindowListener, ActionListener {

    Label s, m, h,error;
    Button checktbtn, clearBtn;

    public ClockFrame() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Even-odd");
        this.addWindowListener(this);
        this.setLayout(null);

        s = new Label("");
        this.add(s);
        s.setBounds(40, 80, 130, 30);

         m = new Label("");
        this.add(m);
        m.setBounds(40, 80, 130, 30);

         h = new Label("");
        this.add(h);
        h.setBounds(40, 80, 130, 30);
        // lb1.setBackground(Color.white);


        checktbtn = new Button("check");
        this.add(checktbtn);
        checktbtn.setBounds(44, 170, 70, 30);
        checktbtn.setBackground(Color.ORANGE);
        
        for(int i =1 ;i<2000; i++){
        checktbtn.addActionListener(this);
        System.out.println(i);
    }

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(120, 170, 60, 30);
        clearBtn.setBackground(Color.LIGHT_GRAY);
        clearBtn.addActionListener(this);

        error = new Label();
        error.setBounds(45, 300, 90, 30);
        this.add(error);
        error.setForeground(Color.red);

        //----------------------------------- 


            int s1=0;
			int m1=0;
			int h1=0;
					
			while(true)
			{			
				s1++;
                h.setText("hour: "+String.valueOf(h)+"\r");			
                m.setText("hour: "+m1 +"\r");
                s.setText("hour: "+s1 +"\r");				
				if(s1==60)
				{
					s1=0;
					m1++;
				}
				if(m1==60)
				{
					m1=0;
					h1++;						
				}
			}	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}

class MyThread extends Thread {
	
	public MyThread()
	{
		this.start();
	}
	public void run()
	{
		try {
			int s=0;
			int m=0;
			int h=0;
					
			while(true)
			{			
				s++;			
				System.out.println("hour: "+h +"   minute: "+m+"   second: "+s+"\r");	
				Thread.sleep(1000);
				//System.out.flush();				
				if(s==60)
				{
					s=0;
					m++;
				}
				if(m==60)
				{
					m=0;
					h++;						
				}
			}		
		}
		catch( InterruptedException ref ){}
	}
}