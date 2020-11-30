import java.util.*;

class Estudiante{
    String nombre,materia,estado;
    int id;
    float calf;

    public Estudiante(String nombre,int id,String materia, float calf, String estado){
        this.nombre=nombre;
        this.id=id;
        this.materia=materia;
        this.calf=calf;
        this.estado=estado;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setMateria(String materia){
        this.materia=materia;
    }

    public void setCalf(int calf){
        this.calf=calf;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id;
    }

    public String getMateria(){
        return materia;
    }

    public float getCalf(){
        return calf;
    }

    public String getEstado(){
        return estado;
    }
}
