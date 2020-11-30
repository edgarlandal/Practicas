public class Marinos extends Zoo{
    String zona;
    String tipo;
    public Marinos(String clase,String name,int age, String especie,boolean vaccinated ,String zona, String tipo) {
        super(clase,name,age,especie,vaccinated);
        this.zona=zona;
        this.tipo=tipo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void eat(){
        System.out.println(name+ " Come otros peces");
    }

}
