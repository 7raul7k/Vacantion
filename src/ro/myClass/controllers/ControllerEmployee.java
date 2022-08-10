package ro.myClass.controllers;

import ro.myClass.models.DaysTaken;
import ro.myClass.models.Employee;
import ro.myClass.models.RequestDate;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerEmployee {
    ArrayList<Employee> employees;
    public ControllerEmployee(){
        this.employees = new ArrayList<>();
        this.load();
    }
    public void load(){
        try{
            File file = new File("C:\\mycode\\JavaBasics\\Mostenirea\\Vacantion\\src\\ro\\myClass\\resources\\employee.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String text = scanner.nextLine();

                switch (text.split(",")[0]){
                    case "daysTaken":
                        this.employees.add(new DaysTaken(text));
                        break;
                    case "requestDate":
                        this.employees.add(new RequestDate(text));
                        break;
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void description(){
        for (Employee m : employees){
            if(m instanceof DaysTaken){
                DaysTaken x = (DaysTaken) m;
                System.out.println(x.descriptionDays());
            }else if(m instanceof RequestDate){
                RequestDate x = (RequestDate) m;
                System.out.println(x.showRequest());
            }

        }
    }
}
