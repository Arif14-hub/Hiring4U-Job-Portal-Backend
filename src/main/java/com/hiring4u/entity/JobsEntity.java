package com.hiring4u.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "jobs")
public class JobsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "recruiter_id", nullable = false)
    private RecEntity recruiter;

    public RecEntity getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(RecEntity recruiter) {
        this.recruiter = recruiter;
    }

    private String title;
    private String description;
    private String requireskills;
    private double salary;
    private String location;
    private LocalDate postedDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequireskills() {
        return requireskills;
    }

    public void setRequireskills(String requireskills) {
        this.requireskills = requireskills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }
}
