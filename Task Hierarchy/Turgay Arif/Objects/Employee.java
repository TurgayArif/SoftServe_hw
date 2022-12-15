package Objects;

import Enums.Position;
import Interfaces.IPerson;

public class Employee implements IPerson {

    private String firstName;
    private String lastName;
    private int age;
    private Position position;
    private int countOfMistakes;


    public Employee(String firstName, String lastName, int age, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    @Override
    public void work() {
        if (position.equals(Position.CEO)) {
            System.out.println(firstName + " is setting the overall strategy and direction of the company!");
        } else if (position.equals(Position.CTO)) {
            System.out.println(firstName + " is developing and implementing technology solutions!");
        } else if (position.equals(Position.COO)) {
            System.out.println(firstName + " is making sure that the company is running smoothly and efficiently!");
        } else if (position.equals(Position.MANAGER)) {
            System.out.println(firstName + " managing the team members!");
        } else if (position.equals(Position.TEAM_MEMBER)) {
            System.out.println(firstName + " is working hard!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void makeMistake() {
        countOfMistakes++;
    }

    public Position getPosition() {
        return position;
    }

    public String getEmployeeDetails() {
        return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + " years old.";
    }

    public int getCountOfMistakes() {
        return this.countOfMistakes;
    }


}
