package proceso_aplicacion;
import javax.swing.JOptionPane;


public class mensaje_final {
		
	public void mensaje_final() {
		System.out.println("Terminar");
		Object mensaje_opcion= JOptionPane.showConfirmDialog(null, "¿Desea continuar?","Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		int mensaje= (Integer) mensaje_opcion;
		
		
		if (mensaje==0) {
			   //si desea continuar
			desarrollo intentar_de_nuevo= new desarrollo();
			intentar_de_nuevo.iniciar();
		}
		
		else if (mensaje==1) {
			//si desea salir
			JOptionPane.showMessageDialog(null, "El Programa a Finalizado","Gracias por preferirnos",JOptionPane.INFORMATION_MESSAGE);
			 
	    }
	 
	}

				
			 
			
}
	


