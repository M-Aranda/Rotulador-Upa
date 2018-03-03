package rotulador.upa;

public abstract class FormatoRotulo {

    private String nombre;
    private String fechaDeElaboracion;
    private String horaDeElaboracion;
    private String fechaDeVencimiento;
    private String responsable;

    public FormatoRotulo(String nombre, String fechaDeElaboracion, String horaDeElaboracion, String fechaDeVencimiento, String responsable) {
        this.nombre = nombre;
        this.fechaDeElaboracion = fechaDeElaboracion;
        this.horaDeElaboracion = horaDeElaboracion;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.responsable = responsable;
    }

    public FormatoRotulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeElaboracion() {
        return fechaDeElaboracion;
    }

    public void setFechaDeElaboracion(String fechaDeElaboracion) {
        this.fechaDeElaboracion = fechaDeElaboracion;
    }

    public String getHoraDeElaboracion() {
        return horaDeElaboracion;
    }

    public void setHoraDeElaboracion(String horaDeElaboracion) {
        this.horaDeElaboracion = horaDeElaboracion;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

}
