package com.motion.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MovieDomain {

    @Id
    @GeneratedValue
    private int movieId;
    private String movieName;
    private Date dateproduct;

    public MovieDomain() {
    }

    public MovieDomain(String movieName, Date dateproduct) {
        this.movieName = movieName;
        this.dateproduct = dateproduct;
    }

    public int getmovieId() {
        return movieId;
    }

    public void setmovieId(int id) {
        this.movieId = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getDateproduct() {
        return dateproduct;
    }

    public void setDateproduct(Date dateproduct) {
        this.dateproduct = dateproduct;
    }
}
