public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String []args) {
        int x=0;
        Triangle [] Ta = new Triangle [4];
        while(x<4) {
            Ta[x] = new Triangle();
            Ta[x].height = (x + 1) * 2;
            Ta[x].length = x + 4;
            Ta[x].CalcArea();
            System.out.println("triangle " + x + ", area = " + Ta[x].area);
            x++;
        }
        }
    void CalcArea(){
        area=(height*length)/2;
    }
}
