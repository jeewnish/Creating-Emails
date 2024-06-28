import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternativeEmail;
    private String email;
    private final String companySuffix = ".winded.com";

    // Constructor to receive Name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Your Name: " +this.firstName + " " + this.lastName);

        // Calling method asking for department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Calling method for password
        this.password = generatePassword(8);
        System.out.println("Your password: " + this.password);

        // Setting up the email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Your Email: " + this.email);
    }
    // Ask Department
    private String setDepartment(){
        System.out.print("1 for Sales\n2 for Development\n3 for Management\n4 for Accounting\nEnter the department: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1){return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "mng";} else if (depChoice == 4) {return "acc";}
        else {return "";}

    }

    // Set password
    private String generatePassword(int length){
        String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
        String DIGITS = "0123456789";
        String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?/";
        String ALL_CHARACTERS = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARACTERS;


        char[] password = new char[length];
        for (int i = 0; i< length; i++){
            int rand = (int) (Math.random() * ALL_CHARACTERS.length());
            password[i] = ALL_CHARACTERS.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox Capacity
    public void setMailboxCapacity(int mailboxCapacity){
        this.mailboxCapacity = mailboxCapacity;
    }

    // Set alternative Email
    public void setAlternativeEmail(String alternativeEmail){
        this.alternativeEmail = alternativeEmail;
    }
    // Change password
    public void changePassword(String password){
        this.password = password;
    }
    public String setAlternateEmail(){return alternativeEmail;}
    public String setPassword(){return password;}

    // Show info
    public String showInfo(){
        return "Display Name: " + this.firstName+
                "\nE-mail: " + this.email +
                "\nPassword: " + this.password +
                "\nDepartment: " + this.department;
    }
}
