class Mago extends Humano{
    String subespecie,resistencia,habilidades,tipo,casa,sangre,varitas;

    public Mago(String nombre, String especie, String genero,String estado,int nivelMagico, String ocupacion,String rol, String subespecie, String resistencia,String habilidades, String tipo , String casa,String sangre, String varitas){
        super(nombre,especie,genero,estado,nivelMagico,ocupacion,rol);
        this.subespecie=subespecie;
        this.resistencia=resistencia;
        this.habilidades=habilidades;
        this.tipo=tipo;
        this.casa=casa;
        this.sangre=sangre;
        this.varitas=varitas;
    }

    public void setSubespecie(String subespecie){
        this.subespecie=subespecie;
    }
    public void setResistencia(String resistencia){
        this.resistencia=resistencia;
    }
    public void setHabilidades(String habilidades){
        this.habilidades=habilidades;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setCasa(String casa){
        this.casa=casa;
    }
    public void setSangre(String sangre){
        this.sangre=sangre;
    }
    public void setVaritas(String varitas){
        this.varitas=varitas;
    }

    public String getSubespecie(){
        return subespecie;
    }
    public String getResistencia(){
        return resistencia;
    }
    public String getHabilidades(){
        return habilidades;
    }
    public String getTipo(){
        return tipo;
    }
    public String getCasa(){
        return casa;
    }
    public String getSangre(){
        return sangre;
    }
    public String getVaritas(){
        return varitas;
    }
   
}