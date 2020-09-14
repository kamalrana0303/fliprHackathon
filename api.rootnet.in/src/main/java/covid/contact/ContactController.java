package covid.contact;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import covid.Dao.ContactsApi;
import covid.Dao.HospitalApi;
import covid.Dao.MedicalApi;
import covid.Dao.NotificationApi;
import covid.contactsdto.Contacts;
import covid.contactsdto.Feed;
import covid.contactsdto.Regional;
import covid.hospitalsdto.FeedHospital;
import covid.medicaldto.Data;
import covid.medicaldto.FeedMedical;
import covid.medicaldto.MedicalCollege;
import covid.notificationdto.FeedNotification;
import covid.notificationdto.Notification;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

@Controller
@RequestMapping("/Covid-19-in")
public class ContactController {
	
	@RequestMapping("/contacts")
	public String requestContact(Model model) throws Exception {
		Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.rootnet.in").addConverterFactory(GsonConverterFactory.create()).build();
		ContactsApi regional=retrofit.create(ContactsApi.class);
		Call<Feed> allRegions = regional.getAllRegions();
		Response<Feed> execute = allRegions.execute();
		Feed body = execute.body();
		covid.contactsdto.Data data = body.getData();
		Contacts contacts2 = data.getContacts();
		List<Regional> regional2 = contacts2.getRegional();
		model.addAttribute("allRegions",regional2);
		return "contacts";
	}
	
	
	@RequestMapping("/notifications")
	public String requestNotification(Model model) throws Exception {
		Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.rootnet.in").addConverterFactory(GsonConverterFactory.create()).build();
		NotificationApi create = retrofit.create(NotificationApi.class);
		Call<FeedNotification> notifications = create.getNotifications();
		Response<FeedNotification> execute = notifications.execute();
		FeedNotification body=execute.body();
		covid.notificationdto.Data data = body.getData();
		List<Notification> notifications2 = data.getNotifications();
		model.addAttribute("allNotifications", notifications2);
		
		
		return "notification";
	}
	
	
	@RequestMapping("/hospitals/beds")
	public String hospitalSummary(Model model) throws Exception {
		OkHttpClient client = new OkHttpClient.Builder()
	            .connectTimeout(100, TimeUnit.SECONDS)
	            .readTimeout(100,TimeUnit.SECONDS).build();
		Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.rootnet.in").client(client).addConverterFactory(GsonConverterFactory.create()).build();
		HospitalApi create = retrofit.create(HospitalApi.class);
		Call<FeedHospital> hospitals = create.getHospitals();
		Response<FeedHospital> execute = hospitals.execute();
		FeedHospital body = execute.body();
		covid.hospitalsdto.Data data = body.getData();
		List<covid.hospitalsdto.Regional> regional = data.getRegional();
		model.addAttribute("allRegionals",regional);
		return "hospitals";
	}
	

	@RequestMapping("/hospitals/medical-colleges")
	public String medicalColleges(Model model) throws Exception {
		OkHttpClient client = new OkHttpClient.Builder()
	            .connectTimeout(100, TimeUnit.SECONDS)
	            .readTimeout(100,TimeUnit.SECONDS).build();
		Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.rootnet.in").client(client).addConverterFactory(GsonConverterFactory.create()).build();
		MedicalApi create = retrofit.create(MedicalApi.class);
		Call<FeedMedical> medical = create.getMedical();
		Response<FeedMedical> execute = medical.execute();
		FeedMedical body = execute.body();
		Data data = body.getData();
		List<MedicalCollege> medicalColleges = data.getMedicalColleges();
		model.addAttribute("colleges", medicalColleges);
		return "medical";
	}
}
