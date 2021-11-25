public class Lesson1 {
    public static void main(String[] args) {

    }
    byte a =1;
    short b =2;
    int  c = 3;
    long d=4;
    float e = 4.1f;
    double f =4.2;
    char j = 'a';
    boolean k = true;

    double calculateFormula (int a,int b,int c,int d){
        return a * (b + (c / d));
    }
    boolean betweenTenAndTwenty(int a,int b){
        return (a+b>=10 && a+b<=20)?true:false;

    }
    void trueOrFalse(int a){
        if (a>=0){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }

    }

    boolean ifNegativeThatFalse(int a){
        if (a<0){
            return true;
        }else return false;
    }

    void helloName(String name){
        System.out.printf("Привет, %s!",name);
    }

    void isLeapYear(int year){
        if (year%4!=0 || year%100==0){
            if (year%400==0){
                System.out.println("Год високосный");
            }else {
                System.out.println("Год не високосный");
            }

        }else {
            System.out.println("Год високосный");
        }
    }

}
