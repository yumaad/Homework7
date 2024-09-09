public class Main {
    public static void main(String[] args) {
        // task #1
        System.out.println();
        float capital = 0;
        int month = 0;
        while (capital <= 2459000)
        {
            capital = (capital + 15000) * 1.01f;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + capital +" рублей");
        }

        // task #2
        System.out.println();
        int counter = 0;
        while(counter < 10)
        {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (;counter>0;)
        {
            System.out.print(counter + " ");
            counter --;
        }

        // task #3
        System.out.println("\n");
        int population = 12000000;
        float birthRate = 17f / 1000f;
        float deathRate = 8f / 1000f;
        int year = 0;
        while (year < 10)
        {
            year++;
            population += population * ( birthRate - deathRate);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

        // task #4
        System.out.println();
        double capital2 = 0;
        int i=0;
        while (capital2 < 12000000)
        {
            i++;
            capital2 = (capital2 + 15000) * 1.07f;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f",capital2) +" рублей");
        }

        // task #5
        System.out.println();
        capital2 = 0;
        i=0;
        while (capital2 < 12000000) {
            i++;
            capital2 = (capital2 + 15000) * 1.07f;
            if (i % 6 == 0)
            {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", capital2) + " рублей");
            }
        }

        // task #6
        System.out.println();
        capital2 = 0;
        month=0;
        while (month < 9*12) {
            month++;
            capital2 = (capital2 + 15000) * 1.07f;
            if (month % 6 == 0)
            {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", capital2) + " рублей");
            }
        }

        // task #7
        System.out.println();
        int firstFriday = 1;
        int days = 31;
        counter = 0;
        while (firstFriday <= days & counter < 5)
        {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday+=7;
            counter++;
        }

        // task #8
        System.out.println();
        int currentYear = 2024;
        int a = currentYear - 200;
        int b = currentYear + 100;
        while ( a < b)
        {
            if (a % 79 == 0)
            {
                System.out.println(a);
            }
            a++;
        }
    }
}