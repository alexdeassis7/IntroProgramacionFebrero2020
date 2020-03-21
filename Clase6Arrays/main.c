#include <stdio.h>
#include <stdlib.h>
/**  Almacenar 10 números en un vector, imprimir cuantos son ceros, cuantos son negativos y
     cuantos positivos. Imprimir además la suma de los negativos  y la suma de los positivos */
int main()
{
    //defino un vector
    int vector[10];
    //defino mis contadores
    int contadorDeCeros = 0 ;
    int contadorDeNumerosPositivos = 0 ;
    int contadorDeNumerosNegativos = 0 ;
    //defino mis acumuladores
    int acumuladorPositivos = 0;
    int acumuladorNegativos = 0;
    //Cargamos el array con datos
    for(int x = 0 ; x < 10 ; x++)
    {

        printf("ingrese el numero %i ", x);
        scanf("%i",&vector[x]);

    }
    //recorremos el array procesando la informacion
    for(int x = 0 ; x < 10 ; x++)
    {
        if(vector[x] > 0)
        {
            contadorDeNumerosPositivos ++;
            acumuladorPositivos += vector[x];
        }
        else if (vector[x] < 0 )
        {
            contadorDeNumerosNegativos ++ ;
            acumuladorNegativos += vector[x];

        }else{
                contadorDeCeros ++ ;
        }
    }
    printf("CANTIDAD DE CEROS = %i \n", contadorDeCeros);
    printf("CANTIDAD DE NUMEROS NEGATIVOS ENCONTRADOS EN EL ARRAY = %i \n" , contadorDeNumerosNegativos);
    printf("CANTIDAD DE NUMEROS POSITIVOS ENCONTRADOS EN EL ARRAY = %i \n" , contadorDeNumerosPositivos);
    printf("LA SUMA DE TODOS LOS NUMEROS POSITIVOS ENCONTRADOS EN EL ARRAY ES = %i \n " , acumuladorPositivos);
    printf("LA SUMA DE TODOS LOS NUMEROS NEGATIVOS ENCONTRADOS EN EL ARRAY ES = %i \n " , acumuladorNegativos);


    return 0;
}
