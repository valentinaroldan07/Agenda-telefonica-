
package agenda.telefonico;

public class Contacto {
    private int tel; 
    private String nombre, correo;

    public Contacto(int tel, String nombre, String correo) {
        this.tel = tel;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getTELnum() {
        return tel;
    }

    public void setTELnum(int TELnum) {
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
