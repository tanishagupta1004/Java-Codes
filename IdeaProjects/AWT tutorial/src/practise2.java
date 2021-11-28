
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class practise2 extends Frame
{
    practise2()
    {
        Frame f = new Frame("Welcome ");
        Choice c = new Choice();
        TextArea area = new TextArea();
        Button b = new Button("Submit");
        Label l,l1,l2,l3,l4,l5;

        TextField t1,t2,t3;
        l= new Label("Student Detail Form");
        l1= new Label("Name: ");
        t1= new TextField();
        l2= new Label("Roll No.: ");
        t2= new TextField();
        l3= new Label("Age: ");
        t3= new TextField();
        l4= new Label("Gender: ");
        l5= new Label("Address: ");

        l.setBounds(50,35,200,50);
        l1.setBounds(50,100,100,30);
        t1.setBounds(175,100,100,30);
        l2.setBounds(50,150,100,30);
        t2.setBounds(175,150,100,30);
        l3.setBounds(50,200,100,30);
        t3.setBounds(175,200,100,30);
        l4.setBounds(50,250,100,30);
        c.setBounds(175,250,100,30);
        l5.setBounds(50,300,100,30);
        area.setBounds(175,300,100,100);
        b.setBounds(100,450,100,30);

        c.add("Female");
        c.add("Male");
        c.add("Other");
        f.add(l);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(l5);
        f.add(c);
        f.add(area);
        f.add(b);

        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });





    }
    public static void main(String[] args)
    {
        practise2 f = new practise2();
    }
}
