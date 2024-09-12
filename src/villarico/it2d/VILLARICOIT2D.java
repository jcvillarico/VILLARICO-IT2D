
package villarico.it2d;

 import java.util.Scanner;

public class VILLARICOIT2D {

 
    public static void main(String[] args) {
    int id;
    String name;
    double gpa;
    double annualFamilyIncome;
    int communityServiceHours;
    String scholarshipStatus;

    public Application(int id, String name, double gpa, double annualFamilyIncome, int communityServiceHours) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.annualFamilyIncome = annualFamilyIncome;
        this.communityServiceHours = communityServiceHours;
        this.scholarshipStatus = determineScholarshipStatus();
    }

    private String determineScholarshipStatus() {
        if (gpa >= 3.5 && annualFamilyIncome < 400000) {
            return "Approved";
        } else {
            return "Not Approved";
        }
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%.1f\t%,.2f\t%d\t\t%s", id, name, gpa, annualFamilyIncome, communityServiceHours, scholarshipStatus);
    
    }
    
    
    }
