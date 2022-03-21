public class Son extends Father{
    private String hobby;

    public Son() {
        super();
    }


    //public Son(){
//    System.out.println("default 2");
//
//}


  public String getHobby() {
        return hobby;
    }

    public Son(String lastName, String address, long assetValue, String hobby) {
        super(lastName, address, assetValue);
        this.hobby = hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
