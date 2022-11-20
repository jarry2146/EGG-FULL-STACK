Proceso AreaYPerimetroDeUnRectangulo
	definir altura , base,area ,perimetro como entero
	
	
    Escribir Sin Saltar "Ingresa el valor de altura:";
    Leer altura;
    Escribir Sin Saltar "Ingresa el valor de base:";
    Leer base;
    area <- altura*base;
    perimetro <- altura+base+altura+base;
    Escribir "Valor de area: ", area;
    Escribir "Valor de perimetro: ", perimetro;
FinProceso