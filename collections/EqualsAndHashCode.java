package collections;
/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;
import java.util.Objects;

class Person{
     String firstName;
     String lastName;
     int age;
     Date lastModifiedDate;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
     public boolean equals(Object obj)
     {
         if(this==obj)
         {
             return true;
         }
         if(obj==null || getClass()!=obj.getClass())
         {
             return  false;
         }
         Person other= (Person) obj;

         return this.age==other.age && Objects.equals(this.firstName,other.firstName)
                 && Objects.equals(this.lastName,other.lastName);

     }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}

public class EqualsAndHashCode {
    public static void main(String[] args) {

        Person atirsaw= new Person("Atirsaw","Awoke",32,new Date());
        Person aty= new Person("Atirsaw","Awoke",32,new Date());
        System.out.println(atirsaw.equals(aty));
        System.out.println(atirsaw.hashCode()== aty.hashCode());

    }
}
