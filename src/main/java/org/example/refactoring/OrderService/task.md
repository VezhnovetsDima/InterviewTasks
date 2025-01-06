## Task: Is this code will work? How many transactions will be opened? If it won't work, make code review.

```java
@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final BalanceService balanceService;

    public void createOrder() {
        // различная логика по проверке баланса
        paymentOrder();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    private void paymentOrder() {
        balanceService.chargeOff();
    }
}

@Service
@Transactional
class BalanceService {

    public void chargeOff() {
        // логика по списанию денег со счета
    }
}

```
task code solution: Read more [here](./task_solution.md)