## Task: make code review

```java
//there are too much mistakes, 
//1)required args constructor
//2)all operations with database need to be in service class
//3)some methods inside are monolith(it is terrible if we get money from user a and don't get them to user b)
//4)custom exception need to be thrown, not just runtimeException.
```

articles:
https://www.baeldung.com/transaction-configuration-with-jpa-and-spring
https://stackoverflow.com/questions/1099025/spring-transactional-what-happens-in-background
