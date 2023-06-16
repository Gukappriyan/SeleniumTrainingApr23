package demo.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemotwo {

	@Test(groups = { "customer" })
	public void addPhoto() {
		System.out.println("Add Profile Photo");
		Assert.assertEquals(true, false);
	}
}
