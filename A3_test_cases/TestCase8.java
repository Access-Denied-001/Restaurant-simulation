import java.io.*;
public class TestCase8 { 
public static void main(String[] args){


try{
PrintStream o = new PrintStream(new File("StudentAnswer8.txt"));
PrintStream console = System.out;

// Assign o to output stream
System.setOut(o);
}
catch (FileNotFoundException ex)  
{
// insert code to run when exception occurs
}

MMBurgersInterface mm = new MMBurgers();
System.out.println("--Started simulation--");
try{
mm.setK(50);
mm.setM(150);
}
catch(IllegalNumberException e){
System.out.println("Exception");
}
try{
mm.arriveCustomer(562, 0, 26);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(521, 0, 96);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(904, 1, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(590, 1, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(897, 1));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(3));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(814, 4, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(903, 11, 72);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(11));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(673, 12));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(14));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(889, 16, 38);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(650, 18, 58);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(18));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(502, 19, 63);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(447, 19, 75);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(226, 19));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(594, 20, 87);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(566, 20));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(430, 21, 55);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(366, 21, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(548, 21, 48);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(76, 23, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(196, 23, 34);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(23));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(38, 24, 75);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(965, 24));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(724, 25, 22);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(989, 29, 56);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(445, 29));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(245, 32, 46);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(32));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(368, 33, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(367, 33));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(736, 36, 90);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(36));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(37));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(989, 39));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(318, 40, 68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(825, 41, 58);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(40, 41, 97);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(554, 42, 87);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(821, 43, 26);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(770, 44, 16);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(194, 44));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(46));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(715, 47, 51);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(194, 50, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(24, 50, 27);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(696, 51, 83);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(415, 52));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(880, 54));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(844, 55, 28);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(242, 58, 80);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(852, 58, 19);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(58));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(958, 59, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(74, 59, 26);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(311, 60, 59);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(192, 60, 49);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(61));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(72, 63, 47);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(63));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(64));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(65));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(971, 66, 70);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(876, 66, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(566, 67, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(401, 68, 77);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(701, 69, 63);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(69));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(175, 70, 19);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(70));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(986, 73));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(74));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(75));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(959, 76, 52);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(76));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(891, 77, 82);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(546, 78, 88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(78));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(221, 79, 55);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(41, 79, 67);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(909, 80, 64);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(80));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(498, 81, 87);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(409, 81, 42);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(415, 82, 64);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(697, 83, 64);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(677, 83));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(582, 84, 86);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(880, 85, 26);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(85));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(777, 86, 70);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(604, 88));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(914, 89, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(777, 89));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(90));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(278, 91, 44);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(23, 91, 91);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(91));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(92));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(92, 93, 96);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(72, 94));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(561, 96, 41);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(842, 97, 42);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(97));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(96, 98, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(100));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(673, 101, 68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(42, 104, 19);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(282, 105, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(221, 105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(120, 106, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(611, 109, 49);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(538, 109));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(110));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(111));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(845, 114, 38);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(116));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(118));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(119));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(128);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(850, 128, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(932, 128, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(673, 130));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(700, 131, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(823, 132, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(505, 132, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(830, 132));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(415, 133));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(136));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(437, 138, 39);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(965, 138, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(138));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(717, 140, 98);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(141));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(862, 142, 58);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(142));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(871, 143, 43);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(488, 143, 21);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(872, 143));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(102, 145));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(445, 147, 84);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(147));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(893, 148, 59);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(148));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(381, 149, 48);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(149));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(123, 150, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(328, 150));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(151));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(72, 152));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(745, 153, 68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(939, 154, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(127, 154, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(185, 154, 74);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(289, 154));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(155));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(794, 157, 87);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(454, 158, 67);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(168);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(216, 168, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(150, 168));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(835, 169));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(938, 170, 97);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(102, 171, 27);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(861, 171, 38);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(997, 171, 69);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(952, 172, 77);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(810, 172, 54);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(172));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(225, 173, 62);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(174));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(941, 175, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(866, 175, 78);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(283, 175));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(832, 177, 30);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(104, 180, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(180));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(634, 182, 85);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(626, 183, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(651, 184, 95);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(718, 187, 24);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(802, 188, 39);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(17, 190, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(190));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(851, 192, 73);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(791, 192, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(192));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(641, 193, 43);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(193));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(194));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(196));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(197));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(819, 198, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(887, 198, 64);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(216, 198));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(872, 202, 34);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(134, 203, 39);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(342, 205, 99);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(915, 205, 53);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(491, 206, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(206));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(207));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(123, 208));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(143, 209, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(489, 209));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(267, 212, 21);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(848, 212, 83);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(128, 212, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(63, 212, 31);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(295, 213, 37);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(334, 214, 94);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(38, 215));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(359, 218, 43);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(311, 218));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(220));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(249, 222, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(223));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(225));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(367, 226, 62);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(228, 228, 54);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(557, 228, 19);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(298, 228));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(685, 229, 78);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(230));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(986, 231, 92);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(224, 231));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(232));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(884, 233));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(924, 234, 90);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(344, 234, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(234));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(237));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(244);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(881, 244, 53);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(227, 245, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(574, 246, 79);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(436, 246, 60);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(246));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(247));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(94, 249, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(250));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(112, 253, 59);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(499, 253, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(253));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(901, 254, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(818, 256));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(697, 257));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(258));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(144, 260, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(260));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(264));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(538, 266, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(200, 267, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(242, 269));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(459, 270, 80);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(298, 270, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(803, 271, 81);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(272));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(273));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(334, 274));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(750, 275, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(276));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(277));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(921, 278, 90);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(278));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(279));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(341, 280, 71);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(621, 280, 84);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(282));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(284));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(677, 285, 45);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(286));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(723, 287, 25);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(83, 287, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(558, 287, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(856, 289, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(506, 290, 63);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(960, 290, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(813, 290, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(395, 291, 79);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(289, 291, 90);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(291));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(293));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(295));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(296));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(297));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(28, 298, 60);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(226, 300, 79);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(656, 302, 81);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(303));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(15, 304, 44);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(489, 305, 84);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(546, 306));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(328, 309, 88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(226, 310));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(34, 311, 80);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(868, 311, 38);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(363, 312, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(791, 312));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(189, 313, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(314));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(316));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(210, 317, 38);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(588, 317, 96);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(318));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(771, 320, 88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(320));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(154, 321, 16);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(673, 322));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(216, 323));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(935, 324, 25);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(835, 324, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(959, 325));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(804, 326, 51);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(618, 326));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(195, 327, 48);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(205, 327, 97);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(646, 329, 25);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(329));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(535, 330, 59);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(146, 331));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(98, 332, 81);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(628, 332, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(64, 333, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(283, 333, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(967, 334, 63);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(334));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(119, 335, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(257, 336, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(41, 336));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(337));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(892, 339, 67);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(598, 340, 86);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(342));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(431, 344, 73);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(324, 344, 74);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(627, 344, 28);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(248, 345, 30);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(347);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(602, 347, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(347));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(517, 348, 81);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(462, 348, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(348));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(349));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(479, 351, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(351));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(71, 352, 90);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(352));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(830, 353, 68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(561, 355));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(912, 357, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(737, 357, 40);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(663, 358, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(318, 358));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(250, 359, 55);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(146, 359, 73);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(333, 359, 55);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(359));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(447, 361));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(364);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(884, 364, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(128, 364));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(984, 366, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(998, 367, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(150, 367, 54);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(370));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(209, 371, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(371));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(190, 373, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(380, 374, 94);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(856, 375));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(516, 376, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(376));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(748, 378, 58);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(378));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(151, 379, 56);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(386);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(897, 386, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(325, 386, 64);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(392);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(266, 392, 93);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(15, 392));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(394));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(721, 395, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(395));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(396));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(397));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(398));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(47, 399, 46);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(399));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(914, 400));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(546, 401));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(402));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(146, 403));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(405));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(17, 406));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(407));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(411));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(414));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(989, 416));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(421));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(423));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(425));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(427));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(428));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(228, 431));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(432));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(245, 437));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(438));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(440));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(448));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(451));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(452));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(484, 456));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(457));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(777, 458));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(459));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(38, 463));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(464));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(465));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(466));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(470));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(477);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(478));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(881, 479));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(485));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(488));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(489));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(493));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(494));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(496));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(498));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(557, 499));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(503);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(505));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(832, 509));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(512));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(810, 515));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(151, 518));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(519));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(520));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(521));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(526);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(529));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(865, 530));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(532));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(656, 535));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(537));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(540));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(542));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(543));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(545));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(549));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(551));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(333, 554));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(555));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(558));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(560));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(563));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(884, 564));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(437, 566));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(567));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(569));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(572));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(479, 573));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(575));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(576));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(72, 577));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(579));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(581));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(546, 582));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(583));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(587));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(589));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(590));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(591));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(593));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(594));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(597));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(602));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(150, 603));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(395, 606));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(608));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(609));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(627, 616));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(619));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(620));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(622));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(628));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(629));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(631));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(459, 632));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(633));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(634));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(635));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(249, 636));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(266, 638));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(997, 639));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(640));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(221, 641));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(534, 642));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(491, 643));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(646));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(151, 647));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(648));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(104, 651));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(295, 652));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(653));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(655));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(656));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(658));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(819, 659));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(662));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(663));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(325, 665));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(668));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(228, 670));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(671));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(672));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(851, 675));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(791, 676));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(678));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(680));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(681));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(687));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(693);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(696));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(699));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(830, 700));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(703));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(989, 704));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(705));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(770, 706));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(708));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(935, 710));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(712));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(714));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(909, 715));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(65, 716));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(718));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(723));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(724));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(726));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(998, 728));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(791, 729));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(735);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(735));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(737));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(627, 741));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(742));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(743));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(744));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(745));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(516, 748));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(24, 751));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(791, 755));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(765);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(677, 767));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(771));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(772));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(773));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(774));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(782);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(782));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(784));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(791);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(800);
System.out.println("--End of simulation--");}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerWaitTime(865));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(395));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(777));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(912));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(431));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(42));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(266));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(989));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(524));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(498));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(415));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(941));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(803));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(850));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(311));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(489));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(367));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(598));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(914));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(930));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(224));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(517));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(143));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(289));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(144));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(774));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(98));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(634));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(819));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(257));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(932));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(546));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(723));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(830));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(617));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(924));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(151));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(318));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(102));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(748));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(76));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(921));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(871));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(701));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(339));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(484));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(574));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(104));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(363));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(445));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(324));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(626));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(656));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(935));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(210));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(566));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(984));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(454));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(887));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(534));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(267));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(64));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(825));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(562));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(15));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(96));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(737));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(861));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(409));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(728));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(845));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(804));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(685));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(641));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(2));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(627));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(506));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(848));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(889));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(342));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(250));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(960));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(334));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(721));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(892));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(65));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(196));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(582));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(228));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(245));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(823));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(146));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(909));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(557));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(459));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(94));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(83));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(328));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(897));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(521));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(502));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(112));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(309));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(565));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(299));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(724));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(128));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(561));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(341));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(835));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(554));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(209));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(971));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(618));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(915));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(602));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(295));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(456));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(904));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(611));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(818));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(998));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(325));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(590));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(248));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(298));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(189));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(194));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(842));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(192));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(34));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(628));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(673));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(939));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(488));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(71));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(92));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(696));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(776));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(134));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(154));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(40));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(903));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(717));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(986));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(958));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(700));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(401));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(967));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(538));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(283));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(535));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(832));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(242));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(221));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(862));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(604));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(430));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(594));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(282));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(462));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(505));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(677));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(657));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(718));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(813));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(366));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(85));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(333));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(868));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(119));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(499));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(884));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(646));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(344));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(195));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(249));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(17));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(750));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(278));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(120));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(851));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(226));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(381));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(814));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(175));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(891));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(437));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(938));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(952));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(802));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(150));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(715));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(225));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(47));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(588));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(650));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(548));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(965));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(697));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(959));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(28));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(893));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(651));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(872));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(621));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(876));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(123));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(852));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(881));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(380));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(829));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(38));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(794));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(23));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(200));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(190));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(736));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(127));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(491));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(216));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(745));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(63));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(844));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(24));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(558));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(436));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(636));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(810));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(866));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(72));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(227));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(74));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(663));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(901));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(359));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(447));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(185));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(997));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(516));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(479));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(41));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(880));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(771));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(856));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(791));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(205));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(770));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(368));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(821));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(String.format("%.2f",mm.avgWaitTime()));
}
}
