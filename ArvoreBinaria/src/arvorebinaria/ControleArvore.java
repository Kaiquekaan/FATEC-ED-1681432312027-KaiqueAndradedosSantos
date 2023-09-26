package arvorebinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleArvore {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArvoreBinaria arvorebinaria = new ArvoreBinaria();
	        ArrayList<Integer> inserirValores = new ArrayList<>();

	        System.out.println("Informe os valores numéricos (digite -1 para encerrar a insercao):");

	        
	        //le os valores digitados até que o valor seja igual a -1
	        int inputValue;
	        while ((inputValue = scanner.nextInt()) != -1) {
	            inserirValores.add(inputValue);
	            arvorebinaria.insert(inputValue);
	        }

	        System.out.println("Valores inseridos na arvore binaria:");
            //mostra os valores que foram colocados no array list
	        for (int value : inserirValores) {
	            System.out.print(value + " ");
	        }

	        //Mostra os valores na ordem 
	        System.out.println("\nImprime em ordem (in-order) na arvore binaria:");
	        arvorebinaria.inOrderTraversal(arvorebinaria.root);

	        System.out.println("\nImprime em Pre ordem (in-Pre-order) na arvore binaria:");
	        arvorebinaria.inPreOrderTraversal(arvorebinaria.root);
	        
	        System.out.println("\nImprime em Pos ordem (in-Pos-order) na arvore binaria:");
	        arvorebinaria.inPosOrderTraversal(arvorebinaria.root);
	        scanner.close();
	    }
}
