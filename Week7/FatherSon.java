import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Age Cannot be Negative");
        }
        this.age = age;
        System.out.println("Father's Age: " + this.age);
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);  
        if (sonAge < 0) {
            throw new WrongAge("Son's Age Cannot be Negative");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's Age Cannot be Greater than or Equal to Father's Age");
        }
        this.sonAge = sonAge;
        System.out.println("Son's Age: " + this.sonAge);
    }
}

public class FatherSon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Father's Age: ");
        int fatherAge = scanner.nextInt();

        System.out.print("Enter Son's Age: ");
        int sonAge = scanner.nextInt();

        try {
            Son son = new Son(fatherAge, sonAge); 
        } catch (WrongAge e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("J S AMOGH KRISHNA 1BM23CS029");
        scanner.close();
    }
}
