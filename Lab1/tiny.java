public class tiny {
    public static void main(String[] args)
    {
        double a, b, c;
        a = Math.random();
        b = Math.random();
        c = Math.random();
        int count = 0;
        double[] array = {a,b,c};

        if ((a>0.5)&&(b>0.5)&&(c>0.5)){
            System.out.println("None are tiny");
        }
        else{
            for(int i=0;i<3;i++){
                if (array[i]<0.5)
                {
                    count +=1;
                }
            }
            if (count == 1){
                System.out.println("One is tiny");
            }
            else{
                if (count==2){
                    System.out.println("Only two are tiny");
                }
                else{
                    System.out.println("All are tiny");
                }
            }
        }
        //debug
        System.out.println(a + "\t" + b + "\t" + c);
    }
}
