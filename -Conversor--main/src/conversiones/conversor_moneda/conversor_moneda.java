package conversiones.conversor_moneda;//paquete
import proceso_aplicacion.desarrollo;//paquete
import proceso_aplicacion.mensaje_final;//paquete
import java.time.LocalDate; //fecha
import java.time.format.DateTimeFormatter;// para pasar dato de LocalDate a String 
import javax.swing.JOptionPane; //interfaz


public class  conversor_moneda {
	
	public void obtener_datos() {
		
	
		//seleccionar tipo de conversor de monedas
		Object [] opciones_moneda={"De Pesos Chilenos a Dolar","De Pesos Chilenos a Euros","De pesos Chilenos a pesos Libras Esterlinas","De pesos Chilenos a Yen Japones","De pesos Chilenos a Won sul-coreano","De Dolar a pesos Chilenos","De Euros a pesos Chilenos","De Libras Esterlinas a pesos Chilenos","De Yen Japones a pesos Chilenos","De Won sul-coreano a pesos Chilenos"}; 
		Object opciones_elegir_moneda = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión", "Menu",JOptionPane.QUESTION_MESSAGE,null,opciones_moneda, opciones_moneda[0]);
		System.out.println(opciones_elegir_moneda);
		String opcionMoneda_elegida= (String)opciones_elegir_moneda;
		
		// al no elegir ninguna conversion
		if (opciones_elegir_moneda==null) {
			mensaje_final mensaje_final= new mensaje_final();
			mensaje_final.mensaje_final();
			// al salir del programa
			System.exit(0);
		}
		
	
		try {
			//ingresar valor
			String opcion_cantidad_dinero=JOptionPane.showInputDialog("Ingrese valor que desea convertir \n Opción escogida: "+ opcionMoneda_elegida);
			
			//operación conversión
			conversor_moneda operacion= new conversor_moneda();
			operacion.resultado_conversion(opcionMoneda_elegida, opcion_cantidad_dinero);
		}
		// al ingresar un valor  no permitido
		catch(NumberFormatException | NullPointerException exception) {
			JOptionPane.showMessageDialog(null,"Valor no valido","Error",JOptionPane.ERROR_MESSAGE);
			desarrollo intentar_de_nuevo= new desarrollo();
			intentar_de_nuevo.iniciar();

			
			
		}
		
		
		
		
	}
	
	public void resultado_conversion(String tipoConvercion, String cantidaDinero) {
		
		String datos_api[];
		datos_api= new String[5];
		
		String pasar_De="",pasar_a = "";
	
		switch (tipoConvercion) {
			case "De Pesos Chilenos a Dolar":
				pasar_De="CLP";
				pasar_a="USD";
				break;
				
			case "De Pesos Chilenos a Euro":
				pasar_De="CLP";
				pasar_a="EUR";
				break;

			case "De Pesos Chilenos a Libras Esterlinas":
				pasar_De="CLP";
				pasar_a="GBP";
				break;

			case "De Pesos Chilenos a Yen Japones":
				pasar_De="CLP";
				pasar_a="JPY";
				break;

			case "De Pesos Chilenos a Won sul-coreano":
				pasar_De="CLP";
				pasar_a="KRW";
				break;

			case "De Dolar a Pesos Chilenos":
				pasar_De="USD";
				pasar_a="CLP";
				break;

			case "De Euros a Pesos Chilenos":
				pasar_De="EUR";
				pasar_a="CLP";
				break;

			case "De Libras Esterlinas a Pesos Chilenos":
				pasar_De="GBP";
				pasar_a="CLP";
				break;

			case "De Yen Japonés a Pesos Chilenos":
				pasar_De="JPY";
				pasar_a="CLP";
				break;

			case "De Won sul-coreano a Pesos Chilenos":
				pasar_De="KRW";
				pasar_a="CLP";
				break;

			case "Otros valores":
				conversor_moneda operacion= new conversor_moneda();
	
			
			default:
				break;
		}
		
		
		
		// fecha actual 
		LocalDate actualDate =LocalDate.now();
		// pasar de tipo LocalDate a String
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String fecha_formateada = actualDate.format(formatter);
		
		
		// guardar los datos en el array
		datos_api[0]= fecha_formateada; 
		datos_api[1]=cantidaDinero;
		datos_api[2]=pasar_De;
		datos_api[3]=pasar_a;
		
		//pasa datos a la Api
		API_Conversor respuesta = new API_Conversor();
		double valor_convertido=respuesta.get(datos_api[0],datos_api[1],datos_api[2],datos_api[3]);
		
		
		//formato decimales del  resultado
		double valor_formateado=0;
		
		valor_formateado=Math.round((valor_convertido*100.0)/100.0);
		
		
		//mostrar conversión
		JOptionPane.showMessageDialog(null,"El valor de la conversión  "+ tipoConvercion+ " es : $"+ valor_formateado);
		
		//mensaje final
		
		mensaje_final mensaje_final= new mensaje_final();
		mensaje_final.mensaje_final();
		
		
		
	}
	
	
	
	
}


