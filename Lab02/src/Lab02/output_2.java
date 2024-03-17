package Lab02;

public class output_2 {
    public static void main(String[] args) {
        User user = new User("John", 19, new Engineer(), "123", "4567890");
        user.printDetails();
    }
}

interface EmployeeType {
    String getName();
}

class Engineer implements EmployeeType {
    @Override
    public String getName(){
        return "Engineer";
    }
}

class Manager implements EmployeeType {
    @Override
    public String getName(){
        return "Manager";
    }
}

class User {
    String name;
    Integer age;
    EmployeeType type;
    String phone;
    String phoneCode;

    User(String name, Integer age, EmployeeType type, String phone, String phoneCode) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.phone = phone;
        this.phoneCode = phoneCode;
    }

    void printDetails() {
        System.out.printf("Name: %s%n", this.name);
        System.out.printf("Age: %d%n", this.age);
        System.out.printf("Type: %s%n", this.type.getName());
        System.out.printf("Phone: %s%s%n", this.phoneCode, this.phone);
    }
}