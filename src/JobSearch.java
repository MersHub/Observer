public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancies("First Java Position");
        jobSite.addVacancies("Second Java Position");

        Observer firstSubscriber = new Subscriber("Egor");
        Observer secondSubscriber = new Subscriber("Dima");

        jobSite.addObserved(firstSubscriber);
        jobSite.addObserved( secondSubscriber);

        jobSite.addVacancies("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
