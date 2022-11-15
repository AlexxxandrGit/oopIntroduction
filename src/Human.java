public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String job;


    /**
     * public void greetingOutput() {
     * System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town +"." + " Мне " +  yearOfBirth + " лет. Я работаю на должности " + job +"."+" Будем знакомы!");
     * <p>
     * }
     * <p>
     * }
     * /* *
     */

    Human(String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else this.yearOfBirth = yearOfBirth;

        if (name.isEmpty()) {
            this.name = " Информация не указана";
        } else this.name = name;

        if (town.isEmpty()) {
            this.town = " Информация не указана";
        } else this.town = name;

        if (job.isEmpty()) {
            this.job = " Информация не указана";
        } else this.job = name;


    }


}



