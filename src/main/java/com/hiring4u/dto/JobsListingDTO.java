package com.hiring4u.dto;
import java.time.LocalDate;


public class JobsListingDTO {

    private String title;
    private String description;
    private String requireskills;
    private double salary;
    private String location;
    private LocalDate postedDate;


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
