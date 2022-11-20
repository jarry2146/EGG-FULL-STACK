///Realizar una función que calcule la suma de los dígitos de un número.Ejemplo: 25 = 2 + 5 = 7
///Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el resto de una 
///división entre 10. 
///Recordar el uso de la función Mod y Trunc.

Algoritmo sumDigitosdeNum
	
	Definir num, r Como Entero;
	
	Hacer
		
		Escribir "Por favor, ingrese un número de 2 dígitos: ";
		Leer num;
		
	Mientras Que num <= 9
	
	r = sumarNums(num);
	
FinAlgoritmo

Funcion return <- sumarNums ( num )
	Definir return, primerNum2, ultNum Como Entero;
	Definir primerNum Como Real;
	
	ultNum = num mod 10;
	primerNum = num / 10;
	primerNum2 = trunc(primerNum);
	
	return = ultNum + primerNum2;
	
	Escribir num, " = ", primerNum2, " + ", ultNum, " = ", return;
FinFuncion
