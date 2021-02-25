package com.aaravchandra.site_running_check;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {
    private final String urlError = "Incorrect URL provided!";
    private final String urlCorrect = "URL provided is running properly!";
    private final String urlInternalError = "URL provided is not running properly!";

    @GetMapping("/go")
    public String getUrlStatusMessage(@RequestParam String Url) {

        try {
            URL urlobj = new URL(Url);
            HttpURLConnection connection = (HttpURLConnection) urlobj.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            return urlCorrect;

        } catch (MalformedURLException e) {
            return urlError;

        } catch (IOException e) {
            return urlInternalError;
        }

    }
}
