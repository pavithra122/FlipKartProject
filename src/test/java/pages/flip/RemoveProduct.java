package pages.flip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import own.base.LibGlobal;

public class RemoveProduct extends LibGlobal {
	public RemoveProduct() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[text()='Change'])[3]")
	private WebElement btnChange;
	@FindBy(xpath = "//span[text()='Remove']")
	private WebElement btnRemove;

	public WebElement getBtnChange() {
		return btnChange;
	}

	public WebElement getBtnRemove() {
		return btnRemove;
	}

}
