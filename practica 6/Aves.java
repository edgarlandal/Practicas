public class Aves extends Zoo{
    String color;
    String volar;
    public Aves(String clase,String name,int age, String especie,boolean vaccinated, String color, String volar){
        super(clase,name,age,especie,vaccinated);
        this.color=color;
        this.volar=volar;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }  

    public void eat(){
        System.out.println(name+ " Come semillas");
    }
}
