package lab4p2_josueespinal;
public class Combustion extends Vehiculos{
    private int consumo;
    private int aceite;
    private int velocidad;
    private String cambio;

    public Combustion() {
    super();
    }

    public Combustion(int consumo, int aceite, int velocidad, String cambio) {
        this.consumo = consumo;
        this.aceite = aceite;
        this.velocidad = velocidad;
        this.cambio = cambio;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return "MODELO: "+ super.getModelo()+ "\nVIN: " + super.getVIN() + "\nCARROCERIA: " + super.getCarroceria()+"\nPASAJEROS: " + super.getPasajeros() + " personas\nMALETERO: "
                + super.getMaletero() + " litros\n"
                + "CONSUMO: " + consumo + " km/litro\nAceite: " + aceite + " meses\nVELOCIDAD: " + velocidad + "km/hr\nCAMBIO: " + cambio +"\n";
    }
    
}
