package context;

import com.poiji.annotation.ExcelCell;

public class Colecciones {

	@ExcelCell(value = 0)
	public String cTitulo;

	@ExcelCell(value = 1)
	public String cDescripcion;

	@ExcelCell(value = 2)
	public String cTextoSeparador;

	@ExcelCell(value = 3)
	public String urlImages;

	//TO DO MODIFICAR CAMPOS SEGUN CORRESPONDEN AL ALTA DE COLECCIONES
	@ExcelCell(value = 4)
	public String urlVideos;

	@ExcelCell(value = 5)
	public String cDestinos;

	@ExcelCell(value = 6)
	public String cActividades;

	@ExcelCell(value = 7)
	public String cLatitud;

	@ExcelCell(value = 8)
	public String cLongitud;

	public Colecciones() {

	}

	public Colecciones(String cTitulo, String cDescripcion, String urlImages, String urlVideos, String cDestinos,
			String cActividades, String cLatitud, String cLongitud, String cTextoSeparador) {
		this.cTitulo = cTitulo;
		this.cDescripcion = cDescripcion;
		this.urlImages = urlImages;
		this.urlVideos = urlVideos;
		this.cDestinos = cDestinos;
		this.cActividades = cActividades;
		this.cLatitud = cLatitud;
		this.cLongitud = cLongitud;
		this.cTextoSeparador = cTextoSeparador;
	}

	public String getcTextoSeparador() {
		return cTextoSeparador;
	}

	public String getcTitulo() {
		return cTitulo;
	}

	public String geturlImages() {
		return urlImages;
	}

	public String geturlVideos() {
		return urlVideos;
	}

	public String getcDescripcion() {
		return cDescripcion;
	}

	public String getcDestinos() {
		return cDestinos;
	}

	public String getcActividades() {
		return cActividades;
	}

	public String getcLatitud() {
		return cLatitud;
	}

	public String getcLongitud() {
		return cLongitud;
	}

//	@XmlElement
//	public void setcTextoSeparador(String cTextoSeparador) {
//		this.cTextoSeparador = cTextoSeparador;
//	}
//
//	@XmlElement
//	public void setcTitulo(String cTitulo) {
//		this.cTitulo = cTitulo;
//	}
//
//	@XmlElement
//	public void seturlImages(String urlImages) {
//		this.urlImages = urlImages;
//	}
//
//	@XmlElement
//	public void setcDescripcion(String cDescripcion) {
//		this.cDescripcion = cDescripcion;
//	}
//
//	@XmlElement
//	public void setcDestinos(String cDestinos) {
//		this.cDestinos = cDestinos;
//	}
//
//	@XmlElement
//	public void setcActividades(String cActividades) {
//		this.cActividades = cActividades;
//	}
//
//	@XmlElement
//	public void setcLatitud(String cLatitud) {
//		cLatitud = cLatitud;
//	}
//
//	@XmlElement
//	public void setcLongitud(String cLongitud) {
//		this.cLongitud = cLongitud;
//	}
//
//	@XmlElement
//	public void seturlVideos(String urlVideos) {
//		this.urlVideos = urlVideos;
//	}

}
