import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class MyFrame extends Frame implements WindowListener{

	public static void main(String args[])
	{
		MyFrame fm = new MyFrame ();
		
		fm.setBounds(400,500,400.500);
		fm.setVisiblity(true);
		fm.setBackground(Color.gray);
		
		 @Override
		public void windowOpened(WindowEvent e) {
			//throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowClosing(WindowEvent e) {

			System.exit(0);
			//throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowClosed(WindowEvent e) {
			//throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowIconified(WindowEvent e) {
			//throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			//throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowActivated(WindowEvent e) {
			//throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			//throw new UnsupportedOperationException("Not supported yet."); // Generated from
			// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}
		
	}
}