public class Employees implements Person {
    private String firstName;
    private String lastName;
    private int age;
    private int countOfMistakes = 0;

    public Employees(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void makeMistake() {
        System.out.println("Sorry! It won't happen again!");
        countOfMistakes += 1;
    }

    @Override
    public void goToWork() {
        System.out.println("I'm going to work");
    }

    @Override
    public void goToGym() {
        System.out.println("I'm going to gym");

    }

    @Override
    public void leaveWork() {
        System.out.println("Bye bye!");

    }

    public void makeMajorMistake() {

    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getEmployeeDetails() {
        return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + " years old.";
    }


}
