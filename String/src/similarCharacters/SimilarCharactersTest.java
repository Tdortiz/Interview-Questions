package similarCharacters;

import org.junit.Test;
import junit.framework.Assert;

public class SimilarCharactersTest {
	@Test
	public void test1(){
		String actual = SimilarCharacters.getSimilarCharacters("abbc","bab");
		String expected = "bab";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2(){
		String actual = SimilarCharacters.getSimilarCharacters("abbc","babcce");
		String expected = "babc";
		Assert.assertEquals(expected, actual);
	}

}
