public class ClassEx
{
	public static void main(String argv[]) //다른 클래스를 이용하여 재고를 관리하는 프로그램
	{
		GoodsManagement GoodsT = new GoodsManagement(); //일반 객체 선언
		GoodsManagement[] GoodsM = new GoodsManagement[2]; //배열 객체 선언
		for(int i=0;i<2;i++)
		{
			GoodsM[i] = new GoodsManagement();
		}
		GoodsT.goodsCode = "76544"; //재고 코드
		GoodsT.stockNum = 1000; //재고 수량
		
		GoodsM[0].goodsCode = "52135";//재고 코드
		GoodsM[0].stockNum = 200;//재고 수
		GoodsM[1].goodsCode = "13245";//재고 코드
		GoodsM[1].stockNum = 100;//재고 수

		System.out.println("현재 상품 코드 : "+GoodsT.goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsT.stockNum);

		System.out.println("현재 상품 코드 : "+GoodsM[0].goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsM[0].stockNum);
		System.out.println("현재 상품 코드 : "+GoodsM[1].goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsM[1].stockNum);
		
		GoodsT.addStock(300);//재고 추가
		System.out.println("현재 상품 코드 : "+GoodsT.goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsT.stockNum);
		GoodsT.subtractStock(700);//재고 삭제
		System.out.println("현재 상품 코드 : "+GoodsT.goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsT.stockNum);
		
		GoodsM[0].addStock(500);//재고 추가
		System.out.println("현재 상품 코드 : "+GoodsM[0].goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsM[0].stockNum);
		GoodsM[0].subtractStock(300);//재고 삭제
		System.out.println("현재 상품 코드 : "+GoodsM[0].goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsM[0].stockNum);

		GoodsM[1].addStock(300);//재고 추가
		System.out.println("현재 상품 코드 : "+GoodsM[1].goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsM[1].stockNum);
		GoodsM[1].subtractStock(50);//재고 삭제
		System.out.println("현재 상품 코드 : "+GoodsM[1].goodsCode);
		System.out.println("현재 재고 수량 : "+GoodsM[1].stockNum);
	}
}