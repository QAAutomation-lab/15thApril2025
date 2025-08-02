package day11.runTimeRetryfailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test002 {
	static int num=5;

	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
		num--;
		Assert.assertTrue(num<4);//4<4 -->skip | 3<4-->Pass
	}
}
