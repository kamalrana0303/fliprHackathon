package covid.contactsdto;

import java.util.List;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contacts {

	
	@SerializedName("regional")
	@Expose
	private List<Regional> regional = null;

	
	

	public List<Regional> getRegional() {
		return regional;
	}

	public void setRegional(List<Regional> regional) {
		this.regional = regional;
	}

}
