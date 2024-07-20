import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel implements MouseListener, MouseMotionListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }



    private BufferedImage image;

    public Panel() {

        //this.setLayout(null);
        this.setBounds(0,0,500,500);
        try {
            this.image = ImageIO.read(new File("Rizz/angryBirdsStartPage.png").getAbsoluteFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.setVisible(true);
        repaint();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
//        this.setFocusable(true);
//        this.requestFocus();

//        Color color = picture();
//        paintNewPicture(color);
    }

    public Color picture() {
        int max = 0;
        int cur = 0;
        int red = 0;
        int green = 0;
        int blue = 0;
        Color maxColor = null;
        Color currColor = null;


        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                currColor = new Color(this.image.getRGB(i, j));
                int r = currColor.getRed();
                int g = currColor.getGreen();
                int b = currColor.getBlue();
                int sum = r + g + b;


                if (sum > max) {
                    max = sum;
                    maxColor = currColor;
                }

            }

        }
        return maxColor;
    }

    public void paintNewPicture(Color color) {
        for (int i = 0; i < this.image.getWidth()/2; i++) {

            for (int j = 0; j < this.image.getHeight(); j++) {
                this.image.setRGB(i, j, color.getRGB());
            }
        }

    }
    public void func () {
        for (int i = 0; i < this.image.getWidth(); i++) {

            for (int j = 0; j < this.image.getHeight(); j++) {
                Color c = new Color(this.image.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                if(r+15>256){
                    r=0;
                }
                if(g+15>256){
                    g=0;
                }
                if(b+15>256){
                    b=0;
                }

               Color newColor = new Color(r+10, g+10, b+10);
               this.image.setRGB(i, j, newColor.getRGB());
            }

        }



    }



        @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 0, 0,this.getWidth(),this.getHeight(), this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {
        func();
        System.out.println("mousePressed");
        repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
