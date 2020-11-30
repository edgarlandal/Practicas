package code;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author German
 */
public class Load extends Nucleo {

    private JPanel panel;

    private JPanel PanelBotones;
    private JButton B_NuevaPartida;
    private JButton B_CargarPartida;
    private JButton B_Creditos;
    private JButton B_Salir;

    private JLabel Portada;

    public Load() {
        panel = new JPanel(new BorderLayout());

        PanelBotones = new JPanel(new GridLayout());
        metodo.CreateButton(B_NuevaPartida = new JButton("Nueva Partida"));
        B_NuevaPartida.addActionListener(e->{
            game.NewGame(panel);
        });
        PanelBotones.add(B_NuevaPartida);

        metodo.CreateButton(B_CargarPartida = new JButton("Cargar Partida"));
        PanelBotones.add(B_CargarPartida);

        metodo.CreateButton(B_Creditos = new JButton("Creditos"));
        PanelBotones.add(B_Creditos);

        metodo.CreateButton(B_Salir = new JButton("Salir"));
        B_Salir.addActionListener(e->{
            System.exit(0);
        });
        PanelBotones.add(B_Salir);
        panel.add(PanelBotones, BorderLayout.NORTH);

        Portada = new JLabel(metodo.CreateImageIcon("/varios/portada.jpg", ANCHO*15, ALTO*15));
        panel.add(Portada, BorderLayout.CENTER);

        Ventana.add(panel);
    }
}
