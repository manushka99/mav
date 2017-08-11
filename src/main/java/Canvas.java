import javax.swing.*;
import java.awt.*;

public class Canvas extends JApplet {
AppletMouseListener appletMouseListener = new AppletMouseListener();

    public void init() {
        addMouseListener(appletMouseListener);
    }


    public void paint(Graphics g) {

        g.drawLine(appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P, appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P);
        g.drawLine(appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P, appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P);
        g.drawLine(appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P, appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y - appletMouseListener.P);
        g.drawLine(appletMouseListener.X - appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P, appletMouseListener.X + appletMouseListener.P, appletMouseListener.Y + appletMouseListener.P);

        repaint();
    }

}