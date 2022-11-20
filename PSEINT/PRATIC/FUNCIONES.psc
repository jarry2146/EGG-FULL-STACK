Funcion suma <- sumar ( n1,n2 )
	definir suma Como real
	suma = n1+n2
Fin Funcion
Funcion resta <- restar ( n1,n2 )
	definir resta ,mayor Como real
	resta = n1-n2
Fin Funcion

Funcion multiplica <- multiplicar ( n1,n2 )
	definir multiplica Como real
	multiplica = n1*n2
	
Fin Funcion

Funcion mayor <- numeromayor( n1,n2 )
	definir mayor Como real
	mayor=n1+n2;mayor= (n1-n2);mayor=(n1*n2)
	si  n1> n2 Entonces
		mayor=(n1+n2) ;mayor= (n1-n2);mayor=(n1*n2)
		
	FinSi 
	
Fin Funcion

Algoritmo FUNCIONES_n_enteros
	definir n1,n2, mayor Como real
	mayor=1
	escribir" ingrese un numero entero "
	leer n1
	escribir" ingrese orto numero entero "
	leer n2
	
	escribir " las suma es ",sumar(n1,n2)
	escribir" la resta es ",restar(n1,n2)
	escribir" la multiplicacion es "  , multiplicar(n1,n2)
	escribir " el numero mayor ",numeromayor(n1,n2) 
FinAlgoritmo
