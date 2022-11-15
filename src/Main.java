public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Маским", "Минск", -2, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 20, "директор по развитию бизнеса");


        System.out.println("Привет! Меня зовут " + maksim.name + "." + " Я из города " + maksim.town + "." + " Мне " + maksim.yearOfBirth + " лет. Я работаю на должности " + maksim.job + "." + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + "." + " Я из города " + anya.town + "." + " Мне " + anya.yearOfBirth + " лет. Я работаю на должности " + anya.job + "." + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + "." + " Я из города " + katya.town + "." + " Мне " + katya.yearOfBirth + " лет. Я работаю на должности " + katya.job + "." + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + "." + " Я из города " + artem.town + "." + " Мне " + artem.yearOfBirth + " лет. Я работаю на должности " + artem.job + "." + " Будем знакомы!");


        Car lada = new Car(null, "Grande", 1.7, "желтого цвета", 2015, "России");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черного цвета", 0, "Германии");
        Car bmw = new Car("BMW", null, 3, null, 0, "Германии");
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красного цвета", 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.4, "оранжевого цвета", 2016, "Южной Корее");

        System.out.println(lada.brand + " " + lada.model + " " + lada.productionYear + " год выпуска. Сборка в " + lada.productionCountry + "." + " Кузов " + lada.color + " Объем двигателя - " + lada.engineVolume);
        System.out.println(bmw.brand + " " + bmw.model + " " + bmw.productionYear + " год выпуска. Сборка в " + bmw.productionCountry + "." + " Кузов " + bmw.color + " Объем двигателя - " + bmw.engineVolume);


        /**
         Human maksim = new Human();
         maksim.name = "Максим ";
         maksim.town = "Минск ";
         maksim.yearOfBirth = 35;
         maksim.job = " бренд-менеджер";
         maksim.greetingOutput();

         Human anya = new Human();
         anya.name = "Аня ";
         anya.town = "Москва ";
         anya.yearOfBirth = 29;
         anya.job = "методист образовательных программ";
         anya.greetingOutput();

         Human katya = new Human();
         katya.name = "Катя ";
         katya.town = "Калиниград ";
         katya.yearOfBirth = 28;
         katya.job = "продакт-менеджер";
         katya.greetingOutput();

         Human artem = new Human();
         artem.name = "Артём ";
         artem.town = "Москва ";
         artem.yearOfBirth = 27;
         artem.job = "директор по развитию бизнеса";
         artem.greetingOutput();



         System.out.println();
         System.out.println(" 3 Задание");

         Car lada = new Car();
         lada.model = "Lada";
         lada.brand = "Grande, ";
         lada.productionYear = 2015;
         lada.productionCountry = "России";
         lada.color = "желтого цвета,";
         lada.engineVolume = 1.7;
         lada.displayingInformationAboutEachMachine();

         Car audi = new Car();
         audi.model = "Audi";
         audi.brand = "A8 50 L TDI quattro, ";
         audi.productionYear = 2020;
         audi.productionCountry = "Германии";
         audi.color = "черного цвета, ";
         audi.engineVolume = 3;
         audi.displayingInformationAboutEachMachine();

         Car bmw = new Car();
         bmw.model = "BMW";
         bmw.brand = "Z8, ";
         bmw.productionYear = 2021;
         bmw.productionCountry = "Германии";
         bmw.color = "черного цвета, ";
         bmw.engineVolume = 3;
         bmw.displayingInformationAboutEachMachine();

         Car kia = new Car();
         kia.model = "Kia";
         kia.brand = "Sportage 4 поколение, ";
         kia.productionYear = 2018;
         kia.productionCountry = "Южной Корее";
         kia.color = "красного цвета, ";
         kia.engineVolume = 2.4;
         kia.displayingInformationAboutEachMachine();

         Car hyundai   = new Car();
         hyundai.model = "Hyundai ";
         hyundai.brand = "Avante, ";
         hyundai.productionYear = 2016;
         hyundai.productionCountry = "Южной Корее";
         hyundai.color = "оранжевого цвета, ";
         hyundai.engineVolume = 1.6;
         hyundai.displayingInformationAboutEachMachine();



         }

         }
         /* *
         *
         */


    }
}
