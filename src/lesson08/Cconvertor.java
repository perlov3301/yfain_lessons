package lesson08;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cconvertor {
   static Map<Integer, String> hm;
   private static Map<Integer, String> map =  Map.of(
		   32, " ", 65, "A", 81, "Q", 106, "j",
		   33, "!", 66, "B", 82, "R", 107, "k",
		   40, "(", 67, "C"
		   //, 83, "S", 108, "l",
//		   41, ")", 68, "D", 84, "T", 109, "m",
//		   48, "0", 69, "E", 85, "U", 110, "n",
//		   49, "1", 70, "F", 86, "V", 111, "o",
//		   50, "2", 71, "G", 87, "W", 112, "p",
//		   51, "3", 72, "H", 88, "X", 113, "q",
//		   52, "4", 73, "I", 89, "Y", 114, "r",
//		   53, "5", 74, "J", 90, "Z", 115, "s",
//		   54, "6", 75, "K", 97, "a", 116, "t",
//		   55, "7", 76, "L", 98, "b", 117, "u",
//		   56, "8", 77, "M", 99, "c", 118, "v",
//		   57, "9", 78, "N",100, "d", 119, "w",
//		   58, ":", 79, "O",101, "e", 120, "x",
//		   59, ";", 80, "P",102, "f", 121, "y",
//		   103,"g",104, "h",105, "i", 122, "z"
		   );
   
   public static String getC(Integer a) {
	   hm = new HashMap<>();
	   hm.put(32, " ");
	   hm.put(33, "!");
	   hm.put(48, "0");
	   hm.put(49, "1");
	   hm.put(50, "2");
	   hm.put(51, "3");
	   hm.put(52, "4");
	   hm.put(53, "5");
	   hm.put(54, "6");
	   hm.put(55 , "7");
	   hm.put(56 , "8");
	   hm.put(57 , "9");
	   hm.put(58 , ":");
	   hm.put(59 , ";");
	   hm.put(65 , "A");
	   hm.put(66 , "B");
	   hm.put(67 , "C");
	   hm.put(68 , "D");
	   hm.put(69 , "E");
	   hm.put(70 , "F");
	   hm.put(71 , "G");
	   hm.put(72 , "H");
	   hm.put(73 , "I");
	   hm.put(74 , "J");
	   hm.put(75 , "K");
	   hm.put(76 , "L");
	   hm.put(77 , "M");
	   hm.put(78 , "N");
	   hm.put(79 , "O");
	   hm.put(80 , "P");
	   hm.put(81 , "Q");
	   hm.put(82 , "R");
	   hm.put(83 , "S");
	   hm.put(84 , "T");
	   hm.put(85 , "U");
	   hm.put(86 , "V");
	   hm.put(87 , "W");
	   hm.put(88 , "X");
	   hm.put(89 , "Y");
       hm.put(90 , "Z");
       hm.put(97 , "a");
       hm.put(98 , "b");
       hm.put(99 , "c");
       hm.put(100 , "d");
       hm.put(101 , "e");
       hm.put(102 , "f");
       hm.put(103 , "g");
       hm.put(104 , "h");
       hm.put(105 , "i");
       hm.put(106 , "j");
       hm.put(107 , "k");
       hm.put(108 , "l");
       hm.put(109 , "m");
       hm.put(110 , "n");
       hm.put(111 , "o");
       hm.put(112 , "p");
       hm.put(113 , "q");
       hm.put(114 , "r");
       hm.put(115 , "s");
       hm.put(116 , "t");
       hm.put(117 , "u");
       hm.put(118 , "v");
       hm.put(119 , "w");
       hm.put(120 , "x");
       hm.put(121 , "y");
	   hm.put(122, "z");
	   return (String)hm.get(a);
   }
   static String getC1(Integer a) {
	   return map.get(a);
   }
}
