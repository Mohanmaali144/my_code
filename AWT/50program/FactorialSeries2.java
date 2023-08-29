import java.awt.*;
import java.awt.event.*;

class FactorialSeries2Frame extends Frame implements ActionListener {
    Label lb1, lb2;
    TextField tf1;
    Button btn1, btn2;

    public FactorialSeries2Frame()
    {
        this.setVisible(true);
        Color cl = new Color(211,185,150);
        this.setBackground(cl);
        this.setLayout(null);
        setTitle("-!2/2+!4/4-!6/6+!8/8-!10/10 series ");
        this.setBounds(50,50,500,400);
       
       
       
        lb1 = new Label("Enter a Number");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);


        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);

        btn1 = new Button("Submit");
        btn1.setBounds(20,100,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);


        lb2 = new Label();
        lb2.setBounds(130,100, 400,30);
       
        lb2.setForeground(Color.BLACK);
        add(lb2);
        addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
       
        }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            try {
                int n = Integer.parseInt(tf1.getText());
                String s = "";
                int i = 1;
                // int x = 2, y = 0, fact = 1, sum = 0;
                for (i = 1; i <= n; i++) {
                    if (i % 2 == 0)
                        s = s + "+!" + (i * 2) + "/" + (i * 2);
                    else
                        s = s + "-!" + (i * 2) + "/" + (i * 2);
                }
                lb2.setText(s);
            } catch (NumberFormatException ex) {
                lb2.setText("Please Enter Valid Number");
            }

            tf1.setText("");
        }
    }
}

public class FactorialSeries2 {
    public static void main(String[] args) {
     new FactorialSeries2Frame();
    }
}