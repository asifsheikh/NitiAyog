package com.fantastic4.nitiaayog.nitiayog.Parsers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Belal on 9/22/2015.
 */
public class NGOParser {
    public  static String[] ngos;

    public static final String JSON_ARRAY = "NGO";
    public static final String KEY_NAME = "name";
    public static final String KEY_STATE = "state";
    public static final String KEY_SECTOR = "sector";
    public static final String KEY_ADDRESS = "address";
    public static final String KEY_CONTACT = "contact";
    public static final String KEY_REVIEW1 = "review1";
    public static final String KEY_REVIEW2 = "review2";
    private JSONArray users = null;

    private String json;

    public NGOParser(String json){
        this.json = json;
    }

    protected void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ngos = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ngos[i] = jo.getString(KEY_NAME);
                ngos[i] = jo.getString(KEY_STATE);
                ngos[i] = jo.getString(KEY_SECTOR);
                ngos[i] = jo.getString(KEY_ADDRESS);
                ngos[i] = jo.getString(KEY_CONTACT);
                ngos[i] = jo.getString(KEY_REVIEW1);
                ngos[i] = jo.getString(KEY_REVIEW2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
