SELECT 
    SensorId,
    DATEPART(HOUR, Timestamp) AS Hour,
    AVG(Temperature) AS AvgTemp,
    COUNT(*) AS ReadingCount
FROM SensorLogs
GROUP BY SensorId, DATEPART(HOUR, Timestamp)
ORDER BY Hour;
