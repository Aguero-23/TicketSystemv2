package Principal;

import static Principal.MainFrame.c;
import static Principal.MainFrame.nextInLine;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Funciones {

    public void determinaAccion(Persona p) {
//        System.out.println("here ");
        if (p.getTicket().substring(0, 1).equals("R")) {
//            Acciones.atenderRetiro ar = new Acciones.atenderRetiro();
//            ar.show();
//            System.out.println("Retiro, "+p.getIdentificacion());
        } else if (p.getTicket().substring(0, 1).equals("T")) {
            Acciones.atenderTransaccion at = new Acciones.atenderTransaccion();
            at.show();
//            System.out.println("Transferencia, "+p.getIdentificacion());
        } else if (p.getTicket().substring(0, 1).equals("I")) {
            Acciones.atenderConsulta ac = new Acciones.atenderConsulta();
            ac.show();
//            System.out.println("Información, "+p.getIdentificacion());
        }
    }

    //Funcion para atender\\
    public void Atender() {
        Persona personaAtendida = null;
        if (c == null) {
            JOptionPane.showMessageDialog(null, "No hay personas disposibles para atender.");
        } else {
            personaAtendida = c.DesencolarDeseado(c);
            nextInLine = String.valueOf(personaAtendida.getIdentificacion());
        }
        determinaAccion(personaAtendida);
    }

    public void AtenderCaja2() {
        Persona personaAtendida = null;
        if (c == null) {
            JOptionPane.showMessageDialog(null, "No hay personas disposibles para atender.");
        } else {
            personaAtendida = c.DesencolarDeseadoCaja2(c);
            nextInLine = String.valueOf(personaAtendida.getIdentificacion());
        }
        determinaAccion(personaAtendida);
    }

    public void AtenderCaja3() {
        Persona personaAtendida = null;
        if (c == null) {
            JOptionPane.showMessageDialog(null, "No hay personas disposibles para atender.");
        } else {
            personaAtendida = c.DesencolarDeseadoCaja3(c);
            nextInLine = String.valueOf(personaAtendida.getIdentificacion());
        }
        determinaAccion(personaAtendida);
    }
}
