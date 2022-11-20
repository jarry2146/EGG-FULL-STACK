///Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero tiene todos sus 
///d�gitos impares (ejemplo: 333, 55, etc.). 
///Para esto vamos a tener que separar el numero en partes (si es un numero de m�s de un digito) y ver si cada 
///n�mero es par o impar. Nota: recordar el uso de la funci�n Mod y Trunc(). 
///No podemos pasar el numero a cadena para realizar el ejercicio.

Algoritmo digitosSonImpares
	
	Definir num Como Entero;
	Definir r Como Logico;
	
	Hacer
	Escribir "Ingrese un n�mero de dos d�gitos: ";
	Leer num;
	
    Mientras Que num <= 9
	
	r = verificar(num);

FinAlgoritmo

Funcion retorno <- verificar ( num )
	Definir retorno Como Logico;
	Definir primerNum2, ultNum Como Entero;
	Definir primerNum Como Real;
	
	ultNum = num mod 10;                         // Variable a usar
	primerNum = num / 10;
	primerNum2 = trunc(primerNum);               // Variable a usar
	
	Si(primerNum2 mod 2 <> 0) Entonces
		retorno = Verdadero;
		Escribir primerNum2, " ES impar."
	SiNo
		retorno = Falso;
		Escribir primerNum2, " NO es impar."
	FinSi
	
	Si(ultNum mod 2 <> 0) Entonces
		retorno = Verdadero;
		Escribir ultNum, " ES impar.";
	SiNo
		retorno = Falso;
		Escribir ultNum, " NO es impar.";
	FinSi
	
	Si primerNum2 == 0 Entonces
		retorno = Verdadero;
		Escribir "Es neutro."
	SiNo
		Si ultNum == 0 Entonces
			retorno = Verdadero;
			Escribir " Es neutro."
		FinSi
	FinSi
FinFuncion
