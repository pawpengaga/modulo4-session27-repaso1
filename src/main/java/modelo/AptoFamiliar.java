package modelo;

public class AptoFamiliar extends Apartamento {

  protected double valorArea = 2500000.0F;
  protected int valorAdmin;
  
	public AptoFamiliar(int idInmobiliario, double mtCuadrado, String direccion, int numHabitaciones, int numBanios, int valorAdmin) {
		super(idInmobiliario, mtCuadrado, direccion, numHabitaciones, numBanios);
		this.valorAdmin = valorAdmin;
	}
  
  public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("{ Valor Administracion " + valorAdmin + " }");
  }

  public double getValorArea(){
    return this.valorArea;
  }
  

}
