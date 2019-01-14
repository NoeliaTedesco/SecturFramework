package config;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Configuration {
	private String browser;
	private String ambiente_testing;
	private String ambiente_desarrollo;
	private String ambiente_homologacion;
	private String driverPath;
	private String log4jPath;
	private String delivery;
	private String deliveryPath;
	private String reportPath;
	private String reportRepository;
	private String imageRepository;
	private String urlDriver;
	private String pruebaRemota;

	public Configuration() {
	}

	public Configuration(String browser, String ambiente_testing, String ambiente_desarrollo, String ambiente_homologacion, String driverPath,
			String log4jPath, String delivery, String reportPath, String reportRepository, String imageRepository,
			String deliveryPath, String urlDriver, String pruebaRemota) {
		this.browser = browser;
		this.ambiente_testing = ambiente_testing;
		this.ambiente_desarrollo = ambiente_desarrollo;
		this.ambiente_homologacion = ambiente_homologacion;
		this.driverPath = driverPath;
		this.log4jPath = log4jPath;
		this.delivery = delivery;
		this.reportPath = reportPath;
		this.reportRepository = reportRepository;
		this.imageRepository = imageRepository;
		this.deliveryPath = deliveryPath;
		this.urlDriver = urlDriver;
		this.pruebaRemota = pruebaRemota;
	}

	
	
	public String getPruebaRemota() {
		return pruebaRemota;
	}

	@XmlElement
	public void setPruebaRemota(String pruebaRemota) {
		this.pruebaRemota = pruebaRemota;
	}

	public String getUrlDriver() {
		return urlDriver;
	}
	
	@XmlElement
	public void setUrlDriver(String urlDriver) {
		this.urlDriver = urlDriver;
	}

	public String getDeliveryPath() {
		return deliveryPath;
	}

	@XmlElement
	public void setDeliveryPath(String deliveryPath) {
		this.deliveryPath = deliveryPath;
	}

	public String getBrowser() {
		return browser;
	}

	@XmlElement
	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getambiente_testing() {
		return ambiente_testing;
	}

	@XmlElement
	public void setambiente_testing(String ambiente_testing) {
		this.ambiente_testing = ambiente_testing;
	}

	public String getambiente_desarrollo() {
		return ambiente_desarrollo;
	}

	@XmlElement
	public void setambiente_desarrollo(String ambiente_desarrollo) {
		this.ambiente_desarrollo = ambiente_desarrollo;
	}

	public String getambiente_homologacion() {
		return ambiente_homologacion;
	}

	@XmlElement
	public void setambiente_homologacion(String ambiente_homologacion) {
		this.ambiente_homologacion = ambiente_homologacion;
	}

	public String getDriverPath() {
		return driverPath;
	}

	@XmlElement
	public void setDriverPath(String driverPath) {
		this.driverPath = driverPath;
	}

	public String getLog4jPath() {
		return log4jPath;
	}

	@XmlElement
	public void setLog4jPath(String log4jPath) {
		this.log4jPath = log4jPath;
	}

	public String getDelivery() {
		return delivery;
	}

	@XmlElement
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getReportPath() {
		return reportPath;
	}

	@XmlElement
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	public String getReportRepository() {
		return reportRepository;
	}

	@XmlElement
	public void setReportRepository(String reportRepository) {
		this.reportRepository = reportRepository;
	}

	public String getImageRepository() {
		return imageRepository;
	}

	@XmlElement
	public void setImageRepository(String imageRepository) {
		this.imageRepository = imageRepository;
	}

}
