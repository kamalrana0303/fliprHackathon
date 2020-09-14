package covid.medicaldto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MedicalCollege {

	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("ownership")
	@Expose
	private String ownership;
	@SerializedName("admissionCapacity")
	@Expose
	private Integer admissionCapacity;
	@SerializedName("hospitalBeds")
	@Expose
	private Integer hospitalBeds;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwnership() {
		return ownership;
	}

	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	public Integer getAdmissionCapacity() {
		return admissionCapacity;
	}

	public void setAdmissionCapacity(Integer admissionCapacity) {
		this.admissionCapacity = admissionCapacity;
	}

	public Integer getHospitalBeds() {
		return hospitalBeds;
	}

	public void setHospitalBeds(Integer hospitalBeds) {
		this.hospitalBeds = hospitalBeds;
	}

}
