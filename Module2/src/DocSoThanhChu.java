import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numberArr = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        System.out.println("Emter a number:0");
        int number = sc.nextInt();
        if(number <= 20) {
            switch (number) {
                case 0:
                    System.out.println(numberArr[number]);
                    break;
                case 1:
                    System.out.println(numberArr[number]);
                    break;
                case 2:
                    System.out.println(numberArr[number]);
                    break;
                case 3:
                    System.out.println(numberArr[number]);
                    break;
                case 4:
                    System.out.println(numberArr[number]);
                    break;
                case 5:
                    System.out.println(numberArr[number]);
                    break;
                case 6:
                    System.out.println(numberArr[number]);
                    break;
                case 7:
                    System.out.println(numberArr[number]);
                    break;
                case 8:
                    System.out.println(numberArr[number]);
                    break;
                case 9:
                    System.out.println(numberArr[number]);
                    break;
                case 10:
                    System.out.println(numberArr[number]);
                    break;
                case 11:
                    System.out.println(numberArr[number]);
                    break;
                case 12:
                    System.out.println(numberArr[number]);
                    break;
                case 13:
                    System.out.println(numberArr[number]);
                    break;
                case 14:
                    System.out.println(numberArr[number]);
                    break;
                case 15:
                    System.out.println(numberArr[number]);
                    break;
                case 16:
                    System.out.println(numberArr[number]);
                    break;
                case 17:
                    System.out.println(numberArr[number]);
                    break;
                case 18:
                    System.out.println(numberArr[number]);
                    break;
                case 19:
                    System.out.println(numberArr[number]);
                    break;
                case 20:
                    System.out.println(numberArr[number]);
                    break;
            };
        }else if(number >20 && number <30){
            System.out.println("Twenty "+ numberArr[number - 20]);
            }else if(number >29 && number <40) {
            if (number == 30) {
                System.out.println("Thirty");
            } else {
                System.out.println("Thirty " + numberArr[number - 30]);
            }
        }else if(number >39 && number <50) {
            if (number == 40) {
                System.out.println("Forty");
            } else {
                System.out.println("Forty " + numberArr[number - 40]);
            }
        }
        else if(number >49 && number <60) {
            if (number == 50) {
                System.out.println("Fifty");
            } else {
                System.out.println("Fifty " + numberArr[number - 50]);
            }
        }else if(number >59 && number <70) {
            if (number == 60) {
                System.out.println("Sixty");
            } else {
                System.out.println("Sisty " + numberArr[number - 60]);
            }
        }else if(number >69 && number <80) {
            if (number == 70) {
                System.out.println("Seventy");
            } else {
                System.out.println("Seventy " + numberArr[number - 70]);
            }
        }else if(number >79 && number <90) {
            if (number == 80) {
                System.out.println("Eighty");
            } else {
                System.out.println("Eighty " + numberArr[number - 80]);
            }
        }else if(number >89 && number <100) {
            if (number == 90) {
                System.out.println("Ninety");
            } else {
                System.out.println("Ninety " + numberArr[number - 90]);
            }
        }
    }
}
