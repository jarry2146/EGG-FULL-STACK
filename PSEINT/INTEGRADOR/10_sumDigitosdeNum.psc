///Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.Ejemplo: 25 = 2 + 5 = 7
///Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el resto de una 
///divisi�n entre 10. 
///Recordar el uso de la funci�n Mod y Trunc.

Algoritmo sumDigitosdeNum
	
	Definir num, r Como Entero;
	
	Hacer
		
		Escribir "Por favor, ingrese un n�mero de 2 d�gitos: ";
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
