//Hacer un algoritmo en Pseint para una helader�a se tienen 4 tipos de empleados
//ordenados de la siguiente forma con su n�mero identificador y salario diario correspondiente:
//				
//				Cajero (5000$/d�a).
//				Servidor (6400$/d�a).
//				Preparador de mezclas (8000$/d�a).
//				Mantenimiento (4800$/d�a).
//				
//	El due�o de la tienda desea tener un programa donde s�lo ingrese dos n�meros enteros que representen 
//al n�mero identificador del empleado y la cantidad de d�as que trabaj� en la semana (6 d�as m�ximos). 
//Y el programa le mostrar� por pantalla la cantidad de dinero que el due�o le debe pagar al empleDDado que ingres�
Proceso heladeria
Definir tipo,diaTrabajado,salario Como Entero;
salario <- 0;

Escribir 'Ingrese el identificador del empleado';
Leer tipo;
Escribir 'Ingrese los d�as trabajados';
Leer diaTrabajado;"
escribir" 1 cajero"

Segun (tipo)  Hacer
	1:
		salario <- diaTrabajado*5000; 
	2:
		salario <- diaTrabajado*6400;
	3:
		salario <- diaTrabajado*8000;
	4:
		salario <- diaTrabajado*4800;
	De Otro Modo:
		Escribir 'Tipo no v�lido';
FinSegun

Escribir 'La cantidad a pagar es: ',salario; 

FinProceso