package com.example.urlsortner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlMappingRepository extends JpaRepository<UrlMapping, Long> {

    UrlMapping findByShortUrl(String shortUrl);
    UrlMapping findByLongUrl(String longUrl);
    
}

