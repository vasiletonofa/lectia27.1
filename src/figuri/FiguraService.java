package figuri;

public class FiguraService {


    public void diseneaza(Figura figura) { // Patrat
        try {
            figura.diseneaza();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
