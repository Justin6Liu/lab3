import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testFailReverseInPlace(){
    int[] input1 = {1,2,3};
    //false output should be 3,2,3
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testFailReversed(){
    int[] input1 = {1,2,3};
    //false output should be {0,0,0}
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testForAverageWithoutLowest(){
    double[] input1 = {1,2,3,4,5,6,7,8,9,10};
    assertEquals(6, ArrayExamples.averageWithoutLowest(input1), 0);
    double[] input2 = {1,1,1,3,3};
    //false output should be 1.5
    assertEquals(2, ArrayExamples.averageWithoutLowest(input2),0);
  }

}
