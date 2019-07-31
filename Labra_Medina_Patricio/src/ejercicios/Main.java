package ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.management.Query;

public class Main {
	
	public static final int NUMERO_PILAS=5;
	private static ArrayList<Stack<Integer>> pilas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercio1();

	}
	
	public static void ejercio1() {
		Scanner s = new Scanner(System.in);
		pilas = new ArrayList<Stack<Integer>>();
		//generar pilas en la lista enlazada 
		for(int i =0; i<NUMERO_PILAS; i++) {
			pilas.add(new Stack<Integer>());
		}
		
		
		int i=9,j=0;
		while(i!=0) {
			
			//Ingreso de teclado
			i=9;
			System.out.print("Ingrese par i: ");
			while(-5>i || i>5){
				i=s.nextInt();
			}
			
			if(i!=0) {
				System.out.print("Ingrese par j: ");
				j=s.nextInt();
			}
			
			//Seleccion de pila
			if(i>0) {
				pilas.get(i-1).push(j);
				System.out.println("Agregado");
			}
			
			if(i<0) {
				if(pilas.get((-1*i)-1).isEmpty()) {
					System.out.println("Esta vacia");
				}else {
					Stack<Integer> aux = new Stack<Integer>();
					int aux2;
					
					//Vaciar pila para eliminar "j"
					while(!pilas.get((-1*i)-1).isEmpty()) {
						aux2=pilas.get((-1*i)-1).pop();
						if(aux2!=j) {
							aux.push(aux2);
						}
					}
					
					//Llenar pila sin "j"
					while(!aux.isEmpty()) {
						pilas.get((-1*i)-1).push(aux.pop());
					}
					
					System.out.println("Eliminado");
				}
			}
		}
		s.close();
		
		//Parte despues de i=0
		System.out.println();
		int aux;
		Queue<Integer> cola = new LinkedList<Integer>();
		
		for(int con=0;con<pilas.size();con++) {
			System.out.print("Pila n"+con+" ");
			while(!pilas.get(con).isEmpty()) {
				aux=pilas.get(con).pop();
				
				//Mostras contenido de la pila
				System.out.print(aux+" ");
				
				//Agregarlo a la cola si es que no esta repetido
				if(!Main.colaContiene(cola, aux)) {
					cola.add(aux);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		//Mostrar la cola
		System.out.print("Cola: ");
		while(!cola.isEmpty()) {
			System.out.print(cola.remove()+" ");
		}
		
	}

	private static boolean colaContiene(Queue<Integer> cola, Integer valor) {
		// TODO Auto-generated method stub
		Queue<Integer> colaAuxiliar = new LinkedList<Integer>();
		boolean answer = false;
		
		while(!cola.isEmpty()) {
			if(cola.peek() == valor) {
				answer = true;
			}
			colaAuxiliar.add(cola.peek());
			cola.remove();
		}
		while(!colaAuxiliar.isEmpty()) {
			cola.add(colaAuxiliar.peek());
			colaAuxiliar.remove();
		}
		return answer;
	}

}
