package ro.myClass.models;

public class Employee {
    private String fName;
    private String lastName;
    private String city;
    private String type;

    public Employee(String fName,String lastName,String city,String type){
        this.city = city;
        this.fName = fName;
        this.lastName = lastName;
        this.type = type;
    }
    public Employee(String text){
        String[] p = text.split(",");
        this.type = p[0];
        this.fName = p[1];
        this.lastName = p[2];
        this.city = p[3];
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
