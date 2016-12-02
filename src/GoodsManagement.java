public class GoodsManagement
{
	String goodsCode; //상품코드
	int stockNum; //재고수량
	void addStock(int amount) //재고 추가함수
	{
		stockNum += amount;
	}
	int subtractStock(int amount) //재고 제거함수
	{
		if(stockNum < amount)
		{
			return 0; //예외처리
		}
		stockNum -= amount;
		return amount;
	}
}
