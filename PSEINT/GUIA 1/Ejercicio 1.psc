Algoritmo radio_perimetro
	
	//	Conocido el n�mero en matem�tica PI ?, pedir al usuario que ingrese el valor del radio de
	//	una circunferencia y calcular y mostrar por pantalla el �rea y per�metro. Recuerde que
	//  para calcular el �rea y el per�metro se utilizan las siguientes f�rmulas:
	
	///area = PI * radio^2
	///perimetro = 2 * PI *radio
	
	definir area,radio,PII,perimetro Como real
	PII= 3.1416
	
	escribir" ingrese el radio de la  circuferencia "
	leer radio
	
	
	area = PII*radio^2
	perimetro = 2 * PII * radio
	escribir" el area es ",area
	escribir" el el perimetro es ",perimetro
	
FinAlgoritmo
