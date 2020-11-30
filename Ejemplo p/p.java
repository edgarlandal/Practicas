import java.util.*;

public class p {
	public static void main(String[] args) {		
		System.out.println("Hello World");
		System.out.println("Today is september 18th");
		Profesor prof1 = new Profesor (CapturaEntrada.capturaString("Nombre"),
										CapturaEntrada.capturaString("Correo"), 
										CapturaEntrada.capturaEntero("Numero de empleado"), 
										CapturaEntrada.capturaEntero("Categoria"),
										CapturaEntrada.capturaString("Grado de estudio"));
									

		System.out.println(prof1.getNombre());
		System.out.println(prof1.getCorreo());
		System.out.println(prof1.getNoEmpleado());
		System.out.println(prof1.getCategoria());
		System.out.println(prof1.getGradoEstudio());

	}
}

class Persona{
	String nombre,correo;
	public Persona(String nombre, String correo){
		this.nombre=nombre;
		this.correo=correo;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setCorreo(String correo){
		this.correo=correo;
	}
	public String getNombre(){
		return nombre;
	}
	public String getCorreo(){
		return correo;
	}
}

class Alumno extends Persona{
	String matricula;
	float promedio;
	public Alumno(String nombre,String correo,float promedio, String matricula){
		super(nombre,correo);
		this.promedio = promedio;
		this.matricula = matricula;
	}
	public void setPromedio(float promedio){
		this.promedio = promedio;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public float getPromedio(){
		return promedio;
	}
	public String getMatricula(){
		return matricula;
	}
}
class Profesor extends Persona{
	int noEmpleado,categoria;
	String gradoEstudio;
	public Profesor(String nombre,String correo,int noEmpleado,int categoria,String gradoEstudio){
		super(nombre,correo);
		this.noEmpleado=noEmpleado;
		this.categoria=categoria;
		this.gradoEstudio=gradoEstudio;
	}
	public void setNoEmpleado(int noEmpleado){
		this.noEmpleado=noEmpleado;
	}
	public void setCategoria(int categoria){
		this.categoria=categoria;
	}
	public void setGradoEstudio(){
		this.gradoEstudio=gradoEstudio;
	}
	public int getNoEmpleado(){
		return noEmpleado;
	}
	public int getCategoria(){
		return categoria;
	}
	public String getGradoEstudio(){
		return gradoEstudio;
	}
}
class CapturaEntrada{
	public static int capturaEntero(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return (sc.nextInt());
	}	
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