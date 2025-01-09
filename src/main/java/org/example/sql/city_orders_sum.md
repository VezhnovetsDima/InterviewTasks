## Make the report: city, sum of orders by each city

```sql
CREATE TABLE cities (
    city_id serial PRIMARY KEY,
    city_name VARCHAR(50) NOT NULL
);

CREATE TABLE orders (
    order_id serial PRIMARY KEY,
    city_id INT NOT NULL REFERENCES cities(city_id) ON DELETE CASCADE,
    total BIGINT NOT NULL
);
```

## Solution

```sql
SELECT city_name, SUM(total) 
FROM cities 
JOIN orders 
ON cities.city_id = orders.city_id
GROUP BY city_name;
```

