import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.lang.Math.cos;
import static java.lang.StrictMath.sin;

public class AppletMouseListener extends InitializatePolygon implements MouseListener {
    public static int X;
    public static int Y;
    public double X2;
    public int Y2;
    public int P;
    public static Polygon poligon;

    public void mouseClicked(MouseEvent me) {

        if (me.getButton() == MouseEvent.BUTTON1) {
        InitializatePolygon initializatePolygon = new InitializatePolygon();
        poligon = initializatePolygon.createPolygon();
        initializatePolygon.iteration();

            // Сохранить предыдущие координаты точки
            X2 = X;
            Y2 = Y;
            // получить новые координаты точки
            int x = me.getX();
            int y = me.getY();
           // X = x1 * cos(90) - y1 * sin(90) ;
           X = x;
           Y = y;
           System.out.println(initializatePolygon.i + "I   " );

            P = 25;
        }

    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    }
