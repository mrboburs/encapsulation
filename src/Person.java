public class Person {
    private String name;
   private   String surname;
String country;
   


    public Person() {
        country="uz";
        
    }

    public void setName(String name){
         this.name=name.trim().toUpperCase();
    }
    public void setSurname(String name){
        this.surname=name.trim().toUpperCase();
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public  void printDetails(){
        System.out.println(this.name+"  "+ surname);
    }


}
