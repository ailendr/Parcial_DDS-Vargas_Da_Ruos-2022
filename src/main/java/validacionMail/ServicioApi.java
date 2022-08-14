package validacionMail;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import validacionMail.entities.Mail;

import java.io.IOException;

public class ServicioApi {
  private static ServicioApi instancia = null;
  private static final String urlApi = "https://api.eva.pingutil.com";
  private Retrofit retrofit;

  private ServicioApi() {
    this.retrofit = new Retrofit.Builder()
        .baseUrl(urlApi)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
  }

  public static ServicioApi instancia(){
    if(instancia== null){
      instancia = new ServicioApi();
    }
    return instancia;
  }

  public Mail propiedadesMail( String direccionMail) throws IOException{
    ApiMail apiMail = this.retrofit.create(ApiMail.class);
    Call<Mail> requestMailValido = apiMail.email(direccionMail);
    Response<Mail> responseMailValido = requestMailValido.execute();
    return responseMailValido.body();

  }
}
