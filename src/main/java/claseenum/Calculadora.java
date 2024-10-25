package claseenum;

public enum Calculadora implements Ioperacion {

  // Los enum los usamos solo con constantes
  // Usamos la misma interfaz de 4 formas diferentes
  // Tenemos 4 constantes
  SUMA{
    @Override
    public double calcular(double a, double b){
      return a + b;
    }

    // Puede haber tambien sobrecarga de metodos en los enum ._.
    // public double sumatriple(double a, double b, double c) { return a + b + c; }
  }, RESTA{
    @Override
    public double calcular(double a, double b){
      return a - b;
    }
  }, MULTIPLICACION{
    @Override
    public double calcular(double a, double b){
      return a * b;
    }
  }, DIVISION{
    @Override
    public double calcular(double a, double b){
      return a / b;
    }
  }

}
