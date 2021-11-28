import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//

/* Program By Ghanendra Yadav
    Visit http://www.programmingwithbasics.com/
*/
public class MovingClass extends Applet implements MouseListener, Runnable
{
    Thread t=null;
    int x1=10, x2=10, x3=10, x4=10;
    int y1=300, y2=300, y3=300, y4=300;
    int flagx1,flagy1,flagx2,flagy2;
    int flagx3,flagy3,flagx4,flagy4;

    public void init()
    {
        addMouseListener(this);
    }
    public void mouseExited(MouseEvent me)   {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me)  {}
    public void mousePressed(MouseEvent me)  {}
    public void mouseClicked(MouseEvent me)  {}

    public void start()
    {
        t=new Thread(this);
        t.start();
    }

    public void run()
    {
        for(;;)
        {
            try
            {
                repaint();
                if(y1<=50)
                    flagx1=0;
                else if(y1>=300)
                    flagx1=1;
                if(x1<=10)
                    flagy1=0;
                else if(x1>=400)
                    flagy1=1;
                if(y2<=50)
                    flagx2=0;
                else if(y2>=300)
                    flagx2=1;
                if(x2<=10)
                    flagy2=0;
                else if(x2>=400)
                    flagy2=1;
                if(y3<=50)
                    flagx3=0;
                else if(y3>=300)
                    flagx3=1;
                if(x3<=10)
                    flagy3=0;
                else if(x3>=400)
                    flagy3=1;
                if(y4<=50)
                    flagx4=0;
                else if(y4>=300)
                    flagx4=1;
                if(x4<=10)
                    flagy4=0;
                else if(x4>=400)
                    flagy4=1;
                Thread.sleep(10);
            }catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g)
    {
        g.drawRect(10,50,410,270);

        g.setColor(Color.blue);
        g.fillOval(x1,y1,20,20);
        if(flagx1==1)
            y1-=2;
        else if(flagx1==0)
            y1+=2;
        if(flagy1==0)
            x1+=4;
        else if(flagy1==1)
            x1-=4;
        g.setColor(Color.red);
        g.fillOval(x2,y2,20,20);
        if(flagx2==1)
            y2-=4;
        else if(flagx2==0)
            y2+=4;
        if(flagy2==0)
            x2+=3;
        else if(flagy2==1)
            x2-=3;
        g.setColor(Color.yellow);
        g.fillOval(x3,y3,20,20);
        if(flagx3==1)
            y3-=6;
        else if(flagx3==0)
            y3+=6;
        if(flagy3==0)
            x3+=2;
        else if(flagy3==1)
            x3-=2;
        g.setColor(Color.magenta);
        g.fillOval(x4,y4,20,20);
        if(flagx4==1)
            y4-=5;
        else if(flagx4==0)
            y4+=5;
        if(flagy4==0)
            x4+=1;
        else if(flagy4==1)
            x4-=1;
    }
}