## Find the email duplicates
```sql
CREATE TABLE t_user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(30),
    email VARCHAR(50),
    created DATE,
    updated DATE
);
```

## Solution

```sql
SELECT email, COUNT(*) AS duplicate_count
FROM t_user
GROUP BY email
HAVING COUNT(*) > 1;
```

