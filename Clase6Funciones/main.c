#include <stdio.h>
#include <stdlib.h>
/** PROTOTIPO DE LA FUNCION */
int sumar (int n1, int n2);
int restar (int n1, int n2);
int multiplicar (int n1, int n2);
int dividir (int n1, int n2);
void mostrarMensajes();//PROCEDIMIENTO




int main()
{
    int opcionIngresada = 0 ;
    printf("***********Welcome to Calculadora*************\n");
    printf("Ingrese la opcion deseada \n ");
    printf("1.SUMAR \n 2.RESTAR \n 3.MULTIPLICAR \n 4.DIVIDIR\n");

    scanf("%i", &opcionIngresada);

    switch(opcionIngresada)
    {
        int numeroUno = 0,numeroDos = 0, resultado = 0;
    case 1:
        printf("usted selecciono la opcion 1 \n ");
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroUno);
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroDos);
        printf("El Resultado es %i \n", sumar(numeroUno ,numeroDos));//INvoco a la funcion sumar
        break;
    case 2:
        printf("usted selecciono la opcion 2 \n ");
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroUno);
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroDos);
        printf("El Resultado es %i \n", restar(numeroUno, numeroDos));
        break;
    case 3:
        printf("usted selecciono la opcion 3 \n ");
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroUno);
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroDos);
        printf("El Resultado es %i \n", multiplicar(numeroUno, numeroDos));
        break;
    case 4:
        printf("usted selecciono la opcion 4 \n ");
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroUno);
        mostrarMensajes();/** invocamos al procedimiento mostrarMensaje()*/
        scanf("%i",&numeroDos);
        if (dividir(numeroUno ,numeroDos) != 0){
            printf("El Resultado de la div es %i \n " , dividir(numeroUno , numeroDos));
        }else{
                printf("no deverias ingresarme un CERO en el numero Dos\n");
        }

        break;
    default:
        printf("la opcion ingresada es invalida \n");

    }

    printf("finalizo el programa\n");

    return 0;
}

/**DEFINIMOS EL CUERPO DE NUESTRAS FUNCIONES*/
/**N1 y N2 son variables locales y automaticas a cada una de las funciones */
int sumar (int n1, int n2)
{
    //CUERPO DE LA FUNCION
    int resultado = n1 + n2 ;
    return resultado ;
}

int restar (int n1, int n2)
{
    int resultado = n1 - n2 ;
    return resultado ;
}

int multiplicar (int n1, int n2)
{

    return n1 * n2 ;
}

int dividir (int n1, int n2)
{
    if(n2 == 0)
    {
        printf("No podes dividir por cero en los numeros Reales \n");
        return 0 ;
    }
    else
    {
        return n1 / n2;
    }
}

void mostrarMensajes()
{
    printf("ingrese un numero \n");
}




