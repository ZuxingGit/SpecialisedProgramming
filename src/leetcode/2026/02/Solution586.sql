-- Write a solution to find the customer_number for the customer who has placed the largest number of orders.
SELECT o.customer_number
FROM Orders o
GROUP BY o.customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;