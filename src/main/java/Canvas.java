import com.sun.javafx.geom.Path2D;
import sun.java2d.loops.DrawLine;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JApplet {


public void init() {
    addMouseListener(new AppletMouseListener());
}

    public void paint(Graphics g) {

      if (AppletMouseListener.X != 0) {
        //  appletMouseListener.iteration();
          g.drawPolygon(AppletMouseListener.poligon);
      }
        repaint();
    }

}