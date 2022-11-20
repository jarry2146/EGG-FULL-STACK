Algoritmo ejer1_g2_2
	definir nota Como Entero
	
	repetir 
		escribir " ingrese una nota "
		leer nota
		
		si nota >=0 y nota<=10 Entonces
			
			escribir "nota es aceptada:" nota
		SiNo
			escribir " nota no aceptada: "
			
		FinSi
		
	hasta Que nota>=0 y nota  <=10
FinAlgoritmo
