import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("Enter number");
        boolean flag = true;
        int trueNumber;
        Scanner sc = new Scanner(System.in);
        while(flag) {
            try {
                String num = sc.nextLine();
                if (num.matches("\\d+")) {
                    flag = false;
                    //trueNumber = -5;
                    trueNumber = Integer.parseInt(num);
                    System.out.println("Task 2");
                    try{
                        if(trueNumber>=0){
                            System.out.println(trueNumber*trueNumber);
                        }else {
                            throw new Exception();
                        }
                    }catch (Exception e){
                        System.out.println("Number short of zero");
                    }
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Enter number");
            }
        }
    }
}