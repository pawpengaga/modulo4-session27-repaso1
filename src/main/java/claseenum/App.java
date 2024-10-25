package claseenum;

public class App {
  public static void main(String[] args) {

    // Los enum se pueden usar para roles, categorias, etc.

    System.out.println("-------------------------------------------------------------------\n");

    System.out.println("El resultado de la suma es: " + Calculadora.SUMA.calcular(5.0, 6.2));
    System.out.println("El resultado de la multiplicacion es: " + Calculadora.MULTIPLICACION.calcular(2.5, 1.8));

  }
}
