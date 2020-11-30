package code;

import java.awt.CardLayout;
import javax.swing.JFrame;

/**
 *
 * @author German
 */
public class Init extends Nucleo {

    public Init() {
        JFrame Ventana = new JFrame();
        Ventana.setSize(ANCHO * 15, ALTO * 15);
        Ventana.setLayout(new CardLayout());
        Ventana.setUndecorated(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Inicializar();

        Ventana.setVisible(true);
    }

    private void Inicializar() {
        Metodos metodo = new Metodos();
        Load load = new Load();
        Game game = new Game();
    }

    public static void main(String[] args) {
        Init init = new Init();
    }
}
