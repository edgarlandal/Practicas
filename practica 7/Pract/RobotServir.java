public class RobotServir extends Robot{
    public RobotServir(String name, float battery_porcent, int id_num, int action){
        super(name,battery_porcent,id_num,action);
    }
    @Override
    protected boolean cutMeat() { 
        System.out.println("Hay no me corte mi dedo de metal :c");
        return false;
    }

    @Override
    protected boolean cutVegetable() {
        System.out.println("Hay no me corte mi dedo de metal :c");
        return false;
    }
    @Override
    protected boolean hotFood(){
        System.out.println("Lo termine quemando :o");
        return false;
    }

    @Override
    protected boolean serve(){
        System.out.println("Servido y listo para comer");
        return true;
    }
    @Override
    public void actionLast(int num){
        action = num;
    }

    @Override
    public void battery(int discharge) {
        battery_porcent-= discharge;
    }
    
    @Override
    public String name() {
        return name;
    }

    @Override
    public int id() {
        return id_num;
    }

    public float getBattery(){
        return battery_porcent;
    }
    @Override
    protected void chargeBattery() {
        for (int i = 0; i < 10; i++) 
            System.out.println("Canrgado ..... "+(battery_porcent+=10)+"%");
        System.out.println("CARGA COMPLETA");
    }

    @Override
    protected void setUtility(int num) {
    }///no hace nada pero al meomento de hacerlas abstracta la clase principal me pedia usarla aqui 
    ////y en el caso de donde es me pedi ponerla en la clase padre

    @Override
    protected int getUtility() {
        return 0;
    }
}
