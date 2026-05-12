/**
 * Student Information Card
 * This program displays a formatted profile card with student details
 * including name, major, graduation year, email, hometown, and favorite hobby
 */

public class StudentInfo {
    public static void main(String[] args) {
        String name = "John Doe";
        String major = "Information Technology";
        int graduationYear = 2025;
        String email = "hogans_diamond@colstate.view.usg.edu";
        String hometown = "Atlanta, Georgia";
        String favoriteHobby = "Cooking";

        System.out.println("==========================================");
        System.out.println("       STUDENT INFORMATION CARD");
        System.out.println("==========================================");
        System.out.println();

        System.out.println("STUDENT PROFILE");
        System.out.println("==========================================");
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Email: " + email);
        System.out.println("Hometown: " + hometown);
        System.out.println("Favorite Hobby: " + favoriteHobby);
        System.out.println("==========================================");
    }
}