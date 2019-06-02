package examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BetterArrayListTest {

	@Test
	public void testBetterArrayListpop() throws Exception {

		BetterArrayList bl1 = new BetterArrayList();
		bl1.add(1);
		bl1.add(2);
		bl1.add(3);
		bl1.pop(bl1);
		assertEquals(2, bl1.size());

	}

}
