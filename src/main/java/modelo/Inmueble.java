package modelo;

public class Inmueble {

  // Un inmmueble puede ser cualquier cosa que sea un trozo de tierra y un precio de venta

  protected int idInmobiliario;
  protected double mtCuadrado;
  protected String direccion;
  // El precio de venta
  protected long precioVenta;


  public Inmueble(int idInmobiliario, double mtCuadrado, String direccion) {
    super();
    this.idInmobiliario = idInmobiliario;
    this.mtCuadrado = mtCuadrado;
    this.direccion = direccion;
  }

  public long precioVenta(int valorArea){
    this.precioVenta = (long) this.mtCuadrado * valorArea;
    return precioVenta;
  }
  
  public void mostrarDetalle(){
    System.out.println("{ Identificador: " + idInmobiliario + ", Metros cuadrados: " + mtCuadrado + ", Direccion: " + direccion + ", Precio de venta: " + precioVenta + " }");
  }

}
