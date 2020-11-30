import java.io.*;
import javax.swing.*;


public class Alumnos2 {

    public static void main(String[] args) {
       NewAlumno obInp,obOut;

       obInp=new NewAlumno("","","",1,""); //Se inicializa a vacios

       int i,promedioGrupo=0,contador=0,promedioPo;
        int total= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de alumnos que vas a dar de alta al sistema "));
        
	Alumno al[]= new Alumno[total];
        
	for(i=0;i<total;i++){
		contador=contador+1;
             al[i] = new Alumno();
             al[i].setNombre(JOptionPane.showInputDialog("Nombre del Alumno nuevo: " + (i +1)));
			 al[i].setTelefono(JOptionPane.showInputDialog("Telefono del Alumno nuevo: " + (i +1)));
             al[i].setDireccion(JOptionPane.showInputDialog("Direccion del Alumno nuevo: " + (i +1)));
             al[i].setSexo(JOptionPane.showInputDialog("Sexo del Alumno nuevo: " + (i +1)));
			 promedioPo= Integer.parseInt(JOptionPane.showInputDialog("promedioPoo del Alumno nuevo : " + (i + 1)));
			 al[i].setPromedio(promedioPo); 
			 promedioGrupo+=(promedioPo/contador);
			 System.out.println("promedio del grupo" + promedioGrupo);
			 
		}//for
       

	try
	{
 		//***instrucciones para escribir***
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		File file = new File("Serializable.txt");
		boolean doesFileExist = file.exists();
		fileOut = new FileOutputStream(file, true);
		if (doesFileExist)
		objOut = new AppendObjectOutputStream(fileOut);
		else
		objOut = new ObjectOutputStream(fileOut);
		for(i=0;i<al.length;i++){
               	obOut=new NewAlumno(al[i].nombre,al[i].sexo,al[i].direccion,al[i].promedioPoo,al[i].telefono);

               //instruccion para escribir obout(objeto) en objout(archivo)
        
				objOut.writeObject(obOut);

                objOut.flush();
           	}
            
            objOut.close();
			
	}catch (IOException e){}


	try{
            //***instrucciones para leer***

	   //se crea un objeto Stream del archivo con el nombre y formato asignado
	   
           FileInputStream fileIn = new FileInputStream("Serializable.txt");

 	   //se crea un objeto de entrada, para qe represente al archivo
	   
           ObjectInputStream objIn= new ObjectInputStream(fileIn);

	while (fileIn != null) {

		//con la instruccion read, se extrae el contenido del objeto               				
			   
		obInp= (NewAlumno) objIn.readObject(); //Se hace un "cast" a NewAlumno
               System.out.print("Nombre   :" + obInp);
               System.out.print(", Sexo: " + obInp.getSexo());
			   System.out.print(", Direccion: "+ obInp.getDireccion());	
			   System.out.print(", Promedio: " + obInp.getpromedioPoo());
			   System.out.print(", Telefono: " + obInp.getTelefono()+"\n");
	}

           objIn.close();
       } catch(Exception e){}   
    
    
	
 
 }
}

//Clase hecha serializable que permite encapsular los miembros de un objeto para que permanezcan juntos para el almacenamiento (persistencia)
class NewAlumno implements Serializable{
   String nombre, sexo, direccion, telefono;
    int promedioPoo;

    public NewAlumno(String in1, String in2, String in3, int in4, String in5){
        nombre=in1;
        sexo=in2;
        direccion = in3;
        promedioPoo=in4;
		telefono=in5;
    }

    public String toString(){
        return nombre;
    }
    
    public String getSexo(){
    
        return sexo;
    
    }
    public String getDireccion(){

        return direccion;

    }
	public String getTelefono() {
		return telefono;
	}
    public int getpromedioPoo(){

        return promedioPoo;

    }
}

class Alumno {
 String nombre, telefono, direccion, sexo;
 int promedioPoo;

public void setNombre(String nom){
  nombre = nom;
} 

public void setTelefono(String tel){
  telefono = tel;
} 

public void setDireccion(String dir){
  direccion = dir;
} 

public void setSexo(String gen){
  sexo = gen;
} 

public void setPromedio(int prom){
  promedioPoo = prom;
} 

public String getNombre(){
  return nombre;
} 

public String getTelefono(){
  return telefono;
} 

public String getDireccion(){
  return direccion;
} 

public String getSexo(){
  return sexo;
} 

public int getPromedio(){
  return promedioPoo;
} 

}//fin clase Alumno


class AppendObjectOutputStream extends ObjectOutputStream{
	public AppendObjectOutputStream(OutputStream out) throws IOException
	{
		super(out);
	}
	//M�todo sobre-escrito que no escribe un objeto encabezdo, as� que m�ltiples objetos pueden ser le�dos
	protected void writeStreamHeader()
	{ }
}