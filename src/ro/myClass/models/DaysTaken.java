package ro.myClass.models;

public class DaysTaken extends Employee {
    private int numberofdays;
    private String typeVacation;
    private String startday;

    public DaysTaken(String fName,String lastName,String city,String type,int numberofdays,String typeVacation,String startday){
        super(fName, lastName, city, type);
        this.numberofdays = numberofdays;
        this.typeVacation = typeVacation;
        this.startday = startday;
    }
    public DaysTaken(String text){
        super(text);
        String[] p = text.split(",");
        this.numberofdays = Integer.parseInt(p[4]);
        this.typeVacation = p[5];
        this.startday = p[6];
    }
    public String descriptionDays(){
        String text = "";
        text += "First name: " + super.getfName();
        text += "\n Last name: " + super.getLastName();
        text += "\n City: " + super.getCity();
        text += "\n Number of days: " + numberofdays;
        text += "\n Type vacantion: " + typeVacation;
        text += "\n Start day: " + startday;
        text += "\n===================================================\n";
        return text;
    }
}
