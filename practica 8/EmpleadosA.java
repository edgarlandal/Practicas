public class EmpleadosA extends Empleados {
    public Float sueldoSemenal;
  
    public EmpleadosA(String name, Integer id, int typeE, Float sueldoSemenal) {
        super(name,id,typeE);        
        this.sueldoSemenal=sueldoSemenal;
    }

    public Float getSueldoSemanal() {
        return this.sueldoSemenal;
    }
    
    public Float calSalario(float sueldoSemanal) {
        return this.sueldoSemenal;
    }

}
