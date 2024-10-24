package modelo;

public class LocalComercial extends Local {

  protected static double valorArea = 300000.0F;
  protected String centroComercial;

  public LocalComercial(int idInmobiliario, double mtCuadrado, String direccion, tipo tipoLocal, boolean esPublico, String centroComercial) {
    super(idInmobiliario, mtCuadrado, direccion, tipoLocal);
    this.centroComercial = centroComercial;

  }

  public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("{ Centro comercial " + centroComercial + " }");
  }
}
