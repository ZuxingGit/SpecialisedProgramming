-- 182. Duplicate Emails
SELECT DISTINCT e1.Email AS Email
FROM Person e1
JOIN Person e2 ON e1.Email = e2.Email AND e1.Id <> e2.Id;