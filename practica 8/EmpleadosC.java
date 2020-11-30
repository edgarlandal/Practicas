public class EmpleadosC extends Empleados {
    private Float comision;
    public EmpleadosC(String name, Integer id, int typeE, Float comision) {
        super(name, id, typeE);
        this.comision = comision;
    }

    public Float getComision() {
        return this.comision;
    }
    
    public Float calSalario(float numVentas){
        return comision * numVentas;
    }
    
}
