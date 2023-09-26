package arvorebinaria;


public class ArvoreBinaria {
    protected No root;

    //Metodo construtor que inicia a Raiz com valor null//
    public ArvoreBinaria() {
        root = null;
    }
    //coloca um valor na arvore//
    public void insert(int novono) {
        root = Processar(root, novono);
    }

    //Metodo que processa e decide o lado do novono//
    private No Processar(No root, int novono) {
        if (root == null) {
            root = new No(novono);
            return root;
        }

        if (novono < root.atual) {
            root.noesquerdo = Processar(root.noesquerdo, novono);
        } else if (novono > root.atual) {
            root.nodireito = Processar(root.nodireito, novono);
        }

        return root;
    }
    
    //Imprime em Ordem
    public void inOrderTraversal(No root) {
        if (root != null) {
            inOrderTraversal(root.noesquerdo);
            System.out.print(root.atual + " ");
            inOrderTraversal(root.nodireito);
        }
    }
    
    //Imprime em Pre Ordem
    public void inPreOrderTraversal(No root) {
        if (root != null) {
        	System.out.print(root.atual + " ");
            inPreOrderTraversal(root.noesquerdo);
            inPreOrderTraversal(root.nodireito);
        }
    }
    //Imprime em Pos Ordem
    public void inPosOrderTraversal(No root) {
        if (root != null) {
            inPosOrderTraversal(root.noesquerdo);
            inPosOrderTraversal(root.nodireito);
        	System.out.print(root.atual + " ");
        }
    }


}

