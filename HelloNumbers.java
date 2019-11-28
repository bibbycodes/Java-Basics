public class HelloNumbers {
  public static void main(String[] args) {
    int i = 0;
    int total = 0;
    while (i < 10) {
      total += i;
      i += 1;
      System.out.println(total + " ");
    }
  }
}