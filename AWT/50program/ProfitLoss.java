
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class ProfitLoss {

    public static void main(String[] args) throws IOException {
        new ProfitLossFrame();
    }

}

class ProfitLossFrame extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, result, ans, error;
    TextField cpob, spob;
    Button checktbtn, clearBtn;

    public ProfitLossFrame() {
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Hcf");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter cost price");
        this.add(lb1);
        lb1.setBounds(40, 80, 130, 30);
        // lb1.setBackground(Color.white);
        lb2 = new Label("Enter sell price");
        this.add(lb2);
        lb2.setBounds(190, 80, 130, 30);

        cpob = new TextField();
        this.add(cpob);
        cpob.setBounds(40, 120, 140, 30);

        spob = new TextField();
        this.add(spob);
        spob.setBounds(190, 120, 140, 30);

        checktbtn = new Button("count");
        this.add(checktbtn);
        checktbtn.setBounds(44, 170, 70, 30);
        checktbtn.setBackground(Color.cyan);
        checktbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(265, 170, 60, 30);
        clearBtn.setBackground(Color.GRAY);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 220, 60, 30);
        this.add(result);
        result.setBackground(Color.orange);

        ans = new Label();
        ans.setBounds(265, 220, 60, 30);
        this.add(ans);
        ans.setForeground(Color.black);


        error = new Label();
        error.setBounds(45, 300, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = cpob.getText();
        String s2 = spob.getText();

        int cp = Integer.parseInt(s1);
        int sp = Integer.parseInt(s2);
        if (e.getSource() == checktbtn) {

            if (cp < 0 || sp < 0) {
               error.setText("Invalid.. cost or saling prize.");
            } else if (cp > sp) {
                int loss = cp - sp;
                ans.setText("loss is: " + loss);
            } else if (sp > cp) {
                int profit = sp - cp;
                ans.setText("profit is: " + profit);
            }
        }

        else if (e.getSource() == clearBtn) {
            cpob.setText("");
            spob.setText("");
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
