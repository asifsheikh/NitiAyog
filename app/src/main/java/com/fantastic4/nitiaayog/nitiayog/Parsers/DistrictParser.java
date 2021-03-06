package com.fantastic4.nitiaayog.nitiayog.Parsers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Belal on 9/22/2015.
 */
public class DistrictParser{
    public  static String[] district;

    public static final String JSON_ARRAY = "district";
    public static final String KEY_ID = "id";


    private JSONArray users = null;

    private String json;

    public DistrictParser(String json){
        this.json = json;
    }

    protected void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            district = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                district[i] = jo.getString(KEY_ID);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
