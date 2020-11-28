// design a class "Vehicle" with a method "getWheels()" which returns the no of wheels
// possessed by a Vehicle.
// design an interface "Colourable" with 2 methods "setColour(String col)" and "getColour()"
// to assign and retrieve the colour of a vehicle.
// design a class "Car" which inherits "Vehicle" & implements "Colourable"
// In main(), create an object of this class "Car" & display it's details.
abstract class Vehicle
{
	abstract int getWheels();
}

interface Colourable
{
	void setColour(String col);
	String getColour();
}

class Car extends Vehicle implements Colourable
{
	private String colour;
	int getWheels()
	{
		return 4;
	}

	public void setColour(String col)
	{
		colour = col;
	}

	public String getColour()
	{
		return colour;
	}
}

class Prog60
{
	public static void main(String args[ ])
	{
		Car santro = new Car();
		santro.setColour("Blue");
		System.out.println("No of wheels of my car santro are " + santro.getWheels());
		System.out.print("Colour of my car santro is " + santro.getColour());
	}
}
