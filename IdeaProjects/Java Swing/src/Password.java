import javax.swing.*;
public class Password {
    public static void main(String[] args) {
        JFrame f=new JFrame("Password");
        f.setSize(1000,1000);
        JPasswordField value=new JPasswordField();
        JLabel L1=new JLabel("Password");
        L1.setBounds(20,100,80,30);
        value.setBounds(100,100,100,30);
        f.add(value);
        f.add(L1);
        f.setLayout(null);
        f.setVisible(true);
    }
}
