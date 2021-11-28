import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menu implements ActionListener
{
    JFrame frame;
    JMenuBar menubar;
    JMenu file,edit,help;
    JMenuItem open,save,print,cut,copy,paste,view,feedback;
    JTextArea ta;
    menu()
    {
         frame =new JFrame("Menu");
        frame.setVisible(true);
        frame.setSize(800,800);

        menubar=new JMenuBar();
        frame.setJMenuBar(menubar);
         file=new JMenu("File");
        menubar.add(file);
         open=new JMenuItem("New");
        file.add(open);
         save=new JMenuItem("Save");
        file.add(save);
         print=new JMenuItem("Print");
        file.add(print);
         edit=new JMenu("edit");
        menubar.add(edit);
         cut=new JMenuItem("cut");
        edit.add(cut);
         copy=new JMenuItem("copy");
        edit.add(copy);
         paste=new JMenuItem("paste");
        edit.add(paste);
         help=new JMenu("help");
        menubar.add(help);
         view=new JMenuItem("view");
        help.add(view);
         feedback=new JMenuItem("feedback");
        help.add(feedback);
        open.addActionListener(this);
        save.addActionListener(this);
        print.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        view.addActionListener(this);
        feedback.addActionListener(this);

        ta=new JTextArea();
        ta.setBounds(300,300,100,100);
        frame.add(ta);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==open)
        {
            ta.setText("You have selected open");
        }
        if(e.getSource()==save)
        {
            ta.setText("You have selected save");
        }
        if(e.getSource()==print)
        {
            ta.setText("You have selected print");
        }
        if(e.getSource()==cut)
        {
            ta.setText("You have selected cut");
        }
        if(e.getSource()==copy)
        {
            ta.setText("You have selected copy");
        }
        if(e.getSource()==paste)
        {
            ta.setText("You have selected paste");
        }
        if(e.getSource()==view)
        {
            ta.setText("You have selected view");
        }
        if(e.getSource()==feedback)
        {
            ta.setText("You have selected feedback");
        }
    }
    public static void main(String[] args) {

new menu();

    }
}
