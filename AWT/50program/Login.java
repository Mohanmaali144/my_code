import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class LoginFrame extends Frame implements WindowListener, ActionListener {
    Label lb1, lb2, lb3, lb4;
    TextField text1, text2;
    Button btn1;

    public LoginFrame() {
        setVisible(true);
        setTitle("Login-frame");
        setBounds(870, 10, 350, 400);

        Color cl = new Color(156, 194, 213);
        setBackground(cl);
        addWindowListener(this);
        setLayout(null);
        // label
        lb1 = new Label("    LOGIN YOUR GMAIL  ");
        lb1.setVisible(true);
        lb1.setBounds(30, 40, 290, 30);
        lb1.setBackground(Color.white);
        this.add(lb1);
        // lb2
        lb2 = new Label(" Enter your ID");
        lb2.setVisible(true);
        lb2.setBounds(30, 80, 120, 30);
        lb2.setBackground(Color.white);
        this.add(lb2);
        // lb3
        lb3 = new Label(" Enter your Password");
        lb3.setVisible(true);
        lb3.setBounds(30, 130, 120, 30);
        lb3.setBackground(Color.white);
        this.add(lb3);
        // textfields
        text1 = new TextField();
        text1.setBounds(160, 80, 160, 30);
        text1.setBackground(Color.white);
        text1.setVisible(true);
        add(text1);
        text2 = new TextField();
        text2.setBounds(160, 130, 160, 30);
        text2.setBackground(Color.white);
        text2.setVisible(true);
        add(text2);
        // btn sbubit
        btn1 = new Button("Submit");
        btn1.setBounds(30, 180, 70, 30);
        btn1.setBackground(Color.white);
        btn1.addActionListener(this);
        add(btn1);
        // label resulr
        lb4 = new Label();
        lb4.setBounds(30, 230, 220, 30);
        lb4.setBackground(Color.white);
        add(lb4);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = text1.getText();
        String ps = text2.getText();
        String id1 = "id1234";
        String ps1 = "1234";
        if ((btn1 == e.getSource()) && (id1.equals(id))) {
            if (ps1.equals(ps)) {
                lb4.setText("     Login Successfully");
                text1.setText("");
                text2.setText("");
                new DataFrame();
            }
        } else {
            lb4.setText("     Incorrect password ");
            text1.setText("");
            text2.setText("");
        }
    }
}

class DataFrame extends Frame implements WindowListener, ActionListener {

    DataFrame() {
        Label lb1, lb2;
        setVisible(true);
        setTitle(" Data");
       setBounds(870, 10, 350, 400);

        Color cl1 = new Color(227, 205, 129);
        setBackground(cl1);
        addWindowListener(this);
        setLayout(null);
        // label
        lb1 = new Label("  Login Success   ");
        lb1.setVisible(true);
        lb1.setBounds(30, 40, 120, 30);
        lb1.setForeground(Color.green);
         lb1.setBackground(Color.gray);
        this.add(lb1);
        lb2 = new Label(" Welcome");
        lb2.setVisible(true);
        lb2.setBounds(30, 80, 120, 30);
        this.add(lb2);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

public class Login {
    public static void main(String[] args) {
        new LoginFrame();
    }
}
