package lab4p2_josueespinal;
public class Vehiculos {
    private String modelo;
    private int VIN;
    private String carroceria;
    private int pasajeros;
    private int maletero;

    public Vehiculos() {
    }

    public Vehiculos(String modelo, int VIN, String carroceria, int pasajeros, int maletero) {
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "modelo=" + modelo + ", VIN=" + VIN + ", carroceria=" + carroceria + ", pasajeros=" + pasajeros + ", maletero=" + maletero + '}';
    }
    
}
