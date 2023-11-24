public class PersonSetAgeException extends RuntimeException {

    private Integer age;

    public PersonSetAgeException(String message, Integer age) {
        super(message);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
