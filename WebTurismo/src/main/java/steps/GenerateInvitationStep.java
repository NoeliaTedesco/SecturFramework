package steps;

import static config.DataSetter.configuration;

import base.BaseStep;
import context.Colecciones;
import context.Usuario;
import helpers.ExcelHelper;
import helpers.PageHelper;
import helpers.StepHelper;
import helpers.XMLHelper;
import pages.ChangePasswordPage;
import pages.HomePage;
import pages.InvitationPage;
import pages.LoginPage;

public class GenerateInvitationStep extends BaseStep {
	
	public static void Run(String testName) {
		try {
			log.Log.startTestCase(testName);
			Usuario usr = XMLHelper.object.getUsuario();
			Colecciones inv = ExcelHelper.objectExcel.getColeccion();
			PageHelper.deleteAllCookies(driver);
			NavigateToSite(configuration.getambiente_testing());
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			StepHelper.takeScreenShot(testName);
			CurrentPage.As(LoginPage.class).loginUsser(usr.getUsser(), usr.getPassword());
			PageHelper.WaitForPageLoading();
			CurrentPage = (new HomePage().GetInstance(HomePage.class));
			CurrentPage.As(HomePage.class).enterInvitationsMenu();
			PageHelper.WaitForPageLoading();
			CurrentPage = (new InvitationPage().GetInstance(InvitationPage.class));
			CurrentPage.As(InvitationPage.class).openInvitationForm();
//			CurrentPage.As(InvitationPage.class).generateInvitation(inv.getNroSocio(),inv.getNroCelular(), inv.getEmail(), inv.getEspecialidad(),
//					inv.getDetalleConsulta(), inv.getNombre(), inv.getApellido(), inv.getFechaNacimiento(), inv.getIdServicio());
//			CurrentPage.As(InvitationPage.class).cancelInvitation(inv.getNroSocio());
			log.Log.SuccessStep(testName);
		} catch (Exception ex) {
			log.Log.info(ex.getMessage());
			log.Log.FailStep(testName);
		}
		log.Log.endTestCase(testName);	

	}	

}
