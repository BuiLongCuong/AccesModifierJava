package Circle;

 class Circle{
//    private int id;
//    private double radius;
//    static final double PI=3.14;
//    static private double maxRadius;
//    static int count;
//
//     public Circle( double radius) {
//         this.id = ++count;
//         this.radius = radius;
////         if(maxRadius<radius){
////             maxRadius=radius;
////             System.out.println();
////         }
//     }
//
//     public Circle() {
//         this.id = ++count;
//     }
//
//
//     public int getId() {
//         return id;
//     }
//
//     public double getRadius() {
//         return radius;
//     }
//
//     public void setRadius(double radius) {
//         this.radius = radius;
//     }
//
//     public void setId(int id) {
//         this.id = id;
//     }
//
//     public double tinhDientich() {
//       double S = PI*radius*radius;
//       return S;
//    }
//
//    public double tinhChuVi(){
//         double CV = PI*2*radius;
//         return CV;
//    }
//    public static double maxRadius(Circle[] arr, int size){
//        for (int i = 0; i < size; i++) {
//            if(maxRadius < arr[i].getRadius() ){
//                maxRadius =arr[i].getRadius();
//            }
//        }
//        return maxRadius;
//    }
//    public static double sum(Circle[] arr, int size){
//         double sum=0;
//        for (int i = 0; i < size; i++) {
//           sum+=arr[i].tinhDientich();
//        }
//        return sum;
//    }
// }
//
//
//
//public class Main {
//    public static void main(String[] args) {
//Circle[] arr = new Circle[10];
//int size = 3;
//Circle ht1 = new Circle(5.3);
//Circle ht2 = new Circle(5.1 );
//Circle ht3 = new Circle(6.1);
//arr[0]=ht1;
//arr[1]=ht2;
//arr[2]=ht3;
//        System.out.println(Circle.count);
//        System.out.println(ht1.getId());
//        System.out.println("Diện tích hình tròn là:"+ht1.tinhDientich());
//        System.out.println(ht1.tinhChuVi());
//
//        System.out.println(ht2.tinhDientich());
//        System.out.println(ht3.tinhDientich());
//
//        System.out.println(Circle.maxRadius(arr,3));
//        System.out.println(Circle.sum(arr,3));


     private int id;
     private double radius;
     private static final double PI = 3.14;
     private static int idIncrement = 1;
     public static int countObject = 0;
     public static double maxRadius = 0;
     public static double sumS = 0;


     public Circle(double radius) {
         this.id = idIncrement;
         this.radius = radius;
         idIncrement++;
         countObject++;

         // Tìm max của các hình trong
         if (radius > maxRadius) {
             maxRadius = radius;
         }

         double s = getS();
         sumS = sumS + s;
     }

     public double getS() {
         return PI * Math.pow(this.radius, 2);
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }
 }

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( 5.3);
        System.out.println(circle.getId());
        Circle circle2 = new Circle( 5.1);
        System.out.println(circle2.getId());
        Circle circle3 = new Circle( 6.1);
        System.out.println(circle3.getId());
        System.out.println("Số lượng đối tượng của lớp circle là: " + Circle.countObject);
        System.out.println("Hình tròn có bán kính lớn nhất là : " + Circle.maxRadius);
        System.out.println("Tổng diện tích của các hình tròn là : " + Circle.sumS);

    }
}