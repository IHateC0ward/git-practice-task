// 自動車クラス【第１版】Carを書く
class Car{
  // feature branch edit
private String name;
private double x;
private double y;
private double fuel;
Car(String name,double fuel){
this.name=name;
this.fuel=fuel;
x=y=0.0;
}
double getX(){
return x;
}
double getY(){
return y;
}
double getFuel(){
return fuel;
}
void putSpec(){
System.out.println("名前:" + name);
}
boolean move(double dx,double dy){
double dist=Math.sqrt(dx*dx+dy*dy);
if(dist>fuel)
return false;
else{
fuel-=dist;
x+=dx;
y+=dy;
return true;
}
}
}
