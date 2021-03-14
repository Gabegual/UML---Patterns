import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CoffeeTest{
	
		CoffeeTouchscreenAdapter CTA = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
		
	@Test
	public void Coffee() {
		CTA.chooseFirstSelection();
		assertEquals("Select A to coffee", CoffeeTest.out.toString());
	}
	
		public void Coffee2() {
		CTA.chooseSecondSelection();
		assertEquals("Select B to coffee", CoffeeTest.out.toString());
	}

}
