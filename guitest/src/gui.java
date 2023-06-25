import javax.swing.*;

public class gui extends JFrame{
    sierp panel;
    gui(){
        panel = new sierp();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}