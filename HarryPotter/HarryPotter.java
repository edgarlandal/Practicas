import java.util.*;
import java.io.IOException;


public class HarryPotter{
    public static void main(String[] args) {
        int op;
        char resp='n';
        Menu menu = new Menu();
        Scanner sc= new Scanner(System.in);

        CriaturaMagica CM = new CriaturaMagica(" "," "," "," "," "," "," ");
        Humano H = new Humano(" "," "," "," ",0," "," ");
        Mago M = new Mago(" "," "," "," ",0," "," "," "," "," "," "," "," "," ");

        do{
            LimpiarPantalla.Limpiar();
            menu.Menu();///llamar al menu 
            op = sc.nextInt();///capturar la opcion op
            switch (op) {
                case 1:
                    LimpiarPantalla.Limpiar();
                    CM.setNombre(CapturaEntrada.capturaString("Nombre "));
                    CM.setEspecie(CapturaEntrada.capturaString("Especie "));
                    CM.setGenero(CapturaEntrada.capturaString("Genero "));
                    CM.setEstado(CapturaEntrada.capturaString("Estado "));
                    CM.setClasificacion(CapturaEntrada.capturaString("Clasificaion "));
                    CM.setHabilidad(CapturaEntrada.capturaString("Habilidad "));
                    CM.setHabitad(CapturaEntrada.capturaString("Habitad "));
                    break;
                case 2:
                    LimpiarPantalla.Limpiar();
                    H.setNombre(CapturaEntrada.capturaString("Nombre "));
                    H.setEspecie(CapturaEntrada.capturaString("Especie "));
                    H.setGenero(CapturaEntrada.capturaString("Genero "));
                    H.setEstado(CapturaEntrada.capturaString("Estado "));
                    H.setNivelMagico(CapturaEntrada.capturaEntero("Nivel Magico "));
                    H.setOcupacion(CapturaEntrada.capturaString("Ocupacion "));
                    H.setRol(CapturaEntrada.capturaString("Rol "));
                    break;
                case 3:
                    LimpiarPantalla.Limpiar();
                    M.setNombre(CapturaEntrada.capturaString("Nombre: "));
                    M.setEspecie(CapturaEntrada.capturaString("Especie "));
                    M.setGenero(CapturaEntrada.capturaString("Genero "));
                    M.setEstado(CapturaEntrada.capturaString("Estado "));
                    M.setNivelMagico(CapturaEntrada.capturaEntero("Nivel Magico "));
                    M.setOcupacion(CapturaEntrada.capturaString("Ocupacion "));
                    M.setRol(CapturaEntrada.capturaString("Rol "));
                    M.setSubespecie(CapturaEntrada.capturaString("Subespecie "));
                    M.setResistencia(CapturaEntrada.capturaString("Resistencias "));
                    M.setHabilidades(CapturaEntrada.capturaString("Habilidades "));
                    M.setTipo(CapturaEntrada.capturaString("Tipo de mago "));
                    M.setCasa(CapturaEntrada.capturaString("Casa "));
                    M.setSangre(CapturaEntrada.capturaString("Estatus de Sangre "));
                    M.setVaritas(CapturaEntrada.capturaString("Varita "));
                    break;
                case 4:
                    LimpiarPantalla.Limpiar();
                    System.out.println("Nombre: "+CM.getNombre());
                    System.out.println("Especie: "+CM.getEspecie());
                    System.out.println("Genero: "+CM.getGenero());
                    System.out.println("Estado: "+CM.getEstado());
                    System.out.println("Clasificaion: "+CM.getClasificacion());
                    System.out.println("Habilidad: "+CM.getHabilidad());
                    System.out.println("Habitad: "+CM.getHabitad());
                    break;
                case 5:
                    LimpiarPantalla.Limpiar();
                    System.out.println("Nombre: "+H.getNombre());
                    System.out.println("Especie: "+H.getEspecie());
                    System.out.println("Genero: "+H.getGenero());
                    System.out.println("Estado: "+H.getEstado());
                    System.out.println("Nivel Magico: "+H.getNivelMagico());
                    System.out.println("Ocupacion: "+H.getOcupacion());
                    System.out.println("Rol: "+H.getRol());
                    break;
                case 6:
                    LimpiarPantalla.Limpiar();
                    System.out.println("Nombre : "+M.getNombre());
                    System.out.println("Especie : "+M.getEspecie());
                    System.out.println("Genero : "+M.getGenero());
                    System.out.println("Estado : "+M.getEstado());
                    System.out.println("Nivel Magico : "+M.getNivelMagico());
                    System.out.println("Ocupacion: "+M.getOcupacion());
                    System.out.println("Rol : "+M.getRol());
                    System.out.println("Subesecie : "+M.getSubespecie());
                    System.out.println("Resistencias : "+M.getResistencia());
                    System.out.println("Habilidades : "+M.getHabilidades());
                    System.out.println("Tipo de mago : "+M.getTipo());
                    System.out.println("Casa : "+M.getCasa());
                    System.out.println("Estatus de Sangre : "+M.getSangre());
                    System.out.println("Varita : "+M.getVaritas());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("Desea continuar y/n");///pregunta si desea continuar 
			resp = sc.next().charAt(0);/// capturar respuesta
        }while(resp!='n');
    }
}
