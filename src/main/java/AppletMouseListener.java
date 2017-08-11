import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

public class AppletMouseListener implements MouseListener {
    public int X;
    public int Y;
    public int X2;
    public int Y2;
    public int P;
    public int Q = 1;
    public void mouseClicked(MouseEvent me) {
        if (me.getButton() == MouseEvent.BUTTON1) {
            // Сохранить предыдущие координаты точки
            X2 = X;
            Y2 = Y;
            // получить новые координаты точки
            int x = me.getX();
            int y = me.getY();
            X = x;
            Y = y;
            P = 25;
            int rad = (int) (sqrt(2.) * P);
            double p = cos(3.14 / 4);
            double pr = rad * p;
            int q = (int) pr;

            Q = 50;
            System.out.println(" P : " + q + "  rad: " + Q + "  pr:" + pr);

        }
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}