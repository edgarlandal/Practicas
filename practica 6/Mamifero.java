public class Mamifero extends Zoo {
    String clasifiacion;
    public Mamifero(String clase,String name,int age, String especie,boolean vaccinated,String clasifiacion) {
        super(clase,name,age,especie,vaccinated);
        this.clasifiacion=clasifiacion;
    }    

    public String getClasifiacion() {
        return clasifiacion;
    }

    public void setClasifiacion(String clasifiacion) {
        this.clasifiacion = clasifiacion;
    }

    
    public void eat(){
        System.out.println(name+ " Come de todo lo que le den");
    }

}
