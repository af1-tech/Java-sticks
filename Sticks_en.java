package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bete {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Sticks - Java version");
        System.out.println("Programmer: Steciuc Angel Florentin");
        System.out.println("The basic rule is: the one who cuts the last piece has lost the game!");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int nr_juc=0;
        String nume1="";
        String nume2="";
        int loop=10;
        int rnd=0;
        int bte=0;
        int dificultate=0;
        int loop1=10;
        System.out.println("Choose the difficulty level: ");
        System.out.println("1 - Easy");
        System.out.println("2 - Standard");
        System.out.println("3 - Hard");
        while (loop!=0) {
            try {
                System.out.println("Input the chosen option:");
                dificultate = scan.nextInt();
                if ((dificultate == 1) || (dificultate == 2) || (dificultate == 3)) {
                    loop = 0;
                } else {
                    System.out.println("You have entered a wrong option!");
                    loop = 10;
                }
            } catch (Exception e) {
                System.out.println("You have entered a wrong option!");
                scan.next();
            }
        }

        System.out.println("Choose the number of players:");
        System.out.println("1 - One player vs A.I.");
        System.out.println("2 - Two players");
        loop=10;
        while (loop!=0) {
            try {
                System.out.println("Input the chosen option:");
                nr_juc = scan.nextInt();
                scan.nextLine();
                if (nr_juc == 1) {
                    System.out.println("Enter the name of the player:");
                    nume1 = scan.nextLine();
                    loop = 0;
                } else if (nr_juc == 2) {
                    System.out.println("Enter the name of the first player:");
                    nume1 = scan.nextLine();
                    System.out.println("Enter the name of the second player:");
                    nume2 = scan.nextLine();
                    loop = 0;
                } else {
		    System.out.println("You have entered a wrong option!");
                    loop = 10;
                }
            } catch (Exception e) {
                System.out.println("You have entered a wrong option!");
                scan.next();
            }
        }

        // creare si afisare initiala a betelor
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();
        List<Character> list4 = new ArrayList<>();
        if (dificultate == 1) {
            System.out.print("1st Row   ");
            for (int i = 0; i < 1; i++) {
                list1.add('|');
                System.out.print(list1.get(i) + " ");
            }
            System.out.print("\n");
            System.out.print("2nd Row   ");
            for (int i = 0; i < 3; i++) {
                list2.add('|');
                System.out.print(list2.get(i) + " ");
            }
            System.out.print("\n");
            System.out.print("3rd Row   ");
            for (int i = 0; i < 5; i++) {
                list3.add('|');
                System.out.print(list3.get(i) + " ");
            }
            System.out.print("\n");
        }
        else if (dificultate == 2){
            System.out.print("1st Row   ");
            for (int i = 0; i < 3; i++) {
                list2.add('|');
                System.out.print(list2.get(i) + " ");
            }
            System.out.print("\n");
            System.out.print("2nd Row   ");
            for (int i = 0; i < 5; i++) {
                list3.add('|');
                System.out.print(list3.get(i) + " ");
            }
            System.out.print("\n");
            System.out.print("3rd Row   ");
            for (int i = 0; i < 7; i++) {
                list4.add('|');
                System.out.print(list4.get(i) + " ");
            }
            System.out.print("\n");
        }
        else if (dificultate == 3){
            System.out.print("1st Row   ");
            for (int i = 0; i < 1; i++) {
                list1.add('|');
                System.out.print(list1.get(i) + " ");
            }
            System.out.print("\n");
            System.out.print("2nd Row   ");
            for (int i = 0; i < 3; i++) {
                list2.add('|');
                System.out.print(list2.get(i) + " ");
            }
            System.out.print("\n");
            System.out.print("3rd Row   ");
            for (int i = 0; i < 5; i++) {
                list3.add('|');
                System.out.print(list3.get(i) + " ");
            }
            System.out.print("\n");
            System.out.print("4th Row   ");
            for (int i = 0; i < 7; i++) {
                list4.add('|');
                System.out.print(list4.get(i) + " ");
            }
            System.out.print("\n");
        }

        int rand = 0;
        int nr_ales = 0;
        byte jucator = 0;

        // cuprins joc

     if ((nr_juc == 1) && (dificultate==1)){
         loop = 10;
         while (loop != 0) {
             if (jucator == 0) {
                 // selectare rand
                 loop1 = 10;
                 while (loop1 != 0) {
                     System.out.println();
                     System.out.println(nume1 + "'s turn" );
                     System.out.println("Input the row you choose:");
                     try {
                         rand = scan.nextInt();
                         if ((rand > 0) && (rand <= 3)) {
                             if ((rand == 1) && (list1.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else if ((rand == 2) && (list2.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else if ((rand == 3) && (list3.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else {
                                 loop1 = 0;
                             }
                         } else {
                             System.out.println("You have entered a wrong option!");
                             loop1 = 10;
                         }
                     }catch (Exception e){
                         System.out.println("You have entered a wrong option!");
                         scan.next();
                     }
                 }

                 // selectare numar bete de taiat
                 loop1 = 10;
                 while (loop1 != 0) {
                     System.out.println("How many sticks do you want to cut? ");
                     try {
                         nr_ales = scan.nextInt();
                         if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list1.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks:");
                         } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks:");
                         } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks:");
                         } else {
                             loop1 = 0;
                         }
                     }catch (Exception e){
                         System.out.println("You have entered a wrong option!");
                         scan.next();
                     }
                 }
                 System.out.println("You chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

                 //aplicare alegeri
                 if (rand == 1) {
                     for (int i = 0; i < nr_ales; i++) {
                         list1.remove(list1.size() - 1);
                     }
                 } else if (rand == 2) {
                     for (int i = 0; i < nr_ales; i++) {
                         list2.remove(list2.size() - 1);
                     }
                 } else if (rand == 3) {
                     for (int i = 0; i < nr_ales; i++) {
                         list3.remove(list3.size() - 1);
                     }
                 }

                 //afisare noua tabela de joc
                 System.out.print("1st Row   ");
                 for (int i = 0; i < list1.size(); i++) {
                     System.out.print(list1.get(i) + " ");
                 }
                 System.out.print("\n");
                 System.out.print("2nd Row   ");
                 for (int i = 0; i < list2.size(); i++) {
                     System.out.print(list2.get(i) + " ");
                 }
                 System.out.print("\n");
                 System.out.print("3rd Row   ");
                 for (int i = 0; i < list3.size(); i++) {
                     System.out.print(list3.get(i) + " ");
                 }
                 System.out.print("\n");
                 if (list1.size() + list2.size() + list3.size() == 0) {
                     System.out.println("A.I. won!");
                     loop = 0;
                 } else {
                     jucator = 1;
                 }

             }
             //Mutare A.I.
             if (jucator == 1) {
                 //Rationament A.I.
                 System.out.println();
                 System.out.println("A.I.'s turn");
                 // cazul par par par
                 if ((list1.size() %2 == 0) && (list2.size()%2==0) && (list3.size()%2==0)) {
                     if ((list2.size() == 2) && (list3.size() > 2)) {
                         while (list3.size() != 2) {
                             list3.remove(list3.size() - 1);
                             rnd=3;
                             bte=bte+1;
                         }
                     } else if ((list2.size() == 2) && (list3.size() == 2)) {
                         list3.remove(list3.size() - 1);
                         rnd=3;
                         bte=bte+1;
                     }
                     else if ((list2.size() == 0) && (list3.size() >= 2)) {
                         while (list3.size() != 1) {
                             list3.remove(list3.size() - 1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                     else if ((list2.size() == 2) && (list3.size() == 0)) {
                         list2.remove(list2.size() - 1);
                         rnd = 2;
                         bte = bte + 1;
                     }
                 }
                 //cazul impar impar impar
                  else if ((list1.size() %2 != 0) && (list2.size()%2!=0) && (list3.size()%2!=0)) {
                      if ((list2.size()==1) && (list3.size()==1)){
                          list3.remove(list3.size()-1);
                          rnd=3;
                          bte=bte+1;
                      }
                      else if ((list2.size()>1) && (list3.size()>1)){
                          while (list3.size()!=2){
                              list3.remove(list3.size()-1);
                              rnd=3;
                              bte=bte+1;
                          }
                      }
                      else if ((list2.size()>1) && (list3.size()==1)){
                          while (list2.size()!=1){
                              list2.remove(list2.size()-1);
                              rnd=2;
                              bte=bte+1;
                          }
                      }
                      else if ((list2.size()==1) && (list3.size()>1)){
                          while (list3.size()!=1){
                              list3.remove(list3.size()-1);
                              rnd=3;
                              bte=bte+1;
                          }
                      }

                  }
                  // cazul par par impar
                 else if ((list1.size() %2 == 0) && (list2.size()%2==0) && (list3.size()%2!=0)) {
                     if ((list1.size()==0) && (list2.size()==0)){
                         if(list3.size()>1){
                             while (list3.size()!=1){
                                 list3.remove(list3.size()-1);
                                 rnd=3;
                                 bte=bte+1;
                             }
                         }
                         else{
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                     else if ((list1.size()==0) && (list2.size()==2)){
                         if (list3.size()>1){
                             while (list3.size()!=2){
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                             }
                         }
                         else{
                             while (list2.size()!=0){
                                 list2.remove(list2.size()-1);
                                 rnd=2;
                                 bte=bte+1;
                             }
                         }

                     }
                 }

                 //cazul par impar impar
                 else if ((list1.size() %2 == 0) && (list2.size()%2!=0) && (list3.size()%2!=0)) {
                     if (list2.size()==list3.size()){
                         list3.remove(list3.size()-1);
                         rnd=3;
                         bte=bte+1;
                     }
                     else if ((list2.size()==1) && (list3.size()>=1)){
                         while (list3.size()!=0){
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                     else if (list2.size()>list3.size()){
                         while (list2.size()!=list3.size()){
                             list2.remove(list2.size()-1);
                             rnd=2;
                             bte=bte+1;
                         }
                     }
                     else if (list3.size()>list2.size()){
                         while (list3.size()!=list2.size()){
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                 }
                 //cazul impar par par
                 else if ((list1.size() %2 != 0) && (list2.size()%2==0) && (list3.size()%2==0)) {
                     if ((list2.size()>=2) && (list3.size()>=2)){
                         list1.remove(list1.size()-1);
                         rnd=1;
                         bte=bte+1;
                     }
                     else if ((list2.size()==0) && (list3.size()>=2)){
                         while (list3.size()!=0){
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                     else if ((list2.size()==2) && (list3.size()==0)){
                         while (list2.size()!=0){
                             list2.remove(list2.size()-1);
                             rnd=2;
                             bte=bte+1;
                         }
                     }
                 }
                 //cazul impar impar par
                 else if ((list1.size() %2 != 0) && (list2.size()%2!=0) && (list3.size()%2==0)) {
                     if ((list2.size()>=1) && (list3.size()==0)){
                         while (list2.size()!=0){
                             list2.remove(list2.size()-1);
                             rnd=2;
                             bte=bte+1;
                         }
                     }
                     else if ((list2.size()==1) && (list3.size()>=2)){
                         while (list3.size()!=1){
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                     else if ((list2.size()==3) && (list3.size()>=2)){
                         if (list2.size()>list3.size()){
                             while (list2.size()!=list3.size()){
                                 list2.remove(list2.size()-1);
                                 rnd=2;
                                 bte=bte+1;
                             }
                         }
                         else if (list3.size()>list2.size()){
                             while (list3.size()!=list2.size()){
                                 list3.remove(list3.size()-1);
                                 rnd=3;
                                 bte=bte+1;
                             }
                         }
                     }
                 }
                 //cazul impar par impar
                 else if ((list1.size() %2 != 0) && (list2.size()%2==0) && (list3.size()%2!=0)){
                    if ((list2.size()==0) && (list3.size()>=1)){
                         while (list3.size()!=0){
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                    else if ((list2.size()==2) && (list3.size()==1)){
                         list2.remove(list2.size()-1);
                         rnd=2;
                         bte=bte+1;
                    }
                    else if ((list2.size()==2) && (list3.size()>=3)){
                         while (list3.size()!=2){
                             list3.remove(list3.size()-1);
                             rnd=3;
                             bte=bte+1;
                         }
                     }
                 }


                 //cazul par impar par
                 else if ((list1.size() %2 == 0) && (list2.size()%2!=0) && (list3.size()%2==0)){
                    if ((list2.size()==1) && (list3.size()==0)){
                        list2.remove(list2.size()-1);
                        rnd=2;
                        bte=bte+1;
                    }
                    else if ((list2.size()==3) && (list3.size()==0)){
                        while (list2.size()!=1){
                            list2.remove(list2.size()-1);
                            rnd=2;
                            bte=bte+1;
                        }
                    }
                    else if ((list2.size()==1) && (list3.size()>=2)){
                        while (list3.size()!=0){
                            list3.remove(list3.size()-1);
                            rnd=3;
                            bte=bte+1;
                        }
                    }
                    else if ((list2.size()==3) && (list3.size()>=2)){
                        if (list2.size()>list3.size()){
                            list2.remove(list2.size()-1);
                            rnd=2;
                            bte=bte+1;
                        }
                        else if (list3.size()>list2.size()){
                            list3.remove(list3.size()-1);
                            rnd=3;
                            bte=bte+1;
                        }
                    }
                 }
                 System.out.println("A.I. chose the row " + Integer.toString(rnd) + " and cut " + Integer.toString(bte) + " sticks.");
                 bte=0;
                 //afisare noua tabela de joc
                 System.out.print("1st Row   ");
                 for (int i = 0; i < list1.size(); i++) {
                     System.out.print(list1.get(i) + " ");
                 }
                 System.out.print("\n");
                 System.out.print("2nd Row   ");
                 for (int i = 0; i < list2.size(); i++) {
                     System.out.print(list2.get(i) + " ");
                 }
                 System.out.print("\n");
                 System.out.print("3rd Row   ");
                 for (int i = 0; i < list3.size(); i++) {
                     System.out.print(list3.get(i) + " ");
                 }
                 System.out.print("\n");

                 if (list1.size() + list2.size() + list3.size() == 0) {
                     System.out.println(nume1 + " won!");
                     loop = 0;
                 } else {
                     jucator = 0;
                 }
             }
         }
     }

        else if ((nr_juc == 1) && (dificultate==2)){
            loop = 10;
            while (loop != 0) {
                if (jucator == 0) {
                    // selectare rand
                    loop1=10;
                    while (loop1 != 0) {
                        System.out.println();
                        System.out.println(nume1 + "'s turn");
                        System.out.println("Input the row you choose:");
                        try {
                            rand = scan.nextInt();
                            if ((rand > 0) && (rand <= 3)) {
                                if ((rand == 1) && (list2.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 2) && (list3.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 3) && (list4.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else {
                                    loop1 = 0;
                                }
                            } else {
                                System.out.println("You have entered a wrong option!");
                                loop1 = 10;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }
                    }

                    // selectare numar bete de taiat
                    loop1 = 10;
                    while (loop1 != 0) {
                        System.out.println("How many sticks do you want to cut? ");
                        try {
                            nr_ales = scan.nextInt();
                            if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list4.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else {
                                loop1 = 0;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }
                    }
                    System.out.println("You chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

                    //aplicare alegeri
                    if (rand == 1) {
                        for (int i = 0; i < nr_ales; i++) {
                            list2.remove(list2.size() - 1);
                        }
                    } else if (rand == 2) {
                        for (int i = 0; i < nr_ales; i++) {
                            list3.remove(list3.size() - 1);
                        }
                    } else if (rand == 3) {
                        for (int i = 0; i < nr_ales; i++) {
                            list4.remove(list4.size() - 1);
                        }
                    }

                    //afisare noua tabela de joc
                    System.out.print("1st Row   ");
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.print(list2.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("2nd Row   ");
                    for (int i = 0; i < list3.size(); i++) {
                        System.out.print(list3.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("3rd Row   ");
                    for (int i = 0; i < list4.size(); i++) {
                        System.out.print(list4.get(i) + " ");
                    }
                    System.out.print("\n");
                    if (list2.size() + list3.size() + list4.size() == 0) {
                        System.out.println("A.I. won!");
                        loop = 0;
                    } else {
                        jucator = 1;
                    }

                }
                //Mutare A.I.
                if (jucator == 1) {
                    //Rationament A.I.
                    System.out.println("A.I.'s turn");
                    System.out.println();
                    // cazul suma para
                    if((list2.size()+list3.size()+list4.size())%2==0){
                        // 0 0 >=2
                        if((list2.size()==0) && (list3.size()==0)){
                            while (list4.size()!=1){
                                list4.remove(list4.size()-1);
                                rnd=3;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==0) && (list4.size()==0)){
                            while (list3.size()!=1){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==0) && (list4.size()==0)){
                            while (list2.size()!=1){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        // 1 1 0
                        else if ((list2.size()==1) && (list3.size()==1) && (list4.size()==0)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==1) && (list4.size()==1) && (list3.size()==0)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==1) && (list4.size()==1) && (list2.size())==0){
                            while (list3.size()!=0){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }

                        // 0  3  1
                        else if ((list2.size() > 1) && (list3.size() == 1) && (list4.size() == 0)){
                            while (list2.size() != 0) {
                                list2.remove(list2.size()-1);
                                rnd = 1;
                                bte = bte + 1;
                            }
                        }
                        else if ((list2.size() > 1) && (list4.size() == 1) && (list3.size() == 0)) {
                            while (list2.size() != 0) {
                                list2.remove(list2.size()-1);
                                rnd = 1;
                                bte = bte + 1;
                            }
                        }
                        else if ((list2.size() == 1) && (list3.size() > 1) && (list4.size() == 0)) {
                            while (list3.size() != 0) {
                                list3.remove(list3.size()-1);
                                rnd = 2;
                                bte = bte + 1;
                            }
                        }
                        else if ((list2.size() == 1) && (list4.size() > 1) && (list3.size() == 0)) {
                            while (list4.size() != 0) {
                                list4.remove(list4.size()-1);
                                rnd = 3;
                                bte = bte + 1;
                            }
                        }
                        else if ((list3.size() > 1) && (list4.size() == 1) && (list2.size() == 0)) {
                            while (list3.size() != 0) {
                                list3.remove(list3.size()-1);
                                rnd = 2;
                                bte = bte + 1;
                            }
                        }
                        else if ((list3.size() == 1) && (list4.size() > 1) && (list2.size() == 0)) {
                            while (list4.size() != 0) {
                                list4.remove(list4.size()-1);
                                rnd = 3;
                                bte = bte + 1;
                            }
                        }

                        //1 1 2
                        else if ((list2.size()==1) && (list3.size()==1) && (list4.size()>=2)){
                            while (list4.size()!=1){
                                list4.remove(list4.size()-1);
                                rnd=3;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==1) && (list4.size()==1) && (list3.size()>=2)){
                            while (list3.size()!=1){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }
                        else if (((list3.size()==1) && list4.size()==1) && (list2.size())==2){
                            while (list2.size()!=1){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        //2 2 0
                        else if ((list2.size()==2) && (list3.size()==2) && (list4.size()>=0)){
                            while (list2.size()!=1){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==2) && (list4.size()==2) && (list3.size()>=0)){
                            while (list2.size()!=1){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==2) && (list4.size()==2) && (list2.size())==0){
                            while (list3.size()!=1){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }

                        //2 2 2
                        else if ((list2.size()==2) && (list3.size()==2) && (list4.size()==2)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }

                        //0 >2 >2
                        else if ((list2.size()==0) && (list3.size()>2) && (list4.size()>2)) {
                            if (list3.size() > list4.size()) {
                                while (list3.size() != list4.size()) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                            } else if (list3.size() < list4.size()) {
                                while (list4.size() != list3.size()) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                            } else if (list3.size() == list4.size()) {
                                list4.remove(list4.size() - 1);
                                rnd = 3;
                                bte = bte + 1;
                            }
                        }
                        else if ((list2.size()==2) && (list3.size()==0) && (list4.size()>2)) {
                                while (list4.size() != list2.size()) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                        }
                        else if ((list2.size()==2) && (list3.size()>2) && (list4.size()==0)) {
                                while (list3.size() != list2.size()) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                        }

                        //2 >2 >2
                        else if ((list2.size()==2) && (list3.size()>2) && (list4.size()>2)){
                           if (list3.size()>list4.size()){
                               while (list3.size() != list4.size()) {
                                   list3.remove(list3.size() - 1);
                                   rnd = 2;
                                   bte = bte + 1;
                               }
                           }
                           else if (list4.size()>list3.size()){
                               while (list4.size() != list3.size()) {
                                   list4.remove(list4.size() - 1);
                                   rnd = 3;
                                   bte = bte + 1;
                               }
                           }
                           else if (list3.size()==list4.size()){
                               list4.remove(list4.size() - 1);
                               rnd = 3;
                               bte = bte + 1;
                           }
                        }

                        //2 2 >2
                        else if ((list2.size()==2) && (list3.size()==2) && (list4.size()>2)){
                            while (list4.size() != list3.size()) {
                                list4.remove(list4.size() - 1);
                                rnd = 3;
                                bte = bte + 1;
                            }
                        }
                        else if ((list2.size()==2) && (list3.size()>2) && (list4.size()==2)){
                            while (list3.size() != list3.size()) {
                                list3.remove(list3.size() - 1);
                                rnd = 2;
                                bte = bte + 1;
                            }
                        }

                        //3 >=3 >=3
                        else if ((list2.size()==3) && (list3.size()>=3) && (list4.size()>=3)){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                        }

                        // >=2  >=3  1
                        else if ((list2.size()>=2) && (list3.size()>=3) && (list4.size()==1)){
                            list4.remove(list4.size()-1);
                            rnd = 3;
                            bte=bte+1;
                        }
                        else if ((list2.size()>=2) && (list3.size()==1) && (list4.size()>=3)){
                            list3.remove(list3.size()-1);
                            rnd = 2;
                            bte=bte+1;
                        }
                        else if ((list2.size()==1) && (list3.size()>=2) && (list4.size()>=3)){
                            list2.remove(list2.size()-1);
                            rnd = 1;
                            bte=bte+1;
                        }
                    }


                    //cazul suma impara
                    else if((list2.size()+list3.size()+list4.size())%2!=0){
                        //1 1 1
                        if ((list2.size()==1) && (list3.size()==1) && (list4.size()==1)){
                            list4.remove(list4.size()-1);
                            rnd=3;
                            bte=bte+1;
                        }

                        //0 0 1
                        else if ((list2.size()==0) && (list3.size()==0) && (list4.size()==1)){
                            while (list4.size()!=0){
                                list4.remove(list4.size()-1);
                                rnd=3;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==0) && (list4.size()==0) && (list3.size()==1)){
                            while (list3.size()!=0){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==0) && (list4.size()==0) && (list2.size()==1)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }

                        //0 0 >=3
                        else if ((list2.size()==0) && (list3.size()==0) && (list4.size()>=3)){
                            while (list4.size()!=1){
                                list4.remove(list4.size()-1);
                                rnd=3;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==0) && (list4.size()==0) && (list3.size()>=3)){
                            while (list3.size()!=1){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==0) && (list4.size()==0) && (list2.size()==3)) {
                            while (list2.size() != 1) {
                                list2.remove(list2.size() - 1);
                                rnd = 1;
                                bte = bte + 1;
                            }
                        }

                        //2 1 2
                        else if ((list2.size()==2) && (list3.size()==1) && (list4.size()==2)){
                            while (list3.size()!=0){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==1) && (list4.size()==2) && (list3.size()==2)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==2) && (list4.size()==1) && (list2.size()==2)){
                            while (list4.size()!=0){
                                list4.remove(list4.size()-1);
                                rnd=3;
                                bte=bte+1;
                            }
                        }

                        //2 3 2
                        else if ((list2.size()==2) && (list3.size()>=3) && (list4.size()==2)){
                            while (list3.size()!=0){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==3) && (list4.size()==2) && (list3.size()==2)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==2) && (list4.size()>=3) && (list2.size()==2)){
                            while (list4.size()!=0){
                                list4.remove(list4.size()-1);
                                rnd=3;
                                bte=bte+1;
                            }
                        }
                        //1 >=3 >=3
                        else if ((list2.size()==1) && (list3.size()>=3) && (list4.size()>=3)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list2.size()==3) && (list4.size()==1) && (list3.size()>=3)){
                            while (list4.size()!=0){
                                list4.remove(list4.size()-1);
                                rnd=3;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()==1) && (list4.size()>=3) && (list2.size()==3)){
                            while (list3.size()!=0){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }

                        //3 >=3 >=3
                        else if ((list2.size()==3) && (list3.size()>=3) && (list4.size()>=3)){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                        }

                        // 0  1  3
                        else if((list2.size()==0) && (list3.size()==1) && (list4.size()>=2)){
                           while (list4.size()!=0) {
                               list4.remove(list4.size() - 1);
                               rnd = 3;
                               bte = bte + 1;
                           }
                        }
                        else if ((list2.size()>=2) && (list4.size()==1) && (list3.size()==0)){
                            while (list2.size()!=0){
                                list2.remove(list2.size()-1);
                                rnd=1;
                                bte=bte+1;
                            }
                        }
                        else if ((list3.size()>=2) && (list4.size()==0) && (list2.size()==1)){
                            while (list3.size()!=0){
                                list3.remove(list3.size()-1);
                                rnd=2;
                                bte=bte+1;
                            }
                        }
                        // 0  2  3
                        else if ((list2.size()==0) && (list3.size()>=2) && (list4.size()>=2)) {
                            if (list3.size() > list4.size())
                                while (list3.size() != list4.size()) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                            else if (list3.size() < list4.size())
                                while (list4.size() != list3.size()) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                        }
                        else if ((list2.size()>=2) && (list4.size()==0) && (list3.size()>=2)){
                            if (list3.size()>list2.size())
                                while (list3.size()!=list2.size()){
                                    list3.remove(list3.size()-1);
                                    rnd=2;
                                    bte=bte+1;
                                }
                            else if (list3.size()<list2.size())
                                while (list2.size()!=list3.size()){
                                    list2.remove(list2.size()-1);
                                    rnd=1;
                                    bte=bte+1;
                                }
                        }
                        else if ((list3.size()==0) && (list4.size()>=2) && (list2.size()>=2)){
                            if (list2.size()>list4.size())
                                while (list2.size()!=list4.size()){
                                    list2.remove(list2.size()-1);
                                    rnd=1;
                                    bte=bte+1;
                                }
                            else if (list2.size()<list4.size())
                                while (list4.size()!=list2.size()){
                                    list4.remove(list4.size()-1);
                                    rnd=3;
                                    bte=bte+1;
                                }
                        }

                    }


                    System.out.println("A.I. chose the row " + Integer.toString(rnd) + " and cut " + Integer.toString(bte) + " sticks.");
                    bte=0;
                    //afisare noua tabela de joc
                    System.out.print("1st Row   ");
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.print(list2.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("2nd Row   ");
                    for (int i = 0; i < list3.size(); i++) {
                        System.out.print(list3.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("3rd Row   ");
                    for (int i = 0; i < list4.size(); i++) {
                        System.out.print(list4.get(i) + " ");
                    }
                    System.out.print("\n");

                    if (list2.size() + list3.size() + list4.size() == 0) {
                        System.out.println(nume1 + " won!");
                        loop = 0;
                    } else {
                        jucator = 0;
                    }
                }
            }
        }
        else if ((nr_juc == 1) && (dificultate==3)){
            loop = 10;
            while (loop != 0) {
                if (jucator == 0) {
                    // selectare rand
                    loop1 = 10;
                    while (loop1 != 0) {
                        System.out.println();
                        System.out.println(nume1 + "'s turn" );
                        System.out.println("Input the row you choose:");
                        try {
                            rand = scan.nextInt();
                            if ((rand > 0) && (rand <= 4)) {
                                if ((rand == 1) && (list1.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 2) && (list2.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 3) && (list3.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 4) && (list4.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else {
                                    loop1 = 0;
                                }
                            } else {
                                System.out.println("You have entered a wrong option!");
                                loop1 = 10;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }
                    }

                    // selectare numar bete de taiat
                    loop1 = 10;
                    while (loop1 != 0) {
                        System.out.println("How many sticks do you want to cut? ");
                        try {
                            nr_ales = scan.nextInt();
                            if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list1.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 4) && ((nr_ales == 0) || (nr_ales > list4.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else {
                                loop1 = 0;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }
                    }
                    System.out.println("You chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

                    //aplicare alegeri
                    if (rand == 1) {
                        for (int i = 0; i < nr_ales; i++) {
                            list1.remove(list1.size() - 1);
                        }
                    } else if (rand == 2) {
                        for (int i = 0; i < nr_ales; i++) {
                            list2.remove(list2.size() - 1);
                        }
                    } else if (rand == 3) {
                        for (int i = 0; i < nr_ales; i++) {
                            list3.remove(list3.size() - 1);
                        }
                    } else if (rand == 4) {
                        for (int i = 0; i < nr_ales; i++) {
                            list4.remove(list4.size() - 1);
                        }
                    }


                    //afisare noua tabela de joc
                    System.out.print("1st Row   ");
                    for (int i = 0; i < list1.size(); i++) {
                        System.out.print(list1.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("2nd Row   ");
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.print(list2.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("3rd Row   ");
                    for (int i = 0; i < list3.size(); i++) {
                        System.out.print(list3.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("4th Row   ");
                    for (int i = 0; i < list4.size(); i++) {
                        System.out.print(list4.get(i) + " ");
                    }
                    System.out.print("\n");
                    if (list1.size() + list2.size() + list3.size() + list4.size() == 0) {
                        System.out.println("A.I. won!");
                        loop = 0;
                    } else {
                        jucator = 1;
                    }

                }
                //Mutare A.I.
                if (jucator == 1) {
                    //Rationament A.I.
                    System.out.println();
                    System.out.println("A.I.'s turn");
                    //cazul suma para
                    if ((list1.size()+list2.size()+list3.size()+list4.size())%2==0){
                        if (list1.size()==0){
                            if((list2.size()+list3.size()+list4.size())%2==0){
                                // 0 0 >=2
                                if((list2.size()==0) && (list3.size()==0)){
                                    while (list4.size()!=1){
                                        list4.remove(list4.size()-1);
                                        rnd=4;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==0) && (list4.size()==0)){
                                    while (list3.size()!=1){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==0) && (list4.size()==0)){
                                    while (list2.size()!=1){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                // 1 1 0
                                else if ((list2.size()==1) && (list3.size()==1) && (list4.size()==0)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==1) && (list4.size()==1) && (list3.size()==0)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==1) && (list4.size()==1) && (list2.size())==0){
                                    while (list3.size()!=0){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }

                                // 0  3  1
                                else if ((list2.size() > 1) && (list3.size() == 1) && (list4.size() == 0)){
                                    while (list2.size() != 0) {
                                        list2.remove(list2.size()-1);
                                        rnd = 2;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list2.size() > 1) && (list4.size() == 1) && (list3.size() == 0)) {
                                    while (list2.size() != 0) {
                                        list2.remove(list2.size()-1);
                                        rnd = 2;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list2.size() == 1) && (list3.size() > 1) && (list4.size() == 0)) {
                                    while (list3.size() != 0) {
                                        list3.remove(list3.size()-1);
                                        rnd = 3;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list2.size() == 1) && (list4.size() > 1) && (list3.size() == 0)) {
                                    while (list4.size() != 0) {
                                        list4.remove(list4.size()-1);
                                        rnd = 4;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list3.size() > 1) && (list4.size() == 1) && (list2.size() == 0)) {
                                    while (list3.size() != 0) {
                                        list3.remove(list3.size()-1);
                                        rnd = 3;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list3.size() == 1) && (list4.size() > 1) && (list2.size() == 0)) {
                                    while (list4.size() != 0) {
                                        list4.remove(list4.size()-1);
                                        rnd = 4;
                                        bte = bte + 1;
                                    }
                                }

                                //1 1 2
                                else if ((list2.size()==1) && (list3.size()==1) && (list4.size()>=2)){
                                    while (list4.size()!=1){
                                        list4.remove(list4.size()-1);
                                        rnd=4;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==1) && (list4.size()==1) && (list3.size()>=2)){
                                    while (list3.size()!=1){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                else if (((list3.size()==1) && list4.size()==1) && (list2.size())==2){
                                    while (list2.size()!=1){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                //2 2 0
                                else if ((list2.size()==2) && (list3.size()==2) && (list4.size()>=0)){
                                    while (list2.size()!=1){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==2) && (list4.size()==2) && (list3.size()>=0)){
                                    while (list2.size()!=1){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==2) && (list4.size()==2) && (list2.size())==0){
                                    while (list3.size()!=1){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                //2 2 2
                                else if ((list2.size()==2) && (list3.size()==2) && (list4.size()==2)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                //0 >2 >2
                                else if ((list2.size()==0) && (list3.size()>2) && (list4.size()>2)) {
                                    if (list3.size() > list4.size()) {
                                        while (list3.size() != list4.size()) {
                                            list3.remove(list3.size() - 1);
                                            rnd = 3;
                                            bte = bte + 1;
                                        }
                                    } else if (list3.size() < list4.size()) {
                                        while (list4.size() != list3.size()) {
                                            list4.remove(list4.size() - 1);
                                            rnd = 4;
                                            bte = bte + 1;
                                        }
                                    } else if (list3.size() == list4.size()) {
                                        list4.remove(list4.size() - 1);
                                        rnd = 4;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list2.size()==2) && (list3.size()==0) && (list4.size()>2)) {
                                    while (list4.size() != list2.size()) {
                                        list4.remove(list4.size() - 1);
                                        rnd = 4;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list2.size()==2) && (list3.size()>2) && (list4.size()==0)) {
                                    while (list3.size() != list2.size()) {
                                        list3.remove(list3.size() - 1);
                                        rnd = 3;
                                        bte = bte + 1;
                                    }
                                }
                                //2 >2 >2
                                else if ((list2.size()==2) && (list3.size()>2) && (list4.size()>2)){
                                    if (list3.size()>list4.size()){
                                        while (list3.size() != list4.size()) {
                                            list3.remove(list3.size() - 1);
                                            rnd = 3;
                                            bte = bte + 1;
                                        }
                                    }
                                    else if (list4.size()>list3.size()){
                                        while (list4.size() != list3.size()) {
                                            list4.remove(list4.size() - 1);
                                            rnd = 4;
                                            bte = bte + 1;
                                        }
                                    }
                                    else if (list3.size()==list4.size()){
                                        list4.remove(list4.size() - 1);
                                        rnd = 4;
                                        bte = bte + 1;
                                    }
                                }
                                //2 2 >2
                                else if ((list2.size()==2) && (list3.size()==2) && (list4.size()>2)){
                                    while (list4.size() != list3.size()) {
                                        list4.remove(list4.size() - 1);
                                        rnd = 4;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list2.size()==2) && (list3.size()>2) && (list4.size()==2)){
                                    while (list3.size() != list3.size()) {
                                        list3.remove(list3.size() - 1);
                                        rnd = 3;
                                        bte = bte + 1;
                                    }
                                }

                                //3 >=3 >=3
                                else if ((list2.size()==3) && (list3.size()>=3) && (list4.size()>=3)){
                                        list2.remove(list2.size()-1);
                                        rnd=1;
                                        bte=bte+1;
                                }

                                // >=2  >=3  1
                                else if ((list2.size()>=2) && (list3.size()>=3) && (list4.size()==1)){
                                    list4.remove(list4.size()-1);
                                    rnd = 4;
                                    bte=bte+1;
                                }
                                else if ((list2.size()>=2) && (list3.size()==1) && (list4.size()>=3)){
                                    list3.remove(list3.size()-1);
                                    rnd = 3;
                                    bte=bte+1;
                                }
                                else if ((list2.size()==1) && (list3.size()>=2) && (list4.size()>=3)){
                                    list2.remove(list2.size()-1);
                                    rnd = 2;
                                    bte=bte+1;
                                }
                            }



                        }
                        //list1.size()!=0
                        else{
                            if ((list2.size()>=1) && (list3.size()>=1) && (list4.size()>=1)) {
                                list1.remove(list1.size() - 1);
                                rnd = 1;
                                bte = bte + 1;
                            }
                            else if ((list2.size()==0) && (list3.size()==0) && (list4.size()>=1)){
                                while (list4.size() != 0) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 4;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()>=1) && (list3.size()==0) && (list4.size()==0)){
                                    while (list2.size() != 0) {
                                        list2.remove(list2.size() - 1);
                                        rnd = 2;
                                        bte = bte + 1;
                                    }
                            }
                            else if ((list2.size()==0) && (list3.size()>=1) && (list4.size()==0)) {
                                while (list3.size() != 0) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==0) && (list3.size()==1) && (list4.size()>=2)) {
                                while (list4.size() != 1) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 4;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==0) && (list3.size()>=2) && (list4.size()==1)) {
                                while (list3.size() != 1) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==1) && (list3.size()>=2) && (list4.size()==0)) {
                                while (list3.size() != 1) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==1) && (list3.size()==0) && (list4.size()>=2)) {
                                while (list4.size() != 1) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 4;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()>=2) && (list3.size()==0) && (list4.size()==1)) {
                                while (list2.size() != 1) {
                                    list2.remove(list2.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()>=2) && (list3.size()==1) && (list4.size()==0)) {
                                while (list2.size() != 1) {
                                    list2.remove(list2.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                            }
                            else if (((list2.size()>=2) && (list3.size()>=2) && (list4.size()==0)) || ((list2.size()>=2) && (list3.size()==0) && (list4.size()>=2)) || ((list2.size()==0) && (list3.size()>=2) && (list4.size()>=2))) {
                                    list1.remove(list1.size() - 1);
                                    rnd = 1;
                                    bte = bte + 1;
                            }


                            //de completat pentru list1.size()!=0







                        }
                    }



                    //cazul suma impara
                    else{
                        if (list1.size()==0){
                            if((list2.size()+list3.size()+list4.size())%2!=0){
                                //1 1 1
                                if ((list2.size()==1) && (list3.size()==1) && (list4.size()==1)){
                                    list4.remove(list4.size()-1);
                                    rnd=4;
                                    bte=bte+1;
                                }
                                //0 0 1
                                else if ((list2.size()==0) && (list3.size()==0) && (list4.size()==1)){
                                    while (list4.size()!=0){
                                        list4.remove(list4.size()-1);
                                        rnd=4;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==0) && (list4.size()==0) && (list3.size()==1)){
                                    while (list3.size()!=0){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==0) && (list4.size()==0) && (list2.size()==1)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                //0 0 >=3
                                else if ((list2.size()==0) && (list3.size()==0) && (list4.size()>=3)){
                                    while (list4.size()!=1){
                                        list4.remove(list4.size()-1);
                                        rnd=4;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==0) && (list4.size()==0) && (list3.size()>=3)){
                                    while (list3.size()!=1){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==0) && (list4.size()==0) && (list2.size()==3)) {
                                    while (list2.size() != 1) {
                                        list2.remove(list2.size() - 1);
                                        rnd = 2;
                                        bte = bte + 1;
                                    }
                                }
                                //2 1 2
                                else if ((list2.size()==2) && (list3.size()==1) && (list4.size()==2)){
                                    while (list3.size()!=0){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==1) && (list4.size()==2) && (list3.size()==2)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==2) && (list4.size()==1) && (list2.size()==2)){
                                    while (list4.size()!=0){
                                        list4.remove(list4.size()-1);
                                        rnd=4;
                                        bte=bte+1;
                                    }
                                }
                                //2 3 2
                                else if ((list2.size()==2) && (list3.size()>=3) && (list4.size()==2)){
                                    while (list3.size()!=0){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==3) && (list4.size()==2) && (list3.size()==2)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==2) && (list4.size()>=3) && (list2.size()==2)){
                                    while (list4.size()!=0){
                                        list4.remove(list4.size()-1);
                                        rnd=4;
                                        bte=bte+1;
                                    }
                                }
                                //1 >=3 >=3
                                else if ((list2.size()==1) && (list3.size()>=3) && (list4.size()>=3)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list2.size()==3) && (list4.size()==1) && (list3.size()>=3)){
                                    while (list4.size()!=0){
                                        list4.remove(list4.size()-1);
                                        rnd=4;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()==1) && (list4.size()>=3) && (list2.size()==3)){
                                    while (list3.size()!=0){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                //3 >=3 >=3
                                else if((list2.size()==3) && (list3.size()>=3) && (list4.size()>=3)){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                }
                                // 0 1 3
                                else if((list2.size()==0) && (list3.size()==1) && (list4.size()>=2)){
                                    while (list4.size()!=0) {
                                        list4.remove(list4.size() - 1);
                                        rnd = 4;
                                        bte = bte + 1;
                                    }
                                }
                                else if ((list2.size()>=2) && (list4.size()==1) && (list3.size()==0)){
                                    while (list2.size()!=0){
                                        list2.remove(list2.size()-1);
                                        rnd=2;
                                        bte=bte+1;
                                    }
                                }
                                else if ((list3.size()>=2) && (list4.size()==0) && (list2.size()==1)){
                                    while (list3.size()!=0){
                                        list3.remove(list3.size()-1);
                                        rnd=3;
                                        bte=bte+1;
                                    }
                                }
                                // 0 2 3
                                else if ((list2.size()==0) && (list3.size()>=2) && (list4.size()>=2)) {
                                    if (list3.size() > list4.size())
                                        while (list3.size() != list4.size()) {
                                            list3.remove(list3.size() - 1);
                                            rnd = 3;
                                            bte = bte + 1;
                                        }
                                    else if (list3.size() < list4.size())
                                        while (list4.size() != list3.size()) {
                                            list4.remove(list4.size() - 1);
                                            rnd = 4;
                                            bte = bte + 1;
                                        }
                                }
                                else if ((list2.size()>=2) && (list4.size()==0) && (list3.size()>=2)){
                                    if (list3.size()>list2.size())
                                        while (list3.size()!=list2.size()){
                                            list3.remove(list3.size()-1);
                                            rnd=3;
                                            bte=bte+1;
                                        }
                                    else if (list3.size()<list2.size())
                                        while (list2.size()!=list3.size()){
                                            list2.remove(list2.size()-1);
                                            rnd=2;
                                            bte=bte+1;
                                        }
                                }
                                else if ((list3.size()==0) && (list4.size()>=2) && (list2.size()>=2)){
                                    if (list2.size()>list4.size())
                                        while (list2.size()!=list4.size()){
                                            list2.remove(list2.size()-1);
                                            rnd=2;
                                            bte=bte+1;
                                        }
                                    else if (list2.size()<list4.size())
                                        while (list4.size()!=list2.size()){
                                            list4.remove(list4.size()-1);
                                            rnd=4;
                                            bte=bte+1;
                                        }
                                }

                            }
                        }
                        //list1.size()!=0
                        else{
                            if ((list2.size()>=1) && (list3.size()>=1) && (list4.size()>=1)) {
                                list1.remove(list1.size() - 1);
                                rnd = 1;
                                bte = bte + 1;
                            }
                            else if ((list2.size()==0) && (list3.size()==0) && (list4.size()>=1)){
                                while (list4.size() != 0) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 4;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()>=1) && (list3.size()==0) && (list4.size()==0)){
                                while (list2.size() != 0) {
                                    list2.remove(list2.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==0) && (list3.size()>=1) && (list4.size()==0)) {
                                while (list3.size() != 0) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==0) && (list3.size()==1) && (list4.size()>=2)) {
                                while (list4.size() != 1) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 4;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==0) && (list3.size()>=2) && (list4.size()==1)) {
                                while (list3.size() != 1) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==1) && (list3.size()>=2) && (list4.size()==0)) {
                                while (list3.size() != 1) {
                                    list3.remove(list3.size() - 1);
                                    rnd = 3;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()==1) && (list3.size()==0) && (list4.size()>=2)) {
                                while (list4.size() != 1) {
                                    list4.remove(list4.size() - 1);
                                    rnd = 4;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()>=2) && (list3.size()==0) && (list4.size()==1)) {
                                while (list2.size() != 1) {
                                    list2.remove(list2.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                            }
                            else if ((list2.size()>=2) && (list3.size()==1) && (list4.size()==0)) {
                                while (list2.size() != 1) {
                                    list2.remove(list2.size() - 1);
                                    rnd = 2;
                                    bte = bte + 1;
                                }
                            }
                            else if (((list2.size()>=2) && (list3.size()>=2) && (list4.size()==0)) || ((list2.size()>=2) && (list3.size()==0) && (list4.size()>=2)) || ((list2.size()==0) && (list3.size()>=2) && (list4.size()>=2))) {
                                list1.remove(list1.size() - 1);
                                rnd = 1;
                                bte = bte + 1;
                            }
                            else if (((list2.size()==0) && (list3.size()==1) && (list4.size()==1)) || ((list2.size()==1) && (list3.size()==0) && (list4.size()==1)) || ((list2.size()==1) && (list3.size()==1) && (list4.size()==0))) {
                                list1.remove(list1.size() - 1);
                                rnd = 1;
                                bte = bte + 1;
                            }

                            // de completat pentru list1.size()!=0


                        }




                    }


                    System.out.println("A.I. chose the row " + Integer.toString(rnd) + " and cut " + Integer.toString(bte) + " sticks.");
                    bte=0;

                    //afisare noua tabela de joc
                    System.out.print("1st Row   ");
                    for (int i = 0; i < list1.size(); i++) {
                        System.out.print(list1.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("2nd Row   ");
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.print(list2.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("3rd Row   ");
                    for (int i = 0; i < list3.size(); i++) {
                        System.out.print(list3.get(i) + " ");
                    }
                    System.out.print("\n");
                    System.out.print("4th Row   ");
                    for (int i = 0; i < list4.size(); i++) {
                        System.out.print(list4.get(i) + " ");
                    }
                    System.out.print("\n");

                    if (list1.size() + list2.size() + list3.size() + list4.size() == 0) {
                        System.out.println(nume1 + " won!");
                        loop = 0;
                    } else {
                        jucator = 0;
                    }
                }
            }
        }

    else if ((nr_juc==2) && (dificultate==1)){
       loop=10;
       while (loop!=0){
       if (jucator==0) {
           // selectare rand
           loop1 = 10;
           while (loop1 != 0) {
               System.out.println();
               System.out.println(nume1 + "'s turn");
               System.out.println("Input the row you choose:");
               try {
                   rand = scan.nextInt();
                   if ((rand > 0) && (rand <= 3)) {
                       if ((rand == 1) && (list1.size() == 0)) {
                           System.out.println("Wrong row! Enter the row you choose:");
                       } else if ((rand == 2) && (list2.size() == 0)) {
                           System.out.println("Wrong row! Enter the row you choose:");
                       } else if ((rand == 3) && (list3.size() == 0)) {
                           System.out.println("Wrong row! Enter the row you choose:");
                       } else {
                           loop1 = 0;
                       }
                   } else {
                       System.out.println("You have entered a wrong option!");
                       loop1 = 10;
                   }
               }catch (Exception e){
                   System.out.println("You have entered a wrong option!");
                   scan.next();
               }
           }

           // selectare numar bete de taiat
           loop1 = 10;
           while (loop1 != 0) {
               System.out.println("How many sticks do you want to cut? ");
               try {
                   nr_ales = scan.nextInt();
                   if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list1.size()))) {
                       System.out.println("Wrong number! Enter the number of sticks:");
                   } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                       System.out.println("Wrong number! Enter the number of sticks:");
                   } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                       System.out.println("Wrong number! Enter the number of sticks:");
                   } else {
                       loop1 = 0;
                   }
               }catch (Exception e){
                   System.out.println("You have entered a wrong option!");
                   scan.next();
               }
           }
           System.out.println(nume1 + " chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

           //aplicare alegeri
           if (rand == 1) {
               for (int i = 0; i < nr_ales; i++) {
                   list1.remove(list1.size() - 1);
               }
           } else if (rand == 2) {
               for (int i = 0; i < nr_ales; i++) {
                   list2.remove(list2.size() - 1);
               }
           } else if (rand == 3) {
               for (int i = 0; i < nr_ales; i++) {
                   list3.remove(list3.size() - 1);
               }
           }

           //afisare noua tabela de joc
           System.out.print("1st Row   ");
           for (int i = 0; i < list1.size(); i++) {
               System.out.print(list1.get(i)+" ");
           }
           System.out.print("\n");
           System.out.print("2nd Row   ");
           for (int i = 0; i < list2.size(); i++) {
               System.out.print(list2.get(i)+" ");
           }
           System.out.print("\n");
           System.out.print("3rd Row   ");
           for (int i = 0; i < list3.size(); i++) {
               System.out.print(list3.get(i)+" ");
           }
           System.out.print("\n");
       if (list1.size()+list2.size()+list3.size()==0){
           System.out.println(nume2 + " won!");
           loop=0;
       }
       else{
           jucator=1;
       }

       }
       else{
           loop1 = 10;
           while (loop1 != 0) {
               System.out.println();
               System.out.println(nume2 + "'s turn");
               System.out.println("Input the row you choose:");
               try {
                   rand = scan.nextInt();
                   if ((rand > 0) && (rand <= 3)) {
                       if ((rand == 1) && (list1.size() == 0)) {
                           System.out.println("Wrong row! Enter the row you choose:");
                       } else if ((rand == 2) && (list2.size() == 0)) {
                           System.out.println("Wrong row! Enter the row you choose:");
                       } else if ((rand == 3) && (list3.size() == 0)) {
                           System.out.println("Wrong row! Enter the row you choose:");
                       } else {
                           loop1 = 0;
                       }
                   } else {
                       System.out.println("You have entered a wrong option!");
                       loop1 = 10;
                   }
               }catch (Exception e){
                   System.out.println("You have entered a wrong option!");
                   scan.next();
               }

           }

           // selectare numar bete de taiat
           loop1 = 10;
           while (loop1 != 0) {
               System.out.println("How many sticks do you want to cut? ");
               try {
                   nr_ales = scan.nextInt();
                   if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list1.size()))) {
                       System.out.println("Wrong number! Enter the number of sticks:");
                   } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                       System.out.println("Wrong number! Enter the number of sticks:");
                   } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                       System.out.println("Wrong number! Enter the number of sticks:");
                   } else {
                       loop1 = 0;
                   }
               }catch (Exception e){
                   System.out.println("You have entered a wrong option!");
                   scan.next();
               }
           }
           System.out.println(nume2 + " chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

           //aplicare alegeri
           if (rand == 1) {
               for (int i = 0; i < nr_ales; i++) {
                   list1.remove(list1.size() - 1);
               }
           } else if (rand == 2) {
               for (int i = 0; i < nr_ales; i++) {
                   list2.remove(list2.size() - 1);
               }
           } else if (rand == 3) {
               for (int i = 0; i < nr_ales; i++) {
                   list3.remove(list3.size() - 1);
               }
           }

           //afisare noua tabela de joc
           System.out.print("1st Row   ");
           for (int i = 0; i < list1.size(); i++) {
               System.out.print(list1.get(i)+" ");
           }
           System.out.print("\n");
           System.out.print("2nd Row   ");
           for (int i = 0; i < list2.size(); i++) {
               System.out.print(list2.get(i)+" ");
           }
           System.out.print("\n");
           System.out.print("3rd Row   ");
           for (int i = 0; i < list3.size(); i++) {
               System.out.print(list3.get(i)+" ");
           }
           System.out.print("\n");
           if (list1.size()+list2.size()+list3.size()==0){
               System.out.println(nume1 + " won!");
               loop=0;
           }
           else{
               jucator=0;
           }
       }
       }
        }

     else if ((nr_juc==2) && (dificultate==2)){
         loop=10;
         while (loop!=0){
             if (jucator==0) {
                 // selectare rand
                 loop1 = 10;
                 while (loop1 != 0) {
                     System.out.println();
                     System.out.println(nume1 + "'s turn");
                     System.out.println("Input the row you choose:");
                     try {
                         rand = scan.nextInt();
                         if ((rand > 0) && (rand <= 3)) {
                             if ((rand == 1) && (list2.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else if ((rand == 2) && (list3.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else if ((rand == 3) && (list4.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else {
                                 loop1 = 0;
                             }
                         } else {
                             System.out.println("You have entered a wrong option!");
                             loop1 = 10;
                         }
                     }catch (Exception e){
                         System.out.println("You have entered a wrong option!");
                         scan.next();
                     }
                 }

                 // selectare numar bete de taiat
                 loop1 = 10;
                 while (loop1 != 0) {
                     System.out.println("How many sticks do you want to cut? ");
                     try {
                         nr_ales = scan.nextInt();
                         if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks");
                         } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks");
                         } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list4.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks");
                         } else {
                             loop1 = 0;
                         }
                     }catch (Exception e){
                         System.out.println("You have entered a wrong option!");
                         scan.next();
                     }
                 }
                 System.out.println(nume1 + " chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

                 //aplicare alegeri
                 if (rand == 1) {
                     for (int i = 0; i < nr_ales; i++) {
                         list2.remove(list2.size() - 1);
                     }
                 } else if (rand == 2) {
                     for (int i = 0; i < nr_ales; i++) {
                         list3.remove(list3.size() - 1);
                     }
                 } else if (rand == 3) {
                     for (int i = 0; i < nr_ales; i++) {
                         list4.remove(list4.size() - 1);
                     }
                 }

                 //afisare noua tabela de joc
                 System.out.print("1st Row   ");
                 for (int i = 0; i < list2.size(); i++) {
                     System.out.print(list2.get(i)+" ");
                 }
                 System.out.print("\n");
                 System.out.print("2nd Row   ");
                 for (int i = 0; i < list3.size(); i++) {
                     System.out.print(list3.get(i)+" ");
                 }
                 System.out.print("\n");
                 System.out.print("3rd Row   ");
                 for (int i = 0; i < list4.size(); i++) {
                     System.out.print(list4.get(i)+" ");
                 }
                 System.out.print("\n");
                 if (list2.size()+list3.size()+list4.size()==0){
                     System.out.println(nume2 + " won!");
                     loop=0;
                 }
                 else{
                     jucator=1;
                 }

             }
             else{
                 loop1 = 10;
                 while (loop1 != 0) {
                     System.out.println();
                     System.out.println(nume2 + "'s turn");
                     System.out.println("Input the row you choose:");
                     try {
                         rand = scan.nextInt();
                         if ((rand > 0) && (rand <= 3)) {
                             if ((rand == 1) && (list2.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else if ((rand == 2) && (list3.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else if ((rand == 3) && (list4.size() == 0)) {
                                 System.out.println("Wrong row! Enter the row you choose:");
                             } else {
                                 loop1 = 0;
                             }
                         } else {
                             System.out.println("You have entered a wrong option!");
                             loop1 = 10;
                         }
                     }catch (Exception e){
                         System.out.println("You have entered a wrong option!");
                         scan.next();
                     }
                 }

                 // selectare numar bete de taiat
                 loop1 = 10;
                 while (loop1 != 0) {
                     System.out.println("How many sticks do you want to cut? ");
                     try {
                         nr_ales = scan.nextInt();
                         if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks:");
                         } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks:");
                         } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list4.size()))) {
                             System.out.println("Wrong number! Enter the number of sticks:");
                         } else {
                             loop1 = 0;
                         }
                     }catch (Exception e){
                         System.out.println("You have entered a wrong option!");
                         scan.next();
                     }
                 }
                 System.out.println(nume2 + " chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

                 //aplicare alegeri
                 if (rand == 1) {
                     for (int i = 0; i < nr_ales; i++) {
                         list2.remove(list2.size() - 1);
                     }
                 } else if (rand == 2) {
                     for (int i = 0; i < nr_ales; i++) {
                         list3.remove(list3.size() - 1);
                     }
                 } else if (rand == 3) {
                     for (int i = 0; i < nr_ales; i++) {
                         list4.remove(list4.size() - 1);
                     }
                 }

                 //afisare noua tabela de joc
                 System.out.print("1st Row   ");
                 for (int i = 0; i < list2.size(); i++) {
                     System.out.print(list2.get(i)+" ");
                 }
                 System.out.print("\n");
                 System.out.print("2nd Row   ");
                 for (int i = 0; i < list3.size(); i++) {
                     System.out.print(list3.get(i)+" ");
                 }
                 System.out.print("\n");
                 System.out.print("3rd Row   ");
                 for (int i = 0; i < list4.size(); i++) {
                     System.out.print(list4.get(i)+" ");
                 }
                 System.out.print("\n");
                 if (list2.size()+list3.size()+list4.size()==0){
                     System.out.println(nume1 + " won!");
                     loop=0;
                 }
                 else{
                     jucator=0;
                 }
             }
         }

     }

        else if ((nr_juc==2) && (dificultate==3)){
            loop=10;
            while (loop!=0){
                if (jucator==0) {
                    // selectare rand
                    loop1 = 10;
                    while (loop1 != 0) {
                        System.out.println();
                        System.out.println(nume1 + "'s turn");
                        System.out.println("Input the row you choose:");
                        try {
                            rand = scan.nextInt();
                            if ((rand > 0) && (rand <= 4)) {
                                if ((rand == 1) && (list1.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 2) && (list2.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 3) && (list3.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 4) && (list4.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else {
                                    loop1 = 0;
                                }
                            } else {
                                System.out.println("You have entered a wrong option!");
                                loop1 = 10;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }
                    }

                    // selectare numar bete de taiat
                    loop1 = 10;
                    while (loop1 != 0) {
                        System.out.println("How many sticks do you want to cut? ");
                        try {
                            nr_ales = scan.nextInt();
                            if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list1.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 4) && ((nr_ales == 0) || (nr_ales > list4.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else {
                                loop1 = 0;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }
                    }
                    System.out.println(nume1 + " chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

                    //aplicare alegeri
                    if (rand == 1) {
                        for (int i = 0; i < nr_ales; i++) {
                            list1.remove(list1.size() - 1);
                        }
                    } else if (rand == 2) {
                        for (int i = 0; i < nr_ales; i++) {
                            list2.remove(list2.size() - 1);
                        }
                    } else if (rand == 3) {
                        for (int i = 0; i < nr_ales; i++) {
                            list3.remove(list3.size() - 1);
                        }
                    } else if (rand == 4) {
                        for (int i = 0; i < nr_ales; i++) {
                            list4.remove(list4.size() - 1);
                        }
                    }

                    //afisare noua tabela de joc
                    System.out.print("1st Row   ");
                    for (int i = 0; i < list1.size(); i++) {
                        System.out.print(list1.get(i)+" ");
                    }
                    System.out.print("\n");
                    System.out.print("2nd Row   ");
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.print(list2.get(i)+" ");
                    }
                    System.out.print("\n");
                    System.out.print("3rd Row   ");
                    for (int i = 0; i < list3.size(); i++) {
                        System.out.print(list3.get(i)+" ");
                    }
                    System.out.print("\n");
                    System.out.print("4th Row   ");
                    for (int i = 0; i < list4.size(); i++) {
                        System.out.print(list4.get(i)+" ");
                    }
                    System.out.print("\n");

                    if (list1.size() + list2.size()+list3.size()+list4.size()==0){
                        System.out.println(nume2 + " won!");
                        loop=0;
                    }
                    else {
                        jucator=1;
                    }

                }
                else{
                    loop1 = 10;
                    while (loop1 != 0) {
                        System.out.println();
                        System.out.println(nume2 + "'s turn");
                        System.out.println("Input the row you choose:");
                        try {
                            rand = scan.nextInt();
                            if ((rand > 0) && (rand <= 4)) {
                                if ((rand == 1) && (list1.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 2) && (list2.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 3) && (list3.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else if ((rand == 4) && (list4.size() == 0)) {
                                    System.out.println("Wrong row! Enter the row you choose:");
                                } else {
                                    loop1 = 0;
                                }
                            } else {
                                System.out.println("You have entered a wrong option!");
                                loop1 = 10;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }
                    }

                    // selectare numar bete de taiat
                    loop1 = 10;
                    while (loop1 != 0) {
                        System.out.println("How many sticks do you want to cut? ");
                        try {
                            nr_ales = scan.nextInt();
                            if ((rand == 1) && ((nr_ales == 0) || (nr_ales > list1.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 2) && ((nr_ales == 0) || (nr_ales > list2.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 3) && ((nr_ales == 0) || (nr_ales > list3.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else if ((rand == 4) && ((nr_ales == 0) || (nr_ales > list4.size()))) {
                                System.out.println("Wrong number! Enter the number of sticks:");
                            } else {
                                loop1 = 0;
                            }
                        }catch (Exception e){
                            System.out.println("You have entered a wrong option!");
                            scan.next();
                        }

                    }
                    System.out.println(nume2 + " chose the row " + Integer.toString(rand) + " and cut " + Integer.toString(nr_ales) + " sticks.");

                    //aplicare alegeri
                    if (rand == 1) {
                        for (int i = 0; i < nr_ales; i++) {
                            list1.remove(list1.size() - 1);
                        }
                    } else if (rand == 2) {
                        for (int i = 0; i < nr_ales; i++) {
                            list2.remove(list2.size() - 1);
                        }
                    } else if (rand == 3) {
                        for (int i = 0; i < nr_ales; i++) {
                            list3.remove(list3.size() - 1);
                        }
                    } else if (rand == 4) {
                        for (int i = 0; i < nr_ales; i++) {
                            list4.remove(list4.size() - 1);
                        }
                    }

                    //afisare noua tabela de joc
                    System.out.print("1st Row   ");
                    for (int i = 0; i < list1.size(); i++) {
                        System.out.print(list1.get(i)+" ");
                    }
                    System.out.print("\n");
                    System.out.print("2nd Row   ");
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.print(list2.get(i)+" ");
                    }
                    System.out.print("\n");
                    System.out.print("3rd Row   ");
                    for (int i = 0; i < list3.size(); i++) {
                        System.out.print(list3.get(i)+" ");
                    }
                    System.out.print("\n");
                    System.out.print("4th Row   ");
                    for (int i = 0; i < list4.size(); i++) {
                        System.out.print(list4.get(i)+" ");
                    }
                    System.out.print("\n");
                    if (list1.size() + list2.size()+list3.size()+list4.size()==0){
                        System.out.println(nume1 + " won!");
                        loop=0;
                    }
                    else{
                        jucator=0;
                    }
                }
            }

        }

    // terminare joc

    }
}
