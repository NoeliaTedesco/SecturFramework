package steps;

import static config.DataSetter.configuration;

import base.BaseStep;
import context.Colecciones;
import context.Usuario;
import helpers.ExcelHelper;
import helpers.PageHelper;
import helpers.StepHelper;
import helpers.XMLHelper;
import pages.HomePage;
import pages.LoginPage;

public class PildorasStep extends BaseStep {
	
	public static void Run(String testName) {
		try {
			log.Log.startTestCase(testName);
			Usuario usr = XMLHelper.object.getUsuario();
			Colecciones col = ExcelHelper.objectExcel.getColeccion();
			PageHelper.deleteAllCookies(driver);
			NavigateToSite(configuration.getambiente_testing());
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			StepHelper.takeScreenShot(testName);
			CurrentPage.As(LoginPage.class).loginUsser(usr.getUsser(), usr.getPassword());
			PageHelper.WaitForPageLoading();
			CurrentPage = (new HomePage().GetInstance(HomePage.class));
			CurrentPage.As(HomePage.class).enterToPillSection();
			PageHelper.WaitForPageLoading();
			CurrentPage.As(HomePage.class).enterToProfileSection();
			PageHelper.WaitForPageLoading();
			CurrentPage.As(HomePage.class).enterToSections();
			PageHelper.WaitForPageLoading();
			CurrentPage.As(HomePage.class).enterToCollectionTypeHome();
			PageHelper.WaitForPageLoading();
			CurrentPage.As(HomePage.class).enterToCollectionTypeRegiones();
			CurrentPage.As(HomePage.class).signOff();
			PageHelper.WaitForPageLoading();
			log.Log.SuccessStep(testName);
		} catch (Exception ex) {
			log.Log.info(ex.getMessage());
			log.Log.FailStep(testName);
		}
		log.Log.endTestCase(testName);	

	}	
		
	
	

}
