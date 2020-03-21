#include <stdio.h>
#include <stdlib.h>

/**definimos una Structura en C de tipo CD*/
struct CD
{
    char titulo[25];
    char artista[25];
    float precio;
    int cantidadDeTemas;
};

int main()
{
    /**declaracion de un struct del tipo CD*/
    struct CD musicaParaVolar;
    /**Cargamos la estructura CD con datos*/
    //Utilizamos funcion strcpy(destino , origen)
    strcpy(musicaParaVolar.artista, "Gustavo Cerati");
    musicaParaVolar.precio = 99.5;
    musicaParaVolar.cantidadDeTemas = 13;
    strcpy(musicaParaVolar.titulo , "Musica Para volar");

    /**mostramos los datos que fueron seteados en los pasos previos*/
    printf(" *****************    CD    *******************\n");
    printf("Artista : %s ", musicaParaVolar.artista);
    printf("\n Precio : %f ", musicaParaVolar.precio);
    printf("\n Cantidad de Temas : %i ", musicaParaVolar.cantidadDeTemas);
    printf("\n Titulo : %s ", musicaParaVolar.titulo);

    printf("\ningrese el artista \n");
    scanf("%s", &musicaParaVolar.artista);
    /**solicitamos que los datos los ingreses el usuario*/
    printf("\ningrese el precio del cd por favor \n");
    scanf("%f", &musicaParaVolar.precio);
    fflush(stdin);
    printf("\n ingrese la cantidad de temas del Cd \n");
    scanf("%i", &musicaParaVolar.cantidadDeTemas);


    /**mostramos los datos que fueron seteados en los pasos previos*/
    printf(" *****************    CD    *******************");
    printf("\nArtista : %s ", musicaParaVolar.artista);
    printf("\n Precio : %f ", musicaParaVolar.precio);
    printf("\n Cantidad de Temas : %i ", musicaParaVolar.cantidadDeTemas);


    return 0;
}
