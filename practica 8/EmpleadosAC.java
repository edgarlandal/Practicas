public class EmpleadosAC extends Empleados{

    Float sueldoA;
    Float sueldoC;

    public EmpleadosAC(String name, Integer id, int typeE, Float sueldoC, Float sueldoA) {
        super(name, id, typeE);
        this.sueldoA = sueldoA;
        this.sueldoC = sueldoC;
    }

    public Float calSalario(float numVentas){
        return sueldoA + sueldoC * numVentas;
    }

    public Float getSueldoA() {
        return this.sueldoA;
    }

    public Float getSueldoC() {
        return this.sueldoC;
    }
}
