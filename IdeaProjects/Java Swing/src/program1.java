import javax.swing.*;
public class program1
{
    public program1()
    {
        JFrame f=new JFrame("Student Details Form");

        JButton sub = new JButton("SUBMIT");

        JTextField name = new JTextField();
        JTextField roll = new JTextField();
        JTextField age = new JTextField();
        JTextArea add = new JTextArea();
        JTextArea d1=new JTextArea();

        JRadioButton radmale = new JRadioButton("Male");
        JRadioButton radfemale = new JRadioButton("Female");
        JRadioButton radothers = new JRadioButton("Others");


        JLabel lname = new JLabel("Name");
        JLabel lroll = new JLabel("Roll no.");
        JLabel lage = new JLabel("Age");
        JLabel lgen = new JLabel("Gender");
        JLabel ladd = new JLabel("Address");
        //JLabel pl= new JLabel("Languages");

        lname.setBounds(20, 40, 80, 30);
        lroll.setBounds(20, 80, 80, 30);
        lage.setBounds(20, 120, 80, 30);
        lgen.setBounds(20, 160, 80, 30);
       // pl.setBounds(20, 200, 80, 30);
        ladd.setBounds(20, 240, 80, 30);

        name.setBounds(100, 40, 100, 30);
        roll.setBounds(100, 80, 80, 30);
        age.setBounds(100, 120, 50, 30);
        radmale.setBounds(100, 150, 75, 50);
        radfemale.setBounds(200, 150, 75, 50);
        radothers.setBounds(300, 150, 75, 50);
       // chkcpp.setBounds(100, 190, 75, 50);
        //chkJava.setBounds(200, 190, 75, 50);
        //chkPython.setBounds(300, 190, 75, 50);

        add.setBounds(100, 250, 200, 200);
        sub.setBounds(150, 470, 100, 50);

        f.add(lname);
        f.add(lroll);
        f.add(lage);
        f.add(lgen);
        f.add(ladd);
        f.add(name);
        f.add(roll);
        f.add(age);
        f.add(radmale);
        f.add(radfemale);
        f.add(radothers);
        f.add(add);
        f.add(sub);
        //f.add(chkcpp);
        //f.add(chkJava);
        //f.add(chkPython);
        //f.add(pl);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[])
    {
       program1 p=new program1();
    }
}