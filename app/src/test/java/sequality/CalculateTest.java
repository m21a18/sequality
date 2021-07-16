package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testave() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2, 3), 0);
  }

  @Test
  public void testallsum() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.allsum(1, 10));
  }

  @Test
  public void testsumave() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.sumave(1, 10), 0);
  }

  @Test
  public void testsumeven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumeven(1, 10));
  }

  @Test
  public void testsumodd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumodd(1, 10));
  }
}
