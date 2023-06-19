public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(" 1-3 Задач, создать переменные ");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2() {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(" 2-3 Задач, прибавить к переменным ");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(" 3-3 Задач, вычеслить из переменных ");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {

        var friend = 19;

        System.out.println("4-5 Задач");

        System.out.println(friend);

        friend = friend * 2;

        System.out.println(friend);
        friend = friend / 7;

        System.out.println(friend);
    }

    public static void task5() {

        var frog = 3.5;

        System.out.println("5-5 Задач");
        System.out.println(frog);

        frog = frog * 10;

        System.out.println(frog);

        frog = frog / 3.5;

        System.out.println(frog);

        frog = frog + 4;

        System.out.println(frog);
    }

    public static void task6() {

        var fighterTayson = 78.2;
        var fighterHolyfield = 82.7;
        var totalWeight = fighterTayson + fighterHolyfield;
System.out.println("6-8 Задач");
        System.out.println( " Общий вес двух боксеров " + totalWeight + "кг");

        var weightDifference = (fighterTayson - fighterHolyfield);

        System.out.println(" Разница в весе " + weightDifference + "кг" ) ;
    }


    public static void task7(){

        var  fighterTayson = 78.2;
        var  fighterHolyfield = 82.7;
        System.out.println("7-8 Задач");
        System.out.println (  fighterHolyfield - fighterTayson + " кг больше Holyfield ");

        var weightDifference = (fighterHolyfield - fighterTayson) ;
        var overweight = (fighterHolyfield + fighterTayson ) % weightDifference;

                System.out.println(  "Перевес " + weightDifference + "кг");


    }

    public static void task8(){

        var hours = 640;
        var workingHours = 8;
        System.out.println("8-8 Задач");
        System.out.println("Если в компании работает " + hours / workingHours + " человек ");

        var workers = hours / workingHours;
        var newWorkers = 94;
        var totalNumberOfEmployees = workers + newWorkers;

        System.out.println(" Общих работников " + totalNumberOfEmployees);

        var hoursPerEmployee = hours / totalNumberOfEmployees;

        System.out.println("То всего " + hoursPerEmployee + " часa работы может быть поделено между сотрудниками ».");
    }
}
