package com.example.springbootcrud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.util.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootCrudExampleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootCrudExampleApplication.class, args);

        Scanner myObj = new Scanner(System.in);
        //JAWABAN NOMOR 3

//        String kalimat;
//
//        System.out.print("Enter Word :");
//        kalimat = myObj.nextLine();
//
//        System.out.print("Integer :");
//        int angka = myObj.nextInt();
//
//        String[] array = kalimat.trim().split(" +");
//        List<String> newArray = new ArrayList<>();
//
//        for (int i =0; i < array.length ; i++) {
//            array[i] = array[i].replaceAll(" ", "");
//            if (array[i].length() == angka) {
//                newArray.add('"'+array[i]+'"');
//            }
//        }
//        System.out.println("[" + newArray.stream().collect(Collectors.joining(",")) + "]");

        //JAWABAN NOMOR 1
//        System.out.print("Masukan Angka :");
//        String angka = myObj.nextLine();
//
//        String[] angkaStr = angka.split(" ");
//        int angkaInt = angkaStr.length;
//        int[] arrayAngka = new int[angkaInt];
//        boolean cek = false;
//        int penampung;
//        List<Integer> temp = new ArrayList<>();
//        List<Integer> finalTemp = new ArrayList<>();
//
//        for (int i=0; i < angkaInt; i++) {
//            arrayAngka[i] = Integer.parseInt(angkaStr[i]);
//        }
//
//        for (int i=0; i < arrayAngka.length; i++) {
//            for (int j=0; j < arrayAngka.length; j++) {
//                    penampung = arrayAngka[i] - arrayAngka[j];
//                    temp.add(penampung);
//                    if (temp.size() == arrayAngka.length) {
//                        for(Integer cekNol : temp) {
//                            if (cekNol.intValue() < 0) {
//                                cek = true;
//                            }
//                        }
//                        if (cek == true) {
//                            temp.clear();
//                            cek = false;
//                        }
//                        else if (cek == false) {
//                            finalTemp.add(arrayAngka[i]);;
//                        }
//                        temp.clear();
//                    }
//
//                }
//        }
//        System.out.println(Arrays.toString(finalTemp.toArray()));
//    }

        //JAWABAN NOMOR 2
        int penampung;
        List<Integer> temp = new ArrayList<Integer>();
        int[] arrayAngka = {1,2,3,4};
        for (int i : arrayAngka)
        {
            temp.add(i);
        }

        int x = 2;
        for (int i=0; i < arrayAngka.length; i++) {
            for (int j=0; j < arrayAngka.length; j++) {
                    penampung = arrayAngka[i] / arrayAngka[j];
                    if (penampung == x) {
                        int index =temp.indexOf(arrayAngka[i]);
                        temp.remove(index);
                    }
                }
        }
        System.out.print(Arrays.toString(temp.toArray()));

    }
}
