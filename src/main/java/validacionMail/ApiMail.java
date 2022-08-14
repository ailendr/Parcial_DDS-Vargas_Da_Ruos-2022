package validacionMail;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import validacionMail.entities.Mail;

public interface ApiMail {
    @GET("email")
    Call<Mail> email(@Query("email") String direccionMail );

}
