public class Banco{
    Cuenta cuenta[] = new Cuenta[10];
    public void crearCuenta(int i){///llenar los datos para crear la cuenta 
        CapturaEntrada.Limpiar();
        cuenta[i] =new  Cuenta(CapturaEntrada.capturaString("Nombre"),
                               CapturaEntrada.capturaEntero("Numero de cuenta"),
                               CapturaEntrada.capturaFloat("Saldo"),
                               CapturaEntrada.capturaEntero("PIN"));
    }
	public void accederCuenta(int cont) {///ingresar ala cuenta 
        int i;
        for (i=0;i<cuenta.length;i++){//verificar si la cuenta existe
            if(cuenta[i].getNoCuenta()==cont){
                ingresarPin(i);
            }else{
                System.out.println("Esta cuenta no existe");

            }
        }
    }

    public void ingresarPin(int position){
        int op;
        char resp='n';
        CapturaEntrada.Limpiar();
        while (cuenta[position].getPin()!=CapturaEntrada.capturaEntero("Ingrese PIN de la cuenta"));//ingresar pin hasta qye sea el correcto
        do{
            CapturaEntrada.Limpiar();
            Menu.Menu2();
            op= CapturaEntrada.capturaEntero("Opcion");
            switch (op) {///seleccion de opciones
                case 1:
                    mostrearCuenta(position);
                    break;
                case 2:
                    depositarDinero(position);
                    break;
                case 3:
                    if(cuenta[position].getSaldo()>0){//verifica primero si el usuario tiene saldo
                        retirarDinero(position);
                    }else{
                        System.out.println("No hay saldo disponible en tu cuenta ");
                    }
                    break;
                default:
                    break;
            }
            resp = CapturaEntrada.capturaChar("Desea continuar? y/n");
            CapturaEntrada.Limpiar();
        }while(resp=='y');
    }
    public void mostrearCuenta(int position){//mostrar la cuenta 
        CapturaEntrada.Limpiar();
        System.out.println("Nombre: "+cuenta[position].getName());
        System.out.println("Numero de cuenta: "+cuenta[position].getNoCuenta());
        System.out.println("Saldo disponible: "+cuenta[position].getSaldo());
    }

    public void depositarDinero(int position){/// depositar dinero
        CapturaEntrada.Limpiar();
        cuenta[position].setSaldo(CapturaEntrada.capturaFloat("Ingrese la cantidad de dinero a ingresar")+cuenta[position].getSaldo());
        System.out.println("Deposito se a realizado con exito");
    }

    public void retirarDinero(int position){///retirar dinero
        float retiro;
        CapturaEntrada.Limpiar();
        retiro=CapturaEntrada.capturaFloat("Ingrese la cantidad de dinero a ingresar");

        if(cuenta[position].getSaldo()>=retiro){///verificar si el retiro es valido 
            cuenta[position].setSaldo(cuenta[position].getSaldo()-retiro);
            System.out.println("Retiro se a relizado con exito");
        }else{
            System.out.println("Saldo no suficiente");
        }
        
    }
}