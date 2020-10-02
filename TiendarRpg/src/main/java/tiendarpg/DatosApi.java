package tiendarpg;
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
        System.out.println("Inicio");
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=iphone")
                .get()
                .addHeader("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "a13b816d4emsh84bfab1266639d2p1c20ecjsn1a9bbd616d49")
                .build();

        Response response = client.newCall(request).execute(); // el request
        
        String json1 = '['+response.body().string()+']';       // le agregamos corchetes
        JSONArray json2 = new JSONArray(json1);                // convertimos en array
        JSONObject objeto3 = json2.getJSONObject(0);           // ahora un objeto json
        JSONArray precio = objeto3.getJSONArray("products");                  //buscamos el array de productos
        
        for(int i = 0; i <= 19; i++)
{
        JSONObject precio2 = (JSONObject) precio.get(i);
        JSONObject precio3 = (JSONObject) precio2.get("price");                  //buscamos  price
        var precio4 =  precio3.get("current_price");                  //buscamos current_price
     
        System.out.println("objeto N° "+i+"  precio: "+ precio4 +"\n");      // imprimimos
        
        JSONObject reviews = (JSONObject) precio2.get("reviews");                  //buscamos reviews
        int reviewsNum = (int) reviews.get("total_reviews");                  //buscamos current_price
        
        System.out.println("reviews: "+ reviewsNum +"\n");      // imprimimos
        
       
       this.listPrecio[i]= ((reviewsNum*2)/5)+105;
       this.listReviews[i]= (reviewsNum/2)+13;
       }
    }
}

     
