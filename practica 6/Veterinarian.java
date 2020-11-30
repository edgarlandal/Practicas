public class Veterinarian {
    String name;
    double salary;
    
    public Veterinarian(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public static void vaccinate(Zoo animal){
        animal.setVaccinated(true);
        System.out.println(animal.getName()+" Tiene vacuna");
    }
}
