package com.example.brendaperez.math4us;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tonyvazgar on 19/11/17.
 */

public class LoginRequest extends StringRequest{

    public static final String LOGIN_REQUEST_URL = "http://xtechmx.tk/math4us/Login3.php";

    private Map<String,String> params;

    public LoginRequest(String username, String password, Response.Listener<String> listener){

        super(Method.POST, LOGIN_REQUEST_URL, listener,null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
