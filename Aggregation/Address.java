// In object-oriented programming and design,
//  has-a is a composition relationship where one object "belongs to" another object,
//  and behaves according to the rules of ownership

public class Address {
    String city,state,country;  
  
    public Address(String city, String state, String country) {  
        this.city = city;  
        this.state = state;  
        this.country = country;  
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", state=" + state + "]";
    }  
    
}
