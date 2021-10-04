import java.util.Scanner;

public class VendedorSopapipillas {



    Scanner teclado =new Scanner(System.in);

    private int stock;
    private int precio;
    private int DineroCaja;

    public VendedorSopapipillas() {
        this.stock = 50;
        this.precio = 200;
        this.DineroCaja=4500;


    }


    public VendedorSopapipillas(int inventarioIncial, int precio, int dineroInicial) {
        this.stock = inventarioIncial;
        this.precio = precio;
        this.DineroCaja = dineroInicial;
    }

    public int getDineroCaja() {
        return DineroCaja;
    }

    public void setDineroCaja(int dineroInicial) {
        this.DineroCaja = dineroInicial;
    }

    public int getstock() {
        return stock;
    }

    public void setstock(int inventarioIncial) {
        this.stock = inventarioIncial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }











































    public int vuelto(int cantPago,int debePagar){

        return cantPago-debePagar;
    }


    public int cantPagar(int cant) {
        int debePagar = cant * precio;

        return debePagar;

    }

    public int cantComprar(){

       int cant = 0;
        do {
            try {
                cant = teclado.nextInt();

            }catch (Exception e){
                System.out.println("Cantidad ingresada invalida");
                teclado.next();
            }

        }while(cant> stock || cant<0 );
        return cant;

    }



    @Override
    public String toString() {
        return "VendedorSopapipillas{" +
                ", inventarioIncial=" + stock +
                ", precio=" + precio +
                ", dineroInicial=" + DineroCaja +
                '}';
    }
}
