package com.sparta.nam.memorymodel;


public class MemoryModel {
    public static void main(String[] args) {

        // walkthrough part 1
//        int khadijah = 5;
//        int chris = khadijah;
//        chris++;
//        String desislava = "Desislava";
//
//        var wajiha = desislava.toUpperCase();
//        int[] virooshny = {2, 7, 8, 1};
//        khadijah = virooshny[2];
//
//
//        var lucy = virooshny;
//        lucy[2] = 10;

        // this is the end of the method  Unwind the stack - ask everyone to sit down one by one starting at the top of the stack
        // at this point run the garbage collector: (it normally runs when the heap is getting full)
        // 1. Identify the objects on the heap that are not reachable from the stack
        // 2. set the references to them to null (detach the from the strings)
        // 3. compact the heap - move the remaining objects on the heap together


        // Part 2 - comment out part 1 and uncomment this section

        var sherin = new Person("Sherin", "Binny");
        sherin.setFirstName("Dav");
        var aiden = 3.6;
        String nahisah = "Nahisah";
        int result = processPerson(sherin, aiden); // 7
        System.out.println(sherin.getFirstName());

        for(int nish = 0; nish <= 5; nish++){
            System.out.println(nish);
        }
    }

    public static int processPerson (Person ahmed, double diana){
        var sathi = "Sathi";
        ahmed.setFirstName("Bob");
        diana *= 2;
        return (int) diana;
    }

}