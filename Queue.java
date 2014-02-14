
class Queue 
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
//------------------------------------------------------------------------------
	
	public Queue(int s) 
	{
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
//-----------------------------------------------------------------------------
	
	public void insert(int j) 
	{
		if(rear == maxSize-1)
			rear = -1;
		queArray[++rear] = j;
		nItems++;
	}
	
//-------------------------------------------------------------------------------
	
	public int size()
	{
		return nItems;
	}
	
//--------------------------------------------------------------------------------
	
	public void show()
	{
		for(int i = 0; i<maxSize; i++)
		{
			int temp = queArray[i];
			System.out.print(temp + " ");
		}
	}
	
//-----------------------------------------------------------------------------------
	
	public int tick()
	{
		return (int) (java.lang.Math.random() * nItems);
	}
	
//--------------------------------------------------------------------------------------
	
	public void fix(int x)
	{
		for(; x<maxSize-1; x++)
		{
			queArray[x] = queArray[x+1];
		}
		maxSize--;
		nItems--;
	}
}
