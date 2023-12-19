package inhertance.hibernate.model;


import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Car")


public class Four_wheeler extends Vehicles
{
	@Column(name="steering_wheel")
	private String steeringWheel;

	public Four_wheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Four_wheeler(String steeringWheel) {
		super();
		this.steeringWheel = steeringWheel;
	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

}
