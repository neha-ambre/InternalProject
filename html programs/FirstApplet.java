
import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet {


    public void init()
    {
        setBackground(Color.black);
        setForeground(Color.yellow);
     }
 
    public void paint(Graphics g)
    {
         g.drawString("Welcome",100,50);
     }
}

