public class Poudarjanje {

  public static void main(String[] args){
    System.out.println(poudari("Zadnja novica"));
    System.out.println(poudariBesede("Zadnja *novica* danes!"));
  }
  public static String poudari(String niz){
    String s = "";
    for (int i = 0; i < niz.length(); ++i){
      char znak = niz.charAt(i);
      if (i > 0) s += ' ';
      s += Character.toUpperCase(znak);
    }
    return s;
  }

  public static String poudariBesede(String niz){
    String s = " ";
    boolean krepko = false;
    for (int i = 0; i < niz.length(); i++){
      char znak = niz.charAt(i);
      if (znak == '*') krepko = !krepko;
      else if (krepko) s += Character.toUpperCase(znak);
      else s += znak;
    }
    return s;
  }
}
