-- 197. Rising Temperature
SELECT
    w1.Id AS Id
FROM
    Weather w1
RIGHT JOIN
    Weather w2
ON
    w1.RecordDate = DATE_SUB(w2.RecordDate, INTERVAL 1 DAY)
    AND w2.Temperature > w1.Temperature