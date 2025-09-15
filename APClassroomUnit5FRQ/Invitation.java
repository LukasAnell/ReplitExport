public class Invitation {
    private String hostName;
    private String address;

    public Invitation(String n, String a) {
        hostName = n;
        address = a;
    }

    public Invitation(String a) {
        this.address = address;
        hostName = "Host";
    }

    public String getHostName() {
        return hostName;
    }

    public void updateAddress(String newAddress) {
        address = newAddress;
    }

    public String sendInvite(String nameOfRecipient) {
        return "Dear " + nameOfRecipient + ", please attend my event at " + address + ". See you\nthen, " + hostName + ".";
    }


}