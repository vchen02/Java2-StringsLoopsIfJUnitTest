import static org.junit.Assert.*;

import org.junit.Test;


public class A2Test {

	@Test
	public void testsameBackAndForth() {
		
		assertEquals(true, A2.sameBackAndForth(""));
		assertEquals(false, A2.sameBackAndForth("ab"));
		assertEquals(true, A2.sameBackAndForth("aba"));
		assertEquals(true, A2.sameBackAndForth("abba"));
		assertEquals(false, A2.sameBackAndForth("Madam, I'm Adam"));
		assertEquals(false, A2.sameBackAndForth("MadamImAdam"));
		assertEquals(true, A2.sameBackAndForth("madamimadam"));
		assertEquals(true, A2.sameBackAndForth("42444424"));
		assertEquals(true, A2.sameBackAndForth("5556555"));
		assertEquals(false, A2.sameBackAndForth("77887788"));	
	}

	@Test
	public void testnumOccurrences() {
		
		assertEquals(1, A2.numOccurrences("ab", "b"));
		assertEquals(2, A2.numOccurrences("Luke Skywalker", "ke"));
		assertEquals(3, A2.numOccurrences("abababab", "aba"));
		assertEquals(3, A2.numOccurrences("aaaa", "aa"));	
		
		
	}
}
