import javax.swing.*;
import java.awt.*;

public class Canvas extends JApplet {
AppletMouseListener appletMouseListener = new AppletMouseListener();


    public void init() {
        addMouseListener(appletMouseListener);
    }


    public void paint(Graphics g) {

       /* g.drawLine(appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P, appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P);
        g.drawLine(appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P, appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P);
        g.drawLine(appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P, appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P);
        g.drawLine(appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P, appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P);
        */
        g.drawPolygon(
                new Polygon(new int[]{100 + appletMouseListener.Q, 100 + appletMouseListener.Q, 200 + appletMouseListener.Q, 200 + appletMouseListener.Q},
                        new int[]{100, 200 + appletMouseListener.Q, 200 - appletMouseListener.Q, 100 - appletMouseListener.Q}, 4)
        );
        repaint();
    }

}