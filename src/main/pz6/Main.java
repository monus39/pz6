package src.main.pz6;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop();
        laptop1.label = "Apple";
        laptop1.series = "MacBook Air";
        laptop1.model = "dsf32dsf1";
        laptop1.wokingMemory = 8;
        laptop1.hardDisk = 256;
        laptop1.operationSystem = "macOS";
        laptop1.colour = "белый";
        laptop1.price = 100000;

        Laptop laptop2 = new Laptop();
        laptop2.label = "Apple";
        laptop2.series = "MacBook Pro";
        laptop2.model = "jghsf1";
        laptop2.wokingMemory = 16;
        laptop2.hardDisk = 512;
        laptop2.operationSystem = "macOS";
        laptop2.colour = "алюминевый";
        laptop2.price = 150000;

        Laptop laptop3 = new Laptop();
        laptop3.label = "Apple";
        laptop3.series = "MacBook Pro";
        laptop3.model = "jdsfsghsf1";
        laptop3.wokingMemory = 16;
        laptop3.hardDisk = 512;
        laptop3.operationSystem = "macOS";
        laptop3.colour = "золотой";
        laptop3.price = 200000;

        Laptop laptop4 = new Laptop();
        laptop4.label = "HP";
        laptop4.series = "255 g8";
        laptop4.model = "232sdfs";
        laptop4.wokingMemory = 4;
        laptop4.hardDisk = 256;
        laptop4.operationSystem = "Windows 10";
        laptop4.colour = "белый";
        laptop4.price = 50000;



        Laptop laptop5 = new Laptop();
        laptop5.label = "HP";
        laptop5.series = "255 g8";
        laptop5.model = "gdfgdfs";
        laptop5.wokingMemory = 8;
        laptop5.hardDisk = 512;
        laptop5.operationSystem = "Windows 10";
        laptop5.colour = "белый";
        laptop5.price = 70000;

        Laptop laptop6 = new Laptop();
        laptop6.label = "HP";
        laptop6.series = "255 g10";
        laptop6.model = "32gddfs";
        laptop6.wokingMemory = 16;
        laptop6.hardDisk = 512;
        laptop6.operationSystem = "Windows 10";
        laptop6.colour = "черный";
        laptop6.price = 100000;

        Laptop laptop7 = new Laptop();
        laptop7.label = "HP";
        laptop7.series = "255 g10";
        laptop7.model = "3dsfdfs";
        laptop7.wokingMemory = 16;
        laptop7.hardDisk = 512;
        laptop7.operationSystem = "Windows 10";
        laptop7.colour = "черный";
        laptop7.price = 100000;

        Laptop laptop8 = new Laptop();
        laptop8.label = "Lenovo";
        laptop8.series = "vg13";
        laptop8.model = "fsddfs";
        laptop8.wokingMemory = 8;
        laptop8.hardDisk = 512;
        laptop8.operationSystem = "Windows 10";
        laptop8.colour = "черный";
        laptop8.price = 900000;

        Laptop laptop9 = new Laptop();
        laptop9.label = "Lenovo";
        laptop9.series = "vg13";
        laptop9.model = "sdfdfs";
        laptop9.wokingMemory = 8;
        laptop9.hardDisk = 512;
        laptop9.operationSystem = "Windows 10";
        laptop9.colour = "черный";
        laptop9.price = 900000;

        Laptop laptop10 = new Laptop();
        laptop10.label = "Lenovo";
        laptop10.series = "vg13";
        laptop10.model = "fsddfs";
        laptop10.wokingMemory = 8;
        laptop10.hardDisk = 512;
        laptop10.operationSystem = "Windows 10";
        laptop10.colour = "черный";
        laptop10.price = 900000;

        Laptop laptop11 = new Laptop();
        laptop11.label = "Lenovo";
        laptop11.series = "vg13";
        laptop11.model = "fsddfs";
        laptop11.wokingMemory = 8;
        laptop11.hardDisk = 512;
        laptop11.operationSystem = "Windows 10";
        laptop11.colour = "черный";
        laptop11.price = 0;

        Laptop laptopsUser = new Laptop(); // выбор юзера (по умолчанию все ноутбуки)
        laptopsUser.label = null;
        laptopsUser.series = null;
        laptopsUser.model = null;
        laptopsUser.wokingMemory = 0;
        laptopsUser.hardDisk = 0;
        laptopsUser.operationSystem = null;
        laptopsUser.colour = null;
        laptopsUser.price = 0;

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);
        laptops.add(laptop10);

        System.out.println("Введите цифры через пробел, соответствующие необходимым критериям поиска:\n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет\n" +
                "5 - Марка ноутбука\n" +
                "6 - цена ноутбука\n");

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] request = value.split(" "); // внес параметры интересующие юзера в массив
        for (int i = 0; i <request.length ; i++) { // заносим требования юзера в laptopsUsers
            switch (request[i]){
                case "1":
                    System.out.println("введите объем (Гб) оперативной памяти(2, 4, 8, 16) ");
                    laptopsUser.wokingMemory= scanner.nextInt();
                    break;
                case "2":
                    System.out.println("введите объем (Гб) жесткого диска (128, 256, 512) ");
                    laptopsUser.hardDisk = scanner.nextInt();
                    break;
                case "3":
                    String consolText = "выберите операционную систему: " + "\n" + "1 - macOS" + "\n" + "2 - Windows 10"+ "\n" + "3- Linux" + "\n" + "4 - без операционной системы" + "\n";
                    System.out.println(consolText);
                    int operationSystemUser = scanner.nextInt();
                    switch (operationSystemUser)
                    {
                        case 1:
                            laptopsUser.operationSystem = "macOS";
                            break;
                        case 2:
                            laptopsUser.operationSystem = "Windows 10";
                            break;
                        case 3:
                            laptopsUser.operationSystem = "Linux";
                            break;
                    }
                    break;
                case "4":
                    String consol = "выберите цвет ноутбука из указанныйх вариантов: \n 1 - белый \n 2 - черный \n 3 - золотой \n 4 - алюминевый \n";
                    System.out.println(consol);
                    int colourUser =scanner.nextInt();
                    switch (colourUser)
                    {
                        case 1:
                            laptopsUser.colour = "белый";
                            break;
                        case 2:
                            laptopsUser.colour = "черный";
                            break;
                        case 3:
                            laptopsUser.colour = "золотой";
                            break;
                        case 4:
                            laptopsUser.colour = "алюминевый";
                            break;
                    }
                    break;
                case "5":
                    System.out.println("введите марку производителя ноутбука: \n 1 - Apple \n 2 - HP \n 3 - Lenovo \n 4 - Aser ");
                    int labelUser =scanner.nextInt();
                    switch (labelUser)
                    {
                        case 1:
                            laptopsUser.label = "Apple";
                            break;
                        case 2:
                            laptopsUser.label = "HP";
                            break;
                        case 3:
                            laptopsUser.label = "Lenovo";
                            break;
                        case 4:
                            laptopsUser.label = "Aser";
                            break;
                    }
                    break;
                case "6":
                    System.out.println("введите максимальную сумму(рублевый эквивалент) стоимости ноутбука без указания вида валюты");
                    laptopsUser.price = scanner.nextInt();
                    break;
                default:
                    System.out.printf(request[i] + " некоректный параметр");
            }
        }


        System.out.println(result(laptops, laptopsUser));   // выполняем запрос
    }


    static Set<Laptop> result ( Set<Laptop> laptops, Laptop laptopsUser)
    {
        Set<Laptop> res = new HashSet<>();
        for (Laptop laptop: laptops)
        {
            // если юзер не указал значения, значит  считаем что все ноутбуки подходят (null)
            if ((laptopsUser.label == null || laptop.label.equals(laptopsUser.label)) & (laptopsUser.hardDisk == 0 || laptop.hardDisk == laptopsUser.hardDisk) & (laptopsUser.wokingMemory == 0 || laptop.wokingMemory== laptopsUser.wokingMemory) & (laptopsUser.operationSystem == null || laptop.operationSystem.equals(laptopsUser.operationSystem)) & (laptopsUser.colour == null || laptop.colour.equals(laptopsUser.colour)) & (laptopsUser.price == 0 || laptop.price <= laptopsUser.price)){
                res.add(laptop);
            }

        }
        return res;
    }

}
