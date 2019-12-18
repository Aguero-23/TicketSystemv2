package Principal;

public class Cola {

    Nodo frente;
    Nodo ultimo;

    public void encola(Persona p) { //Metodo para encolar
        Nodo aux = new Nodo(p);
        if (frente == null) {
            frente = aux;

        } else {
            ultimo.setSiguiente(aux);
        }
        ultimo = aux;
    }

    public Persona extrae(char tipo) {
        Nodo actual = frente;
        Nodo objetivo = null;
        Nodo anterior = null;
        boolean encontrado = false;

        if (actual != null) {
            while (actual != null && !encontrado) {
                if (actual.getPersona().getTicket().charAt(0) == tipo) { //Si el ticket tiene como primer letra el tipo enviado
                    //Evalue las 3 posibilidades
                    if (actual == frente) {

                        objetivo = actual;//Captura la informacion del actual como es esperado

                        actual = actual.getSiguiente();
                        frente = actual;

                    } else if (ultimo.getPersona().getTicket().charAt(0) == tipo) { //Captura la informacion del actual como es esperado

                        objetivo = ultimo;
                        anterior.setSiguiente(null);
                        ultimo = anterior;

                    } else { //Captura la informacion del actual como es esperado
                        objetivo = actual;
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    System.out.println("Nodo eliminado");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.getSiguiente();

            }
        } else if (!encontrado) {
            System.out.println("Nodo no encontrado");
        } else {
            System.out.println("Cola vacia");
        }
        return objetivo.getPersona();
    }

    private String getTipo(Nodo nodo) { //Obtener el tipo de Transaccion
        String resultado = "";
        if (frente == null) {
            return null;
        } else {
            Nodo aux = nodo;
            switch (aux.getPersona().getTicket().charAt(0)) { //Evalua diferentes tipos de transacciones
                case 'R':
                    resultado = "Retiro";
                    break;
                case 'T':
                    resultado = "Transaccion";
                    break;
                case 'I':
                    resultado = "Informacion";
                    break;
            }
        }

        return resultado;
    }

    public Persona DesencolarDeseado(Cola c) {
        Persona getter = null;
        boolean flag = false;
        if (frente == null) {
            System.out.println("Cola Vacia, no hay personas que atender.");
            return null;
        } else {
            Nodo aux = frente;
            while (aux != null && !flag) {
                switch (getTipo(aux).toLowerCase()) {
                    case "retiro":
                        getter = c.extrae('R');
                        flag = true;
                        break;
                    case "transaccion":
                        getter = c.extrae('T');
                        flag = true;
                        break;
                    case "informacion":
                        getter = c.extrae('I');
                        flag = true;
                        break;
                }

                aux = aux.getSiguiente();
            }

        }
        return getter;
    }

    public Persona DesencolarDeseadoCaja2(Cola c) {
        Persona getter = null;
        boolean flag = false;
        if (frente == null) {
            System.out.println("Cola Vacia, no hay personas que atender.");
            return null;
        } else {
            Nodo aux = frente;
            while (aux != null && !flag) {
                switch (getTipo(aux).toLowerCase()) {
                    case "retiro":
                        getter = c.extrae('R');
                        flag = true;
                        break;
                    case "transaccion":
                        getter = c.extrae('T');
                        flag = true;
                        break;
                }
                aux = aux.getSiguiente();
            }
        }
        return getter;
    }

    public Persona DesencolarDeseadoCaja3(Cola c) {
        Persona getter = null;
        boolean flag = false;
        if (frente == null) {
            System.out.println("Cola Vacia, no hay personas que atender.");
            return null;
        } else {
            Nodo aux = frente;
            while (aux != null && !flag) {
                switch (getTipo(aux).toLowerCase()) {
                    case "informacion":
                        getter = c.extrae('I');
                        flag = true;
                        break;
                }
                aux = aux.getSiguiente();
            }
        }
        return getter;
    }

    @Override
    public String toString() {
        String s = "";
        if (frente == null) {
            s = "Cola Vacia";
        } else {
            Nodo aux = frente;
            while (aux != null) {
                s += aux;
                aux = aux.getSiguiente();
            }
        }
        return s;
    }

}
