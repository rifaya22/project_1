SELECT 
    SensorId,
    COUNT(*) AS OfflineOccurrences
FROM SensorLogs
WHERE Status = 'Offline'
GROUP BY SensorId;
