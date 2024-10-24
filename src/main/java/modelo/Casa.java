package modelo;

public class Casa extends Vivienda {
	
	protected int numPisos;

	public Casa(int idInmobiliario, double mtCuadrado, String direccion, int numHabitaciones, int numBanios, int numPisos) {
		super(idInmobiliario, mtCuadrado, direccion, numHabitaciones, numBanios);
		this.numPisos = numPisos;
	}
	

  public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("Numero de pisos");
  }
	
	
	
	

}
