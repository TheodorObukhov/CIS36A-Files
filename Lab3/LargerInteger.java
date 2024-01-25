public class LargerInteger {
    static int max(int x,int y, int z){
        int biggest = 0;
        if(x>y){
            if(x>z){
                biggest = x;
            }
        }
        if(y>x){
            if(y>z){
                biggest = y;
            }
        }
        if(z>x){
            if(z>y){
                biggest = z;
            }
        }
        return biggest;
    }
    
    public static void main(String[] args) {
        int x = (int)((Math.random())*100);
        int y = (int) ((Math.random()) * 100);
        int z = (int) ((Math.random()) * 100);
        System.out.println(max(x, y, z));
        System.out.println(x);
        System.out.println(y);
    }
}