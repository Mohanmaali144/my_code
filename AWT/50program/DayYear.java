
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class DayYear {

    public static void main(String[] args) throws IOException {
        new DayFrame();
    }

}

class DayFrame extends Frame implements WindowListener, ActionListener {

    Label lb1,lb2,lb3,lb4,lb5,y,m,w,d, result,error;
    TextField tf1;
    Button checktbtn, clearBtn;

    public DayFrame() {
        this.setVisible(true);
        this.setBackground(Color.pink);
        this.setBounds(400, 250, 700, 400);
        this.setTitle("Leap-Year");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter day");
        this.add(lb1);
        lb1.setBounds(40, 80, 160, 40);
        // lb1.setBackground(Color.white);

        tf1 = new TextField();
        this.add(tf1);
        tf1.setBounds(40, 120, 170, 40);

        checktbtn = new Button("check");
        this.add(checktbtn);
        checktbtn.setBounds(44, 175, 80, 40);
        checktbtn.setBackground(Color.ORANGE);
        checktbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(130, 175, 80, 40);
        clearBtn.setBackground(Color.GRAY);
        clearBtn.addActionListener(this);

        lb2 = new Label("");
        this.add(lb2);
        lb2.setBounds(44, 270, 80, 40);
        lb2.setBackground(Color.orange);

        lb3 = new Label("");
        this.add(lb3);
        lb3.setBounds(44, 350, 80, 40);
        lb3.setBackground(Color.orange);

        lb4 = new Label("");
        this.add(lb4);
        lb4.setBounds(44, 450, 160, 40);
        lb4.setBackground(Color.orange);

        lb5 = new Label("");
        this.add(lb5);
        lb5.setBounds(44, 500, 160, 40);
        lb5.setBackground(Color.orange);


        result = new Label("Result");
        result.setBounds(45, 230, 50, 30);
        this.add(result);
        result.setBackground(Color.white);
        result.setFont(getFont());







        error = new Label();
        error.setBounds(45, 300, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = tf1.getText();

        int day = Integer.parseInt(s);

        if (e.getSource() == checktbtn) {

           
             
        } else if (e.getSource() == clearBtn) {
            tf1.setText("");
            tf1.setText("");
            //.setText("");
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
