package modelo;

public class Inmueble {

  // Un inmmueble puede ser cualquier cosa que sea un trozo de tierra y un precio de venta

  protected int idInmobiliario;
  protected double mtCuadrado;
  protected String direccion;
  // El precio de venta
  protected double precioVenta;

  // La interfaz no necesariamente tengo que implementarla en clases que esten relacionadas entre si
  // Hay veces que en lo unico que dos clases van a tener en comun, es la interfaz
  // Puedo separar acciones en interfaces y implementar las acciones en cuantas interfaces necesite por sujeto
  // En las interfaces lo unico que esta es su definicion y lo que devuelven, no su implmentación

  public Inmueble(int idInmobiliario, double mtCuadrado, String direccion) {
    super();
    this.idInmobiliario = idInmobiliario;
    this.mtCuadrado = mtCuadrado;
    this.direccion = direccion;
  }

  public double precioVenta(double valorArea){
    this.precioVenta = this.mtCuadrado * valorArea;
    return precioVenta;
  }
  
  public void mostrarDetalle(){
    System.out.println("{ Identificador: " + idInmobiliario + ", Metros cuadrados: " + mtCuadrado + ", Direccion: " + direccion + ", Precio de venta: " + precioVenta + " }");
  }

}
