package pages.flip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import own.base.LibGlobal;

public class AddToCart extends LibGlobal {
	public AddToCart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement btnAddToCart;
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement btnPlaceOrder;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtEmail;
	@FindBy(xpath = "//span[text()='CONTINUE'] ")
	private WebElement btnContinue;
	@FindBy(xpath = "//input[@type='password'] ")
	private WebElement txtPassWrd;
	@FindBy(xpath = "//span[text()='Login'] ")
	private WebElement btnLogin;
	
	@FindBy(xpath="(//button[text()='Change'])[2] ")
	private WebElement btnChangeAddr;
	@FindBy(xpath="//button[text()='EDIT']")
	private WebElement btnEdit;

	@FindBy(name = "name")
	private WebElement txtName;
	@FindBy(name = "phone")
	private WebElement txtMobNo;
	@FindBy(name = "pincode")
	private WebElement txtPinCode;
	@FindBy(name = "addressLine2")
	private WebElement txtLocality;
	@FindBy(xpath = "//textarea[@name='addressLine1']")
	private WebElement txtAddress;
	@FindBy(name = "city")
	private WebElement txtCity;
	@FindBy(name = "state")
	private WebElement dDNState;
	@FindBy(xpath = "(//div[@class='_1XFPmK'])[2]")
	private WebElement btnRadioHome;
	@FindBy(xpath = "//button[contains(text(),'Save and')] ")
	private WebElement btnSave;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtMailId;
	@FindBy(xpath = "//button[text()='CONTINUE'] ")
	private WebElement btnContin;

	@FindBy(xpath = "(//div[@class='_1XFPmK'] )[5]")
	private WebElement btnRadioCashOnDely;

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getBtnPlaceOrder() {
		return btnPlaceOrder;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtPassWrd() {
		return txtPassWrd;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnChangeAddr() {
		return btnChangeAddr;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtMobNo() {
		return txtMobNo;
	}

	public WebElement getTxtPinCode() {
		return txtPinCode;
	}

	public WebElement getTxtLocality() {
		return txtLocality;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getdDNState() {
		return dDNState;
	}

	public WebElement getBtnRadioHome() {
		return btnRadioHome;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public WebElement getTxtMailId() {
		return txtMailId;
	}

	public WebElement getBtnContin() {
		return btnContin;
	}

	public WebElement getBtnRadioCashOnDely() {
		return btnRadioCashOnDely;
	}

	
	
}