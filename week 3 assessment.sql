CREATE TABLE Worker (
    worker_id INT PRIMARY KEY,
    firstname VARCHAR(100),
    lastname VARCHAR(100),
    joining_date DATE,
    department VARCHAR(50),
    salary DECIMAL(10, 2)
);
INSERT INTO Worker (worker_id, firstname, lastname, joining_date, department, salary) VALUES
(1, 'John', 'Doe', '2020-01-15', 'Engineering', 50000),
(2, 'Jane', 'Smith', '2019-03-22', 'Management', 60000),
(3, 'Alex', 'Johnson', '2018-11-30', 'Finance', 70000);
CREATE TABLE Title (
    worker_id INT,
    title VARCHAR(50),
	affected_from DATE,
    FOREIGN KEY (worker_id) REFERENCES Worker(worker_id)
);
INSERT INTO Title (worker_id, title,affected_from) VALUES
(1, 'Engineer','2020-01-15'),
(2, 'Manager','2019-03-22'),
(3, 'Director','2018-11-30');
CREATE TABLE Bonus (
    worker_id INT,
    bonus_amount DECIMAL(10, 2),
	bonus_date DATE,
    FOREIGN KEY (worker_id) REFERENCES Worker(worker_id)
);
INSERT INTO Bonus (worker_id, bonus_amount,bonus_date) VALUES
(1, 5000,'2020-01-15'),
(2, 4000,'2019-03-22'),
(3, 6000,'2018-11-30');
SELECT W.firstname,  W.salary, T.title
FROM Worker W
JOIN Title as T ON W.worker_id = T.worker_id;

CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(n INT)
RETURNS INT AS $$
DECLARE
    nth_salary DECIMAL(10, 2);
    worker_count INT;
BEGIN
    SELECT DISTINCT salary
    INTO nth_salary
    FROM Worker
    ORDER BY salary DESC
    LIMIT 1 OFFSET n - 1;

    SELECT COUNT(*)
    INTO worker_count
    FROM Worker
    WHERE salary = nth_salary;

  
    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;
-- Get the count of workers with the 2nd highest salary
SELECT get_worker_count_by_nth_highest_salary(2);
-- Get the count of workers with the 1st highest salary
SELECT get_worker_count_by_nth_highest_salary(1);




