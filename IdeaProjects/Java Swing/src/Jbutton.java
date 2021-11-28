import javax.swing.*;
public class Jbutton {
    Jbutton()
    {
        JFrame f=new JFrame();
        f.setTitle("This is a Swing Tutorial");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        JButton j =new JButton("Submit");
        j.setBounds(100,270,70,30);
        f.add(j);
        JLabel l1=new JLabel("Name");
        l1.setBounds(20,30,60,30);
        f.add(l1);
        JLabel l2=new JLabel("Rollno");
        l2.setBounds(20,60,60,30);
        f.add(l2);
        JLabel l3=new JLabel("Sex");
        l3.setBounds(20,90,60,30);
        f.add(l3);

        JTextField t1=new JTextField();
        t1.setBounds(100,30,120,30);
        f.add(t1);





    }
    public static void main(String[] args) {
    Jbutton b=new Jbutton();
    }
}
