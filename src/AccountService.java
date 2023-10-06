interface AccountService {

    Account findAccountByOwnerId(long id);

    long countAccountWithBalanceGreaterThan(long balance);
}
