public class Felinos extends Zoo{
    String subEspecie;
    float peso;
    String habitad;
    public Felinos(String clase,String name,int age, String especie, boolean vaccinated,String subEspecie, float peso, String habitad) {
        super(clase,name,age,especie,vaccinated);
        this.subEspecie=subEspecie;
        this.peso=peso;
        this.habitad=habitad;
    }    

    public String getSubEspecie() {
        return subEspecie;
    }

    public void setSubEspecie(String subEspecie) {
        this.subEspecie = subEspecie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
    
    public void eat(){
        System.out.println(name+ "Come mucha carne ");
    }

}
