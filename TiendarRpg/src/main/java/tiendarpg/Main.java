
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendarpg;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import tiendarpg.ProgramaInicio;
/**
 *
 * @author Eduardo
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws com.mashape.unirest.http.exceptions.UnirestException
     */
    public static void main(String[] args) throws IOException, UnirestException {
        // TODO code application logic here
        var i = new ProgramaInicio();
        i.ProgramaInicio2();
    }
    
}
