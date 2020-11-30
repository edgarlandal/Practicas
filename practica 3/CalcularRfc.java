import java.util.*;

class CalcularRfc{
    public static String calcularRfc(String name,String lastNameP, String lastNameM,String birthdate){
        String curp="AAAAAAAAAAAAA";
        char car1[];
        int r,b;
        boolean b2;

        name = name.toUpperCase();
        lastNameP = lastNameP.toUpperCase();
        lastNameM = lastNameM.toUpperCase();

        car1 = curp.toCharArray();

        car1[0] = lastNameP.charAt(0);
        car1[1] = lastNameP.charAt(1);
        car1[2] = lastNameM.charAt(0);
        car1[3] = name.charAt(0);
        car1[4] = birthdate.charAt(2);
        car1[5] = birthdate.charAt(3);
        car1[6] = birthdate.charAt(5);
        car1[7] = birthdate.charAt(6);
        car1[8] = birthdate.charAt(8);
        car1[9] = birthdate.charAt(9);
        for(int i = 10; i < 13 ; i++ ){
            b = (int)(Math.random()*2);
            if(b >= 1) { 
                b2 = true; 
            }else{ 
                b2 = false; 
            } 
    
            if(b2){
                r = (int)(Math.random()*10)+48;
                car1[i] = (char)r;
            }else{
                r = (int)(Math.random()*10)+65;
                car1[i] = (char)r;
            }
        }
        curp = String.valueOf(car1);
        return curp;
    }
}