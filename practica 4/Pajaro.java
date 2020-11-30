class Pajaro{
    String nombre,color,habilidad,alcance,tamano;

    public  Pajaro(String nombre, String color, String habilidad, String alcance, String tamano){
        this.nombre=nombre;
        this.color=color;
        this.habilidad=habilidad;
        this.alcance=alcance;
        this.tamano=tamano;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }   

    public void setColor(String color){
        this.color=color;
    }

    public void setHabilidad(String habilidad){
        this.habilidad=habilidad;
    }

    public void setAlcance(String alcance){
        this.alcance=alcance;
    }
    
    public void setTamano(String tamano){
        this.tamano=tamano;
    }

    public String getNombre(){
        return nombre;
    }

    public String getColor(){
        return color;
    }

    public String getHabilidad(){
        return habilidad;
    }

    public String getAlcance(){
        return alcance;
    }
    
    public String getTamano(){
        return tamano;
    }
}