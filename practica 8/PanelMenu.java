import java.awt.Color;
import javax.swing.*;

public class PanelMenu extends JPanel{

    public JButton btnCrear;
    public JButton btnCalcular;
    JLabel lblHola;

    public PanelMenu(){//creacion del pequeno menu
        setLayout(null);
        setBackground(Color.GREEN);
        lblHola = new JLabel("Hola que desea hacer con el sistema?");
        lblHola.setBounds(160, 100, 240, 50);

        btnCalcular =  new JButton("Calcular");
        btnCalcular.setBounds(200,200,125,50);
        
        btnCrear = new JButton("Crear");
        btnCrear.setBounds(200, 300, 125, 50);
        
        add(lblHola);
        add(btnCalcular);
        add(btnCrear);
    }
}
