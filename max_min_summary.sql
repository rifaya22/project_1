SELECT 
    SensorId,
    MAX(Temperature) AS MaxTemp,
    MIN(Temperature) AS MinTemp,
    COUNT(*) AS ReadingsCount
FROM SensorLogs
GROUP BY SensorId;
