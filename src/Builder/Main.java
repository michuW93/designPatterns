package Builder;

public class Main {
    public static void main(String[] args){
        Account account = new AccountBuilder("Michu", "1234", true)
                .setCoOwner("Ola").setSignature("mwalko").build();

        System.out.println(account);
    }
}
