package com.rifaya;

public class DeviceManager {
    public static void main(String[] args) throws Exception {
        String deviceId = "myDevice001";

        IoTHubService iotHub = new IoTHubService();
        CosmosDBService cosmos = new CosmosDBService();

        iotHub.registerDevice(deviceId);
        cosmos.saveDevice(deviceId);
    }
}
