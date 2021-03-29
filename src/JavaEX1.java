public class JavaEX1{

    public static void mean(){

        int x=20;

        for (int i = 1; i < x; i++) {
            if (i==3){
                System.out.println("ka");
            }
            else if (i==5){
                System.out.println(" ching!");
            }else if (i==9){
                System.out.println("ka");
            }else if( i==10){
                System.out.println("ching!");
            }else if (i==12){
                System.out.println("ka");
            }else if(i==15){
                System.out.println("ka-ching!");
            }else if(i==18){
                System.out.println("ka");
            }else {
                System.out.println(i);}
        }
    }

    public static void main(String[] args) {
        mean();
    }
}
