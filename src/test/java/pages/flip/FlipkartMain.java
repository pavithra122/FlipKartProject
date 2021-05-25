package pages.flip;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import own.base.LibGlobal;

public class FlipkartMain extends LibGlobal {
	ProductSearch ps;
	AddToCart cart;
	RemoveProduct rp;

	@BeforeClass
	public void browserLaunch() {

		getDriver();
		loadUrl("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

	}

	@Test
	public void tc0() {
		ps = new ProductSearch();
		click(ps.getBtnClose());
	}

	@Parameters({ "prtName" })
	@Test
	public void tc0(@Optional("fasttrack watch") String s) {

		type(ps.getTxtSearch(), s);
		click(ps.getBtnSearch());
		List<WebElement> list = ps.getAllProducts();
		WebElement element = list.get(2);
		click(element);

	}

	@Test
	public void tc1() {
		cart = new AddToCart();
		String prtWinId = getPrtWinId();
		Set<String> allWinId = getAllWinId();
		for (String string : allWinId) {
			if (!string.equals(prtWinId)) {
				driver.switchTo().window(string);
			}

		}
		scrollDown(cart.getBtnAddToCart());
		click(cart.getBtnAddToCart());
		click(cart.getBtnPlaceOrder());
	}

	@Parameters({ "email", "password", "name", "mobNo", "pincode", "locality", "Address", "City", "state", "EmailID" })
	@Test
	public void tc2(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8, String a9,
			String a10) throws InterruptedException {
		type(cart.getTxtEmail(), a1);
		click(cart.getBtnContinue());
		type(cart.getTxtPassWrd(), a2);
		click(cart.getBtnLogin());

		click(cart.getBtnChangeAddr());
		click(cart.getBtnEdit());
		clear(cart.getTxtName());
		type(cart.getTxtName(), a3);
		clear(cart.getTxtMobNo());
		type(cart.getTxtMobNo(), a4);
		clear(cart.getTxtPinCode());
		type(cart.getTxtPinCode(), a5);
		clear(cart.getTxtLocality());
		type(cart.getTxtLocality(), a6);
		scrollDown(cart.getTxtCity());
		clear(cart.getTxtAddress());
		type(cart.getTxtAddress(), a7);
		clear(cart.getTxtCity());
		type(cart.getTxtCity(), a8);
		selectOptionByText(cart.getdDNState(), a9);
		click(cart.getBtnRadioHome());
		click(cart.getBtnSave());

		type(cart.getTxtMailId(), a10);

		click(cart.getBtnContin());

		click(cart.getBtnRadioCashOnDely());

	}

	@Test
	public void tc3() {
		rp = new RemoveProduct();
		click(rp.getBtnChange());

		click(rp.getBtnRemove());

	}

}
