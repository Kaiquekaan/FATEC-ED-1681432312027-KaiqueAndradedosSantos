package arvorebinaria;


public class No extends ArvoreBinaria {
	
	    int atual;
	    No noesquerdo;
	    No nodireito;

	    //metodo construtor de cada no criado
	    public No(int novono) {
	        this.atual = novono;
	        this.noesquerdo = null;
	        this.nodireito = null;
	    }

	   
}

