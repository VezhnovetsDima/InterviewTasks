```java
private void doRestWork() {
    var obj = restTemplate.postForObject(...);
    saveToDatabase(obj);
}

@Transactional
public void doWork() {
    doRestWork();
    var obj = restTemplate.postForObject(...);
    try {
        dbService.saveObj(obj); 
    } catch (Exception e) {
        restTemplate.postForObject("http://example.com/rollback", obj);
    }
}
```

Problems:
1)post request by rest may keep database connection, which is waste of resources
2)if post request will throw the exception - all transaction will be rolled back, which is also waste of database resources
3)the main idea of code - union post request with database saving -> if in database we have an error we will send rollback query
4)there is also a problem, that we can't loose our http request(for example rest service will be inaccessible) -> so in my opinion it will be a good idea to change rest -> to async interaction(for example using kafka)
5)also all this methods need to log somwhere(for example in elastic) that post request was, and then database change was. So if our service crashes there might be rollback mechanism how to rollback post request by logs or other solution. 