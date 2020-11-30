public class Funciones {/// funciones que manejan la array list
    static Zoo [] animal = new Zoo[5];

    public static void mostrarLista(int cont){///permite mostrar tpdos los animales almacenados  
        System.out.println("I Nombre Especie");
        for (int i = 0; i < cont ; i++) {
            System.out.println(i+" "+animal[i].getName()+" "+animal[i].getEspecie());
        }
    }

    public static void mostarAnimal(int i) {///permite mostrar solo un animal
        System.out.println("Clase: "+animal[i].getClase());//estos son los atributos de la clase padre
        System.out.println("Nombre: "+animal[i].getName());
        System.out.println("Edad: "+animal[i].getAge());
        System.out.println("Especie: "+animal[i].getEspecie());
        ////usnado el instanceof podemos tomar por sus subclases
        if (animal[i] instanceof Felinos) {///este es el caso de los felinos
            System.out.println("Subespecie:"+((Felinos) animal[i]).getSubEspecie());
            System.out.println("Pesos: "+((Felinos)animal[i]).getPeso()+"Kg");
            System.out.println("Habitad: "+((Felinos)animal[i]).getHabitad());
        }
        if (animal[i] instanceof Aves){///este es el caso de las aves
            System.out.println("Puede volar?"+((Aves) animal[i]).getVolar());
            System.out.println("Color: "+((Aves) animal[i]).getColor());
        }
        if (animal[i] instanceof Reptiles){///este es el caso de los reptiles 
            System.out.println("Puede nadar?:"+((Reptiles) animal[i]).getNadar());
            System.out.println("Numero de patas: "+((Reptiles)animal[i]).getPatas());
        }
        
        if (animal[i] instanceof Mamifero){///este es el caso de los mamifers
            System.out.println("Clasificacion: "+((Mamifero)animal[i]).getClasifiacion());
        }
        if (animal[i] instanceof Marinos) {///este es el caso de los marinos
            System.out.println("Zona: "+((Marinos)animal[i]).getZona());
            System.out.println("Tipo: "+((Marinos)animal[i]).getTipo());
        }
        animal[i].eat();///metodoo que sobrecargan 
        Veterinarian.vaccinate(animal[i]);//metodo de vacunacion
    }

    public static void agregar(int i){///metodo para agregar animales al arreglo
        int op2;
        Menu.Menu2();
        op2 = CapturaEntrada.capturaEntero("Opcion");   
        switch (op2) {
            case 1:///creaccion para el caso de los felinos 
                animal[i] = new Felinos("Felino",CapturaEntrada.capturaString("Nombre"),
                                                 CapturaEntrada.capturaEntero("Edad"),
                                                 CapturaEntrada.capturaString("Especie"),
                                                 false,
                                                 CapturaEntrada.capturaString("Subespecie"),
                                                 CapturaEntrada.capturaFloat("Peso"),
                                                 CapturaEntrada.capturaString("Habitad"));
                break;
            case 2:///caso de las aves
                animal[i] = new Aves("Ave",CapturaEntrada.capturaString("Nombre"),
                                           CapturaEntrada.capturaEntero("Edad"),
                                           CapturaEntrada.capturaString("Especie"),
                                           false,
                                           CapturaEntrada.capturaString("Color"),
                                           CapturaEntrada.capturaString("Volar"));
                break;
            case 3:///caso de los reptiles
                animal[i] = new Reptiles("Reptil",CapturaEntrada.capturaString("Nombre"),
                                                  CapturaEntrada.capturaEntero("Edad"),
                                                  CapturaEntrada.capturaString("Especie"),
                                                  false,
                                                  CapturaEntrada.capturaString("Puede Nadar?(S/N)"),
                                                  CapturaEntrada.capturaEntero("Numero de patas"));
                break;
            case 5:////caso de los mamiferos
                animal[i] = new Mamifero("Mamifero",CapturaEntrada.capturaString("Nombre"),
                                                    CapturaEntrada.capturaEntero("Edad"),
                                                    CapturaEntrada.capturaString("Especie"),
                                                    false,
                                                    CapturaEntrada.capturaString("Clasifiacion"));
                break;
            case 4:///caso  de los marinos 
                animal[i] = new Marinos("Marino",CapturaEntrada.capturaString("Nombre"),
                                                  CapturaEntrada.capturaEntero("Edad"),
                                                  CapturaEntrada.capturaString("Especie"),
                                                  false,
                                                  CapturaEntrada.capturaString("Zona"),
                                                  CapturaEntrada.capturaString("Tipo"));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("Se agrego de manera correcta");
    }

    public static void elimiar(int pos, int cont) {///eliminar un animal 
        animal[pos]=null;///hacemos null a ese animal
        for (int i = pos; i < cont; i++) {
            animal[i]=animal[i+1];/// luego le damos el valor siguiente
            animal[i+1]=null;/// luego lo hacemos null
        }
        System.out.println("Se elimino de manera correcta");
    }

    public static void cambio(int i) {///sirve para clasificar por las 5 clases
        Menu.Menu3();
        switch (CapturaEntrada.capturaEntero("opcion")) {
            case 1:
                mostrarClase(i,"Felino");
                break;
            case 2:
                mostrarClase(i, "Ave");
                break;
            case 3:
                mostrarClase(i, "Reptil");
                break;
            case 4:
                mostrarClase(i, "Marino");
                break;
            case 5:
                mostrarClase(i, "Mamifero");
                break;
            default:
                System.out.println("Opciono no valida");
                break;
        }
    }
    
    public static void mostrarClase(int cont, String clase ) {
        for (int i = 0; i < cont; i++) 
            if(clase==animal[i].getClase())
                System.out.println(i+" "+animal[i].getName()+" "+animal[i].getEspecie());
    }
}
