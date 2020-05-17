package Controllers;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) throws FileNotFoundException {
//        MainController t2 = new MainController();
        addNewSerVices();
    }
    public static void addNewSerVices(){
        Scanner sc = new Scanner(System.in);
        String SERVICE_CODE = "^(SVVL||SVHO||SVRO)[-][0-9][0-9][0-9][0-9]$";
        String NAME_SERVICE = "^[A-Z][A-Z][a-z]+";
        double areaPool;
        int costForRent;
        int numberOfPeople;
        String otherService;
        int numberOfFloor;
        String typeOfRent;
        String DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        //Service Code:
        System.out.println("Service Code: SVXX-YYYY");
        String serviceCode = sc.nextLine();
        while (!Pattern.matches(SERVICE_CODE,serviceCode)){
            System.out.println("Fuck! Wrong answer");
            serviceCode = sc.nextLine();
        }
        System.out.println(serviceCode + " : "+ Pattern.matches(SERVICE_CODE,serviceCode));
//        Name of Service
        System.out.println("Name of Service:");
        String nameService = sc.nextLine();
        while (!Pattern.matches(NAME_SERVICE,nameService)){
            System.out.println("Fuck! Wrong answer");
            nameService = sc.nextLine();
        }
        System.out.println(nameService + " : "+ Pattern.matches(NAME_SERVICE,nameService));
        //AreaPool
        System.out.println("Area Pool");
        areaPool = sc.nextDouble();
        while (areaPool<30){
            System.out.println("Fuck! Wrong answer");
            areaPool = sc.nextInt();
        }
        //Cost For Rent
        System.out.println("Cost for rent:");
        costForRent = sc.nextInt();
        while (costForRent<0){
            System.out.println("Fuck! Wrong answer");
            costForRent = sc.nextInt();
        }
        //Number of people
        System.out.println("Number of people");
        numberOfPeople = sc.nextInt();
        while (numberOfPeople < 0 || numberOfPeople >20){
            System.out.println("Fuck! Wrong answer");
            numberOfPeople = sc.nextInt();
        }
        //other service
        System.out.println("Other Service");
        otherService = sc.nextLine();
        while(otherService!="massage" || otherService!="karaoke"|| otherService!="food"|| otherService!="drink"|| otherService!="car"){
            otherService =sc.nextLine();
        }
        //number of Floor
        System.out.println("Number of Floor");
        numberOfFloor = sc.nextInt();
        while (numberOfFloor<0){
            numberOfFloor = sc.nextInt();
        }
        //Date of Birth
        System.out.println("Date of Birth: dd/mm/yyyy");
        String dateOfBirth = sc.nextLine();
        while (!Pattern.matches(DATE_OF_BIRTH,dateOfBirth)) {
            System.out.println("Fuck! Wrong answer");
             dateOfBirth = sc.nextLine();
        }
        System.out.println(dateOfBirth);
    }

}

