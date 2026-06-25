-- Project
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | project_id  | int     |
-- | employee_id | int     |
-- +-------------+---------+

-- Employee
-- +------------------+---------+
-- | Column Name      | Type    |
-- +------------------+---------+
-- | employee_id      | int     |
-- | name             | varchar |
-- | experience_years | int     |
-- +------------------+---------+

-- rounded to 2 digits
SELECT p.project_id, ROUND(avg(e.experience_years), 2) AS average_years
FROM project p
JOIN employee e ON p.employee_id = e.employee_id
GROUP BY p.project_id;