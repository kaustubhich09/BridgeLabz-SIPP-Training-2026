ALTER TABLE covid_cases
ADD Population BIGINT,
ADD Vaccinated BIGINT;
UPDATE covid_cases
SET Population=1400000000,
    Vaccinated=1200000000
WHERE Country='India';

UPDATE covid_cases
SET Population=330000000,
    Vaccinated=250000000
WHERE Country='USA';

UPDATE covid_cases
SET Population=125000000,
    Vaccinated=110000000
WHERE Country='Japan';

SELECT Country,
       Vaccinated AS Population_Count,
       'Vaccinated' AS Status
FROM covid_cases

UNION

SELECT Country,
       (Population - Vaccinated),
       'Unvaccinated'
FROM covid_cases;
DESC covid_cases;

SELECT * FROM covid_cases;

