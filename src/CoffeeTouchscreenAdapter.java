
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	public OldCoffeeMachine  OldVendingMachine;


	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
		this.OldVendingMachine = oldCoffeeMachine;
	}

	public void chooseFirstSelection() {
		OldVendingMachine.selectA();
	}
	
	public void chooseSecondSelection() {
		OldVendingMachine.selectB();
	}
}
