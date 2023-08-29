
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class ReversNum {

    public static void main(String[] args) throws IOException {
        new ReversFrame();
    }

}

class ReversFrame extends Frame implements WindowListener, ActionListener {

    Label lb1, result, ans, error;
    TextField tf1;
    Button checktbtn, clearBtn;

    public ReversFrame() {
        this.setVisible(true);
        this.setBackground(Color.pink);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Reverse-Frame");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter a number");
        this.add(lb1);
        lb1.setBounds(40, 80, 160, 40);
        // lb1.setBackground(Color.white);

        tf1 = new TextField();
        this.add(tf1);
        tf1.setBounds(40, 120, 170, 40);

        checktbtn = new Button("Submit");
        this.add(checktbtn);
        checktbtn.setBounds(44, 175, 80, 40);
        checktbtn.setBackground(Color.ORANGE);
        checktbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(130, 175, 80, 40);
        clearBtn.setBackground(Color.GRAY);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 230, 50, 30);
        this.add(result);
        result.setBackground(Color.white);
        result.setFont(getFont());

        ans = new Label();
        ans.setBounds(120, 230, 90, 30);
        this.add(ans);
        ans.setForeground(Color.black);
        ans.setBackground(Color.lightGray);

        error = new Label();
        error.setBounds(45, 280, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = tf1.getText();

        int num = Integer.parseInt(s);

        if (e.getSource() == checktbtn) {

            int rev = 0;
            if (num < 0) {
                error.setText("Invalid input");
            } else {
                while (num > 0) {

                    int r = num % 10;
                    rev =rev*10+r;
                    num /= 10;
                }
                ans.setText(String.valueOf(rev));
            }
        }

        else if (e.getSource() == clearBtn) {
            tf1.setText("");
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

