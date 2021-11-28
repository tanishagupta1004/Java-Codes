import javax.swing.*;
public class Radio_Button  {



    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(1000,1000);
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        JLabel l1=new JLabel("Gender");
        l1.setBounds(40,100,100,30);
        //r1.setBounds(140,20,70,30);
        //r2.setBounds(230,20,70,30);
        ButtonGroup g=new ButtonGroup();
        //g.add(r1);
       // g.add(r2);
        f.add(l1);
        //f.add(r1);
       // f.add(r2);
        f.setVisible(true);
        f.setLayout(null);

    }
}
