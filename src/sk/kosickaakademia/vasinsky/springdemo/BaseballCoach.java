package sk.kosickaakademia.vasinsky.springdemo;

public class BaseballCoach implements Coach{

    public String getDailyWorkout(){
        return "Spend 30 minutes in on batting practice";
    }

    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {


        return fortuneService.getFortune();
    }

}
