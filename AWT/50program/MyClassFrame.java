
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class MyClassFrame {

    public static void main(String[] args) throws IOException {
        new MainBtn();
    }

}
class MainBtn extends Frame implements WindowListener,ActionListener {

    Label lb1,lb2; 
    TextField tf1;
    Button btn;
    public MainBtn() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Mybtn");
        this.addWindowListener(this);
        this.setLayout(null);
       
         lb1 = new Label("Enter a Text");
        this.add(lb1);
        lb1.setBounds(125, 80, 200, 30);

         tf1 = new TextField();
        this.add(tf1);
        tf1.setBounds(125, 120, 200, 30);
        // tf.setBackground(Color.white);

         btn = new Button("submit");
        this.add(btn);
        btn.setBounds(125, 180, 80, 30);
        btn.setBackground(Color.cyan);
       
        lb2 = new Label();
        lb2.setBounds(125, 220, 200, 30);
        this.add(lb2);
        btn.addActionListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.exit(0);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                     // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        String s = tf1.getText();
        lb2.setText("Your name is :  "+s);
        tf1.setText("");
    }
}
