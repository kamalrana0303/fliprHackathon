package covid.Dao;

import covid.notificationdto.FeedNotification;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NotificationApi {
	@GET("/covid19-in/notifications")
	Call<FeedNotification> getNotifications();
}
