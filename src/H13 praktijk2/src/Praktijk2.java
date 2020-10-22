import java.applet.*;
import java.awt.*;

public class Praktijk2 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.blue);
        treeline1(g,50,90);
        treeline2(g,100,190);
    }

    void treeline1(Graphics g, int x, int y) {

        int teller;
        int xcopy = x;
        for (teller = 0; teller < 10; teller++) {
            g.setColor(Color.black);
            g.fillRect(x, y, 20, 100);
            g.setColor(Color.green);
            g.fillArc(x - 30, y - 80, 80, 90, 0, 360);
            x += 100;
            if (teller == 4) {
                y += 100;
                x = xcopy + 50;
            }
        }
    }

    //ik wilde graag nog een treeline maken voor de lol om het wat mooier eruit te laten zien en de code nog meer te oefenen
            void treeline2(Graphics g, int x, int y) {

                int teller;
                int xcopy = x;
                for(teller = 0; teller < 10; teller++) {
                    g.setColor(Color.black);
                    g.fillRect(x,y,20,100);
                    g.setColor(Color.green);
                    g.fillArc(x-30,y-80,80,90,0,360);
                    x += 100;
                    if (teller == 4) {
                        y += 100;
                        x = xcopy + 50;
            }
        }
    }
}