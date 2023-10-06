class AccountServiceImpl implements AccountService {

    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id){
        for (Account account : accounts){
            if (account.getOwner().getId() == id){
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountWithBalanceGreaterThan(long balance){
        long count = 0;
        for (Account account : accounts){
            if (account.getBalance() > balance) {
                count++;
            }
        }
        return count;
    }
}
