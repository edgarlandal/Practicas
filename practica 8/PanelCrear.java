import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
///este codigo no lo explico por que creo que
///esta muy dinamico y entendible
public class PanelCrear extends JPanel {
    //Creaccion de objeto
    JButton btnCrear = new JButton("Crear");
    JButton btnBack = new JButton("Regresar");

    JTextField txtName = new JTextField();
    JTextField txtId = new JTextField();
    JTextField txtSueldo = new JTextField();
    JTextField txtHoras = new JTextField();
    JTextField txtComision = new JTextField();

    JComboBox<String> comboTypeE = new JComboBox<>();

    JLabel lblName = new JLabel("Nombre:");
    JLabel lblId = new JLabel("Identificacion:");
    JLabel lblTypeE = new JLabel("Tipo Empleado:");
    JLabel lblSueldo = new JLabel("Sueldo semanal:");
    JLabel lblHoras = new JLabel("Sueldo por hora:");
    JLabel lblComision = new JLabel("Sueldo por comision:");

    int i = 0;

    public PanelCrear() {
        setLayout(null);
        this.setBackground(Color.cyan);
        ///armando ventana 
        txtName.setBounds(180, 30, 145, 50);
        txtId.setBounds(180, 100, 145, 50);
        txtSueldo.setBounds(180, 240, 145, 50);
        txtHoras.setBounds(180, 310, 145, 50);
        txtComision.setBounds(180, 390, 145, 50);

        txtSueldo.setEditable(true);
        txtHoras.setEditable(false);
        txtComision.setEditable(false);

        comboTypeE.setBounds(180, 170, 145, 50);

        comboTypeE.addItem("Empleado asalariado");
        comboTypeE.addItem("Empleado por hora");
        comboTypeE.addItem("Empleado por comision");
        comboTypeE.addItem("Emplador A/C");

        lblName.setBounds(180, 10, 145, 10);
        lblId.setBounds(180, 85, 145, 10);
        lblTypeE.setBounds(180, 152, 145, 12);
        lblSueldo.setBounds(180, 225, 145, 10);
        lblHoras.setBounds(180, 295, 145, 12);
        lblComision.setBounds(180, 370, 145, 12);

        btnBack.setBounds(10, 30, 145, 50);
        btnCrear.setBounds(180, 475, 145, 50);

        accionesCrear();

        add(lblName);
        add(lblId);
        add(lblTypeE);
        add(lblSueldo);
        add(lblHoras);
        add(lblComision);

        add(txtName);
        add(txtId);
        add(txtSueldo);
        add(txtHoras);
        add(txtComision);

        add(comboTypeE);

        add(btnBack);
        add(btnCrear);
    }
    //metodos de los botones
    public void accionesCrear() {
        btnCrear.addActionListener(new ActionListener() {
            ///esto permite la creaccion del tipo de empleado
            //dependiendo del combobox
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (comboTypeE.getSelectedItem().toString()) {
                    case "Empleado asalariado":
                        try {
                            Practica8.empleados[i] = new EmpleadosA(txtName.getText(),
                                    Integer.parseInt(txtId.getText()), 1, Float.parseFloat(txtSueldo.getText()));
                            i++;
                        } catch (Exception er) {
                            JOptionPane.showMessageDialog(txtId, "Datos no estan completos", "Error", ERROR_MESSAGE,
                                    null);
                        }
                        break;
                    case "Empleado por hora":
                        try {
                            Practica8.empleados[i] = new EmpleadosH(txtName.getText(),
                                    Integer.parseInt(txtId.getText()), 2, Float.parseFloat(txtHoras.getText()));
                            i++;
                        } catch (Exception er) {
                            JOptionPane.showMessageDialog(txtId, "Datos no estan completos", "Error", ERROR_MESSAGE,
                                    null);
                        }
                        break;
                    case "Empleado por comision":
                        try {
                            Practica8.empleados[i] = new EmpleadosC(txtName.getText(),
                                    Integer.parseInt(txtId.getText()), 3, Float.parseFloat(txtComision.getText()));
                            i++;
                        } catch (Exception er) {
                            JOptionPane.showMessageDialog(txtId, "Datos no estan completos", "Error", ERROR_MESSAGE,
                                    null);
                        }
                        break;
                    case "Emplador A/C":
                        try {
                            Practica8.empleados[i] = new EmpleadosAC(txtName.getText(),
                                    Integer.parseInt(txtId.getText()), 4, Float.parseFloat(txtComision.getText()),
                                    Float.parseFloat(txtSueldo.getText()));
                            i++;
                        } catch (Exception er) {
                            JOptionPane.showMessageDialog(txtId, "Datos no estan completos", "Error", ERROR_MESSAGE,
                                    null);
                        }
                        break;
                    default:
                        break;
                }

                limpiar();
            }
        });
        ///Dependeiendo del combobox
        //deja editar en unos u otros
        comboTypeE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (comboTypeE.getSelectedItem().toString()) {
                    case "Empleado asalariado":
                        txtSueldo.setEditable(true);
                        txtHoras.setEditable(false);
                        txtComision.setEditable(false);
                        break;
                    case "Empleado por hora":
                        txtSueldo.setEditable(false);
                        txtHoras.setEditable(true);
                        txtComision.setEditable(false);
                        break;
                    case "Empleado por comision":
                        txtSueldo.setEditable(false);
                        txtHoras.setEditable(false);
                        txtComision.setEditable(true);
                        break;
                    case "Emplador A/C":
                        txtSueldo.setEditable(true);
                        txtHoras.setEditable(false);
                        txtComision.setEditable(true);
                        break;
                    default:
                        break;
                }
            }

        });
    }
    //limpiar los textfield
    public void limpiar() {
        txtName.setText("");
        txtId.setText("");
        txtSueldo.setText("");
        txtHoras.setText("");
        txtComision.setText("");
        comboTypeE.setSelectedIndex(0);
        txtSueldo.setEditable(true);
        txtHoras.setEditable(false);
        txtComision.setEditable(false);
    }
}
