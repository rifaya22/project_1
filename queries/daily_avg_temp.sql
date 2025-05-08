SELECT 
    SensorId,
    CAST(Timestamp AS DATE) AS LogDate,
    AVG(Temperature) AS AvgTemp
FROM SensorLogs
GROUP BY SensorId, CAST(Timestamp AS DATE)
ORDER BY LogDate;
