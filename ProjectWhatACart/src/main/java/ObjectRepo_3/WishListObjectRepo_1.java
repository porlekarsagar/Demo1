package ObjectRepo_3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListObjectRepo_1 {

	
	@FindBy(id="wishlist-total")
	public WebElement wishList;
	
	@FindBy(id = "add-to-wish-list-6")
	public WebElement addDesktop1;
	
	@FindBy(xpath = "// tr[1]/td[2]/a")
	public WebElement name;
	
	@FindBy(id = "add-to-wish-list-7")
	public WebElement addDesktop2;
	
	@FindBy(xpath="// *[@class= \"summary\"]/b[2]")
	public WebElement totalNos;
	
	@FindBy(xpath="//a[text()=\"Desktops\"]")
	public WebElement desktopHome;
	//Laptops & Notebooks
	@FindBy (id="showItemsPerPage")
	public WebElement dropDownDesktop;
	
	@FindBy (xpath = "//*[@value=\"63\"]")
	public WebElement valueDesktop;
	
	@FindBy (xpath="//*[@name=\"Add to Wish List\"]")
	public List<WebElement> addWishCount;
	
	@FindBy(xpath="//a[text()=\"Laptops & Notebooks\"]")
	public WebElement LaptopsAndNotebooksHome;
	
	@FindBy(xpath="//a[text()=\"Camera\"]")
	public WebElement cameraHome;
	
	@FindBy(id = "add-to-wish-list-47")
	public WebElement addLaptop;
	
	@FindBy(id = "add-to-wish-list-14")
	public WebElement addCamera;
	
}
