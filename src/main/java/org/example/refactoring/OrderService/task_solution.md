## Task: make code review

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
    public void paymentOrder() {//transctions won't work on private methods
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

answers - no it won't work correctly because @Transactional can't open on private method
but if we make paymentOrder() public - there will be two transactions

When calling createOrder():
1)The first transaction will start for createOrder().
2)Then when calling paymentOrder(), a second, new transaction will be opened due to Propagation.REQUIRES_NEW.
3)The chargeOff() method will be executed within the second transaction.
4)After paymentOrder() completes, the second transaction will complete and the first will continue to execute.

Result: During execution, 2 transactions will be opened:

The first one for createOrder().
The second (new) one for paymentOrder().

Also there is a problem in exceptions, 
@Transactional by default works only with unchecked exceptions, 
so we need to add some exception handling.