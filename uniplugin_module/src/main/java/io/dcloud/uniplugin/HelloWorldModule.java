package io.dcloud.uniplugin;

import com.alibaba.fastjson.JSONObject;

import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.common.UniModule;

public class HelloWorldModule  extends UniModule {

    //run JS thread
    @UniJSMethod(uiThread = false)
    public JSONObject hello(){
        JSONObject data = new JSONObject();
        data.put("code", "hello");
        return data;
    }

}
