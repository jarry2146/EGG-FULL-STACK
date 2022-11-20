//Hacer un algoritmo en Pseint para una heladería se tienen 4 tipos de empleados
//ordenados de la siguiente forma con su número identificador y salario diario correspondiente:
//				
//				Cajero (5000$/día).
//				Servidor (6400$/día).
//				Preparador de mezclas (8000$/día).
//				Mantenimiento (4800$/día).
//				
//	El dueño de la tienda desea tener un programa donde sólo ingrese dos números enteros que representen 
//al número identificador del empleado y la cantidad de días que trabajó en la semana (6 días máximos). 
//Y el programa le mostrará por pantalla la cantidad de dinero que el dueño le debe pagar al empleDDado que ingresó
Proceso heladeria
Definir tipo,diaTrabajado,salario Como Entero;
salario <- 0;

Escribir 'Ingrese el identificador del empleado';
Leer tipo;
Escribir 'Ingrese los días trabajados';
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
		Escribir 'Tipo no válido';
FinSegun

Escribir 'La cantidad a pagar es: ',salario; 

FinProceso