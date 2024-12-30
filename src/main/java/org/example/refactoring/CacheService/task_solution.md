## Task: make code review

```java
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CacheService {
    private final ConcurrentHashMap<Long, Object> objectMap = new ConcurrentHashMap<>();//ConcurrentHashMap does not allow null keys or values.
    private AtomicLong currentId = new AtomicLong(0);

    public long add(T obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object cannot be null");
        }
        long id = currentId.incrementAndGet();
        objectMap.put(id, obj);
        
        return id;
    }

    public Optional<T> get(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        
        return Optional.ofNullable(objectMap.get(id));
    }

    public void update(Long id, T obj) {
        if (id == null || obj == null) {
            throw new IllegalArgumentException("ID and object cannot be null");
        }
        
        if (!objectMap.containsKey(id)) {
            throw new IllegalArgumentException("No object found with the given ID");
        }
        
        objectMap.put(id, obj);
    }
}
```