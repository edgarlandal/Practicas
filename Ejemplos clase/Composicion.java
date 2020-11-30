class Butaca{
    int idButaca;
    int idFila;
    Pasajero pasagero;
}

class Pasajero{
    String nombre;
    String numBoleto;
    Butaca butaca;
}

class Condunctor{
    String nombre;
    String numLicencia;
}

abstract class MedioTransporte{
    String tipoMedio;
    Conductor condtr;
    Pasajero pasajeros[];
    Butaca butacas[];
    //Si un método add() va CON parámetros es una
    //AGREGACION
    void agregarPasajero(Pasajero unPasajero) {

    }
}
class Autobus extends MedioTransporte{
    public void agregarPasajero(Pasajero unPasajero){
    //implementar
    }
}

class Tren extends MedioTransporte{
    public void agregarPasajero(Pasajero unPasajero){
    //implementar
    }
}

class AreaGeografica{
    int zona;
    String nombre;
}

class Ruta{
    AreaGeografica areas[];
    //Si un método add() va SIN parámetros es una
    //COMPOSICION
    void agregarAreas(){
    //definir-capturar los parámetros de área geo.
    }
}
    
class Viaje{//responsible de crear pasajeros
    String IdViaje;
    String destino;
    MedioTransporte medtrans;
    Pasajero pasjro;
    Autobus autobus;
    public Viaje(String dest){
        destino = dest;
    }

    public void crearViaje(MedioTransporte medio){
        medtrans = medio;
    }
    void crearPasajero(){
        pasjro.nombre = "Luis Luna";
        medtrans.agregarPasajero(pasjro);
    }
}
class ViajeRuta{
    Viaje viaje;
    Ruta ruta;
}

public class MisViajes{
    Viaje miViaje = new Viaje("Paris");
    for(int i=0; i<10; i++){
        miViaje.crearPasajero();
    }
    miViaje.crearViaje();
}
}

   