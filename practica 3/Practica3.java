import java.util.*;

public class Practica3{
    public static void main(String [] args){
        Visual menu = new Visual();
        Scanner sc= new Scanner(System.in);
        CalcularCurp calc1 = new CalcularCurp(); 
        CalcularRfc calc2 = new CalcularRfc();
        Persona persona1 = new Persona("","","","","","","","");
        int op;
        char resp='n';
        do{
            menu.Menu();///llamar al menu 
            op = sc.nextInt();///capturar la opcion op
            switch (op) {
                case 1:System.out.println("| Ingrese los siguientes datos  |"); 
                        persona1.setName(CapturaEntrada.capturaString("|             Nombre            |"));
                        persona1.setLastNameP(CapturaEntrada.capturaString("|       Apellido Paterno        |"));
                        persona1.setLastNameM(CapturaEntrada.capturaString("|       Apellido Materno        |"));
                        persona1.setBirthdate(CapturaEntrada.capturaString("|Fecha de nacimiento(AAAA/MM/DD)|"));
                        persona1.setGender(CapturaEntrada.capturaString("|           Genero(H/M)         |"));
                        persona1.setState(CapturaEntrada.capturaString("|             Estado            |"));
                        persona1.setCURP(calc1.calcularCurp(persona1.getName(),
                                           persona1.getLastNameP(),
                                           persona1.getLastNameM(),
                                           persona1.getBirthdate(),
                                           persona1.getGender(),
                                           persona1.getState()));
                        persona1.setRFC(calc2.calcularRfc(persona1.getName(),
                                          persona1.getLastNameP(),
                                          persona1.getLastNameM(),
                                          persona1.getBirthdate()));
                    break;
                case 2:
                    System.out.println("Su CURP es : "+ persona1.getCURP());
                    break;
                case 3:
                    System.out.println("Su RFC es : "+ persona1.getRFC());
                    break;
                case 4:System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("Desea continuar y/n");///pregunta si desea continuar 
			resp = sc.next().charAt(0);/// capturar respuesta
        }while(resp!='n');
    }
}