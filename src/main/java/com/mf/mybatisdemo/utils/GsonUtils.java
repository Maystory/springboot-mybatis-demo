package com.mf.mybatisdemo.utils;

import com.google.gson.*;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

/**
 * @author Maven
 * @since 2018-10-09 18:32
 */
public class GsonUtils {
    public static final GsonBuilder GSON_BUILDER;

    public static final Gson GSON;

    static {
        GSON_BUILDER = new GsonBuilder()
                .registerTypeAdapter(LinkedTreeMap.class, new LinkedTreeMapDeserializer())
                .registerTypeAdapter(TreeMap.class, new TreeMapDeserializer())
                .registerTypeAdapter(HashMap.class, new HashMapDeserializer())
                .registerTypeAdapter(Map.class, new MapDeserializer())
//                .registerTypeAdapter(List.class,new ListDeserializer())
                .disableHtmlEscaping();
        GSON = GSON_BUILDER.create();
    }

    /**
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }

    /**
     * @param json
     * @param typeToken
     * @param <T>
     * @return
     * @throws JsonSyntaxException
     */
    public static <T> T fromJson(String json, TypeToken<T> typeToken) throws JsonSyntaxException {
        return GSON.fromJson(json, typeToken.getType());
    }

    /**
     * @param json
     * @param classOfT
     * @param <T>
     * @return
     * @throws JsonSyntaxException
     */
    public static <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
        return GSON.fromJson(json, classOfT);
    }

    /**
     *
     */
    static class LinkedTreeMapDeserializer implements JsonDeserializer<LinkedTreeMap> {
        @Override
        public LinkedTreeMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            LinkedTreeMap resultMap = new LinkedTreeMap();
            JsonObject jsonObject = json.getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            for (Map.Entry<String, JsonElement> entry : entrySet) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
            return resultMap;
        }
    }

    /**
     *
     */
    static class TreeMapDeserializer implements JsonDeserializer<TreeMap> {
        @Override
        public TreeMap deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            TreeMap resultMap = new TreeMap();
            JsonObject jsonObject = json.getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            for (Map.Entry<String, JsonElement> entry : entrySet) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
            return resultMap;
        }
    }

    /**
     *
     */
    static class HashMapDeserializer implements JsonDeserializer<HashMap> {

        @Override
        public HashMap deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            HashMap resultMap = new HashMap();
            JsonObject jsonObject = json.getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            for (Map.Entry<String, JsonElement> entry : entrySet) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
            return resultMap;
        }
    }

    /**
     *
     */
    static class MapDeserializer implements JsonDeserializer<Map> {
        @Override
        public Map deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            Map resultMap = new LinkedTreeMap<>();
            JsonObject jsonObject = json.getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            for (Map.Entry<String, JsonElement> entry : entrySet) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
            return resultMap;
        }
    }

    static class ListDeserializer implements JsonDeserializer<List> {
        @Override
        public List deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            List list = new ArrayList<>();
            JsonArray jsonArray = json.getAsJsonArray();
            for (JsonElement jsonElement : jsonArray) {
                list.add(jsonElement);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println(gson.toJson("123"));
        System.out.println(gson.toJson(true));
    }
}