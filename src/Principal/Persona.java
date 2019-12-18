package Principal;

public class Persona {

    private int identificacion, idEstruc;
    private String ticket;

    public Persona(int identificacion, String ticket, int idEstruc) {
        this.identificacion = identificacion;
        this.idEstruc = idEstruc;
        this.ticket = ticket;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setId(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getIdEstruc() {
        return idEstruc;
    }

    public void setIdEstruc(int idEstruc) {
        this.idEstruc = idEstruc;
    }

    @Override
    public String toString() {
        return "Persona: " + identificacion + " " + ticket + " " + idEstruc + " " + "\n";
    }
}
