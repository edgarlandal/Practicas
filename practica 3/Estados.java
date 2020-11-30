class Estados{
    public static String Estados(String state){
        String curp;
        state = state.toLowerCase();
        switch (state) {
            case "aguascalientes":
                curp="AS";
                break;
            case "baja California":
                curp="BC";
                break;
            case "baja california sur":
                curp="BS";
                break;
            case "campeche":
                curp="CC";
                break;
            case "chiapas":
                curp="CS";
                break;
            case "chihuahua":
                curp="CH";
                break;
            case "coahuila":
                curp="CL";
                break;
            case "colima":
                curp="CM";
                break;
            case "distrito federal":
                curp="DF";
                break;
            case "durango":
                curp="DG";
                break;
            case "estado de mexico":
                curp="MC";
                break;
            case "guanajuato":
                curp="GT";
                break;
            case "guerrero":
                curp="GR";
                break;
            case "hidalgo":
                curp="HG";
                break;
            case "jalisco":
                curp="JC";
                break;
            case "michoacan":
                curp="MN";
                break;
            case "morelos":
                curp="MS";
                break;
            case "nayarit":
                curp="NT";
                break;
            case "nuevo leon":
                curp="NL";
                break;
            case "oaxaca":
                curp="OC"; 
                break;
            case "puebla":
                curp="PL"; 
                break;
            case "queretaro":
                curp="QT"; 
                break;
             case "quintanaroo":
                curp="QR"; 
                break;
            case "san luis potisi":
                curp="SP"; 
                break;
            case "sinaloa":
                curp="SL"; 
                break;
            case "sonora":
                curp="SR"; 
                break;
            case "tabasco":
                curp="TC"; 
                break;
            case "tamaulipas":
                curp="TS"; 
                break;
            case "tlaxcala":
                curp="TL"; 
                break;
            case "veracruz":
                curp="VZ"; 
                break;
            case "yucatan":
                curp="YN"; 
                break;
            case "zacatecas":
                curp="ZS"; 
                break;
            default:
                curp="NE"; 
                break;
    }
    return curp;
    }
}