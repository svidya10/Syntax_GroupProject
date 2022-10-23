package Project_OOPS;
public class P3_Car {
    double carPrice;
    String color;
    double discountPrice;
    double calculateSalePrice(double a){
        return discountPrice;
    }
}
class Sedan extends P3_Car{
    double length;
    double carPrice = 25000;
    double calculateSalePrice(double length) {
        if (length > 20) {
            discountPrice = carPrice - ((carPrice * 5) / 100);
        } else{
            discountPrice = carPrice - ((carPrice * 10) / 100);
    }
        return discountPrice;
    }
}
class Truck extends P3_Car{
    double weight;
    double carPrice = 30000;
    double discountPrice;
    double calculateSalePrice(double weight){
        if (weight>2000){
            discountPrice = carPrice-((carPrice*10)/100);
        }else
            discountPrice = carPrice-((carPrice*20)/100);
        return discountPrice;
    }
}
class TestCar{
    public static void main(String args[]){
        System.out.println(new Truck().calculateSalePrice(2003));
        System.out.println(new Sedan().calculateSalePrice(19));
    }
}
