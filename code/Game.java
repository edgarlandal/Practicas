package code;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author German
 */
public class Game extends Nucleo {

    private JPanel panel;

    private JLabel L_Equipo;
    private JLabel L_Inventario;
    private JLabel L_Mapa;
    private JLabel L_Ajustes;
    private JLabel L_Guardar;
    private JLabel L_Salir;
    private boolean MenuActivo;

    public Game() {
        panel = new JPanel(null);
        panel.setBackground(Color.BLACK);

        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == e.VK_CONTROL) {
                    if (MenuActivo) {
                        MenuActivo = false;
                        Ventana.setSize(ANCHO * 15, ALTO * 15);
                        Ventana.setLocationRelativeTo(null);
                    } else {
                        Ventana.setSize(ANCHO * 15, ALTO * 16);
                        Ventana.setLocationRelativeTo(null);
                        MenuActivo = true;
                    }
                }
            }
        });

        CreateMenu();

        Ventana.add(panel);
    }

    private void CreateMenu() {
        L_Equipo = new JLabel(metodo.CreateImageIcon("/varios/Menu_0.png", ANCHO, ALTO));
        L_Equipo.setBounds(0, ALTO * 15, ANCHO, ALTO);
        panel.add(L_Equipo);

        L_Inventario = new JLabel(metodo.CreateImageIcon("/varios/Menu_1.png", ANCHO, ALTO));
        L_Inventario.setBounds(ANCHO * 1, ALTO * 15, ANCHO, ALTO);
        panel.add(L_Inventario);

        L_Mapa = new JLabel(metodo.CreateImageIcon("/varios/Menu_2.png", ANCHO, ALTO));
        L_Mapa.setBounds(ANCHO * 2, ALTO * 15, ANCHO, ALTO);
        panel.add(L_Mapa);

        L_Ajustes = new JLabel(metodo.CreateImageIcon("/varios/Menu_3.png", ANCHO, ALTO));
        L_Ajustes.setBounds(ANCHO * 3, ALTO * 15, ANCHO, ALTO);
        panel.add(L_Ajustes);

        L_Guardar = new JLabel(metodo.CreateImageIcon("/varios/Menu_4.png", ANCHO, ALTO));
        L_Guardar.setBounds(ANCHO * 4, ALTO * 15, ANCHO, ALTO);
        panel.add(L_Guardar);

        L_Salir = new JLabel(metodo.CreateImageIcon("/varios/Menu_5.png", ANCHO, ALTO));
        L_Salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                System.exit(0);
            }
        });
        L_Salir.setBounds(ANCHO * 5, ALTO * 15, ANCHO, ALTO);
        panel.add(L_Salir);
    }

    public void NewGame(JPanel PanelSecundario) {
        metodo.IntercambiarCapa(panel, PanelSecundario);
    }

}
