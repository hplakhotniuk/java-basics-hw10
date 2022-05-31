import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

  /**
   * Test data for positive test.
   *
   * @return test data array
   */
  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 3, 6},
        {2, 4, 8},
        {3, 8, 24}
    };
  }

  /**
   * Test data for exception test.
   *
   * @return test data array
   */
  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {2, -2},
        {-1, -3},
        {-5, 8}
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    int result = ExampleException.rectangleArea(a,b);
    assertEquals(result, c, "Input value is correct");
  }


  @Test(dataProvider = "negativeData")
  public void testRectangleAreaNegative(int a, int b) {
    try {
      ExampleException.rectangleArea(a, b);
      fail("Test failed!");
    } catch (IllegalArgumentException e) {
      assertEquals(e.getMessage(), "Input value is less than zero!");
    }
  }
}