package lab4p2_josueespinal;
public class Hibrido extends Vehiculos{
    private int bateria;
    private int motor;

    public Hibrido() {
    super();
    }

    public Hibrido(int bateria, int motor) {
        this.bateria = bateria;
        this.motor = motor;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "MODELO: "+ super.getModelo()+ "\nVIN: " + super.getVIN() + "\nCARROCERIA: " + super.getCarroceria()+"\nPASAJEROS: " + super.getPasajeros() + " personas\nMALETERO: "
                + super.getMaletero() + " litros\n"
                +"BATERIA: " + bateria + "Kw/Hr\nMOTOR: " + motor + " Kw\n";
    }
    
}
