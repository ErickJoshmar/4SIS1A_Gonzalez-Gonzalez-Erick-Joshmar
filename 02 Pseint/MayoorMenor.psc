	Algoritmo MayoorMenor
		Definir a,b,c Como Real
		Escribir "Mayor y menor de numeros ingresados distintos"
		Escribir "Ingrese el primer numero"
		Leer a
		Escribir "Ingrese su segundo numero"
		Leer b
		Escribir "Ingrese el tercer numero"
		Leer c
		
		Si a>b y a>c  Entonces
			Escribir "El numero mayor es:", a
			
		SiNo
			Si b>a y b>c  Entonces
				Escribir "El numero mayor es:",b
				
			SiNo
				Si c>a y c>b  Entonces
					Escribir "El numero mayor es:",c
				SiNo
					Escribir "Existen valores iguales"
				Fin Si
			Fin Si
		FinSi
		
		Si a<b y a<c  Entonces
			Escribir "El numero menor es:",a
			
		SiNo
			Si b<a y b<c  Entonces
				Escribir "El numero menor es:",b
			SiNo
				Si c<a y c<b  Entonces
					Escribir "El numero menor es:",c
				SiNo
					Escribir "Existen valores iguales"
				FinSi
			FinSi
		Finsi
	
FinAlgoritmo
