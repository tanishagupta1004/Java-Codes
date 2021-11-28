import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Lab extends JFrame implements ActionListener{

    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    JTextArea jTextArea = new JTextArea();
    Lab(){
        JFrame f= new JFrame("Menu and MenuItem Example");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("Menu");
        submenu=new JMenu("Sub Menu");
        i1=new JMenuItem("Home");
        i2=new JMenuItem("Contact");
        i3=new JMenuItem("About");
        i4=new JMenuItem("Info");
        i5=new JMenuItem("Login");

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);

        menu.add(i1); menu.add(i2); menu.add(i3);
        submenu.add(i4); submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.add(jTextArea);

        jTextArea.setBounds(50, 50, 200, 30);

        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i1)
        {
            jTextArea.setText("You selected Home in Menu.");
        }
        if(e.getSource()==i2)
        {
            jTextArea.setText("You selected Contact in Menu.");
        }
        if(e.getSource()==i3)
        {
            jTextArea.setText("You selected About in Menu.");
        }
        if(e.getSource()==i4)
        {
            jTextArea.setText("You selected Info in Sub-Menu.");
        }
        if(e.getSource()==i5)
        {
            jTextArea.setText("You selected Login in Sub-Menu.");
        }

    }


    public static void main(String args[])
    {
        new Lab();
    }}