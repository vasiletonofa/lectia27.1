public class PersonService {


    public void validatePerson(Person person) throws PersonAgeToHighException, PersonNameException {

        if(person.getAge() < 0) {
            throw new PersonSetAgeException("Varsta negativa", person.getAge());
        }

        if (person.getName() != null && person.getName().length() == 0) {
            throw new PersonNameException("Numele este gol", person.getName());
        }

        if (person.getAge() > 100) {
            throw new PersonAgeToHighException("Varsta este prea mare");
        }

//        if (person.getName().length() < 10) {
//            throw new Exception("Numeale prea mic");
//        }
    }
}
