public class Time {

	public static void main(String[] args) {
        
        //declarations
        int hour = 12;
        int minute = 26;
        int second = 07;
        int currentHour = 12;
        int currentMinute = 52;
        int currentSecond = 54;
        int secondsInADay = 86400;
        
        //seconds passed
        int secondsPassed = hour * 60 * 60 + minute * 60 + second;
        
        //percentage
        double percentage = (secondsPassed / (double) secondsInADay);
        
        //methods
        //seconds from midnight
        System.out.print("Number of seconds since midnight: ");
        System.out.println(secondsPassed);
        
        //seconds remaining
        System.out.print("Number of seconds remaining: ");
        System.out.println(secondsInADay - secondsPassed);
        
        //percentage passed
        System.out.print("Percent of the day that has passed: ");
        System.out.println(percentage * 100 + "%" + "\n\n");
        
        //timer
        System.out.print("It has been: ");
        System.out.print(currentHour - hour + ":");
        System.out.print((currentMinute - minute) + ":");
        System.out.print((currentSecond - second));
        System.out.println(" working on this assignment.");
    }
}
