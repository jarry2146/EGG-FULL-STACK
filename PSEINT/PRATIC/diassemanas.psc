//Hacer un algoritmo en Pseint que lea un n�mero y seg�n ese n�mero, indique el d�a que corresponde.

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
								Escribir "D�a inv�lido"
	                       FinSi
                        FinSi
                    FinSi
				FinSi
            FinSi
       FinSi
  FinSi
FinAlgoritmo
