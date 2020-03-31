#include <stdio.h>
#include <stdlib.h>

//1.    En una tienda donde solo hay 10 productos se desea calcular el total de ganancia
//que produjo dicho negocio este mes. Para ello se cuenta por producto con: Precio del
//Costo, precio de venta, código y cantidad vendida en ese periodo. Realizar programa
//que permita calcular las Ganancias de la Tienda.
//defino la struct producto

struct producto
{
    char descripcionProducto[25] ;
    int cantidadVendida;
    float precioCosto;
    float precioVenta;
    int codigo;
};

int main()
{
    //defino un array de 10 productos
    struct producto listaDeProducto[10];

    //solicitamos la usuario y cargamos los 10 productos de la tienda en cada sub indice del array
    int i= 0;
    for( i=0 ; i<10 ; i++)
    {

        printf("ingrese la descripcion del producto %i \n ", (i+1));
        scanf("%s",&listaDeProducto[i].descripcionProducto);
        printf("ingrese la cantidad Vendida del producto %i \n ",(i+1));
        scanf("%i",&listaDeProducto[i].cantidadVendida);
        printf("ingrese el precio Costo del producto %i \n ",(i+1));
        scanf("%f",&listaDeProducto[i].precioCosto);
        printf("ingrese el precio Venta del producto %i \n ",(i+1));
        scanf("%f",&listaDeProducto[i].precioVenta);
        printf("ingrese el codigo del producto %i \n ",(i+1));
        scanf("%i",&listaDeProducto[i].codigo);
        printf("------------------------------------------------\n");

    }
  //mostramos los datos que fueron cargado en el paso anterior

    printf("************se cargaron los siguiente productos************* \n");

    for(i=0; i<10; i++)
    {

        printf("producto  %i %s \n ",(i+1),listaDeProducto[i].descripcionProducto );

    }

    //calculamos las ganancias obtenidas
    //defino acumuladores
    float ganaciaParcial = 0 ,gananciaTotalObtenida = 0;
    for(i=0; i<3; i++)
    {
        ganaciaParcial = (listaDeProducto[i].precioVenta - listaDeProducto[i].precioCosto) *listaDeProducto[i].cantidadVendida;
        gananciaTotalObtenida += ganaciaParcial ;

    }
    //mostramos las ganacias obtenias
    printf("la ganancia total que se obtubo es de : $ %f \n" ,gananciaTotalObtenida);



    return 0;
}
