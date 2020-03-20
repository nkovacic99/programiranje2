public class Odvod {

  public static void main(String[] args){
    double[] p1 = {3, 4, -1};
    double[] o1 = odvod(p1);
    izpis(o1);
  }

  public static double[] odvod(double[] p, int n) {
    if (n > p.length) return new double[0];
    double[] op = new double[p.length - n];
    int f = 1;
    for (int i = 2; i<= n; i++) f*=i; //fakulteta
    for (int i = n; i < p.length; i++) {
      op[i - n] = f * p[i];
      f /= i - n + 1;
      f*= i + 1;
    }
    return op;
  }

  public static double[] odvod(double[] p) {
    return odvod(p, 1);
  }

  public static void izpis(double[] p) {
    System.out.print('{');
    for(int i = 0; i < p.length; i++) {
      if (i > 0) System.out.print(",");
      System.out.print(p[i]);
    }
    System.out.println('}');
  }
}
