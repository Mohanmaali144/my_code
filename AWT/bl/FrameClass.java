package bl;
import java.awt.*;
import java.awt.event.WindowListener;
class FrameClass extends Frame implements WindowListener {

	public FrameClass()
	{		
		this.setVisible(true);
		this.setTitle("MyFrame");
		//this.setBackground(Color.Gray);
		this.setBounds(100,50,700,400);
		this.addWindowListener(this);
	}
	public void windowOpend(WindowEvent e)
	{
		
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e)
	{
		
	}
	public void windowIconifid(WindowEvent e)
	{
		
	}
	public void windowDiconifid(WindowEvent e)
	{
		
	}
	public void windowActivate(WindowEvent e)
	{
		
	}
	public void windowDactivate(WindowEvent e)
	{
		
	}
	
}