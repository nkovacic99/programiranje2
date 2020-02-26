public class Razcep {

  public static void main (Sting[] args){
    razcep(1024);
    razcep(5761665);
    razcep(60);
    razcep(25);
    razcep(125);

  }

  public static void razcep(int n){
    char operator = '=';
    System.out.print(n);
    for (int d = 2; d * d <= n; ++d) {
      int e = 0; 
      while (n % d == 0){
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