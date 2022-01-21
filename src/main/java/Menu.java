import java.util.Scanner;

public class Menu {
    
    Scanner input = new Scanner(System.in);
    
    public void run() {
        mainMenu();
    }
    
    private void mainMenu(){
        System.out.println("What would you like to do?");
        System.out.println("1.) Enter a new student");
        System.out.println("2.) Remove a student from roster");
        System.out.println("3.) Edit a student's information");
        String userChoice = input.nextLine();
        
        if( userChoice.equalsIgnoreCase("1")){
            System.out.println("What is the student's first name?");
            String firstName = input.nextLine();
            System.out.println("What is the student's last name?");
            String lastName = input.nextLine();
            System.out.println("What is the student's age?");
            int age = Integer.parseInt(input.nextLine());
            Student student = new Student(firstName, lastName, age);
            System.out.println(student.toString());
            //System.out.println(student.getAge() + " " + student.getLastName() + " " + student.getFirstName());
        }else if(userChoice.equalsIgnoreCase("2")){
            System.out.println("Placeholder Text");
        }
    }
    
    
    
}
