public class Person {
   private int age;
   private String name;

   public Person(Integer age, String name) {
       this.age = age;
       this.name = name;
   }

    public void setAge(int age) throws PersonSetAgeException {

        if(age < 0) {
            throw new PersonSetAgeException("Varsta este negativa 22222222!", age);
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() == 0) {
            throw new PersonNameException("Numele este gol", name);
        }
        this.name = name;
    }
}
