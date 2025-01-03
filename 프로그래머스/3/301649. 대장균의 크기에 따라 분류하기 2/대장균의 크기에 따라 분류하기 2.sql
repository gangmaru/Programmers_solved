SELECT ID, 
CASE 
    WHEN A.E_RANK * 100 / E_COUNT <= 25 THEN 'CRITICAL'
    WHEN A.E_RANK * 100 / E_COUNT <= 50 THEN 'HIGH'
    WHEN A.E_RANK * 100 / E_COUNT <= 75 THEN 'MEDIUM'
    ELSE 'LOW'
END AS COLONY_NAME
FROM (
    SELECT *, 
    RANK() OVER(ORDER BY SIZE_OF_COLONY DESC) AS E_RANK,
    (SELECT COUNT(*) 
     FROM ECOLI_DATA) AS E_COUNT
    FROM ECOLI_DATA) A
ORDER BY ID ASC;