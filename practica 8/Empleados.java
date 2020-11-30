public abstract class Empleados implements InterfazE {
    String name;
    public Integer id;
    int typeE;

    public Empleados(String name, Integer id, int typeE) {
        this.name=name;
        this.id=id;
        this.typeE=typeE;
    }

    public Float calSalario(float f){
        return null;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }
}
