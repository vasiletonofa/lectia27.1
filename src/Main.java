import automobil.Automobil;
import automobil.AutomobilCombustibilException;
import automobil.Bmw;
import figuri.Figura;
import figuri.Patrat;

public class Main {
    public static void main(String[] args) {

        // Exception -> Eroare din program care o putem arunca noi sau Java
        // Exception (Checked) vs RuntimeException (Unchecked)  -> Exception trebuie atentionata prin throws,

        Person person = new Person(90, "Ion");

        PersonService personService = new PersonService();

//        try {
//            personService.validatePerson(person);
//        } catch (PersonNameException | PersonSetAgeException | PersonAgeToHighException  e) {
//            System.out.println("Common catch: " + e.getMessage());
////            System.out.println("Numele " + e.getName() + " este gol");
////            person.setName("ABC");
//        }  catch (RuntimeException e) {
//            System.out.println("Runtime catch: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Exception catch " + e.getMessage());
//        } finally {
//
//        }


//        try {
//            person.setAge(20);
//            person.setName("Ion");
//            // Deschidem conexiunea la baza de date
//            // Eroare
//
//        } catch (PersonNameException e) {
//            System.out.println("Numele este gol");
//
//            throw new RuntimeException("Specific error");
//        } finally {
//            System.out.println("Am ajuns in finally");
//            // inchide conexiunea
//            // notificam prin email despre eroare
//        }
//
//        System.out.println(person.getAge());
//        System.out.println(person.getName());
//        System.out.println("Am ajuns aici");

//        Figura patrat = new Patrat();
//        patrat.diseneaza();

        // Finally ->

        Automobil automobil = new Bmw(0, false);

        try {
            automobil.accelereaza();
        } catch (AutomobilCombustibilException e) {
            System.out.println(e.getMessage());
            Bmw bmw = (Bmw) automobil;
            bmw.setCombustibil(10);
            System.out.println("Am alimentat cu combustibil");
            bmw.accelereaza();
        } finally {
            System.out.println("Mereu se executa");
        }

        try {
            automobil.franeaza();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            Bmw bmw = (Bmw) automobil;
            bmw.setServiceEfectuat(true);
            System.out.println("Am efectuat service");
            bmw.franeaza();
        } finally {
            System.out.println("Mereu se executa");
        }

        System.out.println(automobil);

    }
}