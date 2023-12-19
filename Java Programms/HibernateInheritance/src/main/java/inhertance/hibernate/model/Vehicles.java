package inhertance.hibernate.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="VEHICLE_TYPE",discriminatorType=DiscriminatorType.STRING)
public class Vehicles 
{
	@Id
	@GeneratedValue//(strategy=GenerationType.IDENTITY)
	@Column(name="vehicle_id")
    private int vehicleId;
	
	@Column(name="vehicle_name")
    private String vehicleName;
	

	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicles(int vehicleId, String vehicleName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
