
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class UpperOrLower {

    public static void main(String[] args) throws IOException {
        new UpperOrFrame();
    }

}

class UpperOrFrame extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, result, ans, error;
    TextField tf1;
    Button convertbtn, clearBtn;

    public UpperOrFrame() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Uper Or Lower");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter a Alphabet");
        this.add(lb1);
        lb1.setBounds(40, 80, 120, 30);
        // lb1.setBackground(Color.white);

        tf1 = new TextField();
        this.add(tf1);
        tf1.setBounds(40, 120, 140, 30);

        convertbtn = new Button("Check");
        this.add(convertbtn);
        convertbtn.setBounds(44, 170, 70, 30);
        convertbtn.setBackground(Color.orange);
        convertbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(120, 170, 60, 30);
        clearBtn.setBackground(Color.pink);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 220, 50, 30);
        this.add(result);
        result.setBackground(Color.white);

        ans = new Label();
        ans.setBounds(125, 220, 250, 30);
        this.add(ans);
        // ans.setBackground(Color.white);

        error = new Label();
        error.setBounds(45, 250, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = tf1.getText();
        char ch = s.charAt(0);
        if (e.getSource() == convertbtn) {

            error.setText("");
            if (ch >= 65 && ch <= 90) {
                ans.setText("Upper case");         
            } 
            else if(ch >= 97 && ch <= 122)
            {
                ans.setText("Lower case");
            }
            else {
                error.setText("Invalid input");
            }

        } else if (e.getSource() == clearBtn) {
            tf1.setText("");
            ans.setText("");
            error.setText("");
        }
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
