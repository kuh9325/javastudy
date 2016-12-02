public class nov25loop
{
	public static void main(String arfs[])
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int result=0;
		for(int i :arr)
		{
			System.out.println("i : "+i);
			result += i;
		}
		System.out.println("result : " + result);

	}
}
