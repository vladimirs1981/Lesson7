import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import examples.ExtraRandom;

class ExtraRandomTest {

	@Test
	void test() {
		StringBuffer letterz = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			char nextLetter = new ExtraRandom().nextLetter();
			assertTrue(nextLetter >= 'a');
			assertTrue(nextLetter <= 'z');
			letterz.append(nextLetter);
		}

		assertTrue("We never get A", letterz.toString().indexOf('a') > 0);
		assertTrue("We never get Z", letterz.toString().indexOf('z') > 0);

	}

}
