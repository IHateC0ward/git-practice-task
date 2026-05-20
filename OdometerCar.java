// 派生クラスOdometerCarを書く
class OdometerCar extends Car{
private long totalWay;
OdometerCar(String name,double fuel,long totalWay){
super(name,fuel);
this.totalWay=totalWay;
}
void setTotalWay(long totalWay){
this.totalWay=0;
}
long getTotalWay(){
return totalWay;
}
@Override
protected boolean move(double dx,double dy){
boolean movecan=super.move(dx,dy);
if(movecan){
double dist=Math.sqrt(dx*dx+dy*dy);
totalWay +=dist;
}
return movecan;
}
}
