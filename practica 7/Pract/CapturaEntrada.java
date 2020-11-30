import java.util.*;

public class CapturaEntrada{
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
    
    public static int capturaEntero(String msg){
        Scanner sc =new Scanner(System.in);
        System.out.println(""+ msg + ": ");
        return(sc.nextInt());
	}

	public static char capturaChar(String msg){
        Scanner sc =new Scanner(System.in);
        System.out.println(""+ msg + ": ");
        return(sc.next().charAt(0));
  }
  
  public static boolean capturaBoolean(String msg){
    Scanner sc =new Scanner(System.in);
    System.out.println(""+ msg + ": ");
    return(sc.nextBoolean());
  }
  public static void Limpiar() {
    try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception e) {
        /*No hacer nada*/
    }
  }
}