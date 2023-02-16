public class FuncionIva {
    public static void main(String[] args) {
        double precio = 2300;
        System.out.println("el precio +IVA es: " + calculaIva(precio));
    }
    static double calculaIva(double precio){
        double precioIva = precio * 1.21;
        return precioIva;
    }
}
