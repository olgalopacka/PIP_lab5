public class Zadanie02 {

  public static int fibonacci(int n) {
    int fn_2 = 0;
    int fn_1 = 1;

    if (n == 0) {
      return fn_2;
    }
    if (n == 1) {
      return fn_1;
    }

    for (int i = 1; i < n; i++) {
      int fn = fn_1 + fn_2;
      fn_2 = fn_1;
      fn_1 = fn;
    }
    return fn_1;
  }

  public static void main(String[] args) {

    int result = fibonacci(9);
    System.out.println(result);
  }
}