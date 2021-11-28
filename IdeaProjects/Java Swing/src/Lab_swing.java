import javax.swing.*;
public class Lab_swing {
    public Lab_swing()
    {
        JFrame J=new JFrame();
        J.setTitle("Welcome");
        J.setVisible(true);
        J.setSize(1000,1000);
        J.setLayout(null);

        JLabel l1=new JLabel("STUDENTS DETAILS FORM");
        l1.setBounds(30,20,250,30);
        J.add(l1);
        JLabel l2=new JLabel("Name");
        l2.setBounds(20,70,100,30);
        J.add(l2);
        JTextField t1=new JTextField();
        t1.setBounds(140,70,150,30);
        J.add(t1);

        JLabel l3=new JLabel("Rollno");
        l3.setBounds(20,110,100,30);
        J.add(l3);
        JTextField t2=new JTextField();
        t2.setBounds(140,110,150,30);
        J.add(t2);

        JLabel l4=new JLabel("Age");
        l4.setBounds(20,150,100,30);
        J.add(l4);
        JTextField t3=new JTextField();
        t3.setBounds(140,150,150,30);
        J.add(t3);

        JLabel l5= new JLabel("Gender");
        l5.setBounds(20,190,100,30);
        J.add(l5);
        ButtonGroup bg=new ButtonGroup();
        JRadioButton r1=new JRadioButton("A) Male");
        JRadioButton r2=new JRadioButton("B) Female");
        r1.setBounds(75,190,100,30);
        r2.setBounds(150,190,100,30);
        bg.add(r1);
        bg.add(r2);
        J.add(r1);
        J.add(r2);

        JLabel l6= new JLabel("Address");
        l6.setBounds(20,230,100,30);
        J.add(l6);

        JTextArea ta1=new JTextArea();
        ta1.setBounds(150,230,150,100);
        J.add(ta1);

        JButton b=new JButton("Submit");
        b.setBounds(200,300,100,30);
        J.add(b);

        J.setDefaultCloseOperation(J.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Lab_swing l=new Lab_swing();
    }
}







