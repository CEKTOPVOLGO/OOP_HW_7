import java.util.Scanner;

public  class InputNumber{
    InputNumber(){

    }
    public  int input(String string) {
        Scanner in = new Scanner(System.in);
        System.out.print(string + " = ");
        int number = in.nextInt();
        //in.close();
        return number;
    }

}
