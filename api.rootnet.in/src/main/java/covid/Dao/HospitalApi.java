package covid.Dao;

import covid.hospitalsdto.FeedHospital;
import retrofit2.Call;
import retrofit2.http.GET;

public interface HospitalApi {
	@GET("covid19-in/hospitals/beds")
	Call<FeedHospital> getHospitals();
}

