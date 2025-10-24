package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataReader implements IDataReader {
    private String url;

    public NetworkDataReader(String url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        StringBuilder inputString = new StringBuilder();
        URL url = new URL(this.url);
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                inputString.append((char) c);
            }
        }
        return inputString.toString();
    }
}
