/**
 * Created by Virilad on 12.08.2017.
 */

import java.awt.*;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

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

    int X1 = matrixX(x1, y1);
    int Y1 = matrixY(x1, y1);
    int X2 = matrixX(x2, y2);
    int X3 = matrixX(x3, y3);
    int X4 = matrixX(x4, y4);
    int X5 = matrixX(x5, y5);
    int X6 = matrixX(x6, y6);
    int X7 = matrixX(x7, y7);
    int X8 = matrixX(x8, y8);


    int Y2 = matrixY(x2, y2);
    int Y3 = matrixY(x3, y3);
    int Y4 = matrixY(x4, y4);
    int Y5 = matrixY(x5, y5);
    int Y6 = matrixY(x6, y6);
    int Y7 = matrixY(x7, y7);
    int Y8 = matrixY(x8, y8);
    int i;
    int a = 25;
    static int alfa;

    public int iteration() {
        i++;
        alfa = alfa + 10;
        return i;

    }

    public int matrixX(int x, int y) {

        double[][] mA = {{cos(45), -sin(45)},
                {sin(45), cos(45)}};
        double[][] p = {{x},
                {y}};
        int m = mA.length;
        int n = p[0].length;
        int o = p.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * p[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
            }
        }
        int X = res[0][0];
        int X2 = res[1][0];
        return X;
    }

    public int matrixY(int x, int y) {
        double[][] mA = {{cos(45), -sin(45)},
                {sin(45), cos(45)}};
        double[][] p = {{x},
                {y}};
        int m = mA.length;
        int n = p[0].length;
        int o = p.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * p[k][j];
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {

            }
        }
        int Y = res[1][0];
        return Y;
    }


    public Polygon createPolygon() {
       Polygon polygon = new Polygon(new int[]{X1  + AppletMouseListener.X, X5 + AppletMouseListener.X, X2 + AppletMouseListener.X, X6 + AppletMouseListener.X,
               X3 + AppletMouseListener.X, X7 + AppletMouseListener.X, X4 + AppletMouseListener.X, X8 + AppletMouseListener.X},
               new int[]{Y1 + AppletMouseListener.Y, Y5 + AppletMouseListener.Y, Y2 + AppletMouseListener.Y, Y6 + AppletMouseListener.Y,
                       Y3 + AppletMouseListener.Y, Y7 + AppletMouseListener.Y, Y4 + AppletMouseListener.Y, Y8 + AppletMouseListener.Y}, 8);
        return polygon;
    }
}


