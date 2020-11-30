public class Zoo {
    String clase;
    String name;
    int age;
    String especie;
    boolean vaccinated;
    public Zoo(String clase, String name, int age, String especie,boolean vaccinated) {
        this.clase=clase;
        this.name=name;
        this.age=age;
        this.especie=especie;
        this.vaccinated=vaccinated;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void eat(){
        System.out.println(name+ "Come mucho");
    }
    
    public boolean isVaccinated() {
        return this.vaccinated;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
