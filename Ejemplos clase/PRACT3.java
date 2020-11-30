import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class PRACT3{
	
	public static void main(String[] args){
		Random Al= new Random ();
		Scanner scanInput= new Scanner(System.in);
		String CURP=" ";  
		Persona Pers = new Persona(); 
		int opcion; 
		int al;
		  
		 do{
			 System.out.println("1-. Registrar mi CURP:\n");
			 System.out.println("2-. Registrar mi RFC:\n");
			 System.out.println("3-. Salir");
			 
			 System.out.println("\n\t Ingresa tu opcion:\n");
			 opcion = scanInput.nextInt(); // Para guardar la opcion 
			 
		switch(opcion){
			case 1:
			System.out.println("Ingresa tu apellido paterno:\n");
			scanInput.nextLine();
			Pers.setPrimerApellido(scanInput.nextLine());
			
			System.out.println("Ingresa tu apellido materno:\n");
			Pers.setSegunApellido(scanInput.nextLine()); // Capturar los datos.
			
			System.out.println("Ingresa tu o tus nombres:\n ");
			Pers.setNombre(scanInput.nextLine());
			
			System.out.println("Ingresa tu fecha de nacimiento(AAAA/MM/DD):\n");
			Pers.setFechNac(scanInput.nextLine());
			
			System.out.println("Ingresa tu estado de nacimiento:\n");
			Pers.setEstado(scanInput.nextLine());
			
			System.out.println("Ingresa tu genero:\n");
			Pers.setSexo(scanInput.nextLine());
			
			System.out.println("Tu CURP es :\n");
			
			break;
			case 2:
			System.out.println("Ingresa tu apellido paterno:\n");
			
			System.out.println("Ingresa tu apellido materno:\n");
			
			System.out.println("Ingresa tu nombre:\n");
			
			System.out.println("Ingresa tu fecha de nacimiento:\n");
			
			break;
			
			case 3:
			System.out.println("Haz salido del programa \n");
			
			break;
			
			
			
		}
	

	}while(opcion !=3);
	scanInput.close(); // Cerrar el scanner.
	}
	}



 class Persona{
	String PrimerApellido;
	String SegunApellido; 
	String Nombre;
	String Sexo;
	String FechNac;
	String Estado; 
	
 // get´s y set´s
	public String getPrimerApellido(){
		return PrimerApellido;
	}	
	public void setPrimerApellido(String PrimerApellido){
		this.PrimerApellido= PrimerApellido;
	}
	
	public String getSegunApellido(){
		return SegunApellido;
	}
	public void setSegunApellido(String SegunApellido){
		this.SegunApellido= SegunApellido;
	}
	
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String Nombre){
		this.Nombre= Nombre;
	}
	
	public String getSexo(){
		return Sexo;
	}
	public void setSexo(String Sexo){
		this.Sexo= Sexo;
	}
	
	public String getFechNac(){
		return FechNac;
	}
	public void setFechNac(String FechNac){
		this.FechNac= FechNac; 
	}
	
	public String getEstado(){
		return Estado;
	}
	public void setEstado( String Estado){
		this.Estado= Estado;
	}
	
	public Persona(){
	PrimerApellido="";
	SegunApellido="";
	Nombre="";
	Sexo="";
	FechNac="";
	Estado=""; 
	}
	
	public Persona( String PrimerApellido, String SegunApellido, String Nombre, String Sexo, String FechNac, String Estado)
	{
		this.PrimerApellido= PrimerApellido;
		this.SegunApellido= SegunApellido; 
		this.Nombre= Nombre;
		this.Sexo= Sexo;
		this.FechNac= FechNac;
		this.Estado= Estado;
	}
	
}