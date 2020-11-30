class CriaturaMagica extends Ser{
    String clasificacion,habilidad,habitad;

    public CriaturaMagica(String nombre, String especie, String genero, String estado, String clasificacion, String habilidad, String habitad){
        super(nombre,especie,genero,estado);
        this.clasificacion=clasificacion;
        this.habilidad=habilidad;
        this.habitad=habitad;
    }

    public void setClasificacion(String clasificacion){
        this.clasificacion=clasificacion;
    }
    public void setHabilidad(String habilidad){
        this.habilidad=habilidad;
    }
    public void setHabitad(String habitad){
        this.habitad=habitad;
    }
    public String getClasificacion(){
        return clasificacion;
    }
    public String getHabilidad(){
        return habilidad;
    }
    public String getHabitad(){
        return habitad;
    }
}