package covid.hospitalsdto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Regional {

	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("ruralHospitals")
	@Expose
	private Integer ruralHospitals;
	@SerializedName("ruralBeds")
	@Expose
	private Integer ruralBeds;
	@SerializedName("urbanHospitals")
	@Expose
	private Integer urbanHospitals;
	@SerializedName("urbanBeds")
	@Expose
	private Integer urbanBeds;
	@SerializedName("totalHospitals")
	@Expose
	private Integer totalHospitals;
	@SerializedName("totalBeds")
	@Expose
	private Integer totalBeds;
	@SerializedName("asOn")
	@Expose
	private String asOn;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getRuralHospitals() {
		return ruralHospitals;
	}

	public void setRuralHospitals(Integer ruralHospitals) {
		this.ruralHospitals = ruralHospitals;
	}

	public Integer getRuralBeds() {
		return ruralBeds;
	}

	public void setRuralBeds(Integer ruralBeds) {
		this.ruralBeds = ruralBeds;
	}

	public Integer getUrbanHospitals() {
		return urbanHospitals;
	}

	public void setUrbanHospitals(Integer urbanHospitals) {
		this.urbanHospitals = urbanHospitals;
	}

	public Integer getUrbanBeds() {
		return urbanBeds;
	}

	public void setUrbanBeds(Integer urbanBeds) {
		this.urbanBeds = urbanBeds;
	}

	public Integer getTotalHospitals() {
		return totalHospitals;
	}

	public void setTotalHospitals(Integer totalHospitals) {
		this.totalHospitals = totalHospitals;
	}

	public Integer getTotalBeds() {
		return totalBeds;
	}

	public void setTotalBeds(Integer totalBeds) {
		this.totalBeds = totalBeds;
	}

	public String getAsOn() {
		return asOn;
	}

	public void setAsOn(String asOn) {
		this.asOn = asOn;
	}

}
