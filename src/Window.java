import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {


    public Window() {



        setTitle("Window");
        this.setLayout(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500,500);
        this.setVisible(true);


        Panel panel = new Panel();
        this.add(panel);
        repaint();





    }

}




