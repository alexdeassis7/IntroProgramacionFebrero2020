#include <stdio.h>
#include <stdlib.h>
int main()
{
    /** For anidados*/
    for(int horas = 0 ; horas < 24 ; horas ++)
    {
        for(int minutos = 0 ; minutos < 60 ; minutos ++)
        {
            for(int segundos = 0 ; segundos < 60 ; segundos ++)
            {
                    printf("%i : %i : %i \n", horas, minutos, segundos);
            }
        }

    }

    return 0;
}
