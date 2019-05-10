package jo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GroupForm2 implements Runnable {

 private List<String> nameList = new ArrayList<String>();
 private List<String> oneJo = new ArrayList<String>();
 private List<String> twoJo = new ArrayList<String>();
 private List<String> threeJo = new ArrayList<String>();
 private List<String> fourJo = new ArrayList<String>();
 private int i;
 private Random random = new Random();

 private void nameRegist() {
  oneJo.add("1조 조장");
  twoJo.add("2조 조장");
  threeJo.add("3조 조장");
  fourJo.add("4조 조장");

  // 조장 제외 인원

//  nameList.add("김범홍");
//  nameList.add("김성태");
//  nameList.add("최정제");
//  nameList.add("손혁진");
  nameList.add("정동원");
  nameList.add("최창국");
  nameList.add("이준호");
  nameList.add("권재범");
  nameList.add("김진광");
  nameList.add("송인한");
  nameList.add("김채원");
  nameList.add("김승하");
  nameList.add("윤태원");
  nameList.add("이성민");
  nameList.add("장한얼");
  nameList.add("홍한솔");
  nameList.add("나영균");
  nameList.add("박정수");
  nameList.add("고유진");
  nameList.add("장진선");
  nameList.add("이수연");
  nameList.add("편명우");
  nameList.add("박경민");
  nameList.add("황준우");
  nameList.add("박태영");
  
  Collections.sort(nameList);
 }

 private void groupMake() {
  for (i = 0; i < nameList.size(); i++) {
   if (i < nameList.size() - 1) {
    calcSub1();
   } else {
    calcSub2();
   }
  }
 }

 private void calcSub1() {
  switch (random.nextInt(4)) {
  case 0:
   if (oneJo.size() < 6) {
    oneJo.add(nameList.get(i));
   } else {
    calcSub1();
   }
   break;
  case 1:
   if (twoJo.size() < 6) {
    twoJo.add(nameList.get(i));
   } else {
    calcSub1();
   }
   break;
  case 2:
   if (threeJo.size() < 6) {
    threeJo.add(nameList.get(i));
   } else {
    calcSub1();
   }
   break;
  case 3:
   if (fourJo.size() < 6) {
    fourJo.add(nameList.get(i));
   } else {
    calcSub1();
   }
   break;
  }
 }

 private void calcSub2() {
  switch (random.nextInt(4)) {
  case 0:
   oneJo.add(nameList.get(i));
   break;
  case 1:
   twoJo.add(nameList.get(i));
   break;
  case 2:
   threeJo.add(nameList.get(i));
   break;
  case 3:
   fourJo.add(nameList.get(i));
   break;
  }
 }

 private void showSub(List<String> list) {
  for (int z = 0; z < list.size(); z++) {
   try {
    Thread.sleep(1000);
    System.out.print(list.get(z) + ",");
   } catch (InterruptedException e) {
    System.out.println(e.getMessage());
   }
  }
  System.out.println();
 }

 public void run() {
  nameRegist();
  groupMake();

  for (int j = 1; j <= 4; j++) {
   System.out.print(j + "조 : ");
   switch (j) {
   case 1:
    showSub(oneJo);
    break;
   case 2:
    showSub(twoJo);
    break;
   case 3:
    showSub(threeJo);
    break;
   case 4:
    showSub(fourJo);
    break;
   }
  }
 }

 public static void main(String[] args) {
  GroupForm2 form2 = new GroupForm2();
  form2.run();
 }
}

