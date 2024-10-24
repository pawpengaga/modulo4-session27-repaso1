package modelo;

public class AptoEstudio extends Apartamento {
	
	public AptoEstudio(int idInmobiliario, double mtCuadrado, String direccion, int numHabitaciones, int numBanios) {
    super(idInmobiliario, mtCuadrado, direccion, numHabitaciones, numBanios);
  }

  protected static double valorArea = 15000.0F;

  public void mostrarDetalle(){
    super.mostrarDetalle();
  }

}
