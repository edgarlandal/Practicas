class Humano extends Ser{
    String ocupacion,rol;
    int nivelMagico;

    public Humano(String nombre, String especie, String genero, String estado,int nivelMagico, String ocupacion, String rol){
        super(nombre,especie,genero,estado);
        this.nivelMagico=nivelMagico;
        this.ocupacion=ocupacion;
        this.rol=rol;
    }

    public void setNivelMagico(int nivelMagico){
        this.nivelMagico=nivelMagico;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion=ocupacion;
    }
    public void setRol(String rol){
        this.rol=rol;
    }

    public int getNivelMagico(){
        return nivelMagico;
    }
    public String getOcupacion(){
        return ocupacion;
    }
    public String getRol(){
        return rol;
    }
}