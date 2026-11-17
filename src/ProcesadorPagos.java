public class ProcesadorPagos {
    public void procesarRetiro(CuentaAhorros cuenta, double monto) {
        cuenta.retirar(monto);
    }
}