public class dec02if
{
	public static void main(String args[])
	{
	//배열에 숫자를 입력하고 높은 순으로 정렬하는 프로그램
	//for, while, if 사용
		int cmd;
		int count = 0;
		
		int arr[] = {30,10,40,75,31,50,90};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array["+i+"] = "+arr[i]); // i는 변수, +는 앞뒤로 출력을 가능하게 함.
		}
		while(count!=arr.length)
		{
			for(int j=0; j<(arr.length-1);j++)
			{
				System.out.println(j);
				if(arr[j]<arr[j+1])
				{
					cmd = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = cmd;
				}
			}
			count++;
		}
		System.out.println("");
		for(int k=0; k<arr.length; k++)
		{
			System.out.println("Array["+k+"] = " +arr[k]);
		}
	}
}
