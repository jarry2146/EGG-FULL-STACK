

Funcion inverciones  <- valordep( deposito )
	definir inverciones Como Real
	
	inverciones=deposito*0.2
	
Fin Funcion

Funcion inverciones <- valordes( deposito )
	definir inverciones Como Real
	inverciones=deposito*0.5
	
Fin Funcion




Algoritmo calculo_financiero_FUNCION
	//escribir un programa que calcule el descunto de un deposito de invercion,el valor a pagar por el rago oro 
//	y el decuento del 10 % por cada retiro que se aga 
	
	definir des,dep, deposito Como Entero
	Escribir "ingresar deposito"
	leer deposito
	deposito = 1
	
		escribir " el descuento fue del 2 %:"  valordep(deposito)
		leer deposito
		
	escribir " el descuento fue del 5 %:" valordes(deposito)
	escribir " el descuento fue del 10 %:"
	
FinAlgoritmo


