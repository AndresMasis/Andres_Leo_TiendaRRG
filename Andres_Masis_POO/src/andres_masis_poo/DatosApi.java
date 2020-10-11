package andres_masis_poo;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class DatosApi {
        int[ ] listPrecio = new int[20];              //Definimos el areglo donde vamos a guardar el precio
        int[ ] listReviews = new int[20];                   // Definimos el arreglo donde vamos a guardar las reviews
        
 	public void DatosApi2 () throws IOException, UnirestException{               
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=iphone")
                .get()
                .addHeader("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "a208447badmsh19fe015da114730p18446fjsnf0e1559e6f4d")
                .build();

        Response response = client.newCall(request).execute(); // el request
        
        String json1 = '['+response.body().string()+']';       // le agregamos corchetes
        JSONArray json2 = new JSONArray(json1);                // convertimos en array
        JSONObject objeto3 = json2.getJSONObject(0);           // ahora un objeto json
        JSONArray precio = objeto3.getJSONArray("products");                  //buscamos el array de productos
        
        for(int i = 0; i <= 19; i++)
{
        JSONObject precio2 = (JSONObject) precio.get(i);
                      
        JSONObject reviews = (JSONObject) precio2.get("reviews");                  //buscamos reviews
        int reviewsNum = (int) reviews.get("total_reviews");                  //buscamos current_price
          
        while (reviewsNum > 100){        
            reviewsNum = reviewsNum/2;
        }
       
       this.listPrecio[i]= ((reviewsNum*2)/5)+15;
       this.listReviews[i]= (reviewsNum/2)+13;
       }
        
    }
}

     
