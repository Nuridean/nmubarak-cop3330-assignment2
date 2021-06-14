package oop.assignment2.ex31.base;

public class KarvonenCalc {
    public static String calculation(int age, int heartrate){
        System.out.print("Resting Pulse: " + heartrate + " Age: " + age +"\n");
        int intensity = 55;
        String output = "test";
        //int MHR = 220- age;
        //int THR = MHR *  (intensity/100);

        while (intensity < 96)
        {
            int targetHeartRate = (((220 - age) - heartrate) * intensity/100) + heartrate;
            output = (intensity + "% \t" + targetHeartRate + "bpm\n" );
            System.out.print(intensity + "% \t" + targetHeartRate + "bpm\n" );
            intensity += 5;
            
        }
        if(intensity > 96)
            output = "string";
            return output;

    }
}
