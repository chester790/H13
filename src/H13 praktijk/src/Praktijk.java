import java.applet.*;
import java.awt.*;

public class Praktijk extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawString("mooie klein bosje hè, vindt je niet? :D", 90, 250);

        setBackground(Color.blue);

        tree2(g, 100, 100);
        tree1(g, 180, 120);
        tree3(g, 260,100);
    }

    void tree1(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.fillRect(x, y, 20, 100);
        g.setColor(Color.green);
        g.fillArc(x - 30, y - 80, 80, 90, 0, 360);
    }

    void tree2(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.fillRect(x, y, 20, 100);
        g.setColor(Color.green);
        g.fillArc(x - 30, y - 80, 80, 90, 0, 360);

    }

    void tree3(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.fillRect(x, y, 20, 100);
        g.setColor(Color.green);
        g.fillArc(x - 30, y - 80, 80, 90, 0, 360);
    }
}