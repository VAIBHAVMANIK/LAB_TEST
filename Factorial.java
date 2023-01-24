public class Factorial {
  public static void main(String[] args) {
    int first = 0;
    int second = 1;
    int third = 1;
    System.out.print(first + " " + second + " ");
    while (third < 100) {
      System.out.print(" " + third);
      first = second;
      second = third;
      third = first + second;
    }
  }
}
