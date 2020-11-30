public class RobotHervir extends Robot {
    
    public RobotHervir(String name, float battery_porcent, int id_num, int action){
        super(name,battery_porcent,id_num,action);
    }

    @Override
    protected boolean cutMeat() { 
        System.out.println("Como se toma esta cosa");
        return false;
    }

    @Override
    protected boolean cutVegetable() {
        System.out.println("Casi mato a mi creador con esto >:3");
        return false;
    }
    @Override
    protected boolean hotFood(){
        System.out.println("Se esta calentado correctamente =)");
        return true;
    }

    @Override
    protected boolean serve(){
        System.out.println("Dispulme mi inutilidad en este ambito:c");
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

    @Override
    protected void chargeBattery() {
        for (int i = 0; i < 10; i++) 
            System.out.println("Canrgado ..... "+(battery_porcent+=10)+"%");
        System.out.println("CARGA COMPLETA");
    }

    @Override
    protected void setUtility(int num){}

    @Override
    protected int getUtility() {
        return 0;
    }
}