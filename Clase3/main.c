#include <stdio.h>
#include <stdlib.h>

int main()
{
    /** Cuerpo del main */
    float numero1 = 0 , numero2 = 0 , resultado = 0;
    /**ingreso de datos por teclado */
    printf("ingrese el primer numero por favor ");
    scanf("%f" , &numero1 );//escaneo datos del teclado

    printf("ingrese el segundo numero por favor ");
    scanf("%f" , &numero2 );
    /**procesamos los datos */
    resultado = numero1 + numero2 ;
    /**mostramos el resultado */
    printf("el resultado es : %.2f" , resultado);

    return 0;

}
