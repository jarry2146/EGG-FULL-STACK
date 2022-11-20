//Hacer un algoritmo en Pseint que lea un número y según ese número, indique el día que corresponde.

Algoritmo diassemanas
	definir dias Como Entero
	escribir" ingrese el dia "
	leer dias
	
	si (dias=1) Entonces
		Escribir "lunes"
	SiNo
		
		si (dias=2) Entonces
			Escribir" martes"
		SiNo
			si (dias=3) Entonces
				Escribir "miercoles"
			SiNo
				si (dias=4) Entonces
					Escribir "jueves"
				SiNo
					si (dias=5) Entonces
						Escribir "viernes"
					SiNo
						si (dias=6) Entonces
							Escribir "sabado"
						SiNo
							si (dias=7) Entonces
								Escribir "domingo"
							SiNo
								Escribir "Día inválido"
	                       FinSi
                        FinSi
                    FinSi
				FinSi
            FinSi
       FinSi
  FinSi
FinAlgoritmo
