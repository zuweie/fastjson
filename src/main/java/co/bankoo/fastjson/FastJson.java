package co.bankoo.fastjson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zuweie on 10/7/16.
 */
public class FastJson {

    public static int getInt (JSONObject curr_level_jsonObject, String next_level_name) throws JSONException{
        Object[] retobj          = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);
        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getInt(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getInt(index);
        }

    }

    public static int getInt (JSONArray curr_level_jsonArray, String next_level_name) throws JSONException {
        Object[] retobj          = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);
        if (__get_last_json_context(curr_level_jsonArray, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getInt(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getInt(index);
        }
    }

    public static long getLong (JSONObject curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);
        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getLong(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getLong(index);
        }
    }


    public static long getLong (JSONArray curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);
        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getLong(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getLong(index);
        }
    }

    public static Double getDouble (JSONObject curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getDouble(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getDouble(index);
        }
    }

    public static Double getDouble (JSONArray curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getDouble(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getDouble(index);
        }
    }

    public static String getString (JSONObject curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getString(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getString(index);
        }
    }

    public static String getString (JSONArray curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getString(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getString(index);
        }
    }

    public static boolean getBoolean (JSONObject curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getBoolean(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getBoolean(index);
        }
    }

    public static boolean getBoolean (JSONArray curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getBoolean(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getBoolean(index);
        }
    }

    public static JSONObject getJSONObject (JSONObject curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getJSONObject(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getJSONObject(index);
        }
    }

    public static JSONObject getJSONObject (JSONArray curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators, 0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getJSONObject(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getJSONObject(index);
        }
    }

    public static JSONArray getJSONArray (JSONArray curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators,0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getJSONArray(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getJSONArray(index);
        }
    }

    public static JSONArray getJSONArray (JSONObject curr_level_jsonObject, String next_level_name) throws JSONException {
        Object[] retobj = new Object[RET_OBJSIZE];
        String[] next_indicators = __pre_process_indicators(next_level_name);

        if (__get_last_json_context(curr_level_jsonObject, next_indicators,0, retobj) == DICT){
            JSONObject jsonObject = (JSONObject) retobj[RET_CONTEXT];
            String     name       = (String) retobj[RET_INDICATOR];
            return jsonObject.getJSONArray(name);
        }else{
            JSONArray jsonArray = (JSONArray) retobj[RET_CONTEXT];
            int       index     = (Integer) retobj[RET_INDICATOR];
            return jsonArray.getJSONArray(index);
        }
    }

    //获取最后一个父子节点
    private static int __get_last_json_context (JSONObject curr_context, String[] indicators, int next_indicator_index, Object[] returnObj) throws JSONException {

        if (__has_more_indicators(indicators, next_indicator_index)){

            String next_level_1st_indicator  = __get_1st_indicator(indicators, next_indicator_index);

            if (__is_array_indicator(next_level_1st_indicator)) {

                // 下一个获取的应该是一个[]
                String array_name = __get_indicator_name(next_level_1st_indicator);
                JSONArray next_level_context = curr_context.getJSONArray(array_name);
                return __get_last_json_context (next_level_context, indicators, ++next_indicator_index, returnObj);

            }else if (__is_dict_indicator(next_level_1st_indicator)){
                // 下一个获取的应该是一个 {}
                String dict_name = __get_indicator_name(next_level_1st_indicator);
                JSONObject next_level_jsonobject = curr_context.getJSONObject(dict_name);
                return __get_last_json_context(next_level_jsonobject, indicators, ++next_indicator_index, returnObj);
            }else {
                throw new JSONException(next_level_1st_indicator+" <-- 这个不知道是个啥，请写清楚一点，否则不知道真么解释！");
            }
        }else{
            returnObj[RET_CONTEXT]   = curr_context;
            returnObj[RET_INDICATOR] = __get_indicator_name(indicators[next_indicator_index]);
            return DICT;
        }
    }


    private static int __get_last_json_context (JSONArray curr_context, String[] indicators, int next_indicator_index, Object[] returnObj) throws JSONException {

        if (__has_more_indicators(indicators, next_indicator_index)){

            String next_level_1st_indicator = __get_1st_indicator(indicators, next_indicator_index);

            if (__is_array_indicator(next_level_1st_indicator)){

                int       next_array_index     = Integer.valueOf(__get_indicator_name(next_level_1st_indicator));
                JSONArray next_level_context   = curr_context.getJSONArray(next_array_index);
                return __get_last_json_context (next_level_context, indicators, ++next_indicator_index, returnObj);

            }else if (__is_dict_indicator(next_level_1st_indicator)){
                int next_array_index          = Integer.valueOf(__get_indicator_name(next_level_1st_indicator));
                JSONObject next_level_context = curr_context.getJSONObject(next_array_index);
                return __get_last_json_context (next_level_context, indicators, ++next_indicator_index, returnObj);
            }else{
                throw new JSONException(next_level_1st_indicator+" <-- 这个不知道是个啥，请写清楚一点，否则不知道真么解释！");
            }
        }else{
            returnObj[RET_CONTEXT]   = curr_context;
            returnObj[RET_INDICATOR] = Integer.valueOf(__get_indicator_name(indicators[next_indicator_index]));
            return ARRAY;
        }
    }


    public static boolean __has_more_indicators (String[] indicators, int index) {
        return index < indicators.length-1;
    }

    public static String __get_1st_indicator (String[] indicators, int index) {
        return indicators[index];
    }

    public static boolean __is_array_indicator (String name) {
        String regex = "^\\S+\\[\\]$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(name).matches();
    }

    public static boolean __is_dict_indicator (String name) {
        String regex = "^\\S+\\{\\}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(name).matches();
    }

    public static String __get_indicator_name (String name) {

        if (__is_array_indicator(name)){
            String regex = "(\\S+)\\[\\]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }else if (__is_dict_indicator(name)){
            String regex = "(\\S+)\\{\\}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()){
                return matcher.group(1);
            }
        }
        return name;
    }

    public static String[] __pre_process_indicators (String indicators) {
        return __pre_process_indicators(indicators, "{}");
    }

    public static String[] __pre_process_indicators (String indicators, String default_indicator) {
        String[] ii = indicators.split("\\.");

        for (int i=0; i<ii.length-1; ++i) {
            if (!__is_dict_indicator(ii[i]) && !__is_array_indicator(ii[i])){
                ii[i] = ii[i] + default_indicator;
            }
        }
        return ii;
    }

    final static int RET_CONTEXT   = 0;
    final static int RET_INDICATOR = 1;
    final static int RET_OBJSIZE   = 2;
    final static int DICT   = 1;
    final static int ARRAY  = 2;
}
