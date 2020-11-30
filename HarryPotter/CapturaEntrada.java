import java.util.*;

class CapturaEntrada{
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
}