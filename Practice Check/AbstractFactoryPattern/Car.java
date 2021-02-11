enum CarType {
	MICRO, MINI, LUXURY
}

enum Location {
	DEFAULT, USA, INDIA
}

abstract class Car {
	abstract void construct();

	Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}

	CarType model = null;
	Location location = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}
}
