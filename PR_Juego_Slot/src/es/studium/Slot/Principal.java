package es.studium.Slot;

public class Principal {

	public static void main(String[] args) {
		
		//MVC
		Modelo modelo = new Modelo();
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		new Controlador(modelo, menuPrincipal);

	}

}
