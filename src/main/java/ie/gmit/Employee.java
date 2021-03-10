package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private int ID;
    private String phone;
    private String Employment;
    private int age;


    public Employee(String title, String name, int ID, String phone, String employment, int age) {
        setTitle(title);
        setName(name);
        setID(ID);
        setPhone(phone);
        setEmployment(employment);
        setAge(age);
    }


    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmployment() {
        return Employment;
    }

    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        if ((title == "Mr") || (title == "Mrs")|| (title == "Miss"))
        {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Invalid Title");
        }
    }

    public void setName(String name) {
        if( name.length() > 5 && name.length() < 22){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    public void setID(int ID) {
        if(String.valueOf(ID).length() == 6 ){
            this.ID = ID;
        }else {
            throw new IllegalArgumentException("Invalid ID");
        }
    }

    public void setPhone(String phone) {
        if(phone.length() == 7){
            this.phone = phone;
        }else{
            throw new IllegalArgumentException("Invalid Phone");
        }
    }

    public void setEmployment(String employment) {
        if ((title == "Full Time") || (title == "Part Time"))
        {
            this.Employment = employment;
        }
        else {
            throw new IllegalArgumentException("Invalid Employment");
        }

    }

    public void setAge(int age) {
        if(age >= 18){
            this.age = age;
        }else {
            throw new IllegalArgumentException("Invalid Age");
        }
    }
}
