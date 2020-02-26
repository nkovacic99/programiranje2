public class Colatz {

  public static void main (String[] args){
    int clen = 60
    System.out.println(naslednik(clen));
    System.out.println(dolzina(clen));
    System.out.println(najvecji(clen));
    izpis(clen);
  }

  public static int naslednik(int clen){
    if (clen % 2 == 0) return clen / 2;
    return 3 * clen + 1;
  }

  public static int dolzina(int clen){
    int d = 1;
    while (clen > 1){
      clen = naslednik(clen);
      ++d;
    }
    return d;
  }

  public static int najvecji(int clen){
    int naj = clen;
    while (clen > 1) {
      clen = naslednik(clen);
      if (clen > naj) naj = clen;
    }
    return naj;
  }

  public static void izpis(int clen){
    while (clen > 1){
      System.out.print(clen + " ");
      clen = naslednik(clen);
    }
    System.out.println(1);
  }
}
