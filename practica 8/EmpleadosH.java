public class EmpleadosH extends Empleados {
    Float sueldoHoras;
    public EmpleadosH(String name, Integer id, int typeE, Float sueldoHoras) {
        super(name, id, typeE);
        this.sueldoHoras=sueldoHoras;
    }

    public Float getSueldoHoras() {
        return this.sueldoHoras;
    }
    @Override
    public Float calSalario(float horas) {
		return sueldoHoras * horas;
    }
    
}
