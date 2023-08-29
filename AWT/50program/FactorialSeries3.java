import java.awt.*;
import java.awt.event.*;
class FactorialSeries3Frame  extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public FactorialSeries3Frame()
    {
        this.setVisible(true);

        Color cl = new Color(96,64,131);
        this.setBackground(cl);
        this.setLayout(null);
        setTitle("!2/2+!4/4+!6/6+!8/8+!10/10  - series");
        this.setBounds(50,50,400,400);
        lb1 = new Label("Enter Your Number");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
        btn1 = new Button("Click");
        btn1.setBounds(20,100,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);
        lb2 = new Label();
        lb2.setBounds(130,100, 400,30);
       
        lb2.setForeground(Color.white);
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

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            try 
            {
                int n = Integer.parseInt(tf1.getText());
                String str ="";
                int i,y=0;
		        for(i=1;i<=n;i++)
		        {
			        y =i*2;
			        str =str+"!"+y+"/"+y;
                    if(i<n)
                    str =str+"+";    
                }
                lb2.setText(str);
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter Valid Number");
            }
            
            tf1.setText("");
        }
    }
}
public class FactorialSeries3
{
    public static void main(String[] args)
    {
       new FactorialSeries3Frame();
    }
}