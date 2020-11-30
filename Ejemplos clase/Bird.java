import java.util.*;

public class MiddleAngryBird{

	public static void main(String args[]){
		Ave ave1 = new Ave(CapturaEntrada.capturarString("Nombre "), CapturaEntrada.capturarFloat("Masa "), CapturaEntrada.capturarEntero("Vel Max "), CapturaEntrada.capturarEntero("Ability "), CapturaEntrada.capturarFloat("Peso "), CapturaEntrada.capturarString("Color "), CapturaEntrada.capturarEntero("Strength "));
		ave1.volarAlto(CapturaEntrada.capturarFloat("Angulo "),CapturaEntrada.capturarEntero("Cadencia "));
        ave1.volarAlto(CapturaEntrada.capturarFloat("Angulo "),CapturaEntrada.capturarString("Ritmo "));
		ave1.volarAlto(CapturaEntrada.capturarFloat("Angulo "), ave1.strength, CapturaEntrada.capturarString("Ritmo "));
		ave1.volarAlto(CapturaEntrada.capturarFloat("Angulo "),CapturaEntrada.capturarString("Color "), CapturaEntrada.capturarString("Ritmo "));
	}

}


class Ave{

	private String name;
	private float mass;
	private int speedMax;
	private int ability; 
	private float weight;
	private String color;
	private int strength;
	Vuelo vueloAve;
	
	public Ave(String name, float mass, int speedMax, int ability, float weight, String color, int strength){
		this.name = name;
		this.mass = mass;
		this.speedMax = speedMax;
		this.ability = ability; 
		this.weight = weight;
		this.color = color;
		this.strength = strength;
	}

	public void volarAlto(float angulo, int cadencia){
		vueloAve = new Vuelo(angulo, strength, cadencia);
	}

	public void volarAlto(float angulo, String ritmo){
		vueloAve = new Vuelo(angulo, strength, ritmo);
	}
	
	public void volarAlto(float angulo, float fuerza, String ritmo){
		vueloAve = new Vuelo(angulo, fuerza, ritmo);
	}

	public void volarAlto(float angulo, int cadencia, String ritmo){
		vueloAve = new Vuelo(angulo, strength, cadencia, ritmo);
	}

}


class Vuelo{
	 float anguloVuelo;
	 float fuerzaVuelo;
	 int cadenciaVuelo;
	 String ritmoVuelo;
 
	 public Vuelo(float angulo, float fuerza, int cadencia){
		 anguloVuelo = angulo;
		 fuerzaVuelo = fuerza;
		 cadenciaVuelo = cadencia;
		 ejecutarVuelo();
	 }
	 
	 public Vuelo(float angulo, float fuerza, String ritmo){
		 anguloVuelo = angulo;
		 fuerzaVuelo = fuerza;
		 ritmoVuelo = ritmo;
		ejecutarVuelo();
	 }
	 
	public Vuelo(float angulo, float fuerza, int cadencia, String ritmo){
		 anguloVuelo = angulo;
		 fuerzaVuelo = fuerza;
		 cadenciaVuelo = cadencia;
		 ritmoVuelo = ritmo;
		 ejecutarVuelo();
	 }

	 public void ejecutarVuelo(){
		 System.out.println("Estoy volando con\n" + "Angulo: " + anguloVuelo + "\n Fuerza: " + fuerzaVuelo + "\n Cadencia: " + cadenciaVuelo + "\n Ritmo: " + ritmoVuelo);
	 }

}


class CapturaEntrada{
	
	public static int capturarEntero(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextInt());
	}
	
	public static float capturarFloat(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextFloat());
	}
	
	public static double capturarDouble(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextDouble());
	}
	
	public static String capturarString(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextLine());
	}

}