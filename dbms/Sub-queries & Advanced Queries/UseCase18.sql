DESC covid_cases;
SELECT 
    c1.State,
    c1.Report_Date,
    c1.Confirmed_Cases,
    CASE
        WHEN c1.Confirmed_Cases > 
        (
            SELECT AVG(c2.Confirmed_Cases)
            FROM covid_cases c2
            WHERE c2.State = c1.State
        )
        THEN 'Peak Wave'
        ELSE 'Normal'
    END AS Wave_Status
FROM covid_cases c1
WHERE c1.State = 'Mumbai';

SELECT * FROM covid_cases;

INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Deaths, Recoveries, State, Population, Vaccinated)
VALUES
('India','2024-01-01',5000,100,4500,'Mumbai',20000000,15000000),
('India','2024-01-02',12000,200,10000,'Mumbai',20000000,15000000),
('India','2024-01-03',7000,120,6000,'Mumbai',20000000,15000000),
('India','2024-01-04',15000,250,12000,'Mumbai',20000000,15000000);