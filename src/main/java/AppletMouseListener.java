import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppletMouseListener implements MouseListener {
    public int X;
    public int Y;
    public int X2;
    public int Y2;
    public int P;
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
        }
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}