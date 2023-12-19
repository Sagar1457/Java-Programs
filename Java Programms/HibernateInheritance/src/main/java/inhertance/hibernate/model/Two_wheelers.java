package inhertance.hibernate.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Bike")

public class Two_wheelers extends Vehicles
{
	@Column(name="steering_handle")
	private String steeringHandle;

	public Two_wheelers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Two_wheelers(String steeringHandle) {
		super();
		this.steeringHandle = steeringHandle;
	}

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

}
