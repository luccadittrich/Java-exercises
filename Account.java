class Account {
    private String name;
    private String billingState;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", billingState='" + billingState + '\'' +
                '}';
    }
}
