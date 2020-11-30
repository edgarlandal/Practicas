#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#define ren 4//renglones 
#define col 5//columnas 
#define iteracion 10

///funciones 
void capturaMatriz(float [][col]);//capturar matriz
void metodoJacobi(float [][col]);//metodo de jacobi
void metodoGaussSeidel(float [][col]);//metodo de gauss
void menu();///menu de opciones

int main(void){
    int op = 0;
    float m[ren][col];
    char resp = 'n';
    do{//menu de selecion
        menu();
        scanf("%d", &op);
        switch(op){
            case 1:
                capturaMatriz(m);///usamos captura
                metodoJacobi(m);///usamos el priemr metodo
                break;
            case 2:
                capturaMatriz(m);//usmaos caputura
                metodoGaussSeidel(m);///usamos el segundo metodo
                break;
            default:
            printf("Opcion no valida");
                break;//en caso de usar una opcion que no se a correcta 
        }
        printf("Desea continuar? y/n");
        setbuf(stdin, NULL);//limoiar buffer
        scanf("%c",&resp);//repeticion 
    }while(resp == 'y' || resp != 'n');
    return 0;
}

void menu(){// solo grafico 
    system("cls");
    printf("|--------------------|\n");
    printf("|Seleccine una opcion|\n");
    printf("|--------------------|\n");
    printf("|1.-Jacobi           |\n");
    printf("|--------------------|\n");    
    printf("|2.-Gauss-Seidel     |\n");
    printf("|--------------------|\n");
}

void capturaMatriz(float m[][col]){
    int i,j;
    for(i = 0; i < ren; i++)///usando ciclos se recorre la matriz
        for(j = 0; j < col; j++){
            if(j < 5){// en caso de ser las incognitas
                printf("\nIngrese el valor de x[%d,%d]", (i + 1), (j + 1));
                scanf("%f", &m[i][j]);
            }
            if(j == 5){/// las respuestas 
                printf("\nIngrese la respuesta de x[%d]", (i + 1));
                scanf("%f", &m[i][j]);
            }
        }
}

void metodoJacobi(float m[][col]){
    int i,j;
    float xi[4] = {0,0,0,0};// un arreglo inicial en 0 
    float aux[4];
    printf("|Iteracion|     x1      |       x2      |       x3      |       x4      |\n");
    for(i = 0; i < iteracion; i++){// repite este proceso hasta que llega a 10 iteraciones en este caso 
        xi[0] = (1/m[0][0])*(m[0][5] - m[0][1]*aux[1] - m[0][2]*aux[2] - m[0][3]*aux[3]);// estas son 
        xi[1] = (1/m[1][1])*(m[1][5] - m[1][0]*aux[0] - m[1][2]*aux[2] - m[1][3]*aux[3]);// las mismas 
        xi[2] = (1/m[2][2])*(m[2][5] - m[2][0]*aux[0] - m[2][1]*aux[1] - m[2][3]*aux[3]);// formulas 
        xi[3] = (1/m[3][3])*(m[3][5] - m[3][0]*aux[0] - m[3][1]*aux[1] - m[3][2]*aux[2]);// de calculo 
        for(j = 0; j < 4; j++)// aqui vaciamos los valores iniciales a los auxiliares 
            aux[j] = xi[j];
        if(i < 10){/// solo para mejorar un poco el apartado visual 
            printf("|    %d    |  %.4f  |  %.4f  |  %.4f  |  %.4f  |\n", i+1, aux[0], aux[1], aux[2], aux[3]);
        }else{
            printf("|    %d   |  %.4f  |  %.4f  |  %.4f  |  %.4f  |\n", i+1, aux[0], aux[1], aux[2], aux[3]);
        }
    }
}

void metodoGaussSeidel(float matriz[][col]){
int i = 0;
printf("|Iteracion|     x1      |       x2      |       x3      |       x4      |\n");
float xi[4] = {0,0,0,0};
    for(i = 0; i < iteracion; i++){//mismo caso que el anterior pero no ocupa auxiliar 
        xi[0] = (1/matriz[0][0])*(matriz[0][5] - matriz[0][1]*xi[1] - matriz[0][2]*xi[2] - matriz[0][3]*xi[3]);
        xi[1] = (1/matriz[1][1])*(matriz[1][5] - matriz[1][0]*xi[0] - matriz[1][2]*xi[2] - matriz[1][3]*xi[3]);
        xi[2] = (1/matriz[2][2])*(matriz[2][5] - matriz[2][0]*xi[0] - matriz[2][1]*xi[1] - matriz[2][3]*xi[3]);
        xi[3] = (1/matriz[3][3])*(matriz[3][5] - matriz[3][0]*xi[0] - matriz[3][1]*xi[1] - matriz[3][2]*xi[2]);
        if(i < 10){
            printf("|    %d    |  %.4f  |  %.4f  |  %.4f  |  %.4f  |\n", i+1, xi[0], xi[1], xi[2], xi[3]);
        }else{
            printf("|    %d   |  %.4f  |  %.4f  |  %.4f  |  %.4f  |\n", i+1, xi[0], xi[1], xi[2], xi[3]);
        }
    }
}
