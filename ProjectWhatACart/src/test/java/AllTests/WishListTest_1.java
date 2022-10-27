	
	package AllTests;
	import org.openqa.selenium.WebDriver;
    import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import BasePackage_2.BaseClass;
	import webPages_4.WishList_1;
	
	public class WishListTest_1 extends BaseClass {
	
	WishList_1 wl ;   
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver= initialization();  // browser and url
		wl = loadWishListPage_1();  // Initialization of object of WishList_1 page to use methods inside it
	}
	
	@Test 
	
	public void verifyWishListButton_1() {
		Assert.assertTrue(wl.checkWishListButton());
	}
	
	@Test (dependsOnMethods= "verifyWishListButton_1")
	
	public void verifyAddWishButtonForDesktops_2(){
		
		Assert.assertTrue(wl.checkAddWishButtonForDesktops());
	}
	
	@Test (dependsOnMethods= "verifyAddWishButtonForDesktops_2")
	
	public void verifyMultipalAddWishButton_3() throws Exception {
		
		Assert.assertTrue(wl.checkWishListCount());
	}
	
   @Test (dependsOnMethods= "verifyMultipalAddWishButton_3")
	
	public void verifyWishListButtonForAllDesktops_4() throws Exception {
		
		Assert.assertTrue(wl.checkWishListButtonForAllDesktops());
	}
	
   @Test (dependsOnMethods= "verifyWishListButtonForAllDesktops_4")
	
  	public void verifyWishListButtonForAllLaptopsAndNotebooks_5() throws Exception {
  		
  		Assert.assertTrue(wl.checkWishListButtonForAllLaptopsAndNotebooks());
  	}
   
   @Test (dependsOnMethods= "verifyWishListButtonForAllLaptopsAndNotebooks_5")
	
 	public void verifyWishListButtonForAllCamera_6() throws Exception {
 		
 		Assert.assertTrue(wl.checkWishListButtonForAllCamera());
 	}
   
  
   @Test (dependsOnMethods= "verifyWishListButtonForAllCamera_6")
	
	public void verifycheckAddWishButtonForLaptops_7() throws Exception {
		
		Assert.assertTrue(wl.checkAddWishButtonForLaptops());
	}
   
 
   @Test (dependsOnMethods= "verifycheckAddWishButtonForLaptops_7")
	
  	public void verifycheckAddWishButtonForCamera_8() throws Exception {
  		
  		Assert.assertTrue(wl.checkAddWishButtonForCamera());
  	}
   
   
    // // To get Screen shot of failed test case
   // 
   @Test (dependsOnMethods= "verifycheckAddWishButtonForCamera_8")
	
 	public void verifycheckAddWishButtonForCameraFailTrial_9() throws Exception {
 		
 		Assert.assertTrue(wl.checkAddWishButtonForCameraFailTrial());
 	}
   
	@AfterMethod
	public void tearDown() throws Exception 
		{
			Thread.sleep(2000);
			driver.close();
		}
	
}
