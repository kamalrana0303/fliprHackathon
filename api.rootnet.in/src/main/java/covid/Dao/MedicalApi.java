package covid.Dao;

import covid.medicaldto.FeedMedical;
import retrofit2.Call;
import retrofit2.http.GET;


public interface MedicalApi {
	@GET("/covid19-in/hospitals/medical-colleges")
	Call<FeedMedical> getMedical();
}
