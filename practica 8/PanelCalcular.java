import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelCalcular extends JPanel {
    int posicion;
    //creaccion de objetos
    JButton btnCalcular = new JButton("Calcular Salario");
    JButton btnBuscar = new JButton("Buscar");
    JButton btnBack = new JButton("Regresar");

    JTextField txtName = new JTextField();
    JTextField txtId = new JTextField();
    JTextField txtSueldo = new JTextField();
    JTextField txtHoras = new JTextField();
    JTextField txtComision = new JTextField();

    JTextField txtCalHoras = new JTextField();
    JTextField txtCalComision = new JTextField();
    JTextField txtHorasT = new JTextField();
    JTextField txtComisionT = new JTextField();
    JComboBox<String> comboTypeE = new JComboBox<>();

    JLabel lblName = new JLabel("Nombre:");
    JLabel lblId = new JLabel("Identificacion:");
    JLabel lblTypeE = new JLabel("Tipo Empleado:");
    JLabel lblSueldo = new JLabel("Sueldo semanal:");
    JLabel lblHoras = new JLabel("Sueldo por hora:");
    JLabel lblComision = new JLabel("Sueldo por comision:");
    JLabel lblCalHoras = new JLabel("Sueldo total:");
    JLabel lblCalComision = new JLabel("Sueldo total:");
    JLabel lblHorasT = new JLabel("Horas trabajadas:");
    JLabel lblComisionT = new JLabel("Ventas totales");
    PanelCrear panelCrear = new PanelCrear();

    public PanelCalcular() {
        setLayout(null);
        this.setBackground(Color.ORANGE);
        txtName.setBounds(180, 30, 145, 50);
        txtId.setBounds(180, 100, 145, 50);
        txtSueldo.setBounds(180, 240, 145, 50);
        txtHoras.setBounds(180, 310, 145, 50);
        txtComision.setBounds(180, 390, 145, 50);
        txtCalHoras.setBounds(350, 310, 145, 50);
        txtCalComision.setBounds(350, 390, 145, 50);
        txtHorasT.setBounds(10, 310, 145, 50);
        txtComisionT.setBounds(10, 390, 145, 50);

        txtCalComision.setEditable(false);
        txtCalHoras.setEditable(false);
        txtName.setEditable(false);
        txtSueldo.setEditable(false);
        txtHoras.setEditable(false);
        txtComision.setEditable(false);

        comboTypeE.setBounds(180, 170, 145, 50);

        comboTypeE.addItem("Empleado asalariado");
        comboTypeE.addItem("Empleado por hora");
        comboTypeE.addItem("Empleado por comision");
        comboTypeE.addItem("Emplador A/C");
        comboTypeE.setEditable(false);

        lblName.setBounds(180, 10, 145, 10);
        lblId.setBounds(180, 85, 145, 10);
        lblTypeE.setBounds(180, 152, 145, 12);
        lblSueldo.setBounds(180, 225, 145, 10);
        lblHoras.setBounds(180, 295, 145, 12);
        lblComision.setBounds(180, 370, 145, 12);
        lblCalHoras.setBounds(350, 295, 145, 12);
        lblCalComision.setBounds(350, 370, 145, 12);
        lblComisionT.setBounds(10, 370, 145, 10);
        lblHorasT.setBounds(10, 295, 145, 12);

        btnBack.setBounds(10, 30, 145, 50);
        btnBuscar.setBounds(350, 100, 145, 50);
        btnCalcular.setBounds(180, 475, 145, 59);

        accionesCrear();

        add(lblName);
        add(lblId);
        add(lblTypeE);
        add(lblSueldo);
        add(lblHoras);
        add(lblComision);
        add(lblCalHoras);
        add(lblCalComision);
        add(lblHorasT);
        add(lblComisionT);

        add(txtName);
        add(txtId);
        add(txtSueldo);
        add(txtHoras);
        add(txtComision);
        add(txtHorasT);
        add(txtComisionT);
        add(txtCalHoras);
        add(txtCalComision);
        add(comboTypeE);

        add(btnBuscar);
        add(btnCalcular);
        add(btnBack);
    }

    private void accionesCrear() {

        btnBuscar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    for (int i = 0; i < Practica8.empleados.length; i++) {
                        ///permite leer la informacion de los empleados
                        //y refleajarlos
                        if (Practica8.empleados[i].getId().toString().equals(txtId.getText())) {
                            switch (Practica8.empleados[i].typeE) {
                                case 1:
                                    limpiar();
                                    txtName.setText(Practica8.empleados[i].getName());
                                    txtSueldo.setText(
                                            ((EmpleadosA) Practica8.empleados[i]).getSueldoSemanal().toString());
                                    comboTypeE.setSelectedIndex(0);
                                    posicion = i;

                                    break;
                                case 2:
                                    limpiar();
                                    txtName.setText(Practica8.empleados[i].getName());
                                    txtHoras.setText(((EmpleadosH) Practica8.empleados[i]).getSueldoHoras().toString());
                                    comboTypeE.setSelectedIndex(1);
                                    posicion = i;

                                    break;
                                case 3:
                                    limpiar();
                                    txtName.setText(Practica8.empleados[i].getName());
                                    txtComision.setText(((EmpleadosC) Practica8.empleados[i]).getComision().toString());
                                    comboTypeE.setSelectedIndex(2);
                                    posicion = i;

                                    break;
                                case 4:
                                    limpiar();
                                    txtName.setText(((EmpleadosAC) Practica8.empleados[i]).getName());
                                    txtComision.setText(((EmpleadosAC) Practica8.empleados[i]).getSueldoC().toString());
                                    txtSueldo.setText(((EmpleadosAC) Practica8.empleados[i]).getSueldoA().toString());
                                    comboTypeE.setSelectedIndex(3);
                                    posicion = i;
                                    break;
                                default:

                                    break;
                            }
                        }
                    }

                } catch (Exception er) {

                }
            }
        });
        btnCalcular.addActionListener(new ActionListener() {
            ///depnde del tipo de empleado escogera su calculo
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println(posicion + " " + Practica8.empleados[posicion].typeE);
                    if (Practica8.empleados[posicion].typeE == 1) {
                        ((EmpleadosA) Practica8.empleados[posicion]).calSalario(Float.parseFloat(txtSueldo.getText()));
                    } else if (Practica8.empleados[posicion].typeE == 2) {
                        txtCalHoras.setText(((EmpleadosH) Practica8.empleados[posicion])
                                .calSalario(Float.parseFloat(txtHorasT.getText())).toString());
                    } else if (Practica8.empleados[posicion].typeE == 3) {
                        txtCalComision.setText(((EmpleadosC) Practica8.empleados[posicion])
                                .calSalario(Float.parseFloat(txtComisionT.getText())).toString());
                    } else if (Practica8.empleados[posicion].typeE == 4) {
                        txtCalComision.setText(((EmpleadosAC) Practica8.empleados[posicion])
                                .calSalario(Float.parseFloat(txtComisionT.getText())).toString());
                    }
                } catch (Exception er) {
                }

            }

        });
    }

    public void limpiar() {
        txtName.setText("");
        txtId.setText("");
        txtSueldo.setText("");
        txtHoras.setText("");
        txtComision.setText("");
        txtCalComision.setText("");
        txtCalHoras.setText("");
        txtHorasT.setText("");
        txtComisionT.setText("");
        comboTypeE.setSelectedIndex(0);
        txtSueldo.setEditable(true);
        txtHoras.setEditable(false);
        txtComision.setEditable(false);
    }
}
