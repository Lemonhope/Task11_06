package com.jsonParse;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JacksonData {
    public static void parseJson(String path) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Currency[] currency = objectMapper.readValue(new File(path), Currency[].class);

            for (Currency currencyRate : currency) {
                System.out.println(currencyRate);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
