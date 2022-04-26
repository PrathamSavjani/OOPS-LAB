import java.util.Scanner;
class MyPoint{
    double x;
    double y;
    void getCoordinates(){
        System.out.println("The coordinates of this object are:"+x+","+y);
    }
    public MyPoint(){
        x=y=0;
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    double distance(MyPoint p){
        return (Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y, 2)));
    }
    double distance(double x,double y){
        return (Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y, 2)));
    }   
}
class ThreeDPoint extends MyPoint{
    double z;
    public ThreeDPoint(){
        super();
        z=0;
    }
    public ThreeDPoint(double x,double y,double z){
        super(x,y);
        this.z=z;
    }
    double getCoordinate(){
        return z;
    }
    double distance(double x,double y,double z){
        return (Math.sqrt(Math.pow(super.x-x,2)+Math.pow(super.y-y, 2)+Math.pow(this.z-z,2)));
    }
}
class Two{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the co-ordinates x, y and z:");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        ThreeDPoint p1=new ThreeDPoint();
        double dist=p1.distance(x,y,z);
        System.out.println("the distance between ("+p1.x+","+p1.y+","+p1.z+") and ("+x+","+y+","+z+") will be:"+dist);
    }
}