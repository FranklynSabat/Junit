package JunitTeste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.Conta;

public class ContaTeste {

	
		Conta c  = new Conta();

		@Before
		public void setUp() throws Exception {
			
			
		}

		@Test
		public void testDepositar() {
		Assert.assertEquals(100, c.depositar(100));
			
			
		}

	}
