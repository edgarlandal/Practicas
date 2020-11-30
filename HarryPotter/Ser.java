class Ser{
    String nombre, especie, genero, estado;

    public Ser(String nombre, String especie, String genero, String estado){
        this.nombre=nombre;
        this.especie=especie;
        this.genero=genero;
        this.estado=estado;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEspecie(String especie){
        this.especie=especie;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public String getGenero(){
        return genero;
    }
    public String getEstado(){
        return estado;
    }
}