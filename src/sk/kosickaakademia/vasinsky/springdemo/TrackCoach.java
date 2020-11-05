package sk.kosickaakademia.vasinsky.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It!: " + fortuneService.getFortune();
    }

    public void DoMyStartupStuff(){ System.out.println("TrackCoach: Inside method DoMyStartupStuff");
    }

    public void DoMyCleanupStuff(){ System.out.println("TrackCoach: Inside method DoMyCleanupStuff");
    }

}
