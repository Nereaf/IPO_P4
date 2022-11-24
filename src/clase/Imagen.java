package clase;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Imagen extends javax.swing.JPanel {
    int x, y;
    String a;

    public Imagen(JPanel jPanel1, String a) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        this.a=a;
    }

    public String getA() {
        return  a;
    }

    public void setA(String a) {
        this.a = a;
    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource(a));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
        
    }    

}