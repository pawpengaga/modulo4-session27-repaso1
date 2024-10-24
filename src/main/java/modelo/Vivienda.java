package modelo;

public class Vivienda extends Inmueble{

  protected int numHabitaciones;
  protected int numBanios;

  public Vivienda(int idInmobiliario, double mtCuadrado, String direccion, int numHabitaciones, int numBanios) {
    super(idInmobiliario, mtCuadrado, direccion);
    this.numHabitaciones = numHabitaciones;
    this.numBanios = numBanios;
  }

  public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("{ Numero de habitaciones: " + numHabitaciones + " }");
    System.out.println("{ Numero de baños: " + numBanios + " }");
  }
  
  

}
