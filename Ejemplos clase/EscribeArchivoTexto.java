import java.io.*;
public class EscribeArchivoTexto{
    public static void main(String[] args)  {
        FileWriter archivo = null;
        PrintWriter pw = null;
        try{
            archivo = new FileWriter("pruebatexto.txt");
            pw = new PrintWriter(archivo);
            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);
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
        }
    }
}