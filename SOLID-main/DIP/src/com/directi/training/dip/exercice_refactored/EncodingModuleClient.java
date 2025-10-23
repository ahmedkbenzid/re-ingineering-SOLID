package com.directi.training.dip.exercice_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Configuration 1: Encodage avec fichiers
        IDataReader fileReader = new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IDataWriter fileWriter = new FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        IEncoder base64Encoder = new Base64Encoder();

        EncodingService fileEncodingService = new EncodingService(
                base64Encoder, fileReader, fileWriter, null
        );
        fileEncodingService.encodeFromFiles();

        // Configuration 2: Encodage avec réseau et base de données
        IDataReader networkReader = new NetworkDataReader("http://myfirstappwith.appspot.com/index.html");
        IDataRepository database = new MyDatabase();

        EncodingService networkEncodingService = new EncodingService(
                base64Encoder, networkReader, null, database
        );
        networkEncodingService.encodeFromNetwork();
    }
}
