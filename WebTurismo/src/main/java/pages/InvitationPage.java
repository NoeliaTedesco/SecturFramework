package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helpers.PageHelper;
import base.BasePage;
import log.Log;

public class InvitationPage extends BasePage {

	@FindBy(css = "#main > div > div > div > div > div.col-lg-12.text-right > button")
	WebElement btnEnviarInvitacion;

	@FindBy(className = "panel-heading")
	WebElement divInvitacion;

	@FindBy(css = "#enviarInvitacionForm > div > div > div.form-group.form-group-sm.has-feedback.has-error > div.row > div.col-md-8 > div > input")
	WebElement campNSocio;

	@FindBy(css = "#phone")
	WebElement campNTelefono;

	@FindBy(css = "#email")
	WebElement campEmail;

	@FindBy(id = "clinica")
	WebElement checkClinica;

	@FindBy(id = "pediatria")
	WebElement checkPediatria;

	@FindBy(css = "#enviarInvitacionForm > div > div > div:nth-child(8) > div > textarea")
	WebElement campDetalleMotivo;

	@FindBy(css = "#nombre")
	WebElement campNombre;

	@FindBy(css = "#apellido")
	WebElement campApellido;

	@FindBy(css = "#fechaNacimiento")
	WebElement campFechaNacimiento;

	@FindBy(css = "#id_servicio")
	WebElement campIdServicio;

	@FindBy(css = "#enviarInvitacionForm > div > footer > div > div > div > div:nth-child(2) > button")
	WebElement btnEnviar;

	@FindBy(xpath = "//*[@id='main']/div/div/div/div/div[3]/div/div[1]")
	WebElement panelInvitaciones;

	@FindBy(xpath = "//*[@id='main']/div/div/div/div/div[3]/div/div[2]/div/div[2]/table")
	WebElement panelVideoconsultas;

	@FindBy(className = "toast-message")
	WebElement toastMessage;
	
	WebElement btnAnular;
	
	WebElement btnReenviar;
	
	@FindBy(name = "modal-content")
	WebElement formModal;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/form/div[2]/button[2]")
	WebElement formModalBtnReenviar;
	
	@FindBy (id = "phone")
	WebElement formModalcampTelefono;
	
	@FindBy (id = "email")
	WebElement formModalcampEmail;

	public void openInvitationForm() {
		if (isInvitationButtonDisplayed()) {
			btnEnviarInvitacion.click();
			wait.until(ExpectedConditions.elementToBeClickable(divInvitacion));
		} else {
			Log.info("Invitaciones manuales deshabilitadas");
		}
	}

	public boolean isInvitationButtonDisplayed() {
		wait.until(ExpectedConditions.elementToBeClickable(panelInvitaciones));
		if (btnEnviarInvitacion.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public void generateInvitation(String NSocio, String NTelefono, String Email, String Especialidad,
			String DetalleMotivo, String Nombre, String Apellido, String FechaNacimiento, String idServicio) {

		divInvitacion.click();
		campNSocio.click();
		campNSocio.sendKeys(NSocio);

		campNTelefono.click();
		campNTelefono.sendKeys(NTelefono);

		campEmail.click();
		campEmail.sendKeys(Email);

		switch (Especialidad) {
		case "Clinica":
			checkClinica.click();
			break;
		case "Pediatria":
			checkPediatria.click();
			break;
		}

		campDetalleMotivo.click();
		campDetalleMotivo.sendKeys(DetalleMotivo);

		campNombre.click();
		campNombre.sendKeys(Nombre);

		campApellido.click();
		campApellido.sendKeys(Apellido);

		campFechaNacimiento.click();
		campFechaNacimiento.sendKeys(FechaNacimiento);

		campIdServicio.click();
		campIdServicio.sendKeys(idServicio);

		btnEnviar.click();

		wait.until(ExpectedConditions.textToBePresentInElement(toastMessage, "Invitación enviada."));
	}

	
	public void cancelInvitation(String socio) {
		btnAnular = isElementInInvitationsPanel(socio).findElement(By.xpath("//td[9]/a[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(btnAnular));
		btnAnular.click();
	}
	
	public void resendInvitation(String socio) {
		btnReenviar = isElementInInvitationsPanel(socio).findElement(By.xpath("//td[9]/a[1]"));
		btnReenviar.click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(formModal));
		formModalBtnReenviar.click();
		
	}
	
	public WebElement isElementInInvitationsPanel(String socio) {
		List<WebElement> elementos =  panelInvitaciones.findElements(By.xpath("//div/div[2]/table/tbody/tr"));
		 for (WebElement element : elementos) {
			 	if (element.getText().contains(socio)) {
			 		Log.info("El socio se encuentra en el panel de invitaciones");
			 		return element;
			 	}
		 }
		 return null;
	}

	public WebElement isElementInVideoconsultasPanel(String socio) {
		// TO DO: PONER BIEN EL XPATH DEL REGISTRO. 
		List<WebElement> elementos =  panelVideoconsultas.findElements(By.xpath("//tr/td"));
		 for (WebElement element : elementos) {
			 	if (element.getText().contains(socio)) {
			 		Log.info("El socio se encuentra en el panel de videoconsultas");
			 		return element;
			 	}
		 }
		 return null;
		
	}

}
