package zachmuzzin_cis296_hw1;

import java.util.*;

public class ZachMuzzin_CIS296_HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter your username: ");
        String username = input.next(); // username
        
        System.out.println(username + ", enter the number of credits required to graduate: ");
        int TotalCredits = input.nextInt();
        
        System.out.println(username + ", enter the number of credits you have completed: ");
        int CompletedCredits = input.nextInt();
        
        System.out.println(username + ", enter the number of credits you take per semester: ");
        int CreditsPerSemester = input.nextInt();
        
        
        int CreditsLeft; // credits left - int
        int SemestersToGraduate;// semesters to graduate - int (round up)
        
        CreditsLeft = TotalCredits - CompletedCredits;
        SemestersToGraduate = CreditsLeft / CreditsPerSemester;
        if(CreditsLeft % CreditsPerSemester != 0){
            SemestersToGraduate++;
        }
        System.out.println(username + ", you have " + SemestersToGraduate + " semesters left until graduation!");   
    }    
}
