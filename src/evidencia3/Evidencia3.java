/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Evidencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> dato = new ArrayList();
        int[] datoArr = new int[100];
        Ordenamientos burbuja = new Ordenamientos();
        Ordenamientos seleccion = new Ordenamientos();
        Ordenamientos inserccion = new Ordenamientos();
        Ordenamientos shell = new Ordenamientos();
        Ordenamientos merge = new Ordenamientos();
        Ordenamientos quick = new Ordenamientos();
        ArrayList<Integer> burbujaOrdenado = new ArrayList();
        ArrayList<Integer> seleccionOrdenado = new ArrayList();
        int[] inserccionOrdenado = new int[100];
        int[] shellOrdenado = new int[100];
        int[] mergeOrdenado = new int[100];
        int[] datoQuick = new int[100];
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        String res = "";

        do {

            System.out.println("***** MENÚ *****");
            System.out.println("TIEMPO EN NANOSEGUNDOS CON LOS MÉTODOS DE ORDENAMIENTO: Burbuja, Selección, Inserción, Shell, Merge y Quick.");
            System.out.println("1. INFORMACIÓN CON 100 ELEMENTOS AL AZAR.");
            System.out.println("2. INFORMACIÓN CON 50,000 ELEMENTOS AL AZAR.");
            System.out.println("3. INFORMACIÓN CON 100,000 ELEMENTOS AL AZAR.");
            System.out.println("4. INFORMACIÓN CON 100,000 ELEMENTOS ORDENADOS EN ORDEN INVERSO.");
            System.out.println("5. INFORMACIÓN CON 100,000 ELEMENTOS ORDENADOS.");
            System.out.println("6. INFORMACIÓN CON 100,000 ELEMENTOS QUE SOLO PUEDEN SER NÚMEROS ENTRE EL 1 Y EL 5.");

            System.out.print("Elige una opción: ");
            opcion = entrada.next();

            switch (opcion) {

                case "1":
                    //1. INFORMACIÓN CON 100 ELEMENTOS AL AZAR.
                    merge.setTiempoMerge(0);
                    quick.setTiempoQuick(0);
                    System.out.println("\n***** 1. INFORMACIÓN CON 100 ELEMENTOS AL AZAR. *****");
                    for (int i = 0; i < 100; i++) {

                        dato.add((int) (Math.random() * 100) + 1);

                    }

                    //Copio mis elementos dato a datoArr para trabajar con arreglos.
                    for (int i = 0; i < 100; i++) {
                        datoArr[i] = dato.get(i);
                    }

                    burbujaOrdenado = burbuja.ordBurbuja(dato);
                    seleccionOrdenado = seleccion.ordSeleccion(dato);
                    inserccionOrdenado = inserccion.ordInsercion(datoArr, 100);
                    shellOrdenado = shell.ordShell(datoArr);
                    mergeOrdenado = merge.ordMerge(datoArr);
                    System.out.println("Ordenamiento Merge --> El tiempo de ordenamiento fue: " + merge.getTiempoMerge() + " nanosegundos.");
                    quick.clonarArreglo(datoQuick, datoArr);
                    quick.ordQuick(datoQuick, 0, datoQuick.length - 1);
                    System.out.println("Ordenamiento Quick --> El tiempo de ordenamiento fue: " + quick.getTiempoQuick() + " nanosegundos.");

                    break;

                case "2":

                    //2. INFORMACIÓN CON 50,000 ELEMENTOS AL AZAR.
                    merge.setTiempoMerge(0);
                    quick.setTiempoQuick(0);
                    dato = new ArrayList();
                    datoArr = new int[50000];
                    burbujaOrdenado = new ArrayList();
                    seleccionOrdenado = new ArrayList();
                    inserccionOrdenado = new int[50000];
                    shellOrdenado = new int[50000];
                    mergeOrdenado = new int[50000];
                    datoQuick = new int[50000];

                    System.out.println("\n***** 2. INFORMACIÓN CON 50,000 ELEMENTOS AL AZAR. *****");
                    for (int i = 0; i < 50000; i++) {

                        dato.add((int) (Math.random() * 50000) + 1);

                    }

                    //Copio mis elementos dato a datoArr para trabajar con arreglos.
                    for (int i = 0; i < 50000; i++) {
                        datoArr[i] = dato.get(i);
                    }

                    burbujaOrdenado = burbuja.ordBurbuja(dato);
                    seleccionOrdenado = seleccion.ordSeleccion(dato);
                    inserccionOrdenado = inserccion.ordInsercion(datoArr, 50000);
                    shellOrdenado = shell.ordShell(datoArr);
                    mergeOrdenado = merge.ordMerge(datoArr);
                    System.out.println("Ordenamiento Merge --> El tiempo de ordenamiento fue: " + merge.getTiempoMerge() + " nanosegundos.");
                    quick.clonarArreglo(datoQuick, datoArr);
                    quick.ordQuick(datoQuick, 0, datoQuick.length - 1);
                    System.out.println("Ordenamiento Quick --> El tiempo de ordenamiento fue: " + quick.getTiempoQuick() + " nanosegundos.");

                    break;

                case "3":
                    //3. INFORMACIÓN CON 100,000 ELEMENTOS AL AZAR.
                    merge.setTiempoMerge(0);
                    quick.setTiempoQuick(0);
                    dato = new ArrayList();
                    datoArr = new int[100000];
                    burbujaOrdenado = new ArrayList();
                    seleccionOrdenado = new ArrayList();
                    inserccionOrdenado = new int[100000];
                    shellOrdenado = new int[100000];
                    mergeOrdenado = new int[100000];
                    datoQuick = new int[100000];

                    System.out.println("\n***** 3. INFORMACIÓN CON 100,000 ELEMENTOS AL AZAR. *****");
                    for (int i = 0; i < 100000; i++) {

                        dato.add((int) (Math.random() * 100000) + 1);

                    }

                    //Copio mis elementos dato a datoArr para trabajar con arreglos.
                    for (int i = 0; i < 100000; i++) {
                        datoArr[i] = dato.get(i);
                    }

                    burbujaOrdenado = burbuja.ordBurbuja(dato);
                    seleccionOrdenado = seleccion.ordSeleccion(dato);
                    inserccionOrdenado = inserccion.ordInsercion(datoArr, 100000);
                    shellOrdenado = shell.ordShell(datoArr);
                    mergeOrdenado = merge.ordMerge(datoArr);
                    System.out.println("Ordenamiento Merge --> El tiempo de ordenamiento fue: " + merge.getTiempoMerge() + " nanosegundos.");
                    quick.clonarArreglo(datoQuick, datoArr);
                    quick.ordQuick(datoQuick, 0, datoQuick.length - 1);
                    System.out.println("Ordenamiento Quick --> El tiempo de ordenamiento fue: " + quick.getTiempoQuick() + " nanosegundos.");

                    break;

                case "4":

                    //4. INFORMACIÓN CON 100,000 ELEMENTOS ORDENADOS EN ORDEN INVERSO.
                    merge.setTiempoMerge(0);
                    quick.setTiempoQuick(0);
                    dato = new ArrayList();
                    datoArr = new int[100000];
                    burbujaOrdenado = new ArrayList();
                    seleccionOrdenado = new ArrayList();
                    inserccionOrdenado = new int[100000];
                    shellOrdenado = new int[100000];
                    mergeOrdenado = new int[100000];
                    datoQuick = new int[100000];

                    System.out.println("\n***** 4. INFORMACIÓN CON 100,000 ELEMENTOS ORDENADOS EN ORDEN INVERSO. *****");
                    for (int i = 100000; i > 0; i--) {

                        dato.add(i);

                    }

                    //Copio mis elementos dato a datoArr para trabajar con arreglos.
                    for (int i = 99999; i >= 0; i--) {
                        datoArr[i] = dato.get(i);
                    }

                    burbujaOrdenado = burbuja.ordBurbuja(dato);
                    seleccionOrdenado = seleccion.ordSeleccion(dato);
                    inserccionOrdenado = inserccion.ordInsercion(datoArr, 100000);
                    shellOrdenado = shell.ordShell(datoArr);
                    mergeOrdenado = merge.ordMerge(datoArr);
                    System.out.println("Ordenamiento Merge --> El tiempo de ordenamiento fue: " + merge.getTiempoMerge() + " nanosegundos.");
                    quick.clonarArreglo(datoQuick, datoArr);
                    quick.ordQuick(datoQuick, 0, datoQuick.length - 1);
                    System.out.println("Ordenamiento Quick --> El tiempo de ordenamiento fue: " + quick.getTiempoQuick() + " nanosegundos.");

                    break;

                case "5":
                    //5. INFORMACIÓN CON 100,000 ELEMENTOS ORDENADOS.
                    merge.setTiempoMerge(0);
                    quick.setTiempoQuick(0);
                    dato = new ArrayList();
                    datoArr = new int[100000];
                    burbujaOrdenado = new ArrayList();
                    seleccionOrdenado = new ArrayList();
                    inserccionOrdenado = new int[100000];
                    shellOrdenado = new int[100000];
                    mergeOrdenado = new int[100000];
                    datoQuick = new int[100000];

                    System.out.println("\n***** 5. INFORMACIÓN CON 100,000 ELEMENTOS ORDENADOS. *****");
                    for (int i = 1; i <= 100000; i++) {

                        dato.add(i);

                    }

                    //Copio mis elementos dato a datoArr para trabajar con arreglos.
                    for (int i = 0; i < 100000; i++) {
                        datoArr[i] = dato.get(i);
                    }

                    burbujaOrdenado = burbuja.ordBurbuja(dato);
                    seleccionOrdenado = seleccion.ordSeleccion(dato);
                    inserccionOrdenado = inserccion.ordInsercion(datoArr, 100000);
                    shellOrdenado = shell.ordShell(datoArr);
                    mergeOrdenado = merge.ordMerge(datoArr);
                    System.out.println("Ordenamiento Merge --> El tiempo de ordenamiento fue: " + merge.getTiempoMerge() + " nanosegundos.");
                    quick.clonarArreglo(datoQuick, datoArr);
                    quick.ordQuick(datoQuick, 0, datoQuick.length - 1);
                    System.out.println("Ordenamiento Quick --> El tiempo de ordenamiento fue: " + quick.getTiempoQuick() + " nanosegundos.");

                    break;

                case "6":

                    //6. INFORMACIÓN CON 100,000 ELEMENTOS QUE SOLO PUEDEN SER NÚMEROS ENTRE EL 1 Y EL 5.
                    merge.setTiempoMerge(0);
                    quick.setTiempoQuick(0);
                    dato = new ArrayList();
                    datoArr = new int[100000];
                    burbujaOrdenado = new ArrayList();
                    seleccionOrdenado = new ArrayList();
                    inserccionOrdenado = new int[100000];
                    shellOrdenado = new int[100000];
                    mergeOrdenado = new int[100000];
                    datoQuick = new int[100000];

                    System.out.println("\n***** 6. INFORMACIÓN CON 100,000 ELEMENTOS QUE SOLO PUEDEN SER NÚMEROS ENTRE EL 1 Y EL 5. *****");
                    for (int i = 0; i < 100000; i++) {

                        dato.add((int) (Math.random() * (5 - 1 + 1)) + 1);

                    }

                    //Copio mis elementos dato a datoArr para trabajar con arreglos.
                    for (int i = 0; i < 100000; i++) {
                        datoArr[i] = dato.get(i);
                    }

                    burbujaOrdenado = burbuja.ordBurbuja(dato);
                    seleccionOrdenado = seleccion.ordSeleccion(dato);
                    inserccionOrdenado = inserccion.ordInsercion(datoArr, 100000);
                    shellOrdenado = shell.ordShell(datoArr);
                    mergeOrdenado = merge.ordMerge(datoArr);
                    System.out.println("Ordenamiento Merge --> El tiempo de ordenamiento fue: " + merge.getTiempoMerge() + " nanosegundos.");
                    quick.clonarArreglo(datoQuick, datoArr);
                    quick.ordQuick(datoQuick, 0, datoQuick.length - 1);
                    System.out.println("Ordenamiento Quick --> El tiempo de ordenamiento fue: " + quick.getTiempoQuick() + " nanosegundos.");

                    break;
                    
                default: System.out.println("\nHas ingresado una opción que no está en el menú. Teclea una opción correcta.");

            }

            do {
                System.out.println("\n¿Deseas volver a elegir otra opción?");
                System.out.print("Escribe si o no: ");
                res = entrada.next();
                res = res.toLowerCase();

                if (!res.equals("si") && !res.equals("no")) {
                    System.out.println("No has escrito una respuesta correcta.");
                    System.out.println("Recuerda que solo es si o no.");
                }

            } while (!res.equals("si") && !res.equals("no"));

            System.out.println();

        } while (res.equals("si"));

    }

}
