package structural.decorator.case2;

public class Task {

    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        Developer developer2 = new SeniorJavaDeveloper(new JavaTeamLead(new JavaTeamLead(new JavaDeveloper())));

        System.out.println(developer2.makeJob());

    }
}
