public class Contact {
    public String name;
    public String email;
    public String number;

    public Contact(String name, String email, String number){
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return "Name: " + name + " ,Email: " + email + " ,Number: " + number;}
}
