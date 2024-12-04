//written by Mikhelyn Bowie 11/12/2024
public class TimeConverter {

	private int hours;
	
	private int seconds;//instance variables
	
	private int minutes;
	
	private boolean notPM;
	//default constructor
	public TimeConverter()
	{
		this.hours = 0;
		
		this.seconds = 0;
		
		this.minutes = 0;
		
		this.notPM = true;
	}
	//parameterized constructor
	public TimeConverter(int xHours, int xSeconds, int xMinutes) throws TimeException
	{
		updateTime(hours, minutes, seconds);
	}
	//Accessors
	public int getHours()
	{
		return this.hours;
	}
	public int getSeconds()
	{
		return this.seconds;
	}
	public int getMinutes()
	{
		return this.minutes;
	}
	public boolean getNotPM()
	{
		return this.notPM;
	}
	//creating mutators
	public void setHours(int xHours) throws TimeException
	{
		if(xHours < 0 || xHours >= 24) throw new TimeException();
			this.hours = xHours;
			
	}
	public void setMinutes(int xMinutes) throws TimeException
	{
		if(xMinutes < 0 || xMinutes >= 60) throw new TimeException();		
			this.minutes = xMinutes;
		
		
	}
	public void setSeconds(int xSeconds) throws TimeException
	{
		if(xSeconds >= 0 || xSeconds >= 60) throw new TimeException();		
			this.seconds = xSeconds;
		
	}
	public void setNotPM(boolean notPM)
	{
		this.notPM = notPM;
		
	}
	//first Update Time method
	public void updateTime(int hours, int minutes, int seconds)throws TimeException
	{
		if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60)
		{
			throw new TimeException();
		}
		
		this.hours = (hours % 12 == 0) ? 12 : hours % 12;
		
		this.minutes = minutes;
		
		this.seconds = seconds;
		
		this.notPM = hours < 12;
	}
	//second overloaded method
	public void updateTime(String timeString) throws TimeException
	{
		try
		{
			String[] parts = timeString.split(":");
			
				if(parts.length != 3) throw new TimeException("Invalid time format");
				
				int hours = Integer.parseInt(parts[0]);
				
				int minutes = Integer.parseInt(parts[1]);
				
				int seconds = Integer.parseInt(parts[2]);
				
				updateTime(hours, minutes, seconds);
		}
		catch(NumberFormatException e)
		{
			throw new TimeException("Invalid format entered");
		}
	}
	
	public void displayTime()
	{
		String AmPm = notPM ? "AM" : "PM";
		
		System.out.printf("%d:%02d:%02d %s%n", hours, minutes, seconds, AmPm);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
