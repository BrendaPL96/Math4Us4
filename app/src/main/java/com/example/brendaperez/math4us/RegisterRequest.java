package com.example.brendaperez.math4us;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tonyvazgar on 12/11/17.
 */

public class RegisterRequest extends StringRequest {

    //public static final String REGISTER_REQUEST_URL = "http://192.168.1.85/Register.php";
    public static final String REGISTER_REQUEST_URL = "http://10.49.164.193/Register.php";
    private Map<String,String> params;

    public RegisterRequest(String username, String name, String password, Response.Listener<String> listener){

        super(Method.POST, REGISTER_REQUEST_URL, listener,null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("name", name);
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
