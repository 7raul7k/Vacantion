package ro.myClass.models;

public class RequestDate extends Employee{
    private String curentDay;
    private String departmentName;
    private double phoneNumber;

    public RequestDate(String fName,String lastName,String city,String type,String curentDay,String departmentName,double phoneNumber){
        super(fName,lastName,city,type);
        this.curentDay = curentDay;
        this.departmentName = departmentName;
        this.phoneNumber = phoneNumber;
    }
    public RequestDate(String text){
        super(text);
        String[] p = text.split(",");
        this.curentDay = p[4];
        this.departmentName = p[5];
        this.phoneNumber = Double.parseDouble(p[6]);
    }
    public String showRequest(){
        String text = "";
        text += "First name: " + super.getfName();
        text += "\n Last name: " + super.getLastName();
        text += "\n City: " + super.getCity();
        text += "\n Curent Day:" + curentDay;
        text += "\n Department: "  + departmentName;
        text += "\n Phone number: " + phoneNumber;
        text += "\n===========================================\n";
        return text;

    }

}
