import javax.swing.*;
public class Table {
    Table()
    {
        JFrame f=new JFrame("Tables");
        f.setSize(700,700);
        String data[][]={{"101","Vansh","20000"},{"102","Rohit","39292"},{"103","Juhi","98766"},{"104","Ishika","8767"},
                {"105","Nikita","63637"}};
        String column[]={"ID","Name","Salary"};
        JTable jt=new JTable(data,column);
        jt.setBounds(100,100,300,200);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Table();
    }
}
