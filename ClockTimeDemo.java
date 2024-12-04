//Written by Mikhelyn Bowie 11/12/2024
import java.util.Scanner;//importing java scanner
public class ClockTimeDemo {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);//scanner key
		
		boolean again = true;
		
		System.out.println("Convert military time into 12-hour clock time!!!");//initial message
		
		while(again)//boolean true
		{
			try//try-catch
			{				
				System.out.print("Enter the hours on the military clock: ");				
				int hours = key.nextInt();				
				System.out.print("Enter the minutes on the military clock: ");				
				int minutes = key.nextInt();				
				System.out.print("Enter the seconds on the military clock: ");		//time 1 method		
				int seconds = key.nextInt();								
				TimeConverter time1 = new TimeConverter();				
				time1.updateTime(hours, minutes, seconds);
				System.out.print("12-hour clock time -> ");				
				time1.displayTime();
				
				
				
				key.nextLine();					
				System.out.print("Enter 24 hour clock time in the format \"hours:minutes:seconds\": ");				
				String timeStr = key.nextLine();				
				TimeConverter time2 = new TimeConverter();				//time 2 method
				time2.updateTime(timeStr);				
				System.out.print("12-hour clock time -> ");				
				time2.displayTime();
				
				
				System.out.print("Would you like to do this again ? Enter \"Yes\" or \"No\": ");			
				String r = key.nextLine();				//run again prompt
				again = r.equalsIgnoreCase("Yes");
				
			}
			catch(TimeException e)
			{
				System.out.println(e.getMessage());//invalid value prompt
			}
			
		}
		
		
		System.out.println("Exiting the program!");//program exit prompt
		
		System.exit(0);//exit
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
