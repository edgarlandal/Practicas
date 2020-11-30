import java.util.*;
import java.lang.*; 

public class Practica1 {
	public static void main(String[] args) {
		///Metodos 
		
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Alumno alm = new Alumno("",0);
		///Variables 
		char resp='n';
		int op;	
		String a;

		do{
			menu.Menu();///llamar al menu 
			op = sc.nextInt();///capturar la opcion op
			switch (op) {///seleccion de menu
				case 1:///captura 
					alm.setNombre();
					alm.setCalificaciones();
					break;
				case 2:///impresion de promedio y calificaciones
					System.out.println(alm.getNombre());
					Morstrar.morstrarFloat(alm.getCalificaciones());
					alm.setPromedio();
					System.out.println("Promedio es: "+alm.getPromedio());
					break;
				case 3:///numero menor
					System.out.println("Numero menor: "+Morstrar.mostrarMenor(alm.getCalificaciones()));
					break;
				case 4:///numero mayor
					System.out.println("Numero mayor: "+Morstrar.mostrarMayor(alm.getCalificaciones()));
					break;
				case 5:///salir
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

class Menu {///parte visual del menu
	public static void Menu(){
		System.out.println("Ingrese una opcion: \n"+
						   	"1.-Capturar Nombre y calificaciones\n"+
							"2.-Imprimir calificaciones y promedio de calificaciones\n"+
							"3.-Imprimir calificaciones y calificacion mas baja\n"+
							"4.-Imprimir calificaciones y calificacion mas alta\n"+
							"5.-Salir\n");
	} 
}

class Alumno{///clase alumno
	String nombre;//miembros
	float calificaciones[] = new float [7],promedio=0;
	public Alumno(String nom, float prom){
		nombre=nom;		
		promedio = prom;
	}
	public void setNombre(){//captura de nombre
		nombre = CapturaEntrada.capturaString("Ingrese nombre");
	}
	public void setCalificaciones(){///captura de calificaciones
		for(int i=0; i < calificaciones.length; i++){
			calificaciones[i] = CapturaEntrada.capturaFloat("Ingrese calificacion numero ["+i+"]: ");
		}
	}
	public void setPromedio(){///calcula promedio
		for(int i=0;i < calificaciones.length; i++){
			promedio+=calificaciones[i];
		}
		promedio=promedio/calificaciones.length;
	}
	public String getNombre(){///get de nombre
		return nombre;
	}
	public float [] getCalificaciones(){/// get de calificaciones
		return calificaciones;
	}
	public float getPromedio(){/// get de promedio retornos
		return promedio;
	}
}

class CapturaEntrada{///capturar los float y los string
	public static float capturaFloat(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return(sc.nextFloat());
	}
	public static String capturaString(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return(sc.nextLine());
	}
}

class Morstrar{///mostrar algunas opciones
	public static void morstrarFloat(float [] calf){///mostrar los numeros de un arreglo
		for(int i = 0; i<calf.length; i++){
			System.out.println("Calificacion ["+i+"]:  "+calf[i]);
		}
	}
	public static float mostrarMayor(float [] calf){///buscar el numero mayor
		float mayor=calf[0];
		for (int i = 0; i < calf.length; i++) {
			if (mayor < calf[i]) {
				mayor = calf[i];
			}
		}
		return mayor;
	}
	public static float mostrarMenor(float [] calf){///buscar el menor
		float menor = calf[0];
		for (int i = 0; i < calf.length; i++) {
			if (menor > calf[i]) {
				menor = calf[i];
			}
		}
		return menor;
	} 
}