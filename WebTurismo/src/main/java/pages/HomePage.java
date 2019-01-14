package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class HomePage extends BasePage {
	
		@FindBy (css = "#main > div > div > div.container-fluid.main-full > div > div > div.col-xs-12.col-md-5 > div > div > div > button")
		private WebElement menuInvitaciones;
		
		@FindBy (xpath = "//a[@id='btSalir']")
		private WebElement btnSalir;
		
		@FindBy (xpath = "//div[@id='navbar']/ul/li[2]")
		private WebElement btnCambiarContrasena;
		
		@FindBy(xpath = "//*[@id='navbar']/ul/li[1]")
		private WebElement labelUsuario;
		
		
		public void enterInvitationsMenu() {
			wait.until(ExpectedConditions.elementToBeClickable(menuInvitaciones));
			menuInvitaciones.click();
		}
		
		public void changePassword() {
			wait.until(ExpectedConditions.visibilityOf(btnCambiarContrasena));
			wait.until(ExpectedConditions.elementToBeClickable(btnCambiarContrasena));
			btnCambiarContrasena.click();
		}
		
		public void signOff() {
			wait.until(ExpectedConditions.visibilityOf(btnSalir));
			wait.until(ExpectedConditions.elementToBeClickable(btnSalir));
			btnSalir.click();
		}
		
		public String getUsserLogged() {
			return labelUsuario.getAttribute("textContent");
		}
		
		 
}
