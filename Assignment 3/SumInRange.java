class FindSum
{
	public int sumInt(int a,int b)
	{
		int sum=0;
		for(int i=1;i<=b;i++)
			if((i%13==0 || i%15==0 || i%17==0) && i%30!=0)
				sum=sum+i;
		return sum;
	}
}


class SumInRange
{
	public static void main(String args[])
	{
		FindSum obj = new FindSum();

		System.out.println(obj.sumInt(1,30));
		System.out.println(obj.sumInt(10,15));
	}
}