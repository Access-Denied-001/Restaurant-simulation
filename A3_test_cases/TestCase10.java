import java.io.*;
public class TestCase10 { 
public static void main(String[] args){


try{
PrintStream o = new PrintStream(new File("StudentAnswer10.txt"));
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
mm.setK(100);
mm.setM(250);
}
catch(IllegalNumberException e){
System.out.println("Exception");
}
try{
mm.arriveCustomer(941, 0, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(205, 0, 188);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(221, 1));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(24, 3, 91);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(3));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(189, 6, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(6));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(170, 7, 126);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(470, 7, 161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(825, 7));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(10));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(12));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(412, 13, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(795, 13, 62);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(192, 14, 12);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(382, 14, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(18);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(595, 18, 168);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(18));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(19));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(818, 20, 84);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(905, 20, 18);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(21));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(22));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(23));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(241, 25, 211);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(26));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(562, 27));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(28));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(29));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(854, 31, 89);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(31));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(948, 33, 170);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(294, 34, 109);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(34));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(36));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(40));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(415, 41, 35);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(363, 41, 56);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(41));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(499, 42, 115);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(42));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(43));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(880, 44, 112);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(958, 47));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(999, 49));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(673, 50, 80);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(477, 51, 46);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(51));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(164, 52, 167);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(824, 53, 85);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(53));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(334, 54, 187);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(54));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(301, 56));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(903, 57, 98);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(57));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(58));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(859, 59, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(295, 60, 105);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(561, 61, 68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(61));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(565, 62, 137);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(62));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(63));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(241, 64));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(445, 66, 206);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(580, 66));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(67));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(623, 68, 195);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(69));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(76, 72, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(163, 72, 145);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(546, 73, 32);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(80);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(404, 80, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(80));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(342, 81, 44);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(791, 83, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(633, 83));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(429, 84, 36);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(323, 86, 160);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(376, 89, 223);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(741, 89));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(370, 90, 216);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(889, 91, 188);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(898, 91, 180);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(535, 93));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(868, 94, 21);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(94));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(917, 95));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(339, 96, 61);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(96));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(643, 97, 216);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(120, 100));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(913, 101, 64);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(78, 101, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(884, 101));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(896, 104));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(197, 107, 44);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(678, 107, 184);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(250, 109));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(940, 110, 110);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(128, 112));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(932, 113, 159);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(113));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(268, 114));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(115));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(103, 116, 182);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(116));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(952, 118, 39);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(921, 119));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(675, 121, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(121));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(122));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(534, 123, 88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(425, 123, 207);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(124));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(125));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(144, 127, 189);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(521, 128, 188);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(572, 129));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(183, 130, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(752, 132, 161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(318, 132));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(598, 134, 128);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(996, 136, 23);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(137));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(14, 139, 92);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(139));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(142));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(618, 144, 75);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(590, 144, 172);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(166, 144, 39);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(145));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(486, 148, 118);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(344, 149, 61);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(150));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(477, 151));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(187, 153));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(848, 154, 42);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(370, 155));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(395, 156, 87);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(461, 156, 70);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(761, 157, 206);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(158));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(646, 159, 127);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(159));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(209, 160, 101);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(116, 161, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(161));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(695, 162));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(133, 164, 136);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(832, 165, 74);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(695, 166, 141);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(171, 166, 121);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(151, 167, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(171));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(83, 172, 198);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(814, 173, 137);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(310, 173, 147);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(693, 174, 142);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(14, 174));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(377, 175, 176);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(160, 175, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(216, 177, 117);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(785, 177, 102);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(180));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(181));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(325, 183));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(959, 186, 104);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(186));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(188));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(447, 189, 89);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(190));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(196, 191, 127);}
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
System.out.println(mm.griddleWait(196));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(656, 199));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(201));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(90, 202, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(610, 202, 70);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(502, 203, 190);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(924, 203));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(484, 207, 66);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(174, 208, 175);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(346, 209, 175);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(242, 210, 149);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(328, 214, 180);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(214));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(656, 215, 199);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(398, 215, 75);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(828, 215, 176);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(38, 215));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(216));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(527, 218));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(268, 219, 133);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(225);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(226));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(887, 227, 99);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(60, 227));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(228));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(872, 229, 54);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(229));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(696, 230, 30);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(917, 230));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(909, 232, 207);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(232));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(368, 233));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(72, 234, 151);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(48, 237, 173);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(237));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(713, 241, 185);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(241));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(612, 242, 137);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(799, 242, 175);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(603, 243, 225);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(250);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(366, 250));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(842, 252, 223);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(805, 252, 40);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(252));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(825, 254, 85);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(254));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(282, 256, 217);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(256));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(98, 260, 192);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(15, 260, 210);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(498, 261));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(223, 262, 150);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(262));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(86, 264, 209);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(264));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(113, 265, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(265));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(40, 266, 145);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(266));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(267));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(119, 270, 40);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(195, 270, 89);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(899, 270, 93);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(324, 271, 75);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(402, 271, 161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(772, 271));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(900, 275, 83);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(348, 275));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(276));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(741, 277, 201);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(280));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(326, 281, 104);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(449, 281, 154);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(281));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(81, 282, 111);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(344, 282));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(284);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(284));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(494, 285, 202);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(551, 287, 37);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(339, 287));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(617, 288, 114);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(162, 288, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(428, 289));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(488, 290, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(120, 291, 185);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(736, 291, 123);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(291));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(925, 292, 171);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(292));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(248, 293, 210);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(294));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(121, 295));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(557, 298, 192);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(298));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(594, 300, 157);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(193, 302, 49);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(52, 303, 18);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(303));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(304));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(734, 308));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(318, 310, 109);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(104, 310, 72);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(310));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(311));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(312));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(68, 314, 213);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(314));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(876, 315, 45);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(815, 317, 136);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(318));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(309, 319, 44);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(663, 319, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(604, 320, 169);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(323);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(326));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(329));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(258, 332, 149);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(886, 333, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(760, 333, 130);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(333));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(180, 334, 162);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(774, 335, 204);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(8, 337));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(339));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(382, 343));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(507, 344, 194);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(713, 345));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(351);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(222, 353, 80);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(354));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(999, 355, 73);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(356));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(38, 357, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(797, 357));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(358));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(361));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(362, 362, 200);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(362));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(611, 364, 210);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(805, 364));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(532, 369, 67);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(21, 370));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(803, 372, 135);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(259, 372));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(457, 373));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(535, 376, 88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(813, 376, 49);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(376));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(812, 378));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(28, 379, 203);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(881, 379, 37);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(382);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(71, 382, 193);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(16, 382, 131);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(287, 382, 40);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(687, 384, 201);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(384));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(386));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(728, 387, 170);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(382, 388));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(405, 389, 93);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(29, 389));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(2, 390, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(541, 391, 144);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(8, 391, 106);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(392));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(820, 394, 163);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(394));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(407);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(409));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(411));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(50, 412, 205);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(702, 412, 206);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(419);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(194, 419, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(421));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(912, 422, 93);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(419, 422, 136);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(298, 425, 41);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(425));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(717, 426, 175);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(860, 427, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(742, 427, 162);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(301, 429, 91);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(665, 430, 161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(431));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(432));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(433));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(455, 434));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(435));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(203, 437, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(19, 437, 188);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(437));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(443);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(443));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(770, 445));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(605, 446, 71);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(547, 446, 48);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(810, 447, 195);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(307, 447));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(448));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(449));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(3, 450, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(501, 450, 147);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(869, 450, 115);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(450));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(142, 452, 61);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(217, 453, 191);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(385, 454, 183);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(586, 454));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(464);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(993, 464, 207);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(464));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(309, 465));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(715, 466));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(468));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(65, 470, 43);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(208, 470, 113);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(470));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(998, 472, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(408, 474, 110);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(997, 475, 163);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(346, 475));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(939, 476, 70);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(407, 477, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(498, 478, 112);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(455, 478, 194);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(954, 478, 199);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(204, 479, 92);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(479));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(269, 481, 157);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(481));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(858, 482));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(909, 483));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(718, 484, 79);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(484));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(486));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(487));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(488));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(634, 489, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(752, 489));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(490));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(681, 491, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(450, 491, 196);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(60, 492));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(827, 493, 52);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(493));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(347, 494));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(183, 495));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(657, 497, 112);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(498));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(895, 499));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(501));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(505);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(794, 507, 150);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(515);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(554, 517, 91);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(807, 517, 213);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(518));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(489, 521, 146);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(44, 521, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(413, 521, 145);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(960, 523, 182);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(168, 523, 72);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(770, 525, 84);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(526));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(144, 527));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(154, 528, 102);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(529));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(67, 530, 122);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(765, 531));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(926, 532, 35);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(532));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(640, 534, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(537);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(351, 537, 145);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(538));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(540));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(547);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(785, 548));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(549));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(431, 550));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(552));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(856, 553, 18);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(457, 553, 49);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(555));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(557));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(711, 558, 184);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(919, 558, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(558));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(67, 559));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(560));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(562));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(603, 564));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(651, 567, 12);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(429, 567));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(568));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(575, 570, 216);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(434, 571, 217);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(41, 573, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(429, 574));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(820, 576));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(349, 577, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(578));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(420, 579, 196);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(579));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(888, 580, 163);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(580));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(464, 582, 71);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(235, 582, 105);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(582));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(586);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(819, 587, 153);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(256, 587, 38);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(594);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(229, 594));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(595));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(366, 596, 131);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(596));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(433, 597, 16);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(708, 598, 42);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(598));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(401, 599, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(66, 599, 35);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(599));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(34, 600, 124);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(965, 600, 181);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(737, 601, 165);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(602));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(844, 603, 184);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(603));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(104, 604));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(605));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(562, 606, 187);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(967, 606, 211);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(954, 606));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(580, 607, 12);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(607));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(926, 608));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(84, 609, 177);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(609));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(226, 610, 191);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(866, 611, 179);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(213, 611));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(625, 612, 47);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(612));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(17, 613, 89);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(892, 613));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(857, 614, 21);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(227, 616, 144);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(616));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(184, 617, 45);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(618));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(850, 619, 209);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(224, 620, 68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(18, 624, 52);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(146, 625, 205);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(543, 625, 67);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(961, 626, 84);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(626));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(348, 629, 180);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(166, 629));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(862, 630, 201);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(414, 632, 67);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(632));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(642);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(942, 642, 117);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(594, 642));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(532, 643));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(644));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(77, 645, 142);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(505, 646, 40);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(646));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(853, 647, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(647));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(389, 648, 162);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(851, 649));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(962, 651, 165);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(934, 653, 132);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(653));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(378, 654, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(654));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(655));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(47, 656, 194);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(48, 657));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(658));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(660));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(347, 661, 210);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(661));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(641, 662));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(626, 663, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(835, 664, 166);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(672);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(856, 672));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(674));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(683);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(257, 684, 134);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(958, 686, 41);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(426, 689));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(672, 690, 168);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(64, 691, 35);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(692));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(547, 693));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(920, 695, 198);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(695));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(121, 696, 143);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(200, 697, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(8, 697));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(698));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(701));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(236, 702, 22);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(269, 702));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(307, 704, 88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(272, 704, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(134, 705, 209);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(706));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(456, 707, 199);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(960, 707));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(490, 708, 27);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(708));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(210, 709, 110);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(720);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(720));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(971, 721, 91);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(654, 721, 146);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(729);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(712, 729, 86);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(506, 730, 214);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(963, 734, 97);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(734));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(602, 735, 132);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(976, 735, 93);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(736));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(733, 739, 216);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(986, 741, 221);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(187, 744, 163);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(998, 746));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(325, 749, 35);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(749));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(750));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(313, 751, 82);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(753));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(628, 755, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(947, 755, 47);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(437, 756, 188);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(842, 757));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(758));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(759));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(641, 760, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(548, 761, 87);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(469, 761, 156);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(85, 762, 50);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(763));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(740, 764, 12);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(316, 764));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(769);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(769));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(802, 770, 179);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(430, 771, 80);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(895, 771));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(774));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(935, 775));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(778));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(780));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(288, 781, 154);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(784));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(289, 785, 197);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(984, 785, 204);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(143, 786, 183);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(858, 786, 44);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(230, 786, 92);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(786));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(637, 787, 214);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(306, 787, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(132, 787, 105);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(788));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(789));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(566, 790));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(871, 791, 113);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(96, 793, 91);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(543, 793));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(996, 794));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(524, 795, 145);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(122, 795, 218);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(795));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(949, 796, 206);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(796));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(946, 797, 117);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(799));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(653, 800, 106);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(800));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(801));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(804, 802, 47);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(804);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(434, 804));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(884, 806, 206);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(698, 806));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(642, 807, 49);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(807));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(33, 809, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(96, 809));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(5, 810, 92);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(810));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(482, 811, 25);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(189, 811));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(895, 812, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(368, 815, 90);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(852, 816, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(818));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(851, 820));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(139, 821, 104);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(587, 822, 158);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(823));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(850, 824));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(158, 826, 83);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(826));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(828));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(829));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(479, 830, 117);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(830));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(831));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(832));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(259, 833));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(834));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(517, 835, 191);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(150, 836, 224);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(837));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(608, 838));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(839));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(547, 840));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(674, 841, 21);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(748, 842, 220);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(263, 842, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(510, 844, 138);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(87, 847, 221);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(483, 849, 103);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(808, 849, 203);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(849));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(112, 850, 201);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(751, 850, 220);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(897, 851, 68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(278, 853, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(165, 853));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(128, 854, 25);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(225, 854, 215);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(266, 855, 212);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(830, 855, 21);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(333, 859, 86);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(407, 859));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(245, 860, 26);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(249, 860, 121);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(380, 863, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(320, 863, 40);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(94, 864, 133);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(851, 864, 161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(866));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(867));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(901, 868, 207);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(870));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(871));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(459, 872, 74);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(872));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(777, 873, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(878, 874, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(4, 875, 97);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(875));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(213, 876, 87);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(876));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(424, 877, 41);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(877));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(878));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(879));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(159, 881, 141);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(283, 881));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(724, 882, 42);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(883));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(829, 884, 45);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(677, 886));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(887));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(890, 888, 164);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(888));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(368, 889));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(817, 890, 225);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(759, 891, 160);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(891));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(507, 893));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(896));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(780, 897, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(964, 899, 124);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(900));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(614, 901, 161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(901));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(768, 902, 174);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(347, 902));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(588, 903, 12);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(191, 903, 58);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(867, 904, 62);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(904));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(13, 905, 163);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(974, 906));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(667, 909, 85);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(679, 909, 44);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(685, 910, 61);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(891, 910, 91);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(584, 910, 58);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(85, 912));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(123, 913, 225);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(913));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(299, 914, 108);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(426, 916, 119);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(916));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(788, 918));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(558, 919, 225);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(919));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(40, 923));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(925));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(23, 928, 99);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(928));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(92, 929, 145);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(155, 929, 198);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(929));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(286, 931, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(366, 931));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(627, 932, 150);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(43, 933, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(476, 933, 176);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(934));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(935));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(936));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(937));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(137, 938, 100);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(701, 939, 184);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(939));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(249, 940));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(941));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(832, 942));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(619, 943, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(352, 943, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(39, 943, 211);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(951);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(951));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(815, 952));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(912, 953));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(921, 954, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(954));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(363, 955));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(267, 956, 199);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(956));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(915, 957));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(246, 958, 147);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(535, 958));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(959));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(604, 960));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(963));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(574, 964, 173);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(697, 964, 202);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(359, 965, 98);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(229, 965, 202);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(634, 965));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(966));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(413, 967));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(690, 968, 112);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(700, 969, 146);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(969));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(52, 971));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(972));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(807, 973));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(994, 974, 36);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(776, 976, 94);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(649, 976, 131);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(976));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(745, 982));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(427, 983, 137);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(950, 984, 103);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(984));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(723, 985, 19);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(673, 986));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(989, 987, 105);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(337, 987, 145);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(122, 987));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(988));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(745, 989, 25);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(991));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(992));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(993));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(250, 995, 111);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(160, 996));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(997));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(772, 1001, 63);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(527, 1001, 121);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(20, 1003, 98);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(460, 1003, 58);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1003));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(454, 1004, 102);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1004));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1005));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(924, 1007, 62);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(219, 1007, 166);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(424, 1007));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1008));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(722, 1009, 102);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(914, 1010, 149);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(812, 1010, 18);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1011));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(265, 1013, 214);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(609, 1014, 65);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(797, 1014, 71);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1024);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1024));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1026));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(136, 1027, 96);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1027));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(582, 1028, 139);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1028));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(143, 1030));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1031));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1032));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(756, 1033, 155);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1035));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1037));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(311, 1038, 157);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(823, 1038, 200);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1040));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(677, 1041, 122);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(383, 1045, 225);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(880, 1045));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1046));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(840, 1048, 71);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(29, 1052, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(280, 1055, 157);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(356, 1057, 83);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(73, 1058, 223);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(142, 1059));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(865, 1060, 161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(254, 1061, 28);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1061));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(409, 1062, 137);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(445, 1062));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1063));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(583, 1064, 37);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(721, 1065, 183);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1065));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(297, 1069, 101);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(634, 1069));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(681, 1070));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(190, 1071, 188);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(319, 1071, 223);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1071));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(228, 1072, 101);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(936, 1073, 111);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(622, 1074, 27);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(703, 1074));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1075));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(821, 1077, 155);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(388, 1078, 119);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(601, 1078, 42);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1080));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1084);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1084));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(453, 1085, 88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(808, 1087));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(833, 1088, 106);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1088));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(221, 1092, 41);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(970, 1092, 152);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1094));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1095));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(42, 1096, 222);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(186, 1096, 73);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(37, 1097, 196);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(207, 1098, 129);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1102));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(896, 1104, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1104));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(118, 1105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(946, 1107));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(703, 1108, 37);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1108));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1109));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(999, 1111));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(516, 1113, 197);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(933, 1113, 122);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(74, 1116, 162);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1116));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(21, 1118, 133);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(327, 1119, 193);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(118, 1120, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(959, 1121));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1122));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1123));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(935, 1124, 225);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1129);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1129));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(493, 1130, 46);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1131));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(538, 1132, 186);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(448, 1132, 150);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1133));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1134));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1141);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1141));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(10, 1142, 76);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(621, 1143, 98);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1143));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(9, 1144, 163);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1145));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(361, 1146, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1146));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(605, 1147));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(336, 1151));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1153));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(510, 1157));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(924, 1160));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1162));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1163));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1172);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1173));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1176));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1177));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(665, 1180));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1181));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(672, 1182));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1185));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1186));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1189));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1194);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(542, 1198));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1199));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1204);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1204));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(71, 1210));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(971, 1212));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1214));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.advanceTime(1226);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(103, 1227));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1228));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1229));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1230));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1231));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1235));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1238));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(868, 1239));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1240));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1241));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1242));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(546, 1243));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(643, 1244));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1255);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1257));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(347, 1260));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1269);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1269));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1271));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1272));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1273));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(848, 1274));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1277));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1278));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1280));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1283));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1285));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1288);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1288));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(486, 1289));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1292));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1293));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1295));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1296));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1297));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(389, 1298));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1300));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1306));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1307));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1325);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1326));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(40, 1327));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(646, 1328));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1332));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1336);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(38, 1336));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(333, 1338));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1340));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1342));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(663, 1343));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1344));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1351));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1354));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(932, 1355));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(432, 1359));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1364));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(776, 1366));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(1373));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1376));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1379));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(752, 1386));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1387));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(103, 1389));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1390));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1391));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(625, 1394));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1395));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1397));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(936, 1398));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1399));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(998, 1400));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1402));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1403));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1412);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1412));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1416));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1420));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1428));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1429));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(14, 1430));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1431));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(677, 1434));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1437));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1438));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1441));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1443));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1445));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1447));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1448));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(949, 1451));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(326, 1454));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(759, 1455));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1458));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1461));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(869, 1464));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(967, 1465));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1466));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1468));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1471));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1472));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(1478));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(572, 1479));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1481));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(926, 1484));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1485));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(755, 1487));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1493);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1493));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1494));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(376, 1496));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1497));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1498));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(3, 1501));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1502));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1503));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(10, 1507));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(603, 1508));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1510));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.advanceTime(1523);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(229, 1525));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(622, 1530));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1531));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(947, 1533));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(1535));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(502, 1536));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1537));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1538));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(430, 1539));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1546));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1550));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1551));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1553));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(535, 1554));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1557));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(42, 1558));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(19, 1559));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(835, 1560));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1561));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1566);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1569));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(461, 1571));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1575));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1576));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1582);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1587);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(1590));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1592));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1604);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1606));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1610));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1614));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1619));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(884, 1620));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1625));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1627));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1631));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1632));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1633));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1635));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(672, 1637));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(582, 1639));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(1644));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(151, 1645));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(415, 1647));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(904, 1649));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(840, 1652));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1654));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1657));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1658));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1667);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1668));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(457, 1671));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1672));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1673));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1674));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1675));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(554, 1679));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(223, 1684));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(118, 1687));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(166, 1689));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1692));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(976, 1693));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1700);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(677, 1701));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(336, 1704));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1706));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1707));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(342, 1709));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1713));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1714));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1715));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(113, 1716));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1718));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1719));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(884, 1720));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1722));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1726));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(98, 1728));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1729));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(119, 1730));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1731));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(19, 1733));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1735));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1737));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1740));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(301, 1741));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1746));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1747));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1748));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(794, 1751));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1752));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1758));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(827, 1759));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1762));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1770);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(698, 1770));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(517, 1772));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(696, 1773));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1776));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1782));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1783));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1793));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1794));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(385, 1795));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1797));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(195, 1802));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1808));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(1814));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(87, 1816));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1819));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(210, 1821));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1822));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(672, 1824));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(228, 1825));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(370, 1829));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1830));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1832));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1833));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1841);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(997, 1841));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1844));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1848));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(313, 1849));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(378, 1853));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1854));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1856));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1857));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(1862));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1863));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1865));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1868));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(76, 1871));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(1873));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(280, 1874));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(299, 1876));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1879));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1886);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1886));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(477, 1890));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(1896));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(217, 1897));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1908);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(920, 1911));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1919));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1922));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(222, 1924));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(1929));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(1933));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(420, 1935));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1936));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(1941);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1941));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1943));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1945));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1946));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(359, 1950));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(67, 1952));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(263, 1954));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(657, 1955));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1956));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(197, 1959));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1960));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(1962));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1964));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1966));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1969));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1973));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(401, 1974));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1976));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(817, 1981));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1982));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1989));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(845, 1992));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1994));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(1997));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2001));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(845, 2004));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2006));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2008));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(795, 2009));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(820, 2010));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2011));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2012));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2013));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(622, 2014));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2015));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2017));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2019));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2022));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2023));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2024));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2025));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(272, 2026));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2027));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(459, 2031));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2032));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(420, 2036));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2037));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(78, 2043));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2049));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2050));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2051));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2053));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2054));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2055));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(359, 2056));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(618, 2058));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2059));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2060));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(2068));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(722, 2069));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2072));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(986, 2073));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2074));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2075));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2076));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2078));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(84, 2079));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2080));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2082));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(83, 2083));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2085));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2086));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2087));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(2089));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(40, 2090));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2093));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2094));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(2097));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(887, 2102));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2104));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(154, 2105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(294, 2108));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2110));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2111));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2115));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2117));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2119));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(651, 2121));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(989, 2124));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2126));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2127));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(830, 2128));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2130));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2131));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(2136));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(370, 2137));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(2140));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(18, 2144));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(217, 2146));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2149));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(835, 2150));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(222, 2151));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(294, 2156));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(542, 2159));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2160));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(2167);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(2171);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2171));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2174));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2175));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2178));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(42, 2179));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2180));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2181));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2183));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(770, 2185));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2188));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2189));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(74, 2190));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2193));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2194));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(2203);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(695, 2203));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2205));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2212));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2213));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2214));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2217));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(2222));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2223));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(575, 2225));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2226));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(72, 2227));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2229));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2230));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(498, 2234));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(608, 2236));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(287, 2237));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2240));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2241));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2242));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(2245));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2247));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(5, 2248));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2252));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(428, 2254));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(557, 2256));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2257));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(2260);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(755, 2260));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2261));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(2270));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2272));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2277));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2278));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(898, 2279));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(227, 2280));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2283));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2287));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(356, 2288));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2289));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(2297);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(2300);
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
try{
System.out.println(mm.customerWaitTime(482));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(584));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(174));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(807));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(689));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(888));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(60));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(693));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(163));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(166));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(351));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(543));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(970));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(121));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(612));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(453));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(682));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(180));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(14));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(483));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(698));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(420));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(583));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(900));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(319));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(665));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(833));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(398));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(674));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(933));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(158));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(575));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(708));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(13));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(469));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(81));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(937));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(805));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(974));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(288));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(139));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(246));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(494));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(361));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(625));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(883));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(690));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(751));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(605));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(649));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(772));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(136));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(962));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(722));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(425));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(667));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(857));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(925));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(609));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(197));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(343));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(164));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(755));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(229));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(653));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(905));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(388));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(996));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(695));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(33));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(412));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(733));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(429));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(48));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(170));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(457));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(66));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(993));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(162));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(458));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(541));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(828));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(890));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(619));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(1));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(858));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(507));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(917));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(320));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(759));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(52));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(426));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(193));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(936));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(853));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(86));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(860));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(16));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(679));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(428));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(949));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(4));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(219));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(946));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(3));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(542));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(964));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(101));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(913));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(122));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(623));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(204));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(310));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(287));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(187));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(103));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(999));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(407));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(84));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(785));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(840));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(464));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(788));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(263));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(137));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(940));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(356));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(118));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(159));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(286));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(20));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(44));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(994));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(211));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(672));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(572));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(323));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(376));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(678));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(886));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(766));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(470));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(446));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(382));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(551));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(183));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(213));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(385));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(895));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(10));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(142));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(155));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(820));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(920));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(346));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(377));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(934));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(347));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(37));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(43));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(277));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(168));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(859));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(297));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(370));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(405));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(947));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(133));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(301));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(622));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(490));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(687));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(50));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(316));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(184));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(536));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(73));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(637));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(413));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(337));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(307));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(681));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(898));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(961));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(493));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(486));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(595));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(352));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(797));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(780));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(643));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(510));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(812));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(39));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(614));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(713));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(160));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(171));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(827));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(90));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(68));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(87));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(203));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(768));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(761));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(878));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(9));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(642));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(404));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(532));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(586));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(460));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(501));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(223));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(434));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(654));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(378));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(817));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(268));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(552));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(442));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(703));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(702));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(580));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(867));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(29));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(463));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(207));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(640));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(711));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(408));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(948));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(603));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(610));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(222));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(808));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(108));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(547));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(235));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(795));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(186));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(280));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(424));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(78));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(54));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(306));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(919));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(799));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(976));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(208));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(327));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(349));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(217));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(450));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(752));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(254));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(348));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(608));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(455));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(740));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(427));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(256));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(633));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(326));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(854));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(448));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(756));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(597));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(313));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(477));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(113));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(5));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(815));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(362));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(383));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(461));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(741));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(419));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(165));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(19));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(269));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(899));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(954));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(132));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(765));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(402));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(80));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(432));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(824));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(601));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(963));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(527));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(476));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(414));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(241));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(869));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(410));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(760));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(265));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(950));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(21));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(942));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(116));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(67));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(449));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(587));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(8));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(389));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(433));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(230));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(675));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(742));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(734));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(77));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(336));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(236));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(191));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(259));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(926));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(272));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(258));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(18));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(294));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(712));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(896));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(String.format("%.2f",mm.avgWaitTime()));
}
}
