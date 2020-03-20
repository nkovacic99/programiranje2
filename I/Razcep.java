public class Razcep {

  public static void main (String[] args) {
    razcep(1024);
    razcep(42);
    razcep(17);
    razcep(1);
  }

  public static void razcep (int n) {
    char oper = '=';
    System.out.print(n);
    for (int d = 2; d * d <= n; ++d) {
      int e = 0;
      while (n % d == 0) {
        n /= d;
        ++e;
      }
      if (e > 0) {
        System.out.print( " " + oper + " " + d);
        if (e > 1) System.out.print("^" + e);
        oper = '*';
      }
    }
    if (n > 1) System.out.print(" " + oper + ' ' + n);
    System.out.println();
  }
}
