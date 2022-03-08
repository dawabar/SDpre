public class Objective8Lab3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i += 1) {
      String parity;
      if (i % 2 == 0) {
        parity = "even";
        System.out.println(i + " is " + parity);
      }
      else if (i % 2 == 1) {
        parity = "odd";
        System.out.println(i + " is " + parity);
      }
    }
  }
}
