package modelo;

public class Apartamento extends Vivienda {

  public Apartamento(int idInmobiliario, double mtCuadrado, String direccion, int numHabitaciones, int numBanios) {
    super(idInmobiliario, mtCuadrado, direccion, numHabitaciones, numBanios);
  }

  public void mostrarDetalle(){
    super.mostrarDetalle();
  }

}
