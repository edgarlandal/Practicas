//metodo de inversa
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

//estructuras de datos de la matriz y arreglos de memoria dinamica
typedef struct{///estructira de las matrices
    int row,col;
    float **values;
} Matrix_t;

typedef struct{///estructura de los arreglos
    int size;
    float *values;
} Array_t;
///En mi caso se me hace mas sencillo manejar la memoria dinamica de esta forma
///pero se puede usar de la forma tradicional 

///declaracion de funciones
void init(Matrix_t *ptrm, int row, int col);///definir el tamano de la funcion
void empty(Matrix_t *ptrm);///libera la memoria
void show(Matrix_t m);///mostrar la matriz
void fillNum(Matrix_t m1);///llenar los valores del sistema
void agregar(Array_t *array, float valor);//agregar y reservar un espacio de memoria
void matrizIdentidad(Matrix_t m);///saca la matriz indentidad
void metodoInversa(Matrix_t m1, Matrix_t m2);///Se el calculo de la matriz inversa
///toma las matriz y multiplica por los valores de b
void multiplicacionAporB(Matrix_t m, Array_t a, Array_t z);

int main(void){
    srand(time(NULL));//permite el manejo de memoria dinamica

    Matrix_t a ={0,0,NULL};///Matriz A
    Matrix_t invA ={0,0,NULL};///Matriz indentidad
    Array_t b ={0,NULL};///Matriz B
    Array_t z ={0,NULL};///Aqui almaceno los valores de x y z etc

    float num;///captura de valores para B
    int r,c,i;

    printf("Ingrese el numero de renglones del sistema: \n");
    scanf("%d",&r);///renglones
    printf("Ingrese el numero de columnas del sistema:\n");
    scanf("%d",&c);///comlumnas 
    init(&a, r, c);///reserva el espacio de memorria 
    fillNum(a);///llena la matriz 
    show(a);///muestra la matriz llena 
    init(&invA,r,c);////crea espacio de memoria para la matriz identidad
    matrizIdentidad(invA);//llena la matriz identidad
    show(invA);///muestra la matriz identidad
    for(i=0; i<a.row ; i++){////llenar los datos al arreglo
        printf("Ingrese el numero de la matriz B:\n");
        scanf("%f",&num);///numero a insertar
        agregar(&b,num);///agrega el espacio de memoria
    }
    metodoInversa(a,invA);///calcula la inversa
    show(a);///muestra el resultado en a
    show(invA);///muestra en la matriz identidad
    multiplicacionAporB(invA,b,z);///Multiplica por B
    ///liberacion de memoria 
    empty(&a);
    empty(&invA);

    return 0;
}
///manejo de matrices con memoria dinamica
void empty(Matrix_t *ptrm){///libera la memoria
    int i;
    for (i = 0; i < ptrm->row; i++)
        free(ptrm->values[i]);//libera por renglones de la matriz 
    free(ptrm->values);
    ptrm->values = NULL;///Hace los valores de la matriz NULL
    ptrm->row = ptrm->col = 0;
}

void init(Matrix_t *ptrm, int row, int col){
    ///crear espacio de memoria para las matrices
    int i;
    if (ptrm->values)///si ya tiene valores los libera
        empty(ptrm);
    ptrm->row = row;///cambia el valor de los renglones
    ptrm->col = col;///cambia el valor de las columnas

    ptrm->values = (float **)malloc(sizeof(float *) * ptrm->row);
    ///le asigna el tamano de la memoria requerida
    for (i = 0; i < ptrm->row; i++)///asigna el valor por columnas 
        ptrm->values[i] = (float *)calloc(ptrm->col, sizeof(float));
        ///le asigna memoria pero inicia el arreglo en 0
}

void show(Matrix_t m){///mostrar la matriz
    int i, j;
    if (!m.values){///si es 0 no tiene memoria 
        printf("\nMemoria no reservada, utilice init\n");
        exit(-1);
    }
    for (i = 0; i < m.row; i++){///aqui se my=uestra como en cualquiera
        printf("[ ");
        for (j = 0; j < m.col; j++){
            printf("%.2f ", m.values[i][j]);
        }
        printf("]\n");
    }
    printf("\n");
}

void fillNum(Matrix_t m1){///llenar de valores al sistema
    int i,j;
    float num;
    for(i = 0 ; i < m1.row ; i++ ){
        for(j = 0 ; j < m1.col ; j++ ){
            printf("Ingrese el valor de la posicion [%d,%d]: \n",i,j);
            scanf("%f",&num);//solamente asigna el valor leido
			m1.values[i][j] =num;
        }
    }
}

void matrizIdentidad(Matrix_t m1){//calcular la matriz identidad
    int i,j;
    for(i = 0 ; i < m1.row ; i++ ){
        for(j = 0 ; j < m1.col ; j++ ){
            if(i==j){//cuando i y j sean iguales sera 1 
		    	m1.values[i][j] =1;
            }
        }
    }
}
////Manejar arreglos con memoria dinamica
///agrega un valor nuevo al arreglo y un nuevo bloque de memoria
void agregar(Array_t *array, float valor){
    if (!array->values){///si no tiene memoria la asigna 
        array->values = (float *)malloc(sizeof(float));
        if (!array->values)
            exit(-1);
    }
    else
        array->values = (float *)realloc(array->values,
                                      (array->size + 1) * sizeof(float));
    array->values[array->size++] = valor;///insertar  el valor en el arreglo
}

///metodos
void metodoInversa(Matrix_t m1, Matrix_t m2){///Se el calculo de la matriz inversa
    int i,j,k,l;
    float aux,aux2;
    for(i=0; i < m1.row; i++){///recorre los rengles 
        aux=m1.values[i][i];
            for(j=0; j < m1.col; j++){///esto permite hacer 
                if(m1.values[0][0]!=0){
                    m1.values[i][j]=m1.values[i][j]/aux;
                    m2.values[i][j]=m2.values[i][j]/aux;
                }else{
                    printf("El valor [0,0] es 0 no se puede realizar");///al menos aqui que no movemos
                    exit(0);
                }
            }  
        
        for(k=0; k< m1.row ; k++){
            if(k!=i){// solo se aplicara en todos lados menos donde este i 
                aux2=(-1)*m1.values[k][i];
                for(l = 0 ; l< m1.col; l++){//k es el numero del renglon siguiente 
                    m1.values[k][l]=aux2*m1.values[i][l]+m1.values[k][l];
                    m2.values[k][l]=aux2*m2.values[i][l]+m2.values[k][l];
                }//y l permite recorrer las columnas 
            }
        }
    }
}

void multiplicacionAporB(Matrix_t m, Array_t a, Array_t z){
    ///permite la multiplicacion de A x B
    int i,j;
    for(i = 0; i<m.row ;i++){
        agregar(&z,0);//asigna memoria
        for(j = 0; j<m.col ;j++){//calculos
            printf("%f(%f) + ",m.values[i][j],a.values[j]);
            z.values[i]=z.values[i]+m.values[i][j]*a.values[j];
        }
        printf("= %f\n",z.values[i]);
    }
}


