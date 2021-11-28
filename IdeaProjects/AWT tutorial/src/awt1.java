import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1  {
    awt1()
    {
        Frame f=new Frame("Hello World");
        Button b=new Button("Submit");
        b.setBounds(140,40,100,30);
        f.add(b);

        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });




    }

    public static void main(String[] args) {
        awt1 a=new awt1();

    }

}
