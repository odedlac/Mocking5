/**
 * 
 */
package tests;

import org.junit.Test;
import code.Example;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 * @author oded
 *
 */
public class ExampleTest {

	@Test
	public void test1() {
		
		Integer i = 1;
		String one = "1";
		
		Example example = new Example();
		Example mockedExample = mock(Example.class);
		
		when(mockedExample.isSame(anyInt(),anyString())).thenReturn(true).thenReturn(false);
		
		Boolean same = example.isSame(i, one);
		Boolean mockedSame = mockedExample.isSame(i, one);
			
		assertEquals("Wrong Answer !", same, mockedSame);
		
	}
}
