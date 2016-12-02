public class dec02obj
{
	public static void main(String argv[])
	{
		testObject();
	}
	static void testObject()
	{
		System.out.println("=============object test=============");
		StringBuffer obj;//java에서 제공하는 객체
		obj = new StringBuffer("Hey, Java"); //객체의 디폴트값 설정
		System.out.println(obj);
		obj.deleteCharAt(1);
		System.out.println(obj);
		obj.deleteCharAt(1);
		System.out.println(obj);
		obj.insert(1, 'i');
		System.out.println(obj);
		System.out.println("=====================================");
	}
}
