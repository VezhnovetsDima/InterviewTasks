## Task: make code review

```java
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CacheService {
    private final ConcurrentHashMap<Long, Object> objectMap = new ConcurrentHashMap<>();
    private long currentId = 0l;

    public void add(Object obj) {
        long id = currentId.getAndIncrement();
        cache.put(id, obj);
        return id;
    }

    public Optional<Object> get(Long id) {
        return Optional.ofNullable(objectMap.get(id));
    }

    public void update(Long id, Object obj) {
        objectMap.put(id, obj);
    }
}
```
task code: Read more [here](./task_solution.md)