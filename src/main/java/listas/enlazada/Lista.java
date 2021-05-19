package listas.enlazada;

public class Lista {
    private Nodo cabeza;
    private int numeroElementos;

    public Lista() {
        cabeza = null;
        numeroElementos = 0;
    }

    public void printLista() {
        System.out.println("-----------------------");
        for (int i = 0; i < numeroElementos; i++)
            System.out.println(ObtenerNodo(i));
        System.out.println("-----------------------");

    }

    // agregar primero
    public void AgregarPrimero(int numero) {
        Nodo nodo = new Nodo(numero, null);
        if (cabeza != null)
            nodo.setSiguiente(cabeza);

        cabeza = nodo;
        numeroElementos++;
    }

    public void AgregarAlFinal(int numero) {
        if (cabeza == null) {
            AgregarPrimero(numero);
            // numeroElementos++;
        } else {
            Agregar(numero, numeroElementos);
        }
    }

    // agregar
    public void Agregar(int numero, int posicion) {
        if (posicion < 0 || posicion > numeroElementos) {
            System.out.println("Error de longitud");
        } else if (posicion == 0) {
            AgregarPrimero(numero);
            // numeroElementos++; // Nos estaba generando un nodo null
        } else if (posicion <= numeroElementos) { // < nos nos permite generar un nodo en la ultima posicion
            Nodo nodoAnterior = ObtenerNodo(posicion - 1); // Nos traremos el nodo anterior de la posicion
            Nodo nodo = new Nodo(numero, nodoAnterior.getSiguiente());
            nodoAnterior.setSiguiente(nodo);
            numeroElementos++;
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
        if (cabeza != null && posicion < numeroElementos && posicion >= 0) {

            if (posicion == 0) {
                cabeza = cabeza.getSiguiente();
                numeroElementos--;
            } else {
                Nodo nodo = ObtenerNodo(posicion - 1); // Nos traemos el anterior al que queremos borrar
                nodo.setSiguiente(nodo.getSiguiente().getSiguiente()); 
                // Actualizamos el nodo siguiente del nodo
                // anterior al que queremos borrar
                numeroElementos--;
            }

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
