CREATE TABLE IF NOT EXISTS covid_deaths
(
    Country VARCHAR(50),
    Report_Date DATE,
    Deaths INT
);

INSERT INTO covid_deaths
VALUES
('India','2024-01-01',150000),
('USA','2024-01-01',500000),
('Nepal','2024-01-01',200);
SELECT Country
FROM covid_deaths
WHERE Country NOT IN
(
    SELECT Country
    FROM covid_cases
);

DESC covid_cases;
SHOW TABLES;
