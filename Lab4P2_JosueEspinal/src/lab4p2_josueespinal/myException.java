package lab4p2_josueespinal;
public class myException extends Exception{
    private String texto;

    public myException() {
        super("Cantidad de dias invalida. Deben ser al menos 30 dias");
    }
    
    public myException(String texto) {
        super(texto);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "A OCURRIDO UN ERROR CRITICO. {" + texto + '}';
    }
}
