package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class creditCard {

    public static void main(String[] args) throws IOException {
        List<String> arr = new ArrayList<>(List.of(new String[]{"0 6", "deposit 10", "reservation 20", "pay 5", "deposit 10", "deposit 10", "reservation 6"}));
        List<String> arr2 = new ArrayList<>(List.of(new String[]{"0 6", "deposit 10", "pay 5", "reservation 5", "reservation 5", "pay 5", "deposit 10"}));
        List<Integer> reservation = new ArrayList<Integer>();
        List<Integer> waiting = new ArrayList<Integer>();
        int deposit = Integer.parseInt(arr.get(0).split(" ")[0]);
        int times = Integer.parseInt(arr.get(0).split(" ")[1]);
        System.out.println("first deposit :: "+deposit);


        for (int i = 1; i < arr2.size(); i++) {
            int amount = amount(arr2.get(i));
            String type = type(arr2.get(i));
            System.out.println("type :: "+ type + " // amount :: "+ amount);
            if(type.equals("deposit")){
                deposit += amount;
            }else if(type.equals("pay")){
                if(deposit > amount){ deposit -= amount;}
            }else if(type.equals("reservation")){
                waiting = new ArrayList<Integer>();
                if(deposit < amount || reservation.contains(amount)){
                    reservation.add(amount);
                    System.out.println(reservation);
                }else {
                    deposit -= amount;
                    System.out.println(reservation);
                }

                for (int e = 0; e < reservation.size(); e++) {
                    if (deposit < reservation.get(e)){
                        waiting.add(reservation.get(e));
                    }else {
                        deposit -= reservation.get(e);
                    }
                }
                reservation = waiting;
                System.out.println("deposit :: "+deposit);
            }
        }

        System.out.println(deposit +"//"+ times);

    }
    public static String type(String str){
        String[] arr = str.split(" ");
        return arr[0];
    }
    public static int amount(String str){
        String[] arr = str.split(" ");
        return Integer.parseInt(arr[1]);
    }
}
