package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import log.Log;

public class ChangePasswordPage extends BasePage {

	@FindBy(id = "newPassword")
	WebElement campNueva;

	@FindBy(id = "repeatNewPassword")
	WebElement campReingresar;

	@FindBy(xpath = "//div[@id='main']/div/div[2]/footer/div/div/div/div[2]/button")
	WebElement btnCambiar;

	@FindBy(xpath = "//div[@id='main']/div/div[2]/footer/div/div/div/div[1]/button")
	WebElement btnCancelar;

	@FindBy(className = "toast-message")
	WebElement toastMessage;

	@FindBy(name = "changePasswordForm")
	WebElement formChangePassword;

	@FindBy(xpath = "//form[@name = 'formChangePassword']/div/div/div[2]")
	WebElement mensajeValidacion;

	@FindBy(xpath = "//form[@name = 'formChangePassword']/div[2]/div/div[2]")
	WebElement mensajeValidacionReingreso;

	public void CancelChange() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCancelar));
		btnCancelar.click();

	}

	public void ChangePassword(String newPass, String reEnterPass) {
		wait.until(ExpectedConditions.elementToBeClickable(campNueva));
		campNueva.click();
		campNueva.sendKeys(newPass);
		campReingresar.click();
		campReingresar.sendKeys(reEnterPass);
		btnCambiar.click();
		wait.until(ExpectedConditions.textToBePresentInElement(toastMessage, "Su contraseña ha sido cambiada."));
	}

	
	public boolean ChangePasswordShortFieldError(String newPass) {
		wait.until(ExpectedConditions.elementToBeClickable(campNueva));
		campNueva.click();
		campNueva.sendKeys(newPass);
		if (validateMessage(mensajeValidacion).equals("El campo es muy corto")) {
			Log.info("Validación de campo correcta");
			return true;
		}
		return false;
	}
	
	public boolean ChangePasswordObligatoryFieldError(String newPass, String reEnterPass) {
		wait.until(ExpectedConditions.elementToBeClickable(campNueva));
		campNueva.click();
		campNueva.sendKeys(newPass);
		campReingresar.click();
		campReingresar.sendKeys(reEnterPass);
		if (validateMessage(mensajeValidacion).equals("El campo es requerido")) {
			Log.info("Validación de campo correcta");
			return true;
		}
		return false;
	}
	
	public boolean ChangePasswordDoNotMatchFieldsError() {
		wait.until(ExpectedConditions.elementToBeClickable(campNueva));
		campNueva.click();
		campReingresar.click();
		if (validateMessage(mensajeValidacionReingreso).equals("Confirmación del campo debe coincidir")) {
			Log.info("Validación de campo correcta");
			return true;
		}
		return false;
	}
	
	
	
	public String validateMessage(WebElement element) {
		return element.getText();
		
	}
}
