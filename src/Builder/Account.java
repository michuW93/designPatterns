package Builder;

public class Account {
    private String owner;
    private String number;
    private boolean eMakler;
    private String coOwner; //optionalParam
    private String signature; //optionalParam

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean iseMakler() {
        return eMakler;
    }

    public void seteMakler(boolean eMakler) {
        this.eMakler = eMakler;
    }

    public String getCoOwner() {
        return coOwner;
    }

    public void setCoOwner(String coOwner) {
        this.coOwner = coOwner;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", number='" + number + '\'' +
                ", eMakler=" + eMakler +
                ", coOwner='" + coOwner + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
