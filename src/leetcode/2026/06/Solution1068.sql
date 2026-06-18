-- MySQL
SELECT p.product_name, s.year, s.price
FROM sales s
LEFT JOIN product p USING (product_id);