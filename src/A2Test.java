import static org.junit.Assert.*;

import org.junit.Test;


public class A2Test {

	@Test
	public void testsameBackAndForth() {
		
		/*	Test Case Criteria: 
		 *  1). Test with empty string
		 *  2). Test with alpha characters
		 *  3). Test with numeric characters
		 *  4). Test with alpha+numberic characters
		 *  5). Test with alpha+numeric+space+special characters
		 */
		assertEquals(true, A2.sameBackAndForth(""));
		assertEquals(false, A2.sameBackAndForth("ab"));
		assertEquals(true, A2.sameBackAndForth("aba"));
		assertEquals(true, A2.sameBackAndForth("abba"));
		assertEquals(false, A2.sameBackAndForth("Madam, I'm Adam"));
		assertEquals(false, A2.sameBackAndForth("MadamImAdam"));
		assertEquals(true, A2.sameBackAndForth("madamimadam"));
		assertEquals(true, A2.sameBackAndForth("42444424"));
		assertEquals(true, A2.sameBackAndForth("555a6a555"));
		assertEquals(false, A2.sameBackAndForth("778b87788b77"));
		assertEquals(true, A2.sameBackAndForth(" b*n7%9  9%7n*b "));
	}

	@Test
	public void testnumOccurrences() {
		
		/* Test Case Criteria:
		 * 1). Test with simple alpha strings ie. ab
		 * 2). Test with longer strings
		 * 3). Test with strings with multiple occurrences
		 * 4). Test string with spaces
		 * 5). Test string with no occurrences
		 */
		assertEquals(1, A2.numOccurrences("ab", "b"));
		assertEquals(2, A2.numOccurrences("Luke Skywalker", "ke"));
		assertEquals(3, A2.numOccurrences("abababab", "aba"));
		assertEquals(3, A2.numOccurrences("aaaa", "aa"));
		assertEquals(3, A2.numOccurrences("gee   gee  ", "  "));
		assertEquals(0, A2.numOccurrences("applepie", "q"));	
	}
	
	@Test
	public void testdecompress() {
		
		assertEquals("bbbcxx111bb" ,A2.decompress("b3c1x2a013b2"));
		assertEquals("nnjjnxxkkkkkkkqqq11334" ,A2.decompress("v0n2j2n1x2i0k7q3123241"));
		assertEquals("99999999777777555533abbcccc", A2.decompress("9876543210a1b2c3k0c1"));
		assertEquals("a33x22ppp", A2.decompress("a19032x1c0d022p3"));
		
	}
	
	@Test
	public void testfixName() {
		
		assertEquals("David Gries", A2.fixName("   gRies,  DAVID     "));
		assertEquals("Nate Foster", A2.fixName("foster,    nate"));
		assertEquals("James Arthur Gosling", A2.fixName("GOSLING, JAMES   ARTHUR"));
	}
	
	@Test
	public void testreplaceConsonants() {

		assertEquals("_iNeCRaFT", A2.replaceConsonants("Minecraft"));
		assertEquals("ALaN _uRiNG", A2.replaceConsonants("Alan Turing"));
		assertEquals("_aViD _RieS" ,A2.replaceConsonants("David Gries"));
		assertEquals("G_ieS,  _A_I_", A2.replaceConsonants("gRies,  DAVID"));
	}
	
	@Test
	public void testareAnagrams() {
		 assertEquals(true, A2.areAnagrams("noon", "noon"));
		 assertEquals(true, A2.areAnagrams("mary", "army"));
		 assertEquals(true, A2.areAnagrams("tom marvolo riddle", "i am lordvoldemort"));
		 assertEquals(false, A2.areAnagrams("hello", "world"));
		 assertEquals(false, A2.areAnagrams("tommarvoloriddle", "i am lordvoldemort"));
	}
}
