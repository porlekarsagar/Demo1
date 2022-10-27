	
	package webPages_4;
	//import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	
	import ObjectRepo_3.WishListObjectRepo_1;
	
	public class WishList_1 extends WishListObjectRepo_1 {

	WebDriver driver;
	// parameterized constructor
	public  WishList_1(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// to provide driver to all webElements
		
	}
	
	public boolean checkWishListButton() {
		System.out.println("1. checkWishListButton:-  ");
		wishList.click();
		String actTitle = driver.getTitle();
		String expTitle = "My Wish List";
		
		if (actTitle.equals(expTitle)) {
			
			System.out.println(" Title is matched ");
			return true;
		}
		else {
			
			System.out.println(" Title is not matched ");
			return false;
		}
	}

	public boolean checkAddWishButtonForDesktops()  {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		//Thread.sleep(4000);
		System.out.println("2. verifyAddWishButtonForDesktops_2:-  ");
		desktopHome.click();
		addDesktop1.click();
		wishList.click();
		String actName = name.getText();
		System.out.println("actName:- "+ actName);
		String expName = "Apple Cinema 25\"";
		
		if (actName.equals(expName)) {
			
			System.out.println("Product added successfully in Wish List");
			return true;
		}
		else {
			
			System.out.println("Product not added successfully in Wish List");
			return false;
		}
	}

	public boolean checkWishListCount() throws Exception {
		
		System.out.println("3. checkWishListCount:-  ");
		desktopHome.click();
		addDesktop1.click();
		addDesktop2.click();
		Thread.sleep(4000);
		System.out.println(" Wish List count :- " + wishList.getText());
		String actName = wishList.getText();
		String expName = "Wish List (2)";
		
		if (actName.equals(expName)) {
			
			System.out.println("Wish List count is updated successfully");
			return true;
		}
		else {
			
			System.out.println("Wish List count is not updated successfully");
			return false;
		}
	}
		
	public boolean checkWishListButtonForAllDesktops () {
		System.out.println("4. checkWishListButtonForAllDesktops:-  ");
		desktopHome.click();
		dropDownDesktop.click();
		valueDesktop.click();
		int actTotalCount = addWishCount.size();
		
		String count = totalNos.getText();
		int expectTotalCount = Integer.parseInt(count);
		// Important- string converted into int by parseInt method of Integer class
		System.out.println(" expectTotalCount:- "+ expectTotalCount);
		System.out.println(" actTotalCount:- "+ actTotalCount);
		
      if (actTotalCount == expectTotalCount) {
			
			System.out.println("Add to Wish List option is available for each Desktop product");
			return true;
		}
		else {
			
			System.out.println("Add to Wish List option is available for each Desktop product");
			return false;
		}
		
	}

	public boolean checkWishListButtonForAllLaptopsAndNotebooks () {
		System.out.println("5. checkWishListButtonForAllLaptopsAndNotebooks:-  ");
		LaptopsAndNotebooksHome.click();
		dropDownDesktop.click();
		valueDesktop.click();
		int actTotalCount = addWishCount.size();
		
		String count = totalNos.getText();
		int expectTotalCount = Integer.parseInt(count);
		// Important- string converted into int by parseInt method of Integer class
		System.out.println(" expectTotalCount:- "+ expectTotalCount);
		System.out.println(" actTotalCount:- "+ actTotalCount);
		
      if (actTotalCount == expectTotalCount) {
			
			System.out.println("Add to Wish List option is available for each Laptops and Notebooks product");
			return true;
		}
		else {
			
			System.out.println("Add to Wish List option is available for each Laptops and Notebooks product");
			return false;
		}
		
	}
	public boolean checkWishListButtonForAllCamera () {
		System.out.println("6. checkWishListButtonForAllCamera:-  ");
		cameraHome.click();
		dropDownDesktop.click();
		valueDesktop.click();
		int actTotalCount = addWishCount.size();
		
		String count = totalNos.getText();
		int expectTotalCount = Integer.parseInt(count);
		// Important- string converted into int by parseInt method of Integer class
		System.out.println(" expectTotalCount:- "+ expectTotalCount);
		System.out.println(" actTotalCount:- "+ actTotalCount);
		
      if (actTotalCount == expectTotalCount) {
			
			System.out.println("Add to Wish List option is available for each cameraHome product");
			return true;
		}
		else {
			System.out.println("Add to Wish List option is available for each cameraHome product");
			return false;
		}
	
	}
	
	public boolean checkAddWishButtonForLaptops()  {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		//Thread.sleep(4000);
		System.out.println("7. checkAddWishButtonForLaptops:-  ");
		LaptopsAndNotebooksHome.click();
		addLaptop.click();
		wishList.click();
		String actName = name.getText();
		String expName = "Sony Vaio 22\"";
		
		if (actName.equals(expName)) {
			
			System.out.println("Laptop Product added successfully in Wish List");
			return true;
		}
		else {
			
			System.out.println("Laptop Product not added successfully in Wish List");
			return false;
		}
	}
	
	public boolean checkAddWishButtonForCamera()  {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		//Thread.sleep(4000);
		System.out.println("8. checkAddWishButtonForCamera:-  ");
		cameraHome.click();
		addCamera.click();
		wishList.click();
		String actName = name.getText();
		System.out.println("actName  "+actName);
		String expName = "Canon EOS 5 LX";
		
		if (actName.equals(expName)) {
			
			System.out.println("Camera Product added successfully in Wish List");
			return true;
		}
		else {
			
			System.out.println("Camera Product not added successfully in Wish List");
			return false;
		}
	}
	
	// // To get Screen shot of failed test case
	
	public boolean checkAddWishButtonForCameraFailTrial()  {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		//Thread.sleep(4000);
		System.out.println("9. checkAddWishButtonForCameraFailTrial:-  ");
		cameraHome.click();
		addCamera.click();
		wishList.click();
		String actName = name.getText();
		System.out.println("actName  "+actName);
		String expName = "Canon EOS  LX";        
		
		if (actName.equals(expName)) {
			
			System.out.println("Camera Product added successfully in Wish List");
			return true;
		}
		else {
			
			System.out.println("Camera Product not added successfully in Wish List");
			return false;
		}
	}
	
}
