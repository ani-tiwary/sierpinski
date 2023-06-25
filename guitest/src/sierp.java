import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class sierp extends JPanel{
    sierp(){
        this.setPreferredSize(new Dimension(750,(int)(750 * Math.sqrt(3)/2)));
    }
    private static void drawTri(int iteration, int a, int b, int size, Graphics2D g) {
        if (iteration <= 0) return;
        g.drawLine(a, b, a + size, b);
        g.drawLine(a, b, a, b + size);
        g.drawLine(a + size, b, a, b + size);
        drawTri(iteration - 1, a, b, size / 2, g);
        drawTri(iteration - 1, a + size / 2, b, size / 2, g);
        drawTri(iteration - 1, a, b + size / 2, size / 2, g);
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.red);
        g2D.setStroke(new BasicStroke(1));
        drawTri(9, 0, 0, (int)(750 * Math.sqrt(3)/2), (Graphics2D)g);
    }
}