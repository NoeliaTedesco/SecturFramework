package pages;

import base.BasePage;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage {

	@FindBy(name = "username")
	private WebElement campoUsuario;

	@FindBy(name = "password")
	private WebElement campoContrasena;
	
	@FindBy(name = "submit")
	private WebElement botonIngresar;

	public void loginUsser(String usser, String password) {
		campoUsuario.sendKeys(usser);
		campoContrasena.sendKeys(password);
		botonIngresar.click();	
	}

	public void getUrl() {
		driver.getCurrentUrl();
	}

}
