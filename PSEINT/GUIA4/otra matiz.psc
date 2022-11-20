Algoritmo sin_titulo
	definir matriz, i, j, orden, nro, col,fila, aux Como Entero
	definir flag como logico
	
	Repetir
		Escribir "Ingrese la cantidad de indece de la matriz menor a 10"
		leer orden
    Mientras Que orden > 10
	
	Dimension matriz[orden,orden]
	para i<- 0 hasta orden-1 hacer 
		para j<-0 hasta orden-1 Hacer
			matriz[i,j]=elegir()
		FinPara
	FinPara
	
	para i<- 0 hasta orden-1 hacer 
		para j<-0 hasta orden-1 Hacer
			Escribir sin saltar matriz[i,j] "|"
		FinPara
		escribir ""
	FinPara
	
	veri_fila(matriz,orden,flag) // se puede verificar el resultados de las filas con flag
	si flag Entonces
		veri_columna(matriz,orden,flag,aux)
		si flag entonces
			veri_diago_pri(matriz,orden,flag,aux)
			si flag Entonces
				Escribir "Matriz magica"
			FinSi
		sino 
			Escribir "vamos mal por columnos"
		FinSi
	sino 
		escribir "vamos mal por fila"
	FinSi

	
	
FinAlgoritmo
//----------------------------------------------------------------------------
SubProceso nro2<-elegir()
	definir nro2, nro como entero
	
	repetir
		Escribir "Ingrese el valor para la matriz entre 1 y 9"
		leer nro
	
	mientras que nro<0 o nro>9
	nro2 =nro
FinSubProceso
//----------------------------------------------------------------------------
SubProceso veri_fila(matriz, orden,flag Por Referencia)
	
	definir suma_fila, fila, i, j como entero
	fila = 0	
	flag = verdadero
	para i<- 0 hasta orden-1 hacer 
		suma_fila =0
		para j<-0 hasta orden-1 Hacer
			suma_fila= suma_fila +matriz[i,j]
		FinPara
	
		si i = 0 Entonces
			fila = suma_fila
		FinSi
		
		si fila <> suma_fila Entonces
			flag = falso
		FinSi
		
	FinPara
FinSubProceso
//----------------------------------------------------------------------------
SubProceso veri_columna(matriz, orden,flag Por Referencia, aux Por Referencia)
	definir suma_col, col, i, j como entero
	col  = 0	
	flag = verdadero
	para i<- 0 hasta orden-1 hacer 
		suma_col =0
		para j<-0 hasta orden-1 Hacer
			suma_col= suma_col +matriz[j,i]
		FinPara
		
		si i = 0 Entonces
			col = suma_col
			aux = suma_col
		FinSi
		
		si col <> suma_col Entonces
			flag = falso
		FinSi
		
	FinPara
FinSubProceso
//----------------------------------------------------------------------------
SubProceso veri_diago_pri(matriz,orden,flag,aux por referencia)
	definir suma_diago_prim, i, j, col, secundario Como entero
	suma_diago_prim = 0
	
	para i<-0 hasta orden-1 Hacer
		para j<- 0 hasta orden-1 Hacer
			si (i=j) Entonces
				suma_diago_prim = suma_diago_prim + matriz[i,j]
			FinSi
		FinPara
	FinPara
	secundario = 0
	para i<-0 hasta orden-1 Hacer
		para j<-0 hasta orden-1 hacer
			si (i+j = orden-1) Entonces
				secundario = secundario + matriz[i,j]
			FinSi
		finpara
	FinPara
	si (secundario <> suma_diago_prim y secundario <> aux) Entonces
		flag = falso
	FinSi
FinSubProceso


	