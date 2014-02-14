//musical chairs
public class mcqueue {

	public static void main(String[] args) 
	{
		int start = 10;
		Queue musicalChairs = new Queue(start);
		
		System.out.println("Musical Chairs!");
		
		for(int i = start; i>0; i--)
		{
			musicalChairs.insert(i);
		}
		
		musicalChairs.show();
		System.out.println("");
		
		for(int j = start; j>0; j--)
		{
			musicalChairs.fix(musicalChairs.tick());
			musicalChairs.show();
			System.out.println("");
			if(musicalChairs.size() == 1)
			{
				System.out.print("The winner is player number: ");
				musicalChairs.show();
			}
		}
		
		
	}

}
