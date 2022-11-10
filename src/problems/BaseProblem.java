package problems;

public abstract class BaseProblem {
    public String headline;
    public String Description;
    public String Solution;

    public BaseProblem(String headline, String description, String solution) {
        this.headline = headline;
        Description = description;
        Solution = solution;
    }

    public static void main(String[] args) {
        System.out.println("This is just a base class.");
    }
}
