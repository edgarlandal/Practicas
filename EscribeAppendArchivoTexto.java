import java.io.*;
public class EscribeAppendArchivoTexto {
    public static void main(String[] args){
        File file = new File("pruebatexto.txt");
        boolean doesFileExist = file.exists();
        FileWriter archivo = null;
        PrintWriter pw = null;
try {
archivo = new FileWriter(file, true);
pw = new PrintWriter(archivo);
if (doesFileExist) {
 System.out.println("Entre a append");
for (int i = 0; i < 10; i++)
pw.append("+Linea " + i+"\n");
}
else {
for (int i = 0; i < 10; i++)
pw.println("Linea " + i);
 }
} catch (Exception e) {
e.printStackTrace();
} finally {
try {
// Nuevamente aprovechamos el finally para
// asegurarnos que se cierra el archivo.
if (null != archivo)
archivo.close();
} catch (Exception e2) {
e2.printStackTrace();
}
}//finally
} //main
}
