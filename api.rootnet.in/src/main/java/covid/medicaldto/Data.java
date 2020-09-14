package covid.medicaldto;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

@SerializedName("medicalColleges")
@Expose
private List<MedicalCollege> medicalColleges = null;
@SerializedName("sources")
@Expose
private List<String> sources = null;

public List<MedicalCollege> getMedicalColleges() {
return medicalColleges;
}

public void setMedicalColleges(List<MedicalCollege> medicalColleges) {
this.medicalColleges = medicalColleges;
}

public List<String> getSources() {
return sources;
}

public void setSources(List<String> sources) {
this.sources = sources;
}

}