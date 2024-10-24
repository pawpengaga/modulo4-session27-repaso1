package modelo;

public class Oficina extends Local {

  protected static double valorArea = 350000.0F;
  protected boolean esPublico;


  public Oficina(int idInmobiliario, double mtCuadrado, String direccion, tipo tipoLocal, boolean esPublico) {
    super(idInmobiliario, mtCuadrado, direccion, tipoLocal);
    this.esPublico = esPublico;
  }

  public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("{ Es publico?: " + esPublico + " }");
  }


}
