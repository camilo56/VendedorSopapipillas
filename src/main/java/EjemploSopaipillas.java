
import java.util.Scanner;

public class EjemploSopaipillas {
    public static void main(String[] args ){
        Scanner teclado =new Scanner(System.in);

        VendedorSopapipillas miVendedor =new VendedorSopapipillas(100,150,5000);
        System.out.println("********"+miVendedor.toString()+"**********");

        System.out.println("Cuantas sopaipillas de_*$"+miVendedor.getPrecio()+"*_pesos desea comprar:");
        int cant=miVendedor.cantComprar();

        int inventarioActual= miVendedor.getstock()- cant;
        miVendedor.setstock(inventarioActual);


        System.out.println("*****inventario actual: "+miVendedor.getstock()+"**********");


        int debePagar= miVendedor.cantPagar(cant);
        System.out.println("Debe pagar :$"+debePagar+"\n con cuanto pagara?");
        int cantPago=teclado.nextInt();

        int vuelto =miVendedor.vuelto(cantPago,debePagar);
        System.out.println("su vuelto es \n"+"$"+vuelto);

        int dineroActual=miVendedor.getDineroCaja()+debePagar;
        miVendedor.setDineroCaja(dineroActual);


        System.out.println("*****inventario actual: "+miVendedor.getstock()+"**********");
        System.out.println("*****Dinero actual: "+miVendedor.getDineroCaja()+"**********");
    }
}











