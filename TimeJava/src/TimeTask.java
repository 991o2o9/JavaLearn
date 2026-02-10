import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTask {
    public static void main(String[] args) {
        System.out.println("");
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds to countdown from: ");
        int userCount = scanner.nextInt();

        TimerTask task = new TimerTask() {
            int counter = userCount;
            @Override
            public void run() {
                System.out.println(counter);
                counter--;
                if(counter<0){
                    System.out.println("WAKE UP!!!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }
}