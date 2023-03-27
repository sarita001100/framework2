package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.CustomListeners.class)
public class ListenersTest {

	@Test
	void test1() {
		System.out.println("this is test 1 method");
		Assert.assertEquals("A", "A");
	}
	@Test
	void test2() {
		System.out.println("this is test 2 method");
		Assert.assertEquals("A", "B");
	}
	@Test
	void test3() {
		System.out.println("this is test 3 method");
throw new SkipException("this is skip exception");
	}
}
