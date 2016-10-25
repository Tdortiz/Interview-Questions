package firstNonRepeatingChar;

import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

public class FirstNonRepeatingCharTest {

	@Test
	public void test1(){
		int actual = FirstNonRepeatingCharacterInString.getFirstNonRepeatingChar("google");
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2(){
		int actual = FirstNonRepeatingCharacterInString.getFirstNonRepeatingChar("racecar");
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3(){
		int actual = FirstNonRepeatingCharacterInString.getFirstNonRepeatingChar("winner");
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test4(){
		int actual = FirstNonRepeatingCharacterInString.getFirstNonRepeatingChar("loser");
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test5(){
		int actual = FirstNonRepeatingCharacterInString.getFirstNonRepeatingChar("ncstate");
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
}
