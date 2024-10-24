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
