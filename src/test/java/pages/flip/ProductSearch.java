package pages.flip;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import own.base.LibGlobal;

public class ProductSearch extends LibGlobal {
	public ProductSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z'] ")
	private WebElement btnClose;
	
	@FindBy(name = "q")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//div[@class='_312yBx SFzpgZ']")
	private List<WebElement> allProducts;

	public WebElement getBtnClose() {
		return btnClose;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public List<WebElement> getAllProducts() {
		return allProducts;
	}

}
