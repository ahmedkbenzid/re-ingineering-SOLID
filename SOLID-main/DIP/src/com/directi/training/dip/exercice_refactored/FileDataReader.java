package com.directi.training.dip.exercice_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader implements IDataReader{
    private String filePath;

    public FileDataReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }
}
