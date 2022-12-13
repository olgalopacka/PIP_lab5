import java.util.Scanner;

public class Zadanie01 {

  public static void main(String[] args) {

    System.out.println("Wprowadz liczbe całkowita :");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x = 0;

    if (n <= x) {
      while (x >= n) {
        System.out.println(x);
        x--;
      }
    } else {
      while (x <= n) {
        System.out.println(x);
        x++;
      }
    }
  }
}