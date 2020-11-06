package cis.project.module1.Models;
import javax.persistence.*;


@Entity
@Table(name = "convention")
public class Conventions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "description")
    public String description;

    @Column(name = "startdate")
    public String startdate;

    @Column(name = "enddate")
    public String enddate;

    public Conventions (){}

    public Conventions (String description, String startDate, String endDate){
        this.description = description;
        this.startdate = startDate;
        this.enddate = endDate;
    }


    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startDate) {
        this.startdate = startDate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String endDate) {
        this.enddate = endDate;
    }
}
