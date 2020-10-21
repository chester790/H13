import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet{
    Button baksteen;
    Button beton;
    int keuze = 0;

    public void init() {
        baksteen = new Button("Baksteen");
        baksteen.addActionListener(new Listener());

        beton = new Button("Beton");
        beton.addActionListener(new Listener2());

        add (baksteen);
        add (beton);


    }

    public void paint(Graphics g) {
        if(keuze == 1){
            baksteenmuur(g, 10,40,300,100);
        } else if (keuze == 2){
            betonmuur(g,10,40,300,100);
        }
        int teller;
        int y = 0;
        int x = 0;

    }
    void baksteenmuur (Graphics g, int x, int y, int width, int height) {

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
            g.drawLine(x,40,x,140);
        }
    }
    void betonmuur (Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.lightGray);
        g.fillRect(x,y,width,height);

        g.setColor(Color.black);
        g.drawRect(x,y,width,height);


        for(int teller = 0; teller < 10; teller++) {
            y += 10;
            g.drawLine(10, y,310,y);
        }
        for(int teller = 0; teller < 5; teller++){
            x += 50;
            g.drawLine(x,40,x,140);
        }
    }
    class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            keuze = 1;
            repaint();


        }
    }
    class Listener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            keuze = 2;
            repaint();

        }
    }
}