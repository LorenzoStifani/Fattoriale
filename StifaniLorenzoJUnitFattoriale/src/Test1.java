import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void testFattoriale1() {
		// fail("prova Junit");
		Fattoriale f = new Fattoriale();
		int n = 0;
		int risAtteso = 1;
		float risOttenuto = f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto, 0.1);
	}
	
	@Test
	public void testFattoriale2() {
		// fail("prova Junit");
		Fattoriale f = new Fattoriale();
		int n = 1;
		int risAtteso = 1;
		float risOttenuto = f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto, 0.1);
	}
	
	@Test
	public void testFattoriale3() {
		// fail("prova Junit");
		Fattoriale f = new Fattoriale();
		int n = 4;
		int risAtteso = 24;
		float risOttenuto = f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto, 0.1);
	}

}
