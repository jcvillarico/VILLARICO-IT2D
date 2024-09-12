
package villarico.it2d;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of application: ");
        int numberOfApplications = scanner.nextInt();
        scanner.nextLine();

        Application[] applications = new Application[numberOfApplications];

        for (int i = 0; i < numberOfApplications; i++) {
            System.out.println("Enter details of application:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            System.out.print("Annual Family Income: ");
            double annualFamilyIncome = scanner.nextDouble();
            System.out.print("Community Service Hours: ");
            int communityServiceHours = scanner.nextInt();
            applications[i] = new Application(id, name, gpa, annualFamilyIncome, communityServiceHours) {
           
                public void start(Stage primaryStage) throws Exception {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            };
        }

        System.out.println("ID\tNAME\tGPA\tAnnual Family Income\tCommunity Service Hours\tScholarship Status");
        for (Application application : applications) {
            System.out.println(application);
        }

        scanner.close();
    }
}
