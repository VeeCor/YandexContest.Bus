import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean IsDone = false;
        while(!IsDone) {
            Scanner scanner = new Scanner(System.in);
            int TicketNumber = scanner.nextInt();
            if (TicketNumber >= 100000 && TicketNumber <= 999999) {
                do{
                    int Num1 = TicketNumber / 1000;
                    int Sum1 = 0;
                    while(Num1 > 0){
                        Sum1 += Num1 % 10;
                        Num1 = Num1 / 10;
                    }
                    int Num2 = TicketNumber % 1000;
                    int Sum2 = 0;
                    while(Num2 > 0){
                        Sum2 += Num2 % 10;
                        Num2 = Num2 / 10;
                    }
                    if (Sum1 == Sum2){
                        System.out.println(TicketNumber);
                        IsDone = true;
                        break;
                    }else {
                        TicketNumber++;
                    }
                }while (TicketNumber <= 999999);
            }
        }
    }
}
