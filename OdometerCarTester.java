// mainメソッドを含むOdometerCarTesterクラスを書く
class OdometerCarTester{
public static void main(String[] args){
OdometerCar car=new OdometerCar("A",100,0);
System.out.println("初期場所("+ car.getX() +","+ car.getY() +")");
System.out.println("初期燃料" + car.getFuel());
System.out.println("距離" + car.getTotalWay());
if(car.move(10,10)){
System.out.println("移動成功");}
else{
System.out.println("移動失敗");
}
System.out.println("現在場所("+ car.getX() +","+ car.getY() +")");
System.out.println("現在燃料" + car.getFuel());
System.out.println("距離" + car.getTotalWay());
if(car.move(30,30)){
System.out.println("移動成功");}
else{
System.out.println("移動失敗");
}
System.out.println("現在場所("+ car.getX() +","+ car.getY() +")");
System.out.println("現在燃料" + car.getFuel());
System.out.println("距離" + car.getTotalWay());
}
}
