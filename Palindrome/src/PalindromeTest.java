import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test1(){
		assertTrue(Palindrome.isPalindrome(("racecar")));
	}
	
	@Test
	public void test2(){
		assertTrue(Palindrome.isPalindrome(("RaCeCar")));
	}
	
	@Test
	public void test3(){
		assertTrue(!Palindrome.isPalindrome(("car")));
	}
}