Algoritmo radio_perimetro
	
	//	Conocido el número en matemática PI ?, pedir al usuario que ingrese el valor del radio de
	//	una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
	//  para calcular el área y el perímetro se utilizan las siguientes fórmulas:
	
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
