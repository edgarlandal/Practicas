public class AngryBird extends Pajaro{
    String peso,personalidad,accion,info;

    public AngryBird(String nombre, String color, String habilidad, String alcance, String tamano, String peso, String info, String accion, String personalidad){
        super(nombre,color,habilidad,alcance,tamano);
        this.peso = peso;
        this.info = info;
        this.accion=accion;
        this.personalidad=personalidad;
    }

    public void setPeso(String peso){
        this.peso = peso;
    }

    public void setAccion(String accion){
        this.accion=accion;
    }

    public void setInfo(String info){
        this.info=info;
    }

    public void setPersonalidad(String personalidad){
        this.personalidad=personalidad;
    }

    public String getPeso(){
        return peso;
    }

    public String getAccion(){
        return accion;
    }

    public String getInfo(){
        return info;
    }

    public String getPersonalidad(){
        return personalidad;
    }

    public void accion(String msg){
        System.out.println(" "+ msg +"");
    }

    public void info(String info){
        System.out.println("\""+ info + "\"");
    }
}