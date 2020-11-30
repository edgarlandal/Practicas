import java.util.*;

public class Practica2{
    public static void main(String [] args){
        Estudiante estds[] = new Estudiante[10];
        
        estds[0]= new Estudiante("Erick",1,"POO",60,"");
        estds[1]= new Estudiante("Areli",2,"POO",55,"");
        estds[2]= new Estudiante("Edgar",3,"POO",67,"");
        estds[3]= new Estudiante("Mario",4,"POO",90,"");
        estds[4]= new Estudiante("Paul ",5,"POO",45,"");

        for(int i = 5; i<estds.length; i++){
            estds[i]= new Estudiante(CapturaEntrada.capturaString("Nombre"),
                                        i+1,
                                        CapturaEntrada.capturaString("Materia"),
                                        CapturaEntrada.capturaFloat("Calificacion"),
                                        "");
        }

        for(int i = 0;i< estds.length; i++){
            estds[i].setEstado(Aprobacion.Aprobacion(estds[i].getCalf()));
        }
        System.out.println("Nombre: Id: Materia: Calificacion: Estado:");
        for(int i = 0;i< estds.length; i++){
           System.out.println(estds[i].getNombre()+"    "+ 
                                estds[i].getId()+"   "+
                                estds[i].getMateria()+"        "+
                                estds[i].getCalf()+"   "+
                                estds[i].getEstado());
        }
    }
}
