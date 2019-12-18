package Principal;

public class Lista {

    Nodo siguiente, ultimo;

    public void insert(Persona p) {
        if (siguiente == null) {
            siguiente = new Nodo(p);
        } else if (p.getIdEstruc() < siguiente.getPersona().getIdEstruc()) {
            Nodo aux = new Nodo(p);
            aux.setSiguiente(siguiente);
            siguiente = aux;
        } else if (siguiente.getSiguiente() == null) {
            siguiente.setSiguiente(new Nodo(p));
        } else {
            Nodo aux = siguiente;

            while (aux.getSiguiente() != null && aux.getSiguiente().getPersona().getIdEstruc() < p.getIdEstruc()) {
                aux = aux.getSiguiente();
            }
            Nodo temp = new Nodo(p);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
        }
    }

    public boolean buscar(int identificacion) {
        Nodo aux = siguiente;
        boolean encontrado = false;

        if (siguiente != null) {
            while (aux != null && !encontrado) {
                if (aux.getPersona().getIdentificacion() == identificacion) {
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }

    public Persona buscarPersona(int identificacion) {
        Nodo aux = siguiente;
        Nodo getter = null;
        boolean encontrado = false;

        if (siguiente != null) {
            while (aux != null && !encontrado) {
                if (aux.getPersona().getIdentificacion() == identificacion) {
                    getter = aux;
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
        }
        return getter.getPersona();
    }
    
    @Override
    public String toString() {
        String msj = "";
        Nodo aux = siguiente;
        while (aux != null) {
            msj += aux;
            aux = aux.getSiguiente();
        }
        return msj;
    }
}
