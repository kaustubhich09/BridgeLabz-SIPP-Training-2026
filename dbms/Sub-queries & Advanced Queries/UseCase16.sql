USE covid_assignment2;
SHOW TABLES;
DESC covid_cases;

SELECT Country, Deaths
FROM covid_cases
WHERE Deaths >
(
    SELECT AVG(Deaths)
    FROM covid_cases
);
INSERT INTO covid_cases
VALUES
('USA','2025-07-01',2000,50,1800,NOW(),NULL,NULL,NULL),
('Japan','2025-07-01',1500,10,1400,NOW(),NULL,NULL,NULL);
SHOW TABLES;
DESC covid_cases;
SELECT * FROM covid_cases;