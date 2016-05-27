import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by liukaixin on 16/5/19.
 */
public class JSONDecoder {

    public static String[] decodeArrayFrom(String jsonFromFile) {
        JSONArray jsonArray = new JSONArray(jsonFromFile);
        String strings[] = new String[jsonArray.length()];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = jsonArray.get(i).toString();
        }
        return strings;
    }

    public static String decodeStringWithName(String json, String barcode) {
        return new JSONObject(json).getString(barcode);
    }

    public static double decodeDoubleWithName(String json, String price) {
        return new JSONObject(json).getDouble(price);
    }
}
