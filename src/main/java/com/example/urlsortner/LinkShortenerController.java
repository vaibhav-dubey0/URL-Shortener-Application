package com.example.urlsortner;

import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class LinkShortenerController {

    private final UrlMappingRepository urlMappingRepository;
    private final AtomicInteger idGenerator = new AtomicInteger();

    public LinkShortenerController(UrlMappingRepository urlMappingRepository) {
        this.urlMappingRepository = urlMappingRepository;
    }

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam("longUrl") String longUrl, Model model) {
        // Generate a unique short URL
        String shortUrl = "http://short.url/" + idGenerator.incrementAndGet();

        // Save mapping to the database
        UrlMapping urlMapping = new UrlMapping();
        urlMapping.setShortUrl(shortUrl);
        urlMapping.setLongUrl(longUrl);
        urlMappingRepository.save(urlMapping);

        model.addAttribute("shortUrl", shortUrl);
        return "result";
    }

    @PostMapping("/expand")
    public String expandUrl(@RequestParam("shortUrl") String shortUrl, Model model) {
        // Retrieve the long URL from the database
        UrlMapping urlMapping = urlMappingRepository.findByShortUrl(shortUrl);
        if (urlMapping != null) {
            model.addAttribute("longUrl", urlMapping.getLongUrl());
        } else {
            model.addAttribute("longUrl", "URL not found");
        }
        return "result";
    }
}






