public class ExampleException {
  public static int rectangleArea(int sideA, int sideB) throws IllegalArgumentException {
    if (sideA > 0 && sideB > 0) {
      return sideA * sideB;
    } else {
      throw new IllegalArgumentException("Input value is less than zero!");
    }
  }
}


