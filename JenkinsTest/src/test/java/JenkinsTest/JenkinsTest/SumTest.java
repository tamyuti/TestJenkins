package JenkinsTest.JenkinsTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SumTest {
	Sum s;
	
	@BeforeClass
	public void createObj(){
		s=new Sum();
	}
	
	@Test
	public void posAdd(){
		int num=s.add(5, 10);
		Assert.assertEquals(num, 15);
	}
	
	@Test
	public void negAdd(){
		int num=s.add(-5, -10);
		Assert.assertEquals(num, -15);
		asdf vg
	}
	

}
