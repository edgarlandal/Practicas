public class RobotCortado extends Robot{
    int speedCut;
    public int utility;
    boolean edge =true;

    public RobotCortado(String name, float battery_porcent, int id_num, int action, int speedCut, int utility, boolean edge){
        super(name,battery_porcent,id_num,action);
        this.speedCut = speedCut;
        this.utility = utility;
        this.edge = edge;
    }

    public void setUtility(int resta) {
        utility +=resta;
    }

    @Override
    protected boolean cutMeat() { 
        System.out.println("Esta cortando la carne...");
        return true;
    }

    @Override
    protected boolean cutVegetable() {
        System.out.println("Esta cortando los vegetales..");
        return true;
    }

    @Override
    protected boolean hotFood(){
        System.out.println("Aaah esto esta muy caliente ='( ");
        return false;
    }

    @Override
    protected boolean serve(){
        System.out.println("Lo he tirado todo ='(");
        return false;
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
    public int getUtility(){
        return utility;
    }

    @Override
    protected void chargeBattery() {
        for (int i = 0; i < 10; i++) 
            System.out.println("Canrgado ..... "+(battery_porcent+=10)+"%");
        System.out.println("CARGA COMPLETA");
    }
}
