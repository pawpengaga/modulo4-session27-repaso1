package principal;

import modelo.AptoFamiliar;
import modelo.LocalComercial;
import modelo.Local.tipo;
import modelo.Oficina;

public class App {

  public static void main(String[] args) {
    // Hoy vamos a ver conceptos de herencia

    System.out.println("----------------------------------------------------------\n");

    AptoFamiliar apto1 = new AptoFamiliar(800, 85, "Camino del sol 123", 3, 2, 750000);
    System.out.println("Datos Apartamento");
    apto1.precioVenta(apto1.getValorArea());
    apto1.mostrarDetalle();
    System.out.println();

    Oficina ofc = new Oficina(754, 45, "Arlegui 405", tipo.INTERNO, false);
    LocalComercial lc = new LocalComercial(587, 50, "Viana", tipo.CALLE, "Las tinajas");
    ofc.mostrarDetalle();
    System.out.println();
    lc.mostrarDetalle();

  }

}
