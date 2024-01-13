public class Employee {
     private String name;
     private byte age;
public Employee(){
this.name="sachin";
this.age=30;
}
public Employee(String name, byte age){
    this.name=name;
    this.age=age;
}
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }


}
