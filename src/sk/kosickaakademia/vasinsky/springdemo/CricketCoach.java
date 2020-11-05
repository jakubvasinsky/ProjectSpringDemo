package sk.kosickaakademia.vasinsky.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
private String emailAdress;
private String team;


    public CricketCoach(){
        //prazdny konstruktor
        System.out.println("CricketCoach: inside the constructor of cricket coach");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("CricketCoach: inside the setter of email adress");
        this.emailAdress = emailAdress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside the setter of team");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: inside the setter of fortune service");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
