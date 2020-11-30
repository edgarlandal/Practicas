class Practica7{
    public static void main(String[] args) {
        selectionR();// inciar la seleccion
    }

    public static void selectionR(){
        Robot[] robot = new Robot[3];//inicializar
        robot[0] = new RobotCortado("Juancho",100,1,0,1,20,true);//robot cortador 
        robot[1] = new RobotHervir("Luis",100,2,0);/// robot cocinero 
        robot[2] = new RobotServir("Paco",100,3,0);/// robot servir
        char resp = 'n';/// solo para continuar
        int cont = 0;// contador que permite saber si se completo o no
        do{ 
            Menu.MenuPrincipal();// menu principal
            int op = CapturaEntrada.capturaEntero("Ingrese opcion");//op menu
            switch(op){
                case 1:// robot cortador
                    if(selectionAction(robot[0],cont) > 0){// con esto comprobamos si se hizo correcto
                        cont++;// se le suma al contador 
                    }else{
                        cont = 0;// se reinicio el contador
                    }
                    robot[0].battery(10);//descarga la bateria 
                    robot[0].setUtility(-1);/// le quita utilidad al cuchillo 
                    if(robot[0].getUtility() == 0){//// saber si sigue sirviendo o no
                        System.out.println("Oh no se ha roto tomare otro");//mensaje
                        robot[0].setUtility(20);//rcupera la utibilidad
                    }
                    System.out.println("Porcemtaje de carga: "+robot[0].getBattery());// mostrar porcentaje
                    System.out.println("Mi nombre es"+ robot[0].name()+ "\n"+"Mi id es :"+ robot[0].id());//datos       
                    if(robot[0].getBattery() == 0){///saber si se desargdo 
                        System.out.println("Se termino la bateria favor de regargar");
                        if(CapturaEntrada.capturaChar("Desea recargar ? y/n") == 'y')//recargar?
                            robot[0].chargeBattery();//recarga
                        break;// vuelve a reiniciar menu
                    }         
                    break;
                case 2:// aqui se repite todo lo del anterior pero sin utilidad
                    if(selectionAction(robot[1],cont) > 0){
                        cont++;
                    }else{
                        cont = 0;
                    }
                    robot[1].battery(10);   
                    System.out.println("Porcemtaje de carga: "+robot[1].getBattery());    
                    System.out.println("Mi nombre es"+ robot[1].name()+ "\n"+"Mi id es :"+ robot[1].id());                 
                    if(robot[1].getBattery() == 0){
                        System.out.println("Se termino la bateria favor de regargar");
                        if(CapturaEntrada.capturaChar("Desea recargar ? y/n") == 'y'){
                            robot[1].chargeBattery();
                        }
                        break;
                    }                    
                    break;
                case 3:
                    if(selectionAction(robot[2],cont) > 0){
                        cont++;
                    }else{
                        cont = 0;
                    }
                    robot[2].battery(10); 
                    System.out.println("Porcemtaje de carga: "+robot[2].getBattery());        
                    if(robot[2].getBattery() == 0){
                        System.out.println("Se termino la bateria favor de recargar");
                        System.out.println("Mi nombre es"+ robot[2].name()+ "\n"+"Mi id es :"+ robot[2].id());       
                        if(CapturaEntrada.capturaChar("Desea recargar ? y/n") == 'y'){
                            robot[2].chargeBattery();
                        }
                        break;
                    } 
                    break;
                case 4:
                    System.exit(0);    
                    break;
                default:
                    break;
            }
            if(cont == 0)/// si se reinica el contador se empeiza de nuevo
                System.out.println("Oh lo siento dentremos que iniciar de nuevo :(");
            resp = CapturaEntrada.capturaChar("Desea continuar? y/n");
        }while(resp != 'n');
        if(cont > 4){
            System.out.println("Enhorabuena lo hemos logrado");//se logro
        }
    }

    public static int selectionAction(Robot robot,int cont){// sleciona que quieres que haga
        Menu.MenuAction();
        int op = CapturaEntrada.capturaEntero("Ingrese opcion");
        switch(op){
            case 1:
                if(robot.cutMeat()){///si es verdadero aumenta contador
                    cont++;
                }else{
                    cont=0;// reinicia contador
                }
                break;
            case 2:
                if(robot.cutVegetable()){
                    cont++;
                }else{
                    cont = 0;
                }
                break;
            case 3:
                if(robot.hotFood()){
                    cont++;
                }else{
                    cont = 0;
                }
                break;
            case 4:
                if(robot.serve()){
                    cont++;
                }else{
                    cont = 0;
                }
                break;
            default:
                break;
        }
        robot.actionLast(op);/// con esto le da como ultima accion
        return cont;
    }
}