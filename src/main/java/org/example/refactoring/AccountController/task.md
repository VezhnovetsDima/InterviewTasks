## Task: make code review

```java
@RestController
public class AccountController {
    @Autowired
    public AccountDaoImpl accountDaoImpl;
    
    @Autowired
    public KafkaNotificationService kafkaNotificationService;
    
    @PutMapping("/transfer")
    public Long transferMoney(@RequestParam Double money, @RequestParam long fromId, @RequestParam long toId) {
        var accountFrom = accountDaoImpl.getAccountById(fromId);
        var accountTo = accountDaoImpl.getAccountById(toId);
        
        if (accountFrom.balance - money < 0) {
            throw new RuntimeException();
        }
        
        accountFrom.balance = accountFrom.balance - money;
        accountTo.balance = accountTo.balance + money;
        
        long transactionId = accountDaoImpl.transfer(accountFrom, accountTo);
        
        kafkaNotificationService.export(transactionId);
        
        return transactionId;
    }
}
```
task code solution: Read more [here](./task_solution.md)