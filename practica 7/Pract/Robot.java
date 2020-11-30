public abstract class Robot implements Interfaz{/// clase padre 
    String name;
    float battery_porcent;
    int id_num;
    int action;
    public Robot(String name, float battery_porcent, int id_num, int action ){
        this.name=name;
        this.battery_porcent=battery_porcent;
        this.id_num=id_num;
        this.action=action;
    }
    
    protected abstract boolean cutMeat();
    protected abstract boolean cutVegetable();
    protected abstract boolean hotFood();
    protected abstract boolean serve();
    protected abstract float getBattery();
    protected abstract void chargeBattery();
    protected abstract void setUtility(int num);
    protected abstract int getUtility();

    public String name(){
        return name;
    }
    
    public void battery(){}
    
    public int id(){
        return 0;
    }
    
    public void actionLast(){}
}
