package Food;

import rotulador.upa.FormatoRotulo;

public class IngredienteOProducto extends FormatoRotulo {

    public IngredienteOProducto(String nombre, String fechaDeElaboracion, String horaDeElaboracion, String fechaDeVencimiento, String responsable) {
        super(nombre, fechaDeElaboracion, horaDeElaboracion, fechaDeVencimiento, responsable);
    }

    public IngredienteOProducto() {
    }

    @Override
    public void setResponsable(String responsable) {
        super.setResponsable(responsable);
    }

    @Override
    public String getResponsable() {
        return super.getResponsable();
    }

    @Override
    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        super.setFechaDeVencimiento(fechaDeVencimiento);
    }

    @Override
    public String getFechaDeVencimiento() {
        return super.getFechaDeVencimiento();
    }

    @Override
    public void setHoraDeElaboracion(String horaDeElaboracion) {
        super.setHoraDeElaboracion(horaDeElaboracion);
    }

    @Override
    public String getHoraDeElaboracion() {
        return super.getHoraDeElaboracion();
    }

    @Override
    public void setFechaDeElaboracion(String fechaDeElaboracion) {
        super.setFechaDeElaboracion(fechaDeElaboracion);
    }

    @Override
    public String getFechaDeElaboracion() {
        return super.getFechaDeElaboracion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "  "
                + "\nFecha de elaboracion: " + getFechaDeElaboracion() + "  "
                + "\nHora de elaboracion: " + getHoraDeElaboracion() + "  "
                + "\nFecha de vencimiento: " + getFechaDeVencimiento() + "  "
                + "\nResponsable: " + getResponsable();

    }

}
