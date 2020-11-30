import java.util.*;

public class Practica4{
    static int n = 4;
    public static void main(String[] args) {
        int op,j;
        char resp='n';
        Menu menu = new Menu();

        Scanner sc= new Scanner(System.in);
        AngryBird P [] = new AngryBird[n];
        
        for(int i=0; i<P.length; i++)
            P[i] = new AngryBird("N/D","N/D","N/D","N/D","N/D","N/D","N/D","N/D","N/D");

        do{
            menu.Menu();///llamar al menu 
            op = sc.nextInt();///capturar la opcion op
            j=op-1;
            switch (op) {
                case 1:
                    P[j].setNombre("RED");
                    P[j].setColor("Rojo");
                    P[j].setHabilidad("Ninguna");
                    P[j].setAlcance("Medio");
                    P[j].setTamano("Medio");
                    P[j].setInfo("Red es de forma redonda, su plumaje es de color rojo, y dos cejas muy gruesas color negro.");
                    P[j].setAccion("Grito de guerra");
                    P[j].setPersonalidad("Responsable y persistente");
                    break;
                case 2:
                    P[j].setNombre("AGUILA PODEROSA");
                    P[j].setColor("Cafe con blanco");
                    P[j].setHabilidad("Elimina a todos los cerdos de un nivel");
                    P[j].setAlcance("Extremo");
                    P[j].setTamano("Gigante");
                    P[j].setInfo("Vive en su cueva.");
                    P[j].setAccion("CAER!!!");
                    P[j].setPersonalidad("Seria");
                    break;
                case 3:
                    P[j].setNombre("CHUCK");
                    P[j].setColor("Amarillo");
                    P[j].setHabilidad("Puede acelerar y alcanzar una velocidad muy rapida");
                    P[j].setAlcance("Normal");
                    P[j].setTamano("Medio");
                    P[j].setInfo("A diferencia de las otras aves, Chuck tiene forma de cono, con una mata de plumas negras en la cabeza y en la cola, y con cejas de color cafe");
                    P[j].setPersonalidad("Chuck es un pajaro muy disparatado e hiperactivo");
                    break;
                case 4:
                    P[j].setNombre("TERECE");
                    P[j].setColor("Rojo");
                    P[j].setHabilidad("Super fuerza y gran tamano");
                    P[j].setAlcance("Medio");
                    P[j].setTamano("Gigante");
                    P[j].setPeso("Gordo, le hace falta bajarle a los tacos");
                    P[j].setInfo("Es hermano mayor de RED");
                    P[j].setPersonalidad("Muy silencioso y aislado que rara vez muestra emocion, tristeza o alegria");
                    break;
                default:
                    break;
            }
            System.out.println("Nombre: "+P[j].getNombre());
            System.out.println("Color: "+P[j].getColor());
            System.out.println("Habilidad: "+P[j].getHabilidad());
            System.out.println("Alcance: "+P[j].getAlcance());
            System.out.println("Tamano: "+P[j].getTamano());
            System.out.println("Peso: "+P[j].getPeso());
            System.out.println("Informacio: "+P[j].getInfo());
            System.out.println("Personalidad: "+P[j].getPersonalidad());

            System.out.println("Desea continuar y/n");///pregunta si desea continuar 
			resp = sc.next().charAt(0);/// capturar respuesta
        }while(resp!='n');
    }
}