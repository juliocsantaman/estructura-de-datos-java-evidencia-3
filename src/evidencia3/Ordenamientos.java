/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia3;

import java.util.ArrayList;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Ordenamientos {
    
    //Ordenamiento burbuja.
    public ArrayList<Integer> ordBurbuja(ArrayList<Integer> data) {
        
        ArrayList<Integer> result = new ArrayList(data); //Resultado.
        boolean swaped = false; //Variable en caso de que no haya intercambio.
        long tiempoInicio, tiempoFin, resTiempo;
        
        tiempoInicio = System.nanoTime();
        
        for(int i=0; i<result.size()-1; i++) { //desde 0 a n-1 iteraciones.
            swaped=false;
            
            for(int j=0; j<result.size()-i-1; j++) { //desde 0 a n-i iteraciones - 1.
                //obtenemos los valores pos y next.
                int pos = result.get(j);
                int next = result.get(j+1);
                
                //si la pos es mayor a next, se hace el intercambio
                if(pos>next) {
                    result.set(j, next);
                    result.set(j+1, pos);
                    
                    swaped=true;
                }
    
            }
            
            if(!swaped) { //Si no hubo intercambio, se acaba el método.
                break;
            }
            
        }
        
        
        tiempoFin = System.nanoTime();
        
        resTiempo = tiempoFin - tiempoInicio;
        
        System.out.println("Ordenamiento burbuja --> El tiempo de ordenamiento es: " + (resTiempo) + " nanosegundos.");
        
        return result;
    }
    
    
    
    //Ordenamiento por selección.
    public ArrayList<Integer> ordSeleccion(ArrayList<Integer> data) {
        
        ArrayList<Integer> result = data; //Resultado.
        long tiempoInicio, tiempoFin, resTiempo;
        
        tiempoInicio = System.nanoTime();
        
        for(int i=0; i<result.size()-1; i++) {
            int pos = result.get(i); //se obtiene el mínimo supuesto.
            
            for(int j=i+1; j<result.size(); j++) { //compara desde la posición de i hasta el fin del arreglo.
                
                int next = result.get(j);
                
                if(pos>next) {
                    
                    result.set(i, next);
                    result.set(j, pos);
                    
                    pos=next;
                }
                
            }
        }
        
        tiempoFin = System.nanoTime();
        
        resTiempo = tiempoFin - tiempoInicio;
        
        System.out.println("Ordenamiento por selección --> El tiempo de ordenamiento es: " + (resTiempo) + " nanosegundos.");
        
        return result;
    }
    
    
    //Método de ordenamiento Inserción.
    public int [] ordInsercion(int [] arr, int n) {
        
        int [] res = new int[n];
 
        clonarArreglo(res, arr);
        
        int i, j;
        int aux;
        long tiempoInicio, tiempoFinal, resTiempo;
        
        tiempoInicio = System.nanoTime();
        
        for(i=1; i<n; i++) {
            aux = res[i];
            j=i-1;
            
            while(j>=0 && res[j]>aux) {
                res[j+1] = res[j];
                j=j-1;
            }
            
            res[j+1] = aux;
        }
        
        tiempoFinal = System.nanoTime();
        resTiempo = tiempoFinal - tiempoInicio;
        
        System.out.println("Ordenamiento Inserción --> El tiempo de ordenamiento fue: " + (resTiempo) + " nanosegundos.");
        
        return res;
        
    }
    
    
    //Método de ordenamiento Shell.
    public int [] ordShell(int [] arr) {
        
        int [] res = new int[arr.length];
        int saltos, i, j, k;
        int aux;
        long tiempoInicio, tiempoFinal, resTiempo;
        
        clonarArreglo(res, arr);
        
        saltos = res.length/2;
        
        tiempoInicio = System.nanoTime();
        
        while(saltos > 0) {
            for(i=saltos; i<res.length; i++) {
                j=i-saltos;
                while(j >= 0) {
                    k=j+saltos;
                    if(res[j] <= res[k]) {
                        j=-1;
                    } else {
                        aux = res[j];
                        res[j] = res[k];
                        res[k] = aux;
                        j-=saltos;
                    }
                }
            }
            
            saltos=saltos/2;
        }
        
        tiempoFinal = System.nanoTime();
        resTiempo = tiempoFinal - tiempoInicio;
        
        System.out.println("Ordenamiento Shell --> El tiempo de ordenamiento fue: " + (resTiempo) + " nanosegundos.");
        
        
        return res;
        
        
    }
    
    //Método para imprimir un Arreglo.
    public void imprimirArr(int [] dato) {
        
        for(int i=0; i<dato.length; i++) {
            
            System.out.println("Valor " + (i+1) + " --> " + dato[i]);
        }
        
        System.out.println();
    }
    
    //Método para copiar los valores de un arreglo a otro.
    public void clonarArreglo(int [] nuevoArr, int [] arrOriginal) {
        
        for(int i=0; i<arrOriginal.length; i++) {
            
            nuevoArr[i] = arrOriginal[i];
        }
        
    }
    
    
    //Ordenamientos Merge y Quick.
    private int movMerge=0;
    private int movQuick=0;
    private long tiempoMerge=0;
    private long tiempoQuick=0;
    
    //Getters y setters.
    public int getMovMerge() {
        return this.movMerge;
    }
    
    public int getMovQuick() {
        return this.movQuick;
    }
    
    public long getTiempoMerge() {
        return this.tiempoMerge;
    }
    
    public long getTiempoQuick() {
        return this.tiempoQuick;
    }
    
    public void setMovMerge(int movMerge) {
        this.movMerge = movMerge;
    }
    
    public void setMovQuick(int movQuick) {
        this.movQuick = movQuick;
    }
    
    public void setTiempoMerge(long tiempoMerge) {
        this.tiempoMerge = tiempoMerge;
    }
    
    public void setTiempoQuick(long tiempoQuick) {
        this.tiempoQuick = tiempoQuick;
    }
    
    //Método de ordenamiento Merge.
    public int[] ordMerge(int [] arr) {
        
        int [] nuevoArr = new int[arr.length];
        
        clonarArreglo(nuevoArr, arr);
        
        long tiempoInicio, tiempoFin, resTiempo;
        
        tiempoInicio = System.nanoTime();
        if(nuevoArr.length==1) {
            //Ya esta ordenado
        } else {
            int i, j, k;
        
            if(nuevoArr.length>1) {
                int nIzq = nuevoArr.length/2;
                int nDer = nuevoArr.length-nIzq;
                int [] arrIzq= new int[nIzq];
                int [] arrDer= new int[nDer];

                //Copiando los elementos de parte primera al arrIzq.
                for(i=0; i<nIzq; i++) {
                    arrIzq[i] = arr[i];
                }

                //Copiando los elementos de parte segunda al arrDer.
                for(i=nIzq; i<nIzq+nDer ; i++) {
                    arrDer[i-nIzq] = arr[i];
                }

                //Recursividad.
                arrIzq=ordMerge(arrIzq);
                arrDer=ordMerge(arrDer);

                i=0;
                j=0;
                k=0;

                while(arrIzq.length!=j && arrDer.length!=k) {   
                    if(arrIzq[j] < arrDer[k]) {
                        nuevoArr[i] = arrIzq[j];
                        i++;
                        j++;
                        this.movMerge++;
                    } else {
                        nuevoArr[i] = arrDer[k];
                        i++;
                        k++;
                        this.movMerge++;
                    }
                }
            
                //Arreglo final.
                while(arrIzq.length != j) {
                    nuevoArr[i] = arrIzq[j];
                    i++;
                    j++;
                }

                while(arrDer.length != k) {
                    nuevoArr[i] = arrDer[k];
                    i++;
                    k++;
                }
            } //Fin del if.
        }
        
        tiempoFin = System.nanoTime();
        resTiempo = tiempoFin - tiempoInicio;
        this.tiempoMerge+=resTiempo;

        return nuevoArr;
    }
    
    //Ordenamiento de ordenamiento Quick.
    public void ordQuick(int [] arr, int primero, int ultimo) {
        
        
        long tiempoInicio, tiempoFin, resTiempo;
        int i, j, pivote, aux;
        i=primero;
        j=ultimo;
        pivote=arr[(primero+ultimo)/2];
        
        tiempoInicio = System.nanoTime();
        if(arr.length==1) {
            
            //Arreglo ya ordenado.
            
            
        } else {
            
            do {
            
            
            while(arr[i]<pivote) {
                i++;
            }
            
            while(arr[j]>pivote) {
                j--;
            }
            
            //Aquí hacemos el intercambio.
            if(i<=j) {
   
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
                i++;
                j--;
                this.movQuick++;
            }
            
            } while (i<=j);

            if(primero<j) {
                ordQuick(arr, primero, j);
            }

            if(i<ultimo) {
                ordQuick(arr, i, ultimo);
            }
            
        }
        
        tiempoFin = System.nanoTime();
        resTiempo = tiempoFin - tiempoInicio;
        this.tiempoQuick+=resTiempo;
        
        
        
        
    }
    
}
