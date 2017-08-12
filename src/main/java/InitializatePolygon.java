/**
 * Created by Virilad on 12.08.2017.
 */
import java.awt.Polygon;
public class InitializatePolygon {

    static int x1 = 0;
    static int x2 = -25;
    static int x3 = 0;
    static int x4 = 25;
        static int x5 = -5;
        static int x6 = -5;
        static int x7 = 5;
        static int x8 = 5;

    static int y1 = 25;
    static int y2 = 0;
    static int y3 = -25;
    static int y4 = 0;
        static int y5 = 5;
        static int y6 = -5;
        static int y7 = -5;
        static int y8 = 5;

    int X1 = x1 + alfa;
    int X2 = x2;
    int X3 = x3 - alfa;
    int X4 = x4;
        int X5 = x5 + (alfa / 50);
        int X6 = x6;
        int X7 = x7 - (alfa / 50);
        int X8 = x8;

    int Y1 = y1;
    int Y2 = y2 + alfa;
    int Y3 = y3;
    int Y4 = y4 - alfa;
        int Y5 = y5;
        int Y6 = y6 + (alfa / 50);
        int Y7 = y7;
        int Y8 = y8 - (alfa / 50);
       int i;
        static int alfa;

        public int iteration () {
    i++;
    alfa = alfa + 10;
    return i;

}

    public Polygon createPolygon () {
       Polygon polygon = new Polygon(new int[]{X1  + AppletMouseListener.X, X5 + AppletMouseListener.X, X2 + AppletMouseListener.X, X6 + AppletMouseListener.X,
               X3 + AppletMouseListener.X, X7 + AppletMouseListener.X, X4 + AppletMouseListener.X, X8 + AppletMouseListener.X},
               new int[]{Y1 + AppletMouseListener.Y, Y5 + AppletMouseListener.Y, Y2 + AppletMouseListener.Y, Y6 + AppletMouseListener.Y,
                       Y3 + AppletMouseListener.Y, Y7 + AppletMouseListener.Y, Y4 + AppletMouseListener.Y, Y8 + AppletMouseListener.Y}, 8);
        return polygon;
    }
}
