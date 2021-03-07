package Builder;

public class AccountBuilder {
    private String owner;
    private String number;
    private boolean eMakler;
    private String coOwner; //optionalParam
    private String signature; //optionalParam

    public AccountBuilder(String owner, String number, boolean eMakler) {
        this.owner = owner;
        this.number = number;
        this.eMakler = eMakler;
    }

    public AccountBuilder setCoOwner(String coOwner){
        this.coOwner = coOwner;
        return this;
    }

    public AccountBuilder setSignature(String signature){
        this.signature = signature;
        return this;
    }

    public Account build(){
        Account account =  new Account();
        account.setOwner(this.owner);
        account.setNumber(this.number);
        account.seteMakler(this.eMakler);
        account.setCoOwner(this.coOwner);
        account.setSignature(this.signature);
        return account;
    }
}
