/*
 Try This 2-1
 Compute the distance to a lightning
 strike whose sound takes 7.2 seconds
 to reach you.
*/
class Sound {
    public static void main(String[] args) {
        double distance, echoTime, oneWayTime;
        echoTime = 4.6; //seconds
        oneWayTime = echoTime/2;

        distance = oneWayTime * 1100;
        System.out.println("The lightning is approximately " + distance +
                " feet away.");
    }
}
