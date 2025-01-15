## Task: make code review

```java
@Service
public class RestClient {
    @Transactional
    public void doWork() {
        var object = restTemplate.postForObject(...);
        
        dbService.saveObject(object);
    }
}
```
Solution: [here](./task_solution.md)