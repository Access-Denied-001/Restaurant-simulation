import java.io.*;
public class TestCase6 { 
public static void main(String[] args){

try{
PrintStream o = new PrintStream(new File("StudentAnswer6.txt"));
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
mm.setK(25);
mm.setM(50);
}
catch(IllegalNumberException e){
System.out.println("Exception");
}
try{
System.out.println(mm.griddleState(1));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(2));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(871, 4, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(935, 4, 32);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(921, 14));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(143, 15, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(626, 16, 16);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(777, 17));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(415, 18, 18);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(656, 19, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(20));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(21));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(634, 22));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(748, 23, 24);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(921, 23, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(23));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(266, 24, 22);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(76, 24, 28);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(98, 26, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(803, 26));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(938, 27, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(524, 28, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(28));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(29));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(498, 30, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(318, 30, 35);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(562, 30, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(395, 31, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(32));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(484, 33, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(33));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(34));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(64, 35, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(409, 35, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(42);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(865, 42, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(144, 42, 24);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(42));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(46);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(431, 48));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(617, 49, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(49));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(887, 50, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(143, 50));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(737, 53, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(267, 53));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(546, 56, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(803, 57, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(728, 57, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(68);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(68));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(941, 69, 28);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(774, 69, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(566, 69, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(930, 70, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(289, 70, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(819, 70, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(71));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(989, 72, 20);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(72));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(151, 73, 23);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(861, 74, 28);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(257, 75, 12);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(96, 75, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(830, 76, 33);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(76));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(634, 77, 30);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(701, 78, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(848, 78, 7);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(78));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(79));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(80));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(81));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(685, 82, 26);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(144, 82));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(339, 84, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(804, 84, 23);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(84));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(445, 86, 31);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(15, 86, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(454, 87, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(989, 87));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(990, 89, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(641, 89, 11);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(431, 90, 22);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(517, 90, 34);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(534, 90, 17);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(91));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(92));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(777, 93, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(93));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(94));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(95));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(324, 96, 29);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(517, 96));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(101));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(395, 102));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(103));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(534, 105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(108));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(109));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(112));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(115));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(626, 116));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(117));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(118));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(120));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(122));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(127));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(845, 133));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(143);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(102, 143));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(146));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(147));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(149));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(150));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(161);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(161));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(163));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(164));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(166));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(363, 167));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(168));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(546, 170));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(914, 171));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(172));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(728, 177));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(395, 180));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(182));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(185));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(186));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(187));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(188));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(200);
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
System.out.println(mm.customerWaitTime(992));
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
System.out.println(mm.customerWaitTime(990));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(566));
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
System.out.println(mm.customerWaitTime(938));
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
System.out.println(String.format("%.2f",mm.avgWaitTime()));
}
}
