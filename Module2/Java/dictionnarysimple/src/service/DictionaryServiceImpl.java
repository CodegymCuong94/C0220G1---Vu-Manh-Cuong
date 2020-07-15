package service;


import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    public static Map<String, String> dictionaryKey;

    static {
        dictionaryKey = new HashMap<>();
        dictionaryKey.put("red", "đỏ");
        dictionaryKey.put("blue", "xanh lam");
        dictionaryKey.put("abc", "ngô ngố");

    }


    @Override
    public String findByEnglish(String english) {
        return dictionaryKey.get(english);
    }

}
