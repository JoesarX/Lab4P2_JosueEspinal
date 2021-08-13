package lab4p2_josueespinal;
public class Electrico extends Vehiculos{
    private int km;
    private int baterias;
    private int aceleracion;
    private int carga;

    public Electrico() {
        super();
    }

    public Electrico(int km, int baterias, int aceleracion, int carga) {
        this.km = km;
        this.baterias = baterias;
        this.aceleracion = aceleracion;
        this.carga = carga;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getBaterias() {
        return baterias;
    }

    public void setBaterias(int baterias) {
        this.baterias = baterias;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "MODELO: "+ super.getModelo()+ "\nVIN: " + super.getVIN() + "\nCARROCERIA: " + super.getCarroceria()+"\nPASAJEROS: " + super.getPasajeros() + " personas\nMALETERO: "
                + super.getMaletero() + " litros\n"
                + "KILOMETROS: " + km + " km\nBATERIAS: " + baterias + "baterias\nACELERACION 0-100: " + aceleracion + " segundos\nCARGA: " + carga + " minutos\n";
    }
    
    
}

