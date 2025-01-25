package jan23.customexceptionsdemo;

public class CustomExceptionsMain {

    public static void main(String[] args) {

        DriverLicenceDemo d = new DriverLicenceDemo();
        d.eligibleToDrive();

        Voting voting = new Voting();
        voting.eligibleToVote();
    }
}
