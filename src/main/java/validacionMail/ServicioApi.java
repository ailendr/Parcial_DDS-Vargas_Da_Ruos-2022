package validacionMail;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
}
