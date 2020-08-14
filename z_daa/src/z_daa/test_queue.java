package z_daa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class test_queue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Rate of Arrival : ");
        long lambda = s.nextInt();
        System.out.println("Service Time : ");
        long serviceTime = s.nextInt();

        System.out.println("Number of servers given is 2 : ");

        System.out.println("Enter the number of users to arrive today : ");
        int n = s.nextInt();

        ArrayList<Integer> time = new ArrayList<>();
        HashMap<Integer,String> names = new HashMap<>();
        for(int i = 0;i<n;i++) {
            time.add(s.nextInt());
            String name = s.next();
            if(names.get(time.get(time.size()-1))!=null){
                System.out.println("Customer already arrived at that time ");
                time.remove(time.size()-1);
                continue;
            }
            names.put(time.get(time.size()-1),name);
        }


        Collections.sort(time);

        int currTime1 = 0;
        int currTime2 = 0;

        System.out.println("   Name           Arrival Time  Server           Allocated Time     Waiting Time");

        if(n>=1){
            System.out.println();
            System.out.println("   "+names.get(time.get(0))+ "    " + time.get(0) + "                  " + "server1" + "         "+ time.get(0) + "               "+"0");
            currTime1 = time.get(0);
            if(n==1)
                return;
        }
        currTime2 = time.get(1);
        System.out.println("   "+names.get(time.get(1))+ "            " + time.get(1) + "                  " + "server2"+ "              "+ currTime2+ "               " + "0");



        for(int i = 2;i<time.size();i++){
            int currTime = time.get(i);
            if(currTime-currTime1>=serviceTime){
                currTime1 = time.get(i);

                System.out.println("   "+names.get(time.get(i))+ "         " + time.get(i) + "                  " + "server1" +"         " + currTime1+ "               " +"0");
                continue;
            }else if(currTime-currTime2>=serviceTime){
                currTime2 = time.get(i);

                System.out.println("   "+names.get(time.get(i))+ "          " + time.get(i) + "                  " + "server2"+ "        "+ currTime2+ "               " +"0");
            continue;
            }

            if(currTime-currTime1>=currTime-currTime2){
                currTime1 += serviceTime;
                System.out.println("   "+names.get(time.get(i))+ "            " + time.get(i) + "                  " + "server1" +"          " + currTime1+ "               " +(currTime1-currTime));
            }else{
                currTime2 += serviceTime;
                System.out.println("   "+names.get(time.get(i))+ "             " + time.get(i) + "                  " + "server2"+ "          "+ currTime2+ "               " +(currTime2-currTime));
            }
        }
    }
}
