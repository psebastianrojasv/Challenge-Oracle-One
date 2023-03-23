<h1 align="center"> CHALLENGE ONE BACK END - JAVA</h1>
<h2 align="center"> Sprint 01: Crea tu propio conversor de moneda </h2>

 

## Descripción del Proyecto
En esta oportunidad, a los Devs  solicitó crear un conversor de divisas  y lo que se le quisiera agregar  utilizando el lenguaje Java .
Este Challenge  forma parte del proyecto ONE – Oracle Next Education con alula Latam en la ruta de formación de  Java Orientado a Objetos, con esta formación se dio el conocimiento para desarrollar  este challenge por medio de  una serie de sprints y  un tablero de trello para organizar el trabajo

![Challenge Oracle Next Education + Alura Banner](https://raw.githubusercontent.com/EduardoUT/ConversorMoneda-ONE-Alura_Challenge/master/src/Imagenes/challengeImage.jpg)

## Funcionamiento 
Al iniciar se da la opción de elegir entre el conversor de monedas o el conversor de temperatura.

![image](https://github.com/psebastianrojasv/Challenge-Oracle-One/blob/main/imagenes/1.PNG)

Al seleccionar "convertidor de moneda" nos mostrara un menú donde podremos seleccionar una de las  opciones para realizar la  conversión.

![image](https://github.com/psebastianrojasv/Challenge-Oracle-One/blob/main/imagenes/2.PNG)

Una vez elegida la conversion que quiere realizar aparecera un cuadro de diálogo en el cual se tiene que ingresar  el monto a convertir. 

![image](https://github.com/psebastianrojasv/Challenge-Oracle-One/blob/main/imagenes/3.PNG) 

En el caso de que  no haya ningún error, se despliega un cuadro de diálogo con la conversión solicitada.
![image](https://github.com/psebastianrojasv/Challenge-Oracle-One/blob/main/imagenes/3.2.PNG) 


En caso de que se ingrese un valor que  no sea válido o no se ingrese ningún valor, se mostrará un mensaje de error y se preguntará si quiere iniciar de  nuevo .

![image](https://user-images.githubusercontent.com/94869227/175195260-e2e93f0a-d01c-4413-9eb2-f106452f5c02.png) ![image](https://github.com/psebastianrojasv/Challenge-Oracle-One/blob/main/imagenes/3.3.PNG)


Finalizando muestra un cuadro para elegir si se quiere intentar de  nuevo o si quiere finalizar.

![image](https://user-images.githubusercontent.com/94869227/175196145-e2fb526b-68f4-4211-a876-de8073197612.png)

En el caso de que se decida finalizar, el programa se cerrara, se mostrará un mensaje al usuario donde se indique "El Programa a Finalinado"

![image](https://github.com/psebastianrojasv/Challenge-Oracle-One/blob/main/imagenes/4.PNG)


En caso de seguir en el programa, se vuelve al comienzo para elegir otra conversión, en este caso  el conversor de temperatura

![image](https://user-images.githubusercontent.com/94869227/175196595-5649c6f8-1125-43e0-a71f-35f900ff4e3a.png)


Nos presentará un  cuadro de diálogo  donde debemos seleccionar el tipo de conversión

![image](https://user-images.githubusercontent.com/94869227/175196988-92d24ad7-5d53-4f8c-9629-d9364b69dd48.png)


A continuación deberemos ingresar el valor que queremos convertir, se nos recordará la opción elegida anteriormente

![image](https://user-images.githubusercontent.com/94869227/175197191-c949b16c-aade-4720-908e-b016c2da7c58.png)


Si se ingresa un valor no valido, saldrá un cuadro de error

![image](https://user-images.githubusercontent.com/94869227/175197548-cae24657-315c-4302-b1fd-225545dffac2.png)

De lo contrario, saldrá el resultado de la conversión

![image](https://user-images.githubusercontent.com/94869227/175197798-384e5797-d7e7-477d-9692-184dcd6811cd.png)


Podemos elegir continuar  en el programa o finalizarlo .

![image](https://user-images.githubusercontent.com/94869227/175197837-43361d7a-c262-4299-a3c5-68b0449334d9.png)


### <h2>¿Qué se utilizó? </h2>

Se utilizó java.io las operaciones de entrada/salida de Api 
Se Conectó la aplicación con una API de tipos de cambio en tiempo real, ya que las tasas cambian constantemente permitiendo que la aplicación siga funcionando de manera correcta independientemennte del  cambio en las tasas  monetarias.

![image](https://user-images.githubusercontent.com/94869227/175204627-89f42e4b-7d02-4ff2-81db-8553204c0936.png)

Se usaron validaciones para que al ingresar a la aplicacion esta identifique la fecha actual. 

Se  usaron Excepciones como NumberFormatException para poder evitar problemas de parte de Api, del programa o del usuario

Se usó  la librería  javax.swing.JOptionPane para el manejo de interfaces gráficas, permitiendo mostrar el conocimiento adquirido en el lenguaje Java de una forma más accesible al usuario 

El código  se agrupó en clases y en paquetes (package) para que su comprensión  y mantenimiento fuera más fácil y entendible  

