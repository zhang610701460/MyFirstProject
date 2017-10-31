package com.zyn.java.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/30 0030 23:51
 */
    @Component
    public class JsonTools {

        /**
         * 把JSON文本parse成JSONObject
         *
         * @param text
         * @return
         */
        public static final JSONObject parseObject(String text) {
            if (text == null || text.equals("")) {
                return null;
            }

            return JSONObject.parseObject(text);
        }

        /**
         * 把JSON文本parse为JavaBean
         *
         * @param text
         * @param clazz
         * @param <T>
         * @return
         */
        public static final <T> T parseObject(String text, Class<T> clazz) {
            if (text == null || text.equals("")) {
                return null;
            }
            return JSONObject.parseObject(text, clazz);
        }

        /**
         * 把JSON文本parse成JSONArray
         *
         * @param text
         * @return
         */
        public static final JSONArray parseArray(String text) {
            if (text == null || text.equals("")) {
                return null;
            }
            return JSONObject.parseArray(text);
        }

        /**
         * 把JSON文本parse成JavaBean集合
         *
         * @param text
         * @param clazz
         * @param <T>
         * @return
         */
        public static final <T> List<T> parseList(String text, Class<T> clazz) {
            if (text == null || text.equals("")) {
                return null;
            }
            return JSONObject.parseArray(text, clazz);
        }

        /**
         * 将JavaBean序列化为JSON文本
         *
         * @param object
         * @return
         */
        public static final String toJSONString(Object object) {
            if (object == null) {
                return null;
            }
            return JSONObject.toJSONString(object, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
        }

        /**
         * 将JavaBean序列化为带格式的JSON文本
         *
         * @param object
         * @return
         */
        public static final String showJSONStringFormat(Object object) {
            if (object == null) {
                return null;
            }
            return JSONObject.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
        }
}
