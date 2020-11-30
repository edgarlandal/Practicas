class Practica5 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        int op,i=0;
        char resp='n';

        do {
            CapturaEntrada.Limpiar();
            Menu.Menu();
            op= CapturaEntrada.capturaEntero("Opcion");
            switch (op) {
                case 1:
                    banco.crearCuenta(i);
                    break;
                case 2:
                    CapturaEntrada.Limpiar();
                    banco.accederCuenta(CapturaEntrada.capturaEntero("Numero de cuenta"));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            resp = CapturaEntrada.capturaChar("Desea continuar? y/n");
            i++;
        } while (resp=='y');
    }
}