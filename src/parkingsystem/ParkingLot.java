package parking_system;

public class ParkingLot {
	private int totalNumbarofSlots;
	private Slot[] slotsInLot;
	
	public ParkingLot(int totalNumbarofSlots) {
		this.totalNumbarofSlots = totalNumbarofSlots;
		slotsInLot=new Slot[totalNumbarofSlots];
		
	}

	public Token parkACar(Car car) {
		if(isThereAFreeSlot()) {
			Slot availableSlot = getTheNextFreeSlot();
		}
	}
	
	private Slot getTheNextFreeSlot() {
		for(Slot slot:slotsInLot) {
			if (slot.isItFree()) {
				return slot;
				
			}
		}
		return null;
	}
	
	private boolean isThereAFreeSlot() {
		boolean isThereAFreeSlot=false;
		for(Slot slot:slotsInLot) {
			if (slot.isItFree()) {
				isThereAFreeSlot=true;
				break;
			}
		}
		return isThereAFreeSlot;
	}
}
