import java.util.Scanner;

class JavaEX1{

    public static void mean(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number to start with");

        int x = scanner.nextInt();
        System.out.println("enter a number to stop at");
        int y=scanner.nextInt();
        for (int i =x; i <= y; i++) {
            if (i % 15 == 0) {
                System.out.println("ka-ching!");

            } else if (i % 5 == 0) {
                System.out.println(" ching!");

            } else if (i % 3 == 0) {
                System.out.println("ka");
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        mean();
    }
}

