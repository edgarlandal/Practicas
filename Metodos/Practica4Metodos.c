#include <stdio.h>
#include <math.h>
#define MAX 10
///Funciones
void imprimirFucion(int grade, float c[]);
int derivadaFucion(int grade, float c[], float c2[]);
void mNewtonRapshon2doOrden(float c[], float c2[], float c3[], int grade, int grade2, int grade3, float x,int it);
float evaluarFunciones(int grade, float c[], float x );
float calcularxr(float f, float fdx1, float fdx2,float x);

int main(){
    int i,grade=1,grade2,grade3,it;
    float constantes[MAX],c2[MAX],c3[MAX],x;
    while(grade<2){//con esto comprobamos que la funcion puede derivarse 2 veces 
        printf("\nEl grado debe ser derivable 2 veces\n");
        printf("Ingrese el grado de su funcion f(x): ");///grado de funcion
        scanf("%d",&grade);
    }  
    for(i = 0; i <=grade ; i++){///llena de coeficientes a la funcion
        printf("Ingrese las constante en la variable [%d]: ",i);
        scanf("%f",&constantes[i]);
    }
    imprimirFucion(grade,constantes);//imprimir primer funcion
    grade2=derivadaFucion(grade,constantes,c2);///primera derivada
    imprimirFucion(grade2,c2);///imprimir primera derivada
    grade3=derivadaFucion(grade2,c2,c3);///segunda derivada
    imprimirFucion(grade3,c3);///imprimir segunda derivada

    printf("Ingrese valor inicial\n");
    scanf("%f",&x);//ingresar valor inicial
    printf("Ingrese El numero de itercaciones maximas\n");
    scanf("%d",&it);//ingresar numero de iteraciones
    mNewtonRapshon2doOrden(constantes,c2,c3,grade,grade2,grade3,x,it);//funcion del calculo 
    return 0;
}

void mNewtonRapshon2doOrden(float c[], float c2[], float c3[], int grade, int grade2, int grade3, float x, int it){
    int i;
    float f,fdx1,fdx2,xr,ea;
    printf("Funcion | Valor inciial | 1era Derivada | 2da Derivada | Error Relativo\n");
    for(i = 0; i<it ;i++){///iteraciones 
        f=evaluarFunciones(grade,c,x);///evaluacion de la funcion 
        fdx1=evaluarFunciones(grade2,c2,x);///evaluacion de la primera derivada
        fdx2=evaluarFunciones(grade3,c3,x);///evaluacion de la segunda derivada

        xr = calcularxr(f,fdx1,fdx2,x);//calculo de xr
        printf("%f|    %f    |    %f    |    %f    ",f,x,fdx1,fdx2);// imprimir la tabla 
        if(i==0){
            x=xr;//cambiar el valor de xi
            printf("|\n");
        }else{
            ea=fabs((xr-x)/xr)*100;//calculo del error relativo
            x=xr;//cambair el valor de xi
            printf("|    %f\n",ea);
        }
        if(ea==0){
            i=it;
            printf("\nSe detuvo el calculo por que se encontro la raiz real");
        }
    }
}

float evaluarFunciones(int grade, float c[], float x ){///funcion de calcular funciones
    float f=0;
    int i;
    for(i = 0; i <=grade ; i++)//recorrer la funcion
        f+=c[i]*pow(x,i);///sumar la funcion
    return f;
}

float calcularxr(float f, float fdx1, float fdx2,float x){
    float xr;
    xr=x-((f*fdx1)/(pow(fdx1,2)-(f*fdx2)));///caldulo de xr
    return xr;
}

void imprimirFucion(int grade, float c[]){///imprimer la funcion en su forma escrita
    int i;
    printf("Su funcion f(x) = ");
    for(i = grade; 0 <= i; i-- ){
        if(i==grade){///esto lo que hace es dependiendo de la posicion dara una impresion diferente 
                printf("%fx^%d",c[i],i);
        }else{
            if(i==1){
                printf(" + %fx",c[i]);
            }else if(i==0){
                printf(" + %f",c[i]);
            }else{
                printf(" + %fx^%d",c[i],i);           
            }
        }
    }
    printf("\n");
}

int derivadaFucion(int grade, float c[], float c2[]){
    int i;
    for(i = 0; i<grade ; i++)
        c2[i]=(i+1)*c[i+1];///calculo de la derivada
    return i-1;
}