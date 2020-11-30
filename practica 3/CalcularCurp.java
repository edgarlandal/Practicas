import java.util.*;

class CalcularCurp{
    public static String calcularCurp(String name,String lastNameP, String lastNameM,String birthdate,String gender, String state){
        String curp="                  ";
        char car1[];
        int i,r;
        name = name.toUpperCase();
        lastNameP = lastNameP.toUpperCase();
        lastNameM = lastNameM.toUpperCase();

        car1 = curp.toCharArray();
        car1[0] = lastNameP.charAt(0);
        for(i = 1; i<lastNameP.length(); i++){
            char lNP = lastNameP.charAt(i);
            if(lNP=='A'|| lNP =='E' || lNP =='I'|| lNP == 'O' || lNP =='U'){
                car1[1]=lastNameP.charAt(i);
                break;
            }
        }

        car1[2] = lastNameM.charAt(0);
        car1[3] = name.charAt(0);
        car1[4] = birthdate.charAt(2);
        car1[5] = birthdate.charAt(3);
        car1[6] = birthdate.charAt(5);
        car1[7] = birthdate.charAt(6);
        car1[8] = birthdate.charAt(8);
        car1[9] = birthdate.charAt(9);
        car1[10] = gender.charAt(0);
        String st = Estados.Estados(state);
        car1[11] = st.charAt(0);
        car1[12] = st.charAt(1);
        for(i = 1; i<lastNameP.length() ;i++){
            char lNP = lastNameP.charAt(i);
            if(lNP !='A'&& lNP !='E' && lNP !='I'&& lNP != 'O' && lNP !='U'){
                car1[13]=lastNameP.charAt(i);
                break;
            }
        }
        for(i = 1; i<lastNameM.length(); i++){
            char lNM = lastNameM.charAt(i);
            if(lNM!='A'&& lNM !='E' && lNM !='I'&& lNM != 'O' && lNM !='U'){
                car1[14]=lastNameM.charAt(i);
                break;
            }
        }
        for(i = 1; i<name.length(); i++){
            char n= name.charAt(i);
            if(n!='A'&& n !='E' && n !='I'&& n != 'O' && n !='U'){
                car1[15]=name.charAt(i);
                break;
            }
        }
        if(birthdate.charAt(0)<2){
            r = (int)(Math.random()*10)+48;
            car1[16] = (char)r;
        }else{
            r = (int)(Math.random()*10)+65;
            car1[16] = (char)r;
        }
        r = (int)(Math.random()*10)+48;
        car1[17] = (char)r;
        curp = String.valueOf(car1);

        return curp;
    }
}