package by.academy.aircraft;

public abstract class CommercialPassengerAircraft extends Aircraft {
	private final Integer seatingCapacity;
	private final Integer cargoCapacity;

	public CommercialPassengerAircraft(int seatingCapacity, int cargoCapacity, int flightRange, int fuelConsumption,
			String aircraftManufacturer, String aircraftModel) {
		super(flightRange, fuelConsumption, aircraftManufacturer, aircraftModel);
		this.seatingCapacity = seatingCapacity;
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	@Override
	public int getCargoCapacity() {
		return cargoCapacity;
	}
}
