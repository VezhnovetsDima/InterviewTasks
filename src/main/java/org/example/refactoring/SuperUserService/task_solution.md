## Task: make code review

```java
@Service
@RequiredArgsConstructor
class SuperUserService {
    private final GroupFeignClient groupClient;
    private final UserFeignClient userClient;
    private final ScoringFeignClient scoringClient;

    public SuperUserDTO findById(String userId) {
        GroupsSearchCriteriaDTO searchDTO = GroupsSearchCriteriaDTO.builder()
                .userId(userId)
                .build();

        // Execute calls in parallel using CompletableFuture
        CompletableFuture<List<GroupDTO>> groupsFuture = CompletableFuture.supplyAsync(() -> groupClient.search(searchDTO));
        CompletableFuture<UserDTO> userFuture = CompletableFuture.supplyAsync(() -> userClient.findById(userId));
        CompletableFuture<ScoringDTO> scoringFuture = CompletableFuture.supplyAsync(() -> scoringClient.findByUserId(userId));

        // Wait for all futures to complete
        CompletableFuture.allOf(groupsFuture, userFuture, scoringFuture).join();

        try {
            List<GroupDTO> groups = groupsFuture.get();
            UserDTO user = userFuture.get();
            ScoringDTO scoring = scoringFuture.get();
            
            return new SuperUserDTO(user, groups, scoring);
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch data from microservices: ", e);
        }
    }
}

```