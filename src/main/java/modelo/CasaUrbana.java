package modelo;

public class CasaUrbana extends Casa {

  public CasaUrbana(int idInmobiliario, double mtCuadrado, String direccion, int numHabitaciones, int numBanios, int numPisos) {
    super(idInmobiliario, mtCuadrado, direccion, numHabitaciones, numBanios, numPisos);
  }
  
  public void mostrarDetalle(){
    super.mostrarDetalle();
  }

}
