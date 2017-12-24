package com.example.santicovi.proyectouf1;

import java.io.Serializable;



public class Photo implements Serializable{

    private Integer id, sol, page, totalPhotos, maxSol;
    private String roverName, roverCam, imageUrl, status;
    private String landingDate, launchDate, maxDate;

    public Photo() {

    }

    public Integer getRoverId() {
        return id;
    }

    public void setRoverId(Integer id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPhotos() {
        return totalPhotos;
    }

    public void setTotalPhotos(Integer totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    public Integer getMaxSol() {
        return maxSol;
    }

    public void setMaxSol(Integer maxSol) {
        this.maxSol = maxSol;
    }

    public String getRoverName() {
        return roverName;
    }

    public void setRoverName(String roverName) {
        this.roverName = roverName;
    }

    public String getRoverCam() {
        return roverCam;
    }

    public void setRoverCam(String roverCam) {
        this.roverCam = roverCam;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLandingDate() {
        return landingDate;
    }

    public void setLandingDate(String landingDate) {
        this.landingDate = landingDate;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", sol=" + sol +
                ", page=" + page +
                ", totalPhotos=" + totalPhotos +
                ", maxSol=" + maxSol +
                ", roverName='" + roverName + '\'' +
                ", roverCam='" + roverCam + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", status='" + status + '\'' +
                ", landingDate=" + landingDate +
                ", launchDate=" + launchDate +
                ", maxDate=" + maxDate +
                '}';
    }
}
