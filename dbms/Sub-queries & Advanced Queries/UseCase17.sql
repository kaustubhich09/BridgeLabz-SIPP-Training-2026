SELECT * FROM covid_cases;
UPDATE covid_cases
SET Confirmed_Cases = 1500000
WHERE Country = 'USA';
SELECT * FROM covid_cases;
SELECT DISTINCT Country
FROM covid_cases
WHERE Country IN
(
    SELECT Country
    FROM covid_cases
    GROUP BY Country
    HAVING MAX(Confirmed_Cases) > 1000000
);

SELECT Country, Confirmed_Cases
FROM covid_cases;