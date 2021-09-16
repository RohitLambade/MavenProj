import static org.junit.Assert.*;

import org.junit.Test;

import com.jenk.MyCal;

public class MyCalTest {

	@Test
	public void test1() {
		assertEquals(10, new MyCal().getsum(5,5));
	}
	@Test
	public void test2() {
		assertEquals(5, new MyCal().getsum(2,3));
	}
	@Test
	public void test3() {
		assertEquals(5, new MyCal().getdiff(10,5));
	}
	@Test
	public void test4() {
		assertEquals(0, new MyCal().getdiff(5,5));
	}

}
