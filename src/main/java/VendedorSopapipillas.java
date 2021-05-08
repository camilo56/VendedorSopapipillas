public class VendedorSopapipillas

{
    private int inventarioIncial;
    private int precio;

    public VendedorSopapipillas() {
        this.inventarioIncial = 50;
        this.precio = 200;

    }
    public VendedorSopapipillas(int inventarioIncial, int precio) {
        this.inventarioIncial = inventarioIncial;
        this.precio = precio;
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





    @Override
    public String toString() {
        return "VendedorSopapipillas{" +
                "inventarioIncial=" + inventarioIncial +
                ", precio=" + precio +
                '}';
    }
}
