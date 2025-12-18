import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();
        if(mark >=90 && mark <=100) {
            System.out.println("Grade: O");
        }
        if(mark >=80 && mark <=90) {
            System.out.println("Grade: E");
        }
        if(mark >=70 && mark <=80) {
            System.out.println("Grade: A");
        }
        if(mark >=60 && mark <=70) {
            System.out.println("Grade: B");
        }
        if(mark >=50 && mark <=60) {
            System.out.println("Grade: C");
        }
        if(mark >=40 && mark <=50) {
            System.out.println("Grade: D");
        }
        if(mark >=30 && mark <=40) {
            System.out.println("Grade: F");
        }


    }
}
