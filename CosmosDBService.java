package com.rifaya;

import com.azure.cosmos.*;
import com.azure.cosmos.models.*;

public class CosmosDBService {
    private static final String endpoint = "<YOUR_COSMOSDB_ENDPOINT>";
    private static final String key = "<YOUR_COSMOSDB_KEY>";
    private static final String databaseName = "IoTDevicesDB";
    private static final String containerName = "Devices";

    public void saveDevice(String deviceId) {
        CosmosClient client = new CosmosClientBuilder()
                .endpoint(endpoint)
                .key(key)
                .consistencyLevel(ConsistencyLevel.EVENTUAL)
                .buildClient();

        CosmosDatabase database = client.createDatabaseIfNotExists(databaseName).getDatabase();
        CosmosContainer container = database.createContainerIfNotExists(containerName, "/id").getContainer();

        DeviceInfo device = new DeviceInfo(deviceId);
        container.upsertItem(device);
        System.out.println("Device saved in Cosmos DB: " + deviceId);

        client.close();
    }

    static class DeviceInfo {
        public String id;

        public DeviceInfo(String id) {
            this.id = id;
        }
    }
}
