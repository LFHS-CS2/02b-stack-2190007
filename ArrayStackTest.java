import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * Tests ArrayStack
 *
 */
public class ArrayStackTest
{
  public static void main(String args[]) {
    ArrayStackTest test = new ArrayStackTest();
    test.test_example();
  }
		//This tests the pop method.
    @Test
    public void testPop() throws Exception{
        ArrayStack<Integer> sc = new ArrayStack<Integer>();
        sc.push(10);
        sc.push(31);
        try{
            assertEquals(new Integer(31), sc.pop());
        }
        catch(Exception e){
            System.out.println("Does not work.");
            System.out.println("Stack Exception");
        }
    }
		//This tests the peek top method.
		@Test
		public void testPeekTop() throws Exception{
			ArrayStack<Integer> sc = new ArrayStack<Integer>();
			sc.push(10);
			try{
				assertEquals(new Integer(10), sc.peekTop());
			}
			catch(Exception e){
				System.out.println("Does not work.");
				System.out.println("Stack Exception");
			}
		}
		//This tests the Push method
		@Test
		public void testPush() throws Exception{
			ArrayStack<Integer> sc = new ArrayStack<Integer>();
			sc.push(10);
			try{
				assertEquals(new Integer(10), sc.peekTop());
			}
			catch(Exception e){
				System.out.println("Does not work.");
				System.out.println("Stack Exception");
			}
		}
		//This tests the evaluate method.
		@Test
		public void testEvaluate(){
      try{
      PostfixCalculator c = new PostfixCalculator();
			String str = "123*+";
			int num = c.evaluate(str);
		  assertEquals(new Integer(7), (Integer)num);
      }
      catch(Exception e){
        System.out.println(e);
      }
		}
		//This tests the isEmpty method
		@Test
		public void testIsEmpty(){
			ArrayStack<Integer> sc = new ArrayStack<Integer>();
			try{
			assertTrue(sc.isEmpty());
		}
		catch(Exception e){
			System.out.println("Does not work.");
			System.out.println("Stack Exception");
		} 
			sc.push(10);
			try{
			assertTrue(!sc.isEmpty());
		}
		catch(Exception e){
			System.out.println("Does not work.");
			System.out.println("Stack Exception");
		}
}
}

