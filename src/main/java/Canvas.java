import java.awt.*;
import javax.swing.*;

public class Canvas extends JApplet {
AppletMouseListener appletMouseListener = new AppletMouseListener();

    public void init() {
        setBackground(Color.WHITE);
        addMouseListener(appletMouseListener);
   }

   public void paint(Graphics g) {
        g.drawLine(appletMouseListener.X,appletMouseListener.Y,appletMouseListener.X2, appletMouseListener.Y2);
        g.setColor(appletMouseListener.colorRect);
        repaint();
    }

}