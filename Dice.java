import java.util.Random;

public class Dice {
	int faces;
	String output;
	
			
	Dice(int faces){
		this.faces = faces;
		
	}
	
	public void roll() {
		Random random = new Random();
		int result = random.nextInt(faces) + 1;
		output = result(result);
	}
	
	public String send()
	{
		if(faces==2||faces==4||faces==6)
			return output;
		else
			return ("Dice Not Possible");
	}
	public String result(int n)
	{
		if(faces==2)
		{
			switch (n) 
			{
			case 1:
				return "heads";
			case 2:
				return "tails";	
			}	
		}
		else
		{
			switch (n) 
			{
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			}	
		}
		return null;
	}
	
	public static void main(String[] args) 
	{  
		Dice dice=new Dice(2);
		dice.roll();
		System.out.println(dice.send());
	}

}
