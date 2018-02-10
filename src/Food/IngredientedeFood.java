package Food;

import rotulador.upa.FormatoRotulo;

public class IngredientedeFood extends FormatoRotulo {

    public IngredientedeFood(String nombre, String fechaDeElaboracion, String horaDeElaboracion, String fechaDeVencimiento, String responsable) {
        super(nombre, fechaDeElaboracion, horaDeElaboracion, fechaDeVencimiento, responsable);
    }

    public IngredientedeFood() {
    }
    
    

    @Override
    public void setResponsable(String responsable) {
        super.setResponsable(responsable); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getResponsable() {
        return super.getResponsable(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        super.setFechaDeVencimiento(fechaDeVencimiento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFechaDeVencimiento() {
        return super.getFechaDeVencimiento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHoraDeElaboracion(String horaDeElaboracion) {
        super.setHoraDeElaboracion(horaDeElaboracion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHoraDeElaboracion() {
        return super.getHoraDeElaboracion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechaDeElaboracion(String fechaDeElaboracion) {
        super.setFechaDeElaboracion(fechaDeElaboracion); //To change body of generated methods, choose Tools | Templates.
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
        return "Nombre: "+getNombre()+"  "+
                "\nFecha de elaboracion: "+getFechaDeElaboracion()+"  "+
                "\nHora de elaboracion: "+getHoraDeElaboracion()+"  "+
                "\nFecha de vencimiento: "+getFechaDeVencimiento()+"  "+
                "\nResponsable: "+getResponsable();
                
    }


    
    

}
