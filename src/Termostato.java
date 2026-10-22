public class Termostato {

    private double temperaturaActual;
    private String modoOperacion;

    public Termostato(double temperaturaActual, String modoOperacion) {
        if (temperaturaActual >= 15 && temperaturaActual <= 30) {
            this.temperaturaActual = temperaturaActual;
        }else{
            this.temperaturaActual = 15;
        }
        this.modoOperacion = modoOperacion;
    }

    public void setTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura >= 15 && nuevaTemperatura <= 30) {
            temperaturaActual = nuevaTemperatura;

        }else{
            System.out.println("Error: Temperatura no valido");
        }
    }

    public double getTemperatura() {
        return temperaturaActual;
    }

    public String getModoOperacion() {
        return modoOperacion;
    }


    public void setModoOperacion(String modoOperacion) {
        this.modoOperacion = modoOperacion;
    }
}
