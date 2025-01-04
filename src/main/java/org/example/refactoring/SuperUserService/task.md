## Task: make code review

```java

import lombok.RequiredArgsConstructor;

/*
    List<GroupDTO> GroupFeignClient.search(GroupSearchCriteriaDTO searchDTO); //200-300ms
    UserDTO UserFeignClient.findById(String userId); //50-160 ms
    ScoringDTO ScoringFeignClient.findById(String userId); //100-250ms
*/

@Service
@RequiredArgsConstructor
class SuperUserService {
    private final GroupFeignClient feignClient;
    private final UserFeignClient userClient;
    private final ScoringFeignClient scoringClient;
    
    public SuperUserDTO findById(String userId) {
        SearchDTO searchDTO = GroupsSearchCriteriaDTO.builder().userId(userId).build();
        
        //write api-composition(methods above class) method with theoretically target to 300ms
        
        //SuperUserDTO contains inside List<GroupDTO>, UserDTO, ScoringDTO
        
        return new SuperUserDTO();
    }
}
```
task code solution: Read more [here](./task_solution.md)