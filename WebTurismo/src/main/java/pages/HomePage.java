package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import helpers.PageHelper;

public class HomePage extends BasePage {
	
		@FindBy (xpath = "//ul[@id ='slide-out']/li[2]")
		private WebElement menuPildoras;
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[3]")
		private WebElement menuItinerarios;
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[4]")
		private WebElement menuPerfiles;
		
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[5]")
		private WebElement menuDestinos;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]")
		private WebElement menuSecciones;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div")
		private WebElement colHome;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[2]")
		private WebElement colRegiones;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[3]")
		private WebElement colProvincias;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[4]")
		private WebElement colCiudades;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[5]")
		private WebElement colCatActividades;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[6]")
		private WebElement colActividades;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[7]")
		private WebElement colHistorias;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[8]")
		private WebElement colCatItinerarios;
		

		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[9]")
		private WebElement colItinerarios;
		
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[6]/ul/li/div[10]")
		private WebElement colInformacion;
		
		@FindBy (xpath = "//div[@id='navbar']/ul/li[2]")
		private WebElement btnCambiarContrasena;
		
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[7]")
		private WebElement menuInstagram;
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[8]")
		private WebElement menuTags;
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[9]")
		private WebElement menuIdiomas;
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[10]")
		private WebElement menuEventos;
		
		@FindBy (xpath = "//ul[@id ='slide-out']/li[11]/a")
		private WebElement btnSalir;
		
		public void enterToPillSection() {
			wait.until(ExpectedConditions.elementToBeClickable(menuPildoras));
			menuPildoras.click();
		}
		
		public void enterToProfileSection() {
			wait.until(ExpectedConditions.elementToBeClickable(menuPerfiles));
			menuPerfiles.click();
		}
		
		
		public void enterToSections() {
			wait.until(ExpectedConditions.elementToBeClickable(menuSecciones));
			menuSecciones.click();
		}
		
		public void enterToCollectionTypeHome() {
			wait.until(ExpectedConditions.elementToBeClickable(colHome));
			colHome.click();
		}
		
		public void enterToCollectionTypeRegiones() {
			wait.until(ExpectedConditions.elementToBeClickable(colRegiones));
			colRegiones.click();
		}
		
		public void enterToCollectionTypeProvincias() {
			wait.until(ExpectedConditions.elementToBeClickable(colProvincias));
			colProvincias.click();
		}
		
		public void enterToCollectionTypeCiudades() {
			wait.until(ExpectedConditions.elementToBeClickable(colCiudades));
			colCiudades.click();
			
		}
		
		public void enterToCollectionTypeCategoriaAct() {
			wait.until(ExpectedConditions.elementToBeClickable(colCatActividades));
			colCatActividades.click();
			
		}
		
		
		public void enterToCollectionTypeHistorias() {
			wait.until(ExpectedConditions.elementToBeClickable(colHistorias));
			colHistorias.click();
			
		}
		
		public void enterToCollectionTypeCatItinerarios() {
			wait.until(ExpectedConditions.elementToBeClickable(colCatItinerarios));
			colCatItinerarios.click();
			
		}
		
		public void enterToCollectionTypeInformacion() {
			wait.until(ExpectedConditions.elementToBeClickable(colInformacion));
			colInformacion.click();
			
		}
		
		public void enterToCollectionTypeActividades() {
			wait.until(ExpectedConditions.elementToBeClickable(colActividades));
			colActividades.click();		
		}
		
		
		public void signOff() {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btnSalir);
		}
		

		
		 
}
