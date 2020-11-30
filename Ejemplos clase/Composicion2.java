class Motor {
    int cilindros;
    int potencia;
    String combustible;
    void setMotor(int cilindros, int potencia, String combustible){
        this.cilindros = cilindros;
        this.potencia = potencia;
        this.combustible = combustible;
        System.out.println("setMotor() de Motor");
    }
        void setCilindros(int cilindros) {
            this.cilindros = cilindros;
        }
}//fin de clase Motor
    
    class Automovil {
        String marca;
        int modelo;
        Motor motor = new Motor();
        void setMarca (String marca) {
            this.marca = marca;
        }
        void setMotor(int cilindros, int potencia, String combustible) {
            this.motor.setCilindros(cilindros);
            System.out.println("setMotor() de Automovil");
        }
    }//fin clase Automovil

public class Composicion2{
    public static void main(String args[]){
        Automovil auto = new Automovil();
        auto.motor.setMotor(8, 15000, "Gasolina");
        System.out.println("No. cilindros: " + auto.motor.cilindros);
        System.out.println("No. caballos: " + auto.motor.potencia);
        System.out.println("Conbustible " + auto.motor.combustible);
    }
}//fin clase Composicion2