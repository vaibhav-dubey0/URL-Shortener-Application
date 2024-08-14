package com.example.urlsortner;

import java.util.HashMap;
import java.util.Map;
import java.util.Base64;

public class LinkShortener {
    private Map<String, String> urlMap = new HashMap<>();
    private final String domain = "http://short.url/";

    public String shortenURL(String longUrl) {
        String shortUrl = Base64.getUrlEncoder().encodeToString(longUrl.getBytes()).substring(0, 6);
        while (urlMap.containsKey(shortUrl)) {
            shortUrl = Base64.getUrlEncoder().encodeToString((longUrl + shortUrl).getBytes()).substring(0, 6);
        }
        urlMap.put(shortUrl, longUrl);
        return domain + shortUrl;
    }

    public String expandURL(String shortUrl) {
        return urlMap.getOrDefault(shortUrl.replace(domain, ""), "URL not found!");
    }
}

