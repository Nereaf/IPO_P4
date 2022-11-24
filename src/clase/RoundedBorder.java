/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.border.Border;

/**
 *
 * @author nerea
 */
public  class RoundedBorder implements Border {

    int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius / 2, this.radius, this.radius / 2, this.radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (c.getParent() != null) {
            Color bc = Color.getColor("[146,194,197]");
            g.setColor(c.getParent().getBackground());
            for (int r = 0; r < radius; r++) {
                g.drawRoundRect(x, y, width - 1, height - 1, r, r);
            }
            g.setColor(bc);
        }
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    
}
}
