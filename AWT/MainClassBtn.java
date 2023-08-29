
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class MainClassBtn {

    public static void main(String[] args) throws IOException {

        new MainBtn();

    }

}

class MainBtn extends Frame implements WindowListener {

    public MainBtn() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Mybtn");
        this.addWindowListener(this);
        this.setLayout(null);

        Button btn = new Button("submit");
        this.add(btn);
        btn.setBounds(125, 280, 80, 30);
        btn.setBackground(Color.red);
       // btn.setLocation(125, 280);
       
        Label lbl = new Label("some text ");
        this.add(lbl);
        lbl.setBounds(125, 80, 200, 30);
        lbl.setBackground(Color.white);

        TextField tf = new TextField("Enter text");
        this.add(tf);
        tf.setBounds(125, 120, 200, 30);
        tf.setBackground(Color.white);

        CheckboxGroup cb = new CheckboxGroup();

        Checkbox cb1 = new Checkbox("box 1", cb, false);
        this.add(cb1);
        cb1.setBounds(125, 180, 30, 20);
        cb1.setBackground(Color.white);
        cb1.setSize(40, 30);

        Checkbox cb2 = new Checkbox("box 2", cb, true);
        this.add(cb2);
        cb2.setBounds(125, 220, 30, 20);
        cb2.setBackground(Color.white);
        cb2.setSize(40, 30);

        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Menu-1");
        Menu submenu = new Menu("Sub Menu");
        MenuItem i1 = new MenuItem("Item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        MenuItem i4 = new MenuItem("Item 4");
        MenuItem i5 = new MenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
         menu.add(submenu);
        mb.add(menu);
        this.setMenuBar(mb);

        Choice ch = new Choice();
        ch.setBounds( 420,100,75, 75);    
       
        ch.add("item-1");
        ch.add("item-2");
        ch.add("item-3");
        ch.add("item-4");
        ch.add("item-5");
        this.add(ch);
		
		
        List li = new List();
        li.add("item-1");
        li.add("item-2");
        li.add("item-3");
        li.add("item-4");
        li.add("item-5");
        li.add("item-6");
        li.add("item-7");
        li.add("item-9");
        li.add("item-10");
        li.add("item-11");
        li.add("item-12");
        li.add("item-13");
        li.add("item-14");
        li.add("item-15");
        li.add("item-16");
        li.add("item-17");
        li.add("item-18");
        li.add("item-19");
		
		li.setBounds(340, 100,70,100);
        this.add(li);

        Panel pnl=new Panel();  
        
        this.add(pnl);
        pnl.setBackground(Color.blue);
        pnl.setBounds(120, 75, 400, 290);

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
}
