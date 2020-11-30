#include <stdio.h>
#include <math.h>

int main(){
    float x,fx,fdx,xi,t=0,ea;
    int i;
    printf("Ingrese valor inicial\n");
    scanf("%f",&x);//ingresar valor inicial
    while(t==0){//ingresar el valor de t pero t no sera 0 por que se cicla infinitamente
        printf("Ingrese error\n");
        scanf("%f",&t);
    }
    ea=t+1;//para que ea siempre cuando inicie sea mayor a el error dado por el ususario
    printf("Valor inicial,   Valor i+1      ,Error relativo\n");
    for( i = t; t <= ea; i++ ){//ciclo del calculo
        fx=exp(x)-3*pow(x,2);//funcion original
        fdx=exp(x)-6*x;//funcion derivada
        xi=x-(fx/fdx);///calculo de xi+1
        //printf("fx=%f\nfxd=%f\nxi=%f",fx,fdx,xi);
        if(i!=0){
            printf("%f     ,     %f     ,     ",x,xi);//imprimir xi y xi+1 
            ea=((xi-x)/xi)*100;///calculo de error 
            if(ea<0){
                ea=ea*-1;///solo para sacar el valor absoluto 
            }
            printf("%f\n",ea);///imprimir el error 
        }else{
            printf("%f     ,     %f     ,     \n",x,xi);//imprimir xi y xi+1 pero sin el primer error
        }
        x=xi;//cambio de xi por xi+1
    }
    return 0;
}