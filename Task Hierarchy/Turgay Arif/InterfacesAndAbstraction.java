import Enums.DeptNames;
import Enums.Position;
import Objects.*;

import java.time.LocalTime;

public class InterfacesAndAbstraction {
    public static void main(String[] args) {
        TechCompany ngu = new TechCompany("NGU");
        CEO ceo = new CEO(1);
        Department hr = new HR(2);
        Department it = new IT(3);

        Employee stevenNgu = new Employee("Steven", "NGU", 45, Position.CEO);
        Employee johnDoe = new Employee("John", "Doe", 20, Position.COO);
        Employee emilyJohnson = new Employee("Emily", "Johnson", 25, Position.MANAGER);
        Employee johnSmith = new Employee("John", "Smith", 35, Position.TEAM_MEMBER);
        Employee janeDoe = new Employee("Jane", "Doe", 28, Position.CTO);
        Employee bobJohnson = new Employee("Bob", "Johnson", 42, Position.MANAGER);
        Employee sallyMiller = new Employee("Sally", "Miller", 31, Position.TEAM_MEMBER);
        Employee tomWilliams = new Employee("Tom", "Williams", 26, Position.TEAM_MEMBER);
        Employee emilyJones = new Employee("Emily", "Jones", 38, Position.TEAM_MEMBER);
        Employee davidBrown = new Employee("David", "Brown", 49, Position.TEAM_MEMBER);
        Employee sarahDavis = new Employee("Sarah", "Davis", 40, Position.TEAM_MEMBER);
        Employee mikeWilson = new Employee("Mike", "Wilson", 33, Position.TEAM_MEMBER);
        Employee emmaMoore = new Employee("Emma", "Moore", 29, Position.TEAM_MEMBER);

        ngu.addEmployee(DeptNames.CEO, stevenNgu);
        ngu.addEmployee(DeptNames.HR, johnDoe);
        ngu.addEmployee(DeptNames.HR, emilyJones);
        ngu.addEmployee(DeptNames.HR, emilyJohnson);
        ngu.addEmployee(DeptNames.HR, johnSmith);
        ngu.addEmployee(DeptNames.IT, janeDoe);
        ngu.addEmployee(DeptNames.IT, bobJohnson);
        ngu.addEmployee(DeptNames.IT, sallyMiller);
        ngu.addEmployee(DeptNames.IT, tomWilliams);
        ngu.addEmployee(DeptNames.IT, davidBrown);
        ngu.addEmployee(DeptNames.IT, sarahDavis);
        ngu.addEmployee(DeptNames.IT, mikeWilson);
        ngu.addEmployee(DeptNames.IT, emmaMoore);

        stevenNgu.work();
        johnDoe.work();
        janeDoe.work();
        bobJohnson.work();
        tomWilliams.work();
        ngu.getCompanyDetails();
        emilyJohnson.makeMistake();
        emilyJohnson.makeMistake();
        emilyJohnson.makeMistake();
        ceo.setMeeting(emilyJohnson, LocalTime.of(14, 55));
        System.out.println(emilyJohnson.getCountOfMistakes());
        hr.callEmployee(sallyMiller);
        mikeWilson.makeMistake();
        ngu.fireEmployee(mikeWilson);
        ngu.fireEmployee(emilyJohnson);
        ngu.getEmployeesList();
        ngu.getCompanyDetails();

    }


}