public class nov25ary
{
	public static void main(String args[])
	{
		int Array[];
		int Array2[] = {1,2,3,4,5};
		Array = new int[10]; //java의 배열 선언
		
		for(int i=0 ; i<Array.length;i++)
		{
			Array[i] = i*10;
			System.out.println(Array[i]);
		}
		System.out.print("배열 크기 확인 : ");
		System.out.println(Array2.length);
	}
}
