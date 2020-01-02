package info.vladyslav.EPAM_HW_7_1206.model;

import info.vladyslav.EPAM_HW_7_1206.auxiliary.AccountStatus;

public class Account {
    Long id;
    String accountName;
    AccountStatus status;

    public Account() {
    }

    public Account(Long id, String accountName, AccountStatus status) {
        this.id = id;
        this.accountName = accountName;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", status=" + status +
                '}';
    }

}
