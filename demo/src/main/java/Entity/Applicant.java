package Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "applicants")
public class Applicant {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private  Long Id ;
     private  String Name ;
     private  String Email ;
     private  String Phone ;
     private  String status ;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
