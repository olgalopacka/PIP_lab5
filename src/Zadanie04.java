public class Zadanie04 {

  public static void drawColumns(int x, int y, int z) {
    int highestColumn = Math.max(Math.max(x, y), z);

    int[] numOfSpacesFromTop = {highestColumn - x, highestColumn - y, highestColumn - z};

    for (int row = 1; row <= highestColumn; row++) {
      for (int col = 0; col < 3; col++) {
        if (numOfSpacesFromTop[col] >= row) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }

      System.out.print("\n");
    }
  }


  public static void main(String[] args) {
    drawColumns(5, 3, 8);
  }
}
