#include <stdio.h>
#include <math.h>

float calculoF(float x);
float calculoE(float a,float b);

int main(){
    float xl,xu,xr,fxl,fxr,ep,ea,xe;//variables de los valores iniciales y las funciones evaluadas
    int i,j=0;
    while(j<2){
        ea=1.5;
        if(j<1){///Permite el uso de ambos casos 
            xe=0.91000756548175;///primer caso 
            xl=0.5;
            xu=1;
        }else{
            xe=-0.4589623816908;///segundo caso
            xl=-2;
            xu=0;
        }
        printf("Iteracion       Xl           Xu           Xr            Ea         Ep\n");
        for(i = 0 ; 0.5 <= ea ; i++){   
            ///PASO 1
            fxl=calculoF(xl);//cacular la funcion de f(xl)
            ///PASO 2
            xr=(xl+xu)/2;///calcular xr
            ///PASO 3
            fxr=calculoF(xr);//cacular la funcion de f(xr)
            printf("    %d     ,  %f  ,  %f  ,  %f   ,",i,xl,xu,xr);
            if(i!=0){///en la primer iteracion no genera Ea     
                if((fxl*fxr)<0){//calcular Ea
                    ea=calculoE(xr,xl);
                    printf("   %f   ,",ea);
                }else{
                    ea=calculoE(xr,xu);
                    printf("   %f   ,",ea);
                }   
            }else{
                printf("             , ");
            }
            if((fxl*fxr)<0){///sustituir xr en xl o xu
                xu=xr;
            }else if((fxl*fxr)>0){
                xl=xr;
            }
            ep=calculoE(xe,xr);//calcular Ep
            printf("%f  \n",ep);
            }
        j++;//permite el cambio de valores iniciales
    }
    return 0;
}

float calculoF(float x){/// calculo de la funcion
    float fx;
    fx=exp(x)-3*pow(x,2);///formuna de la funcion
    return fx;
}

float calculoE(float a, float b){///calculo general de los errores
    float e;
    e=fabs((a-b)/a)*100;//Formula de los errores
    return e;
}