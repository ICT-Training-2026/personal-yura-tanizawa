package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator cal = new Calculator();
	@Test
	public void testTaxPrice() {
		//テスト値
		int excepted = 110;
		int actual = cal.taxPrice(100);
		assertEquals(excepted, actual);
	}
	
	@Test
	public void testTaxPriceException() {
		assertThrows(IllegalArgumentException.class, () -> cal.taxPrice(-100));
		//メッセージの確認
		//IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> cal.taxPrice(-100));
		//assertEquals("価格は0円以上にしてください", e.getMessage());
	}


}
