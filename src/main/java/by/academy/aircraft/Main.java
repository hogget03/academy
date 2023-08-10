package by.academy.aircraft;

public class Main {
	public static void main(String[] args) {
		Aircraft aircraftAirbusA320a = new AircraftAirbusA320();
		Aircraft aircraftAirbusA320b = new AircraftAirbusA320();
		Aircraft aircraftDouglas = new AircraftDouglasMD11F();
		Aircraft aircraftCessna = new AircraftCessna172();
		Aircraft aircraftBoeing = new AircraftBoeing737();

		Airline BelarusAirline = new Airline("Belarus Airlines");
		BelarusAirline.addAircraft(aircraftAirbusA320a);
		BelarusAirline.addAircraft(aircraftAirbusA320b);
		BelarusAirline.addAircraft(aircraftDouglas);
		BelarusAirline.addAircraft(aircraftCessna);
		BelarusAirline.addAircraft(aircraftBoeing);

		BelarusAirline.showAirlineAircrafts();

		System.out.println("Aircrafts sorted by flight range:");
		BelarusAirline.sortPlanesByFlightRange();
		BelarusAirline.showAirlineAircrafts();
		System.out.println();

		BelarusAirline.filterAircraftsByFuelConsumption(2000, 3000, true);
		System.out.println();

		BelarusAirline.calculateTotalCargoPassengerCapacity();
	}
}
