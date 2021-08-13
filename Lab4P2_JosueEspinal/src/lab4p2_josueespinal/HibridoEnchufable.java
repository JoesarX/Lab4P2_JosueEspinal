package lab4p2_josueespinal;
public class HibridoEnchufable extends Vehiculos{
    private int km;
    private int motores;
    private int remolque;
    private boolean wheel;

    public HibridoEnchufable() {
    super();
    }

    public HibridoEnchufable(int km, int motores, int remolque, boolean wheel) {
        this.km = km;
        this.motores = motores;
        this.remolque = remolque;
        this.wheel = wheel;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRemolque() {
        return remolque;
    }

    public void setRemolque(int remolque) {
        this.remolque = remolque;
    }

    public boolean isWheel() {
        return wheel;
    }

    public void setWheel(boolean wheel) {
        this.wheel = wheel;
    }
    

    @Override
    public String toString() {
        return "MODELO: "+ super.getModelo()+ "\nVIN: " + super.getVIN() + "\nCARROCERIA: " + super.getCarroceria()+"\nPASAJEROS: " + super.getPasajeros() + " personas\nMALETERO: "
                + super.getMaletero() + " litros\n"
                + "KILOMETROS: " + km + " km\nMOTORES: " + motores + "\nREMOLQUE: " + remolque + " toneladas\n";
    }
    
}
