package covid.hospitalsdto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

@SerializedName("url")
@Expose
private String url;
@SerializedName("lastUpdated")
@Expose
private String lastUpdated;

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getLastUpdated() {
return lastUpdated;
}

public void setLastUpdated(String lastUpdated) {
this.lastUpdated = lastUpdated;
}

}