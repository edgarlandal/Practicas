public class Reptiles extends Zoo{
    String nadar;
    int patas;
    public Reptiles(String clase,String name,int age, String especie,boolean vaccinated, String nadar,int patas) {
        super(clase,name,age,especie,vaccinated);
        this.nadar=nadar;
        this.patas=patas;
    }

    public String getNadar() {
        return nadar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void eat(){
        System.out.println(name+ " Come insectos");
    }

}
