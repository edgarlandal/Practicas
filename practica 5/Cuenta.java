public class Cuenta {
    private String name;
    private int noCuenta;
    private int pin;
    private float saldo;

    public Cuenta(String name, int noCuenta, float saldo, int pin) {
        this.name = name;
        this.noCuenta = noCuenta;
        this.saldo = saldo;
        this.pin=pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}