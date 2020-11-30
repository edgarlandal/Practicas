#include <stdio.h>
#include <math.h>
#define  MAX 20
//declaracion de funciones 
float miFalsaPosicion(float xl, float xu,float c[], int grade, int n);
float calcularF(float c[],int a, float x);
float calcularXr(float xl, float xu,float fxl, float fxu);
float calculoE(float a, float b);


int main(){
    int grade,i,n;
    float constantes[MAX],xl,xu;
    printf("Ingrese el grado de su funcion f(x) ");///grado de funcion
    scanf("%d",&grade);
    for(i = 0; i <=grade ; i++){///llena de coeficientes a la funcion
        printf("Ingrese las constante en la variable [%d]: ",i);
        scanf("%f",&constantes[i]);
    }
    imprimirFucion(grade,constantes);/// imprime la funcion requeriada
    printf("\nIngrese su valor inicial xl: \n");
    scanf("%f",&xl);
    printf("Ingrese su valor inicial xu: \n");
    scanf("%f",&xu);
    printf("Ingrese numero de iteraciones: \n");
    scanf("%d",&n);
    miFalsaPosicion(xl,xu,constantes,grade,n);
   
    return 0; 
}
float miFalsaPosicion(float xl, float xu,float c[], int grade, int n){
    float fxl,fxu,xr,fxr,ep;
    int i;
    printf("Iteracion           Xl                Xu                  Xr                 Ep\n");
    for(i = 0; i < n ; i++){
        fxl=calcularF(c,grade,xl);////calulo de xl en la funcion 
        fxu=calcularF(c,grade,xu);///calculo de xu en la funcion 
        xr=calcularXr(xl,xu,fxl,fxu);///calculo de xr
        fxr=calcularF(c,grade,xr);///calculo de xr en la funcion
        if(i==0){///para saber si imprime o no 
            printf("   %d       ,    %f    ,     %f     ,     %f      ,      \n\n",i+1,xl,xu,xr);//imprime los valores en ep 0 siendo nada
            if((fxl*fxr)<0){///calculo del primer ep
                ep=calculoE(xu,xr);
                xu=xr;
            }else if((fxl*fxr)>0){
                ep=calculoE(xl,xr);
                xl=xr;
            }
        }else{
            if((fxl*fxr)<0){///calculo del resto de ep
                ep=calculoE(xu,xr);
                xu=xr;
            }else if((fxl*fxr)>0){
                ep=calculoE(xl,xr);
                xl=xr;
            }
            printf("   %d       ,    %f    ,     %f     ,     %f      ,   %f   \n\n",i+1,xl,xu,xr,ep);//imprime los demas valroes
        }    
    }
    return 0;
}

float calcularF(float c[],int a, float x){///calcular todas las funciones
    int i;
    float fx=0;
    for( i = 0 ; i <=a ; i++)
        fx=fx+c[i]*pow(x,i);///Calcula la funcion evaluada
    return fx;
}

float calcularXr(float xl, float xu,float fxl, float fxu){///calcular xr 
    float xr,x1,x2;
    x1=(fxu*(xl-xu));/// se hizo por separada para facilitar verlo
    x2=(fxl-fxu);
    xr=xu-(x1/x2);
    return xr;
}

float calculoE(float a, float b){///calculo general de los errores
    float e;
    e=fabs((a-b)/a)*100;///formula del calculo de rror
    return e;
}

void imprimirFucion(int grade, float c[]){///imprimer la funcion en su forma escrita
    int i;
    printf("Su funcion f(x) = ");
    for(i = grade; 0 <= i; i-- ){
        if(i==grade){///esto lo que hace es dependiendo de la posicion dara una impresion diferente 
                printf("%fx^%d",c[i],i);
        }else{
            if(i==1){
                printf(" + %fx",c[i],i);
            }else if(i==0){
                printf(" + %f",c[i],i);
            }else{
                printf(" + %fx^%d",c[i],i);           
            }
        }
    }
}