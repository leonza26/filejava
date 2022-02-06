public class ParamaeterKonstruktor {
  int x;

  public ParamaeterKonstruktor(int y) {
    x = y;
  }

  public static void main(String[] args) {
    ParamaeterKonstruktor myObj = new ParamaeterKonstruktor(5);
    System.out.println(myObj.x);
  }
}