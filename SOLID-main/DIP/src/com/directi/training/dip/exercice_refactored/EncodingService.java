package com.directi.training.dip.exercice_refactored;

import java.io.IOException;

public class EncodingService {
    private final IEncoder encoder;
    private final IDataReader reader;
    private final IDataWriter writer;
    private final IDataRepository repository;

    public EncodingService(IEncoder encoder, IDataReader reader,
                           IDataWriter writer, IDataRepository repository) {
        this.encoder = encoder;
        this.reader = reader;
        this.writer = writer;
        this.repository = repository;
    }

    public void encodeFromFiles() throws IOException {
        String data = reader.read();
        String encodedData = encoder.encode(data);
        writer.write(encodedData);
    }

    public void encodeFromNetwork() throws IOException {
        String data = reader.read();
        String encodedData = encoder.encode(data);
        repository.write(encodedData);
    }
}
