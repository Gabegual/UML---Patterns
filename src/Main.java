
public class Main {

	public static void main(String[] args) {
		
		CoffeeMachineInterface coffeeMachine = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
		
		coffeeMachine.chooseFirstSelection();
		coffeeMachine.chooseSecondSelection();

	}

}
