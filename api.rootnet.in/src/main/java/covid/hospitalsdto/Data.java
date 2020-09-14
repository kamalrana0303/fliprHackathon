package covid.hospitalsdto;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

	@SerializedName("summary")
	@Expose
	private Summary summary;
	@SerializedName("sources")
	@Expose
	private List<Source> sources = null;
	@SerializedName("regional")
	@Expose
	private List<Regional> regional = null;

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public List<Source> getSources() {
		return sources;
	}

	public void setSources(List<Source> sources) {
		this.sources = sources;
	}

	public List<Regional> getRegional() {
		return regional;
	}

	public void setRegional(List<Regional> regional) {
		this.regional = regional;
	}

}