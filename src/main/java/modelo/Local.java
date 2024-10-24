package modelo;

public class Local extends Inmueble {

  // Enum puede ser un tipo o una clase
  // Un enum lo que hace es definir unas constantes (Valores que no van a variar)

  enum tipo {INTERNO, CALLE};

  protected tipo tipoLocal;

  public Local(int idInmobiliario, double mtCuadrado, String direccion, tipo tipoLocal) {
    super(idInmobiliario, mtCuadrado, direccion);
    this.tipoLocal = tipoLocal;  
  }

  public void mostrarDetalle(){
    super.mostrarDetalle();
    System.out.println("{ Tipo de local: " + tipoLocal + " }");
  }


}
