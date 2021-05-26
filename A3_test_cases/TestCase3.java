import java.io.*;
public class TestCase3 { 
public static void main(String[] args){
try{
PrintStream o = new PrintStream(new File("StudentAnswer3.txt"));
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
mm.setK(20);
mm.setM(35);
}
catch(IllegalNumberException e){
System.out.println("Exception");
}
try{
mm.arriveCustomer(249, 0, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(374, 0, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(242, 0, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(36, 2, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(258, 2, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(220, 2, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(415, 3, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(436, 3, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(230, 4, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(488, 5, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(5));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(41, 7, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(471, 9, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(142, 9, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(497, 9, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(9));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(47, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(42, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(277, 10, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(268, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(173, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(10));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(299, 12, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(60, 12, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(12));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(259, 13));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(14));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(93, 15, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(422, 16, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(199, 16, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(16));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(17));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(432, 18, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(423, 20, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(129, 21, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(37, 21, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(272, 21, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(376, 22, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(350, 23, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(313, 25, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(8, 25, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(219, 25, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(240, 25, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(25));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(463, 26, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(346, 26, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(26));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(397, 27, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(27));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(28));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(424, 29, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(123, 29, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(329, 29, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(311, 29, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(357, 29, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(105, 30, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(196, 30, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(86, 30));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(399, 31, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(31));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(32));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(362, 33, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(426, 33, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(461, 34, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(34));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(46, 35, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(35));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(36));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(330, 37, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(153, 37, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(348, 38, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(372, 38, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(213, 38, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(73, 39, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(382, 39, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(111, 41, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(330, 41));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(246, 42, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(496, 42, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(42));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(43));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(17, 45, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(392, 45, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(45));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(281, 46, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(478, 48, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(328, 48, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(406, 49, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(227, 50, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(403, 50, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(34, 50, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(114, 50));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(315, 51, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(475, 51, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(164, 52, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(427, 53, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(157, 53, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(38, 54, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(54));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(83, 55, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(229, 55, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(55));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(224, 56, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(61, 56, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(347, 56, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(56));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(421, 61, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(125, 65, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(91, 65, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(351, 65));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(251, 66, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(445, 66, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(67));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(68));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(67, 69, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(121, 69, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(343, 70, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(465, 70));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(134, 71, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(414, 71, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(244, 74, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(215, 74, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(103, 74, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(76);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(191, 76, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(267, 77, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(9, 77, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(190, 77, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(250, 78, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(423, 78));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(156, 79, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(113, 79));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(51, 80, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(155, 80, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(81));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(146, 82, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(425, 83, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(113, 84, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(84));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(77, 85, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(335, 85, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(20, 86, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(201, 86, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(24, 86, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(14, 87, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(379, 87, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(87));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(114, 88, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(75, 88));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(89));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(90));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(160, 91, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(297, 92, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(308, 92, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(150, 93, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(93));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(359, 94, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(489, 94, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(95, 95, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(337, 96, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(322, 96, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(80, 96, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(48, 97));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(303, 98, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(98));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(99));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(494, 100, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(100));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(205, 101, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(141, 101, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(384, 101, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(309, 102, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(139, 103, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(179, 103, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(311, 103));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(374, 104));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(145, 106, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(159, 106, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(88, 106, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(176, 108, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(252, 108, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(499, 109, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(210, 110, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(110));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(149, 111, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(111));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(112));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(300, 113));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(433, 114, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(298, 114, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(1, 115, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(140, 115, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(115));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(295, 117, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(282, 117, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(184, 119, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(126);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(402, 126, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(409, 126, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(115, 126, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(62, 127, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(446, 127, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(377, 127, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(284, 127, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(128));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(129));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(345, 132, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(361, 133, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(172, 133, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(407, 133, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(133));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(325, 134, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(198, 135, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(223, 135, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(136));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(96, 137, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(482, 138, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(445, 138));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(192, 139, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(387, 140, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(231, 140, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(56, 142, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(483, 142, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(191, 142));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(21, 143, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(441, 143, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(143));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(349, 144, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(50, 144, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(144));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(64, 145, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(145));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(48, 147));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(148));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(302, 149, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(395, 149, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(90, 149, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(442, 150, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(151));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(455, 152, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(133, 154, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(21, 154));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(283, 155, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(148, 155, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(162, 156, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(300, 156, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(253, 157));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(269, 158, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(386, 159, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(159));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(364, 160, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(108, 160, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(160));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(317, 162, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(293, 162, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(369, 162));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(124, 163, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(449, 163, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(86, 163, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(498, 164, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(74, 164, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(291, 165, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(485, 166, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(98, 166, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(166));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(167, 167, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(228, 167, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(167));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(210, 170));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(495, 171, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(182, 172, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(76, 173, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(82, 173, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(35, 173, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(318, 173, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(173));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(261, 174, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(289, 174, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(12, 175, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(32, 176, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(340, 178));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(301, 179, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(385, 179, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(235, 179, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(371, 180, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(306, 182, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(30, 182, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(351, 182));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(351, 183, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(396, 183, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(371, 183));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(392, 184));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(273, 185, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(185));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(418, 186, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(186));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(43, 187, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(19, 188, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(295, 188));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(189));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(470, 191, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(180, 191, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(292, 191, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(191));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(476, 192, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(262, 193, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(170, 193, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(199);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(400, 199, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(87, 201, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(253, 202, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(408, 202, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(202));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(314, 204, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(274, 204, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(152, 204, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(204));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(411, 206, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(416, 206, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(51, 206));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(457, 207, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(72, 207, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(460, 207, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(453, 208));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(33, 209, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(465, 210, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(52, 210, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(469, 210, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(210));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(107, 211, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(43, 211));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(344, 213, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(233, 213, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(242, 213));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(245, 214, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(466, 214, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(294, 215, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(448, 216, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(279, 217, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(487, 217, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(369, 218, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(363, 218, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(303, 218));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(323, 219, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(171, 220, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(79, 221, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(344, 221));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(444, 223, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(412, 223, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(97, 223, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(304, 223, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(112, 224, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(58, 224, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(224));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(389, 226, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(208, 226, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(226));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(430, 227, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(100, 228, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(228));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(229));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(163, 231, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(340, 231, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(231));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(216, 232, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(439, 232, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(454, 232, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(232));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(321, 233, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(453, 234, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(234));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(319, 235, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(484, 235, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(431, 236, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(230, 237));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(356, 238, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(238));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(378, 239, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(468, 240, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(240));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(213, 241));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(447, 242, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(92, 242, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(242));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(462, 243, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(287, 243));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(244));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(49, 246, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(398, 246, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(212, 246, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(433, 247));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(248));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(259, 249, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(394, 249, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(218, 249, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(410, 250, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(287, 250, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(413, 250, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(257);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(259));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(32, 260));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(261));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(263));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(266));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(267));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(269));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(270));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(378, 274));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(275));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(115, 277));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(279));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(280));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(281));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(361, 282));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(283));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(284));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(286));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(287));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(295);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(295));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(41, 297));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(299));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(223, 301));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(311);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(97, 311));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(407, 313));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(319));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(321));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(224, 323));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(302, 327));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(330);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(333);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(142, 333));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(334));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(336));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(339));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(342));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(343));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(344));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(351);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(353));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(433, 354));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(355));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(356));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(408, 358));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(364));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(365));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(366));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(368));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(369));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(372));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(374));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(375));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(376));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(377));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(382));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(383));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(416, 384));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(385));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(455, 386));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(371, 387));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(389));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(391));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(393));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(394));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(397));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(402));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(405));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(407));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(409));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(410));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(415));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(416));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(426);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(61, 426));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(427));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(430));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(431));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(432));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(433));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(434));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(436));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(437));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(439));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(283, 441));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(444));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(77, 445));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(381, 446));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(447));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(450));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(452));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(297, 453));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(454));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(457));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(460));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(463));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(465));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(466));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(64, 467));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(468));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(469));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(470));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(471));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(242, 473));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(475));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(476));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(477));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(479));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(481);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(483));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(159, 485));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(350, 486));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(488));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(500);
System.out.println("--End of simulation--");}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerWaitTime(433));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(198));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(389));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(456));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(216));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(21));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(133));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(262));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(249));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(208));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(471));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(402));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(425));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(156));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(245));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(184));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(299));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(457));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(465));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(112));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(259));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(72));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(145));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(478));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(387));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(49));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(317));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(410));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(129));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(466));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(273));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(362));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(415));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(309));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(462));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(76));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(159));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(51));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(374));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(38));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(436));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(351));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(170));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(242));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(287));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(52));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(182));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(223));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(162));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(313));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(328));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(105));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(283));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(485));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(227));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(444));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(267));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(134));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(32));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(413));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(281));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(8));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(48));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(369));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(431));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(205));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(364));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(423));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(488));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(343));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(321));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(1));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(314));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(253));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(424));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(171));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(125));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(461));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(167));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(361));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(33));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(98));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(291));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(114));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(123));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(412));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(73));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(414));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(279));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(230));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(47));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(42));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(164));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(261));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(251));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(56));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(155));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(447));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(150));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(468));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(64));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(439));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(487));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(277));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(448));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(470));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(398));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(301));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(148));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(228));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(409));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(306));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(498));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(163));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(295));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(124));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(149));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(95));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(97));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(96));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(17));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(427));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(337));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(442));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(244));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(36));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(46));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(348));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(67));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(77));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(20));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(408));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(359));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(396));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(350));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(201));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(400));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(269));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(142));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(268));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(121));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(111));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(372));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(302));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(215));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(297));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(141));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(231));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(426));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(339));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(329));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(183));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(43));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(421));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(378));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(60));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(250));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(392));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(323));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(172));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(418));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(432));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(9));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(139));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(344));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(113));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(191));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(88));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(397));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(219));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(441));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(454));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(75));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(334));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(24));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(294));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(274));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(394));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(460));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(14));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(399));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(381));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(311));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(385));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(62));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(499));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(497));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(190));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(335));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(19));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(12));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(100));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(382));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(319));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(246));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(108));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(349));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(322));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(411));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(218));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(449));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(376));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(422));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(416));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(37));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(403));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(180));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(224));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(93));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(303));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(258));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(240));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(494));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(483));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(345));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(103));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(298));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(484));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(241));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(87));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(395));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(30));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(82));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(83));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(176));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(272));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(489));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(61));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(445));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(90));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(7));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(496));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(210));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(406));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(160));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(357));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(199));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(469));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(79));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(363));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(235));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(41));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(340));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(325));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(140));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(476));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(35));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(315));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(196));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(446));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(384));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(91));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(157));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(74));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(173));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(92));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(152));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(229));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(386));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(330));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(463));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(34));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(282));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(80));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(308));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(192));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(107));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(213));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(346));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(455));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(428));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(153));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(50));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(179));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(86));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(289));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(252));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(58));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(407));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(115));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(318));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(453));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(430));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(146));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(233));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(377));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(284));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(293));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(495));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(304));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(475));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(482));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(300));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(356));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(347));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(220));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(379));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(371));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(212));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(292));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(String.format("%.2f", mm.avgWaitTime()));
}
}
