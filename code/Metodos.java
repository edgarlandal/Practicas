package code;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author German
 */
public class Metodos {

    public void CreateButton(JButton button) {
        button.setBackground(Color.decode("#006666"));
        button.setForeground(Color.WHITE);
        button.setFocusable(false);
    }

    public ImageIcon CreateImageIcon(String name, int ancho, int alto) {
        ImageIcon img = new ImageIcon(getClass().getResource(name));
        img = new ImageIcon(img.getImage().getScaledInstance(ancho, alto, 1));
        return img;
    }

    public void IntercambiarCapa(JPanel visible, JPanel invisible) {
        invisible.setVisible(false);
        visible.setVisible(true);
        visible.requestFocus();
    }
}
