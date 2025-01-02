## Task: make code review

```java
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public final class CachedPhotosService {
    
    private final PhotoRepository photoRepository;
    private final PhotoValidationService photoValidationService;
    private final PhotoOperations photoOperations;

    @Cacheable(cacheNames = "ResizedPhotoCache")
    public PhotoDTO getResizedPhoto(String photoId, int width, int height) {
        photoValidationService.validateSize(width, height);

        Photo photo = photoRepository.findById(photoId).orElseThrow(() -> new RuntimeException("can't find value by id"));//or custom exception
        
        PhotoDTO photoDTO = ConversionUtils.convert(photo);
        return photoOperations.resize(photoDTO, width, height);
    }
}
```

also there are a lot of questions about this cache

when we need to update?
when we need to clear?
is there more then one instance of application?(distributive cache)

articles:
https://www.baeldung.com/spring-cache-tutorial
https://hazelcast.com/foundations/caching/distributed-cache/