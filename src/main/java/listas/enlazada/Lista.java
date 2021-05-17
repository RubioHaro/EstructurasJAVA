package listas.enlazada;

public class Lista {
    private Nodo cabeza;
    private int numeroElementos;

    public Lista() {
        cabeza = null;
        numeroElementos = 0;
    }

    public void printLista() {
        // Nodo nodo;
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(ObtenerNodo(i));
        }
    }

    // agregar primero
    public void AgregarPrimero(int numero) {
        Nodo nodo = new Nodo(numero, null); // Haria estuviera vacia
        if (cabeza != null) {
            nodo.setSiguiente(cabeza);
        }
        cabeza = nodo;
        numeroElementos++;
    }

    // agregar
    public void Agregar(int numero, int posicion) {
        if (posicion < 0 || posicion > numeroElementos) {
            System.out.println("Error de longitud");
        } else if (posicion == 0) {
            AgregarPrimero(numero);
            // numeroElementos++; // Nos esta generando un nodo null
        } else if (posicion <= numeroElementos) { // < nos nos permite generar un nodo en la ultima posicion
            Nodo nodoARemplazar = ObtenerNodo(posicion - 1); // Nos traremos el nodo anterior de la posicion
            Nodo nodo = new Nodo(numero, nodoARemplazar.getSiguiente());
            nodoARemplazar.setSiguiente(nodo);
            numeroElementos++;
        }
    }

    public void AgregarAlFinal(int numero) {
        if (cabeza == null) {
            AgregarPrimero(numero);
            numeroElementos++;
        } else {
            Agregar(numero, numeroElementos - 1);
        }
    }

    // ObtenerNodo
    public Nodo ObtenerNodo(int posicion) {
        if (posicion == 0) {
            return cabeza;
        }
        Nodo nodo = cabeza; // Ref
        for (int i = 1; i < numeroElementos; i++) {
            nodo = nodo.getSiguiente();
            if (i == posicion) {
                return nodo;
            }
        }
        return null;
    }

    // obtener
    public int Obtener(int posicion) {
        return ObtenerNodo(posicion).getElemento();
    }

    // remover
    public void Remover(int posicion) {
        if (cabeza != null) {
            Nodo nodo = ObtenerNodo(posicion);
            nodo = null;
            numeroElementos--;
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }

    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }

}
