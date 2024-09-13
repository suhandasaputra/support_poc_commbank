
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SendMessage {
    public static String sendMessage (HashMap req){


        String reqMsg = JsonProcess.generateJson(req);
        System.out.println("ini req : " + reqMsg);
        String respMsg = new SendHttpProcess().sendHttpRequest("http://103.41.204.105:8080/" + "MIFAST/API", reqMsg);


        return respMsg;
    }
    
    public static String sendMessage2 (HashMap req){


        String reqMsg = JsonProcess.generateJson(req);
        System.out.println("ini req : " + reqMsg);
        String respMsg = new SendHttpProcess().sendHttpRequest("http://103.41.204.105:8080/" + "MIFAST2/API", reqMsg);


        return respMsg;
    }
    
}
