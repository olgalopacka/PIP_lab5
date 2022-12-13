public class Zadanie03 {

  public static void drawTree(int n) {
    if (n % 2 == 0) {
      n = n - 1;
    }

    double numberOfSpaces = Math.floor(n / 2d);

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println();
      } else {

        for (int space = 1; space <= numberOfSpaces; space++) {
          System.out.print(" ");
        }

        for (int star = 1; star <= i; star++) {
          System.out.print("*");
        }
        numberOfSpaces--;
      }
    }
  }

  public static void main(String[] args) {

    drawTree(8);

  }
}


