import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;
        tekenmuur(g,10,10,300, 100);

    }
    void tekenmuur(Graphics g, int x, int y, int width, int height) {

        setBackground(Color.orange);

        g.setColor(Color.red);
        g.fillRect(x,y,width,height);

        g.setColor(Color.black);
        g.drawRect(x,y,width,height);


        for(int teller = 0; teller < 10; teller++) {
            y += 10;
            g.drawLine(10, y,310,y);
        }
        for(int teller = 0; teller < 11; teller++){
            x += 25;
            g.drawLine(x,10,x,110);
        }
    }
}