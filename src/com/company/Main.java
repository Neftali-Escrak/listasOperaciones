package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {

        Lista lista = new Lista();

        /*lista.agregarAlFinal(7);
        lista.agregarAlFinal(8);
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(16);*/


        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        int opcion;
        do {
            System.out.println(" ");
            System.out.println("Elija una opción");
            System.out.println("( 1 ) --> Insertar");
            System.out.println("( 2 ) --> Mostrar");
            System.out.println("( 3 ) --> Buscar");
            System.out.println("( 4 ) --> Eliminar");
            System.out.println("( 5 ) --> Tamaño");
            System.out.println("( 6 ) --> Terminar");
            System.out.println(" ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    int valor;
                    System.out.println("<<--ingresa el número que deseas insertar-->> ");
                    valor = sc.nextInt();
                    lista.agregarAlFinal(valor);
                    //lista.listar();
                    break;


                case 2:
                    System.out.println("<<--Lista simple -->>");
                    lista.listar();
                    System.out.println(" ");
                    break;

                case 3:

                    if(lista.esVacia()) {
                        lista.listar();

                        System.out.println(" ");

                    }else {


                        System.out.println(" valor a buscar");
                        int num2=sc.nextInt();
                        System.out.println(lista.buscar(num2));
                        System.out.print(lista.getPosicion(num2));
                    }

                    break;

                case 4:
                    System.out.println("Elimina el nodo en la posición por indice");
                    int num=sc.nextInt();
                    lista.removerPorPosicion(num);
                    lista.listar();
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("Tamaño");
                    System.out.println(lista.getTamaño());
                    break;

                case 6:
                    System.out.println("Usted salio de la lista");

                    break;
            }
        }while (opcion !=6);


    }
}
