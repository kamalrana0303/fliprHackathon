package covid.Dao;


import covid.contactsdto.Feed;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactsApi {
	@GET("/covid19-in/contacts")
	Call<Feed> getAllRegions();
}
