import java.util.Scanner;

public class VendedorSopapipillas

{
    Scanner teclado =new Scanner(System.in);

    private int inventarioIncial;
    private int precio;
    private int dineroInicial;

    public VendedorSopapipillas() {
        this.inventarioIncial = 50;
        this.precio = 200;
        this.dineroInicial=5000;


    }


    public VendedorSopapipillas(int inventarioIncial, int precio, int dineroInicial) {
        this.inventarioIncial = inventarioIncial;
        this.precio = precio;
        this.dineroInicial = dineroInicial;
    }

    public int getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public int getInventarioIncial() {
        return inventarioIncial;
    }

    public void setInventarioIncial(int inventarioIncial) {
        this.inventarioIncial = inventarioIncial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public int vuelto(int pago,int aPagar){

        int b=pago-aPagar;
        System.out.println("El vuelto del cliente es:"+b);
        return b;
    }


    public int cantSopa(){
        System.out.println("Cuantas sopaipillas de_*"+precio+"*_pesos desea comprar:");

        int cant = teclado.nextInt();
        return cant;
    }
public int pagarCliente(int cant) {
    int pagarCliente = cant * precio;
    System.out.println("monto que debe pagar:\n" + pagarCliente);
    return pagarCliente;

}







    @Override
    public String toString() {
        return "VendedorSopapipillas{" +
                "inventarioIncial=" + inventarioIncial +
                ", precio=" + precio +
                '}';
    }
}
