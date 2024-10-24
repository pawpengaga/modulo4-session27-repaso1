package modelo;

public class CasaRural extends Casa {

  // Esto puede seguir heredando hasta
  // Conjunto cerrado, independiente, duples, etc.

  protected int distanciaCiudad;
  protected double altitud;
  protected static double valorArea = 150000.0F;

  public CasaRural(int idInmobiliario, double mtCuadrado, String direccion, int numHabitaciones, int numBanios, int numPisos, int distanciaCiudad, double altitud) {
    super(idInmobiliario, mtCuadrado, direccion, numHabitaciones, numBanios, numPisos);
    this.distanciaCiudad = distanciaCiudad;
    this.altitud = altitud;
  }

  public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("{ Distancia a la ciudad: " + distanciaCiudad + " }");
    System.out.println("{ Altitud sobre nivel del mar: " + altitud + " }");
  }



}
