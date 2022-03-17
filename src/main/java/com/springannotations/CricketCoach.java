package com.springannotations;

public class CricketCoach implements Coach{

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public CricketCoach(){
    }

    @Override
    public String getDailyWorkout() {
        return "cricket daily workout";
    }

    @Override
    public String getDailyFortune() {
        return "cricket daily fortune";
    }


}
