import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Practica8 {
    JFrame frame = new JFrame("Practica 8");//frame principal
    ///llama a los paneles
    PanelMenu panelMenu = new PanelMenu();
    PanelCrear panelCrear = new PanelCrear();
    PanelCalcular panelCalcular = new PanelCalcular();
    ///instancia de empleados
    public static Empleados[] empleados = new Empleados[10];
    
    public static void main(String[] args) {
        Practica8 menu = new Practica8();
    }

    public Practica8() {
        ///propiedades del frame
        frame.setBounds(450, 100, 550, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panelMenu);
        frame.setVisible(true);
        frame.setResizable(false);
        acciones();
    }

    public void acciones() {
    //acciones de botones que simplemente permiten el cambio de paneles de uno a otro
        panelMenu.btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelMenu.setVisible(false);
                panelCrear.setVisible(true);
                frame.add(panelCrear);
            }

        });

        panelMenu.btnCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelMenu.setVisible(false);
                panelCalcular.setVisible(true);
                frame.add(panelCalcular);
            }
        });

        panelCrear.btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelMenu.setVisible(true);
                panelCrear.setVisible(false);
                frame.add(panelMenu);
            }
        });
        
        panelCalcular.btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelMenu.setVisible(true);
                panelCalcular.setVisible(false);
                frame.add(panelMenu);
            }
        });
    }
}