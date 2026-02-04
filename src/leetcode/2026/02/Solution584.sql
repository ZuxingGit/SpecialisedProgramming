-- Find the names of the customer that are either:
-- referred by any customer with id != 2.
-- not referred by any customer.
-- Return the result table in any order.
SELECT c1.name
FROM Customer c1
WHERE c1.referee_id != 2 OR c1.referee_id IS NULL;