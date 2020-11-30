public class Practica6 {

    public static void main(String[] args) {
        char resp='n';
        int i=2,pos;/// i es igual a cuantos valores tiene inicializados 

        Funciones.animal[0] = new Felinos("Felino","Tiger",5,"Tigre",false,"Bengala",220,"Bosques Tropicales");///incializar
        Funciones.animal[1] = new Aves("Ave","Mordecai",3,"Azulejo",false,"Azul","Si");

        do { 
            CapturaEntrada.Limpiar();
            Menu.Menu();///seleccion de accion
            switch (CapturaEntrada.capturaEntero("Opcion")) {
                case 1:
                    CapturaEntrada.Limpiar();
                    Funciones.mostrarLista(i);
                    break;
                case 2:
                    CapturaEntrada.Limpiar();
                    Funciones.mostarAnimal(CapturaEntrada.capturaEntero("Posicion del animal"));
                    break;
                case 3:
                    CapturaEntrada.Limpiar();
                    Funciones.cambio(i);
                    break;
                case 4:
                    CapturaEntrada.Limpiar();
                    Funciones.agregar(i);
                    i++;//anade un punto mas al arreglo
                    break;
                case 5:
                    CapturaEntrada.Limpiar();
                    while ((pos=CapturaEntrada.capturaEntero("Posicion a eliminar"))>i) {///verifica que la posicion sea valida
                        System.out.println("Posicion no encontarda");
                    }
                    Funciones.elimiar(pos,i);
                    i--;///quita un punto al arreglo
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no validad");
                    break;
            }
            resp = CapturaEntrada.capturaChar("Desea continuar? y/n");
        } while (resp=='y'|| resp!='n');
    }
}
