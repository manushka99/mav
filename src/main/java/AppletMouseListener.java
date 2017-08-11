import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.Color.BLUE;

public class AppletMouseListener implements MouseListener {
    public Color colorRect = BLUE;
    public int X;
    public int Y;
    public int X2;
    public int Y2;

    public void mouseClicked(MouseEvent me) {
        // Сохранить предыдущие координаты точки
        X2 = X;
        Y2 = Y;
        // получить новые координаты точки
        int x = me.getX();
        int y = me.getY();
            X = x;
            Y = y;
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}