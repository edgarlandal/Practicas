class Aprobacion{
    public static String Aprobacion(float calf){
        String estado="Reprobada";
        if(calf>=60){
             return estado="Aprobada";
        }
        return estado;
    }
}