public class Father {
    private String lastName;
    private String address;
    private long assetValue;

    public Father() {

    }

    @Override
    public String toString() {
        return "Father{" +
                "lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", assetValue='" + assetValue + '\'' +
                '}';
    }
//public Father(){
//    System.out.println( "Default");
//}
    public Father(String lastName, String address, long assetValue) {
        this.lastName = lastName;
        this.address = address;
        this.assetValue = assetValue;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(long assetValue) {
        this.assetValue = assetValue;
    }
}
