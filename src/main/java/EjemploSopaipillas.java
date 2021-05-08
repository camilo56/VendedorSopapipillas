import java.util.Random;
import java.util.Scanner;

public class EjemploSopaipillas {
    public static void main(String[] args ){
        Scanner teclado =new Scanner(System.in);
        Random rnum =new Random();
        VendedorSopapipillas miVendedor =new VendedorSopapipillas(36,150,5166);

         System.out.println("Cuantas sopaipillas de_*"+miVendedor.getPrecio()+"*_pesos desea comprar:");


         int cant = teclado.nextInt();
         int rest= miVendedor.getInventarioIncial()- cant;
         miVendedor.setInventarioIncial(rest);




       int a= miVendedor.pagarCliente(cant);

       System.out.println(" ingrese con cuanto pagara:\n");
       int pagoCliente = teclado.nextInt();

       miVendedor.vuelto(pagoCliente,a);

       miVendedor.setInventarioIncial();






    }






}
