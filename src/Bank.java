public  abstract class Bank {
    private String name;
    private String address;
    private  String policy;
    private  double rate;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void CalculateRateOfInterest();
    // incomplete method, to be filled later by user accordingly
}
