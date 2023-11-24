package automobil;

public class Bmw implements Automobil {

    int combustibil;
    boolean serviceEfectuat;


    public Bmw(int combustibil, boolean serviceEfectuat) {
        this.combustibil = combustibil;
        this.serviceEfectuat = serviceEfectuat;
    }

    @Override
    public void accelereaza() throws AutomobilCombustibilException  {
        if (combustibil == 0) {
            throw new AutomobilCombustibilException("Nu este combustibil");
        }
        System.out.println("Accelereaza...");
    }

    @Override
    public void franeaza()  {
        if (!serviceEfectuat) {
            throw new RuntimeException("Nu putem frana");
        }

        System.out.println("Franeaza....");
    }

    public void setCombustibil(int combustibil) {
        this.combustibil = combustibil;
    }

    public void setServiceEfectuat(boolean serviceEfectuat) {
        this.serviceEfectuat = serviceEfectuat;
    }

    @Override
    public String toString() {
        return "Combustibil: " + combustibil + " serviceEfectuat: " + serviceEfectuat;
    }
}
