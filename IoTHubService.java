package com.rifaya;

import com.microsoft.azure.sdk.iot.service.RegistryManager;
import com.microsoft.azure.sdk.iot.service.exceptions.IotHubException;
import com.microsoft.azure.sdk.iot.service.Device;

import java.io.IOException;

public class IoTHubService {
    private static final String connectionString = "<YOUR_IOTHUB_CONNECTION_STRING>";

    public void registerDevice(String deviceId) throws IOException, IotHubException {
        RegistryManager registryManager = RegistryManager.createFromConnectionString(connectionString);
        Device device;
        try {
            device = registryManager.addDevice(new Device(deviceId));
            System.out.println("Device created: " + device.getDeviceId());
        } catch (IotHubException e) {
            device = registryManager.getDevice(deviceId);
            System.out.println("Device already exists: " + device.getDeviceId());
        }
    }
}
