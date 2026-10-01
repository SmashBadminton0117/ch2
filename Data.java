public class Data {

	public static void main(String[] args) {
        
        //declarations
        String day = "Monday";
        String month = "September";
        int date = 14;
        int year = 2026;
        
        //method - American
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month + " ");
        System.out.print(date + ", ");
        System.out.println(year);
        
        //method - European
        System.out.print(day + " ");
        System.out.print(date + " ");
        System.out.print(month + " ");
        System.out.print(year);
        
    }
}
