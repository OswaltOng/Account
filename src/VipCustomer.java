public class VipCustomer {
    private String name;
    private String email;
    private double limit;
    
    public VipCustomer(){
        this("Default-Name", "Default-Email", 999999);
    }
    
    public VipCustomer(String name, String email){
        this(name, email, 100);
    }
    public VipCustomer(String name, String email, float limit){
        this.name = name;
        this.email = email;
        this.limit = limit;
    }
    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public double getLimit(){
        return this.limit;
    }
}
