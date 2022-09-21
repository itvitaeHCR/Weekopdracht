import java.util.Scanner;

/**
 * Maak een nieuwe console applicatie met IDEA; Noem deze applicatie 'Phoneshop'
 * De console app moet een lijst met de merken en types van de 5 telefoons laten zien. Voor elk toestel moet een nummer komen.
 * Een gebruiker kan via zijn toetsenbord een nummer kiezen: Als het nummer incorrect is moet er een melding getoond worden.
 * Als de gebruiker dat heeft gedaan moet het scherm geleegd worden en product informatie getoond worden als volgt:
 * {merk} {type} {prijs}
 * {omschrijving}
 * Een gebruiker kan dan op een willekeurige toets drukken. Hierbij kom je weer terug bij de lijst van telefoons waar je
 * opnieuw een keuze kan maken.
 */


public class Main {
    static Phone phone1 = new Phone("Huawei", "P30", 697, "6.47\" FHD+ (2340x1080) OLED, Kirin 980 Octa-Core (2x Cortex-A76 2.6GHz + 2x Cortex-A76 1.92GHz + 4x Cortex-A55 1.8GHz), 8GB RAM, 128GB ROM, 40+20+8+TOF/32MP, Dual SIM, 4200mAh, Android 9.0 + EMUI 9.1.");
    static Phone phone2 = new Phone("Samsung", "Galaxy A52", 399, "64 megapixel camera, 4k videokwaliteit 6.5 inch AMOLED scherm 128 GB opslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig (IP67).");
    static Phone phone3 = new Phone("Apple", "Iphone 11", 619, "Met de dubbele camera schiet je in elke situatie een perfecte foto of video. De krachtige A13-chipset zorgt voor razendsnelle prestaties. Met Face ID hoef je enkel en alleen naar je toestel te kijken om te ontgrendelen. Het toestel heeft een lange accuduur dankzij een energiezuinige processor.");
    static Phone phone4 = new Phone("Google", "Pixel 4a", 411, "12.2 megapixel camera, 4k videokwaliteit 5.81 inch OLED scherm 128 GB opslaggeheugen 3140 mAh accucapaciteit.");
    static Phone phone5 = new Phone("Xiaomi", "Redmi Note 10 Pro", 298, "108 megapixel camera, 4k videokwaliteit 6.67 inch AMOLED scherm 128 GB opslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig (IP53).");


    public static void main(String[] args) {


        menu();


//        printPhone(phone1);
//        printPhone(phone2);
//        printPhone(phone3);
//        printPhone(phone4);
//        printPhone(phone5);
    }
    public static void printPhone(Phone phone) {
        System.out.print(phone.phoneMerk + " ");
        System.out.print(phone.phoneType + ", ");
        System.out.println("€ " + phone.phonePrijs + ".");
        System.out.println(phone.phoneOmschrijving);
    }

    public static void menuPrintPhone(Phone phone) {
        System.out.print(phone.phoneMerk + " ");
        System.out.println(phone.phoneType);
    }

    public static void menu() {
        System.out.println("Welcome to the Phoneshop!");
        System.out.println("Please type the number of the phone you would like to view: ");
        System.out.println();
        System.out.print("    1:    ");
        menuPrintPhone(phone1);
        System.out.print("    2:    ");
        menuPrintPhone(phone2);
        System.out.print("    3:    ");
        menuPrintPhone(phone3);
        System.out.print("    4:    ");
        menuPrintPhone(phone4);
        System.out.print("    5:    ");
        menuPrintPhone(phone5);
        System.out.println();

        Scanner newNumber = new Scanner(System.in);
        System.out.print("Your choice: ");
        int number = newNumber.nextInt();

        // EMPTY CONSOLE HERE!

        switch (number) {
            case 1:
                printPhone(phone1);
                break;
            case 2:
                printPhone(phone2);
                break;
            case 3:
                printPhone(phone3);
                break;
            case 4:
                printPhone(phone4);
                break;
            case 5:
                printPhone(phone5);
                break;
            default:
                System.out.println("Please pick a valid number");
                menu();
        }
    }

}
