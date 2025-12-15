import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Total points/ total credits
        //Points for a class = grade value * credits
        // A = 4, B = 3 ...

        Scanner scanner = new Scanner(System.in);
        // Bilgisayarın klavye girişini (System.in) kullanmaya başlar. Bu da sistemde açık bir kaynak (resource) demektir. Tıpkı: açılmış bir dosya, açılmış bir internet bağlantısı  gibi düşün.

        Integer totalPoints = 0;
        Integer totalCredits = 0;
        boolean moreClasses = false;

        do {
            Integer credits = 0;
            boolean validCreadits = true;
            do {
                validCreadits = true;
                System.out.println("Enter number of credits: ");
                String creditsString = scanner.nextLine();

                try {
                    credits = Integer.parseInt(creditsString);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid number");
                    validCreadits = false;
                }
            }
            while (!validCreadits);

            boolean validGrade = true;
            Integer gradeValue = 0;
            String grades = "";

            do {
                validGrade = true;
                System.out.println("Enter grade: ");
                grades = scanner.nextLine();

                if (grades.equalsIgnoreCase("A")) {
                    gradeValue = 4;
                } else if (grades.equalsIgnoreCase("B")) {
                    gradeValue = 3;
                } else if (grades.equalsIgnoreCase("C")) {
                    gradeValue = 2;
                } else if (grades.equalsIgnoreCase("D")) {
                    gradeValue = 1;
                } else if (grades.equalsIgnoreCase("F")) {
                    gradeValue = 0;
                } else {
                    System.out.println("You did not enter a valid grade :(");
                    validGrade = false;
                }
            } while (!validGrade);

            Integer points = gradeValue * credits;
            totalPoints += points;
            totalCredits += credits;

            System.out.println("Would you like to enter another class? (Y/N)");
            String moreClassesString = scanner.nextLine();

            moreClasses = moreClassesString.equalsIgnoreCase("Y");


        } while (moreClasses);

        DecimalFormat df = new DecimalFormat("0.00");
        Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);

        System.out.println("Credits: " + totalCredits);
        System.out.println("Points: " + totalPoints);
        System.out.println("GPA: " + df.format(gpa));

        scanner.close();
        // Java’da açılan her kaynak iş bitince kapatılmalıdır. Aksi halde: Bellek gereksiz yere dolabilir, Program yavaşlayabilir, Büyük projelerde ciddi hatalara yol açabilir

    }
}
