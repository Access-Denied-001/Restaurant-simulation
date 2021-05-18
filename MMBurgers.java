import java.util.*;

class Customer{
    // customer brings id and number of burgers with them
    int cId;
    int numberOfBurgers;
    int numberOfBurgersReceived;
    // state of customer index 0 queued in the Kth queue index 1 order gone to chef index2 All orders received
    // time of events will tell time at which events were completed for the customer
    int[] timeOfEvents =  new int[3];
    int queueNumber;
    int rankOfCustomer;
    public Customer(int id, int numb, int timeOfEntry){
        cId = id;
        numberOfBurgers = numb;
        timeOfEvents[0] = timeOfEntry;
        for(int i=1;i<3;i++){
            timeOfEvents[i]=-1;
        }
    }
}

class Burger{
    // id of customer
    int orderedBy;
    boolean hasCooked;
    boolean hasReceived;
    int timeOfCooking;
    int timeOfDelivery;
    public Burger(int id){
        orderedBy = id;
    }
}

class BillingQueue{
    int queueName;
    Vector<Customer> queue;
    int size;
    public BillingQueue(int queueN){
        size = 0;
        queueName = queueN;
        queue = new Vector<Customer>();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return size;
    }
    public Vector<Customer> enqueue(Customer curr){
        queue.add(curr);
        size++;
        return queue;
    }
    public Customer dequeue(){
        size--;
        return queue.remove(0);
    }
    public Customer peekFront(){
        if(isEmpty()){
            return null;
        }
        else{
            return queue.get(0);
        }
    }
    public Customer peekLast(){
        if(isEmpty()){
            return null;
        }
        else{
            return queue.get(size-1);
        }
    }
    //Comparator function type for two queues
    public int compareWith(BillingQueue second){
        if(size<second.size){
            return -1;
        }
        else if(size>second.size){
            return 1;
        }
        else{
            if(queueName<second.queueName){
                return -1;
            }else{
                return 1;
            }
        }
    }
}

class HeapOfQueues{
    BillingQueue[] heapOfQueues;
    int size;
    public HeapOfQueues(int k){
        //Index 0 is left out
        heapOfQueues = new BillingQueue[k+1];
        size = k;
        for(int i=1;i<k+1;i++){
            heapOfQueues[i] = new BillingQueue(i);
        }
    }
    // heap ka size
    public int size(){
        return size;
    }
    public int parent(int j){
        return j/2;
    }
    public int left(int j){
        return 2*j;
    }
    public int right(int j){
        return (2*j)+1;
    }
    public boolean hasLeft(int j){
        if(j>0) {
            return left(j) <= size;
        }else{
            System.out.println("Index 0 is a dummy node");
            return false;
        }
    }
    public boolean hasRight(int j){
        if(j>0) {
            return right(j) <= size;
        }
        else {
            System.out.println("Index 0 is a dummy node");
            return false;
            }
        }
    public void swap(int i, int j){
        BillingQueue temp = heapOfQueues[i];
        heapOfQueues[i] = heapOfQueues[j];
        heapOfQueues[j] = temp;
    }
    public boolean isEmpty() {
        boolean flag = true;
        for(int i=1;i<=size;i++){
            if(!heapOfQueues[i].isEmpty()){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public BillingQueue jthQueue(int j){
        if (j >= 1 && j <= size) {
            for (int i = 1; i < heapOfQueues.length; i++) {
                if (heapOfQueues[i].queueName == j) {
                    return heapOfQueues[i];
                }
            }
        }
        return null;
    }
    public int compare(int i, int j){
        if(i>0 && i<size+1 & j>0 && j<size+1 && i!=j){
            BillingQueue first = heapOfQueues[i];
            BillingQueue second = heapOfQueues[j];
            return first.compareWith(second);
        }
        return 0;
    }
    public void upheap(int j){
        while(j>1){
            int p = parent(j);
            if(compare(j,p)>0){
                break;
            }
            swap(j,p);
            j=p;
        }
    }
    public void downheap(int j){
        while(hasLeft(j)){
            int leftIndex = left(j);
            int smallChildIndex = leftIndex;
            if(hasRight(j)){
                int rightIndex = right(j);
                if(compare(leftIndex,rightIndex)>0){
                    smallChildIndex = rightIndex;
                }
            }
            if(compare(smallChildIndex,j)>0){
                break;
            }
            swap(j,smallChildIndex);
            j = smallChildIndex;
        }
    }
    public void bubble(int j){
        if(j>1 && compare(j, parent(j))<0){
            upheap(j);
        }else{
            downheap(j);
        }
    }
    public void changeMinQueue(){
        bubble(1);
    }
    public BillingQueue min(){
        return heapOfQueues[1];
    }
    public void printer(){
        for(int i=1;i<size+1;i++){
            System.out.print("( " + heapOfQueues[i].queueName +","+ heapOfQueues[i].size +" )" +" ");
        }
        System.out.println();
    }
}

class Node {
    public int key;
    public Customer newCustomer;
    public int balance;
    public int height;
    public Node left, right, parent;

    Node(int k, Node p) {
        key = k;
        parent = p;
    }
}

class AVLTree {
    public Node root;
    // key is customer ID
    public boolean insert(int key) {
        if (root == null) root = new Node(key, null);
        else {
            Node n = root;
            Node parent;
            while (true) {
                if (n.key == key) return false;
                parent = n;
                boolean goLeft = n.key > key;
                n = goLeft ? n.left : n.right;
                if (n == null) {
                    if (goLeft) {
                        parent.left = new Node(key, parent);
                    } else {
                        parent.right = new Node(key, parent);
                    }
                    rebalance(parent);
                    break;
                }
            }
        }
        return true;
    }
    private void delete(Node node) {
        if (node.left == null && node.right == null) {
            if (node.parent == null) root = null;
            else {
                Node parent = node.parent;
                if (parent.left == node) {
                    parent.left = null;
                } else parent.right = null;
                rebalance(parent);
            }
            return;
        }
        if (node.left != null) {
            Node child = node.left;
            while (child.right != null) child = child.right;
            node.key = child.key;
            delete(child);
        } else {
            Node child = node.right;
            while (child.left != null) child = child.left;
            node.key = child.key;
            delete(child);
        }
    }
    public void delete(int delKey) {
        if (root == null) return;
        Node node = root;
        Node child = root;

        while (child != null) {
            node = child;
            child = delKey >= node.key ? node.right : node.left;
            if (delKey == node.key) {
                delete(node);
                return;
            }
        }
    }
    private void rebalance(Node n) {
        setBalance(n);
        if (n.balance == -2) {
            if (height(n.left.left) >= height(n.left.right)) n = rotateRight(n);
            else n = rotateLeftThenRight(n);

        } else if (n.balance == 2) {
            if (height(n.right.right) >= height(n.right.left)) n = rotateLeft(n);
            else n = rotateRightThenLeft(n);
        }
        if (n.parent != null) {
            rebalance(n.parent);
        } else {
            root = n;
        }
    }
    private Node rotateLeft(Node a) {
        Node b = a.right;
        b.parent = a.parent;
        a.right = b.left;
        if (a.right != null) a.right.parent = a;
        b.left = a;
        a.parent = b;
        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else {
                b.parent.left = b;
            }
        }
        setBalance(a, b);
        return b;
    }
    private Node rotateRight(Node a) {
        Node b = a.left;
        b.parent = a.parent;
        a.left = b.right;
        if (a.left != null) a.left.parent = a;
        b.right = a;
        a.parent = b;
        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else {
                b.parent.left = b;
            }
        }
        setBalance(a, b);
        return b;
    }
    private Node rotateLeftThenRight(Node n) {
        n.left = rotateLeft(n.left);
        return rotateRight(n);
    }
    private Node rotateRightThenLeft(Node n) {
        n.right = rotateRight(n.right);
        return rotateLeft(n);
    }
    private int height(Node n) {
        if (n == null) return -1;
        return n.height;
    }
    private void setBalance(Node... nodes) {
        for (Node n : nodes) {
            reheight(n);
            n.balance = height(n.right) - height(n.left);
        }
    }
    public void printBalance() {
        printBalance(root);
    }
    private void printBalance(Node n) {
        if (n != null) {
            printBalance(n.left);
            System.out.printf("%s ", n.balance);
            printBalance(n.right);
        }
    }
    private void reheight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }
    public Node search(int key) {
        Node result = searchHelper(this.root, key);
        return result;
    }
    private Node searchHelper(Node root, int key) {
        // root is null or key is present at root
        if (root == null || root.key == key) return root;

        // key is greater than root's key
        if (root.key > key)
            return searchHelper(root.left, key); // call the function on the node's left child

        // key is less than root's key then
        // call the function on the node's right child as it is greater
        return searchHelper(root.right, key);
    }
}

class chefsQueueObject{
    int id;
    int numberOfBurgers;
    boolean hasOrdered = false;
    int queueNum;
    int timeOfOrder;
    boolean onGriddle=false;
    int timeOfOnGriddle;
    boolean hasCooked = false;
    // time when it is added to chefs griddle
    int timeWhenFullCooked;
    public chefsQueueObject(int cid,int numb, int time,int queueN){
        id = cid;
        numberOfBurgers = numb;
        hasOrdered=true;
        timeOfOrder = time;
        queueNum = queueN;
        }
    public int compareWith(chefsQueueObject second){
        if(timeOfOrder < second.timeOfOrder){
            return -1;
        }
        if(timeOfOrder > second.timeOfOrder){
            return 1;
        }else{
            if(queueNum < second.queueNum){
                return 1;
            }
            if(queueNum > second.queueNum){
                return -1;
            }
        }
        return 0;
    }
    public boolean isEquals(chefsQueueObject second){
        if(id==second.id && timeOfOrder == second.timeOfOrder && queueNum == second.queueNum){
            return true;
        }
        else{
            return false;
        }
    }
    public void printer(){
        System.out.print(id+" "+numberOfBurgers+" "+timeOfOrder+" " + queueNum);
    }
}

class griddleQueue{
    Vector<Burger> griddleQueue;
    //If griddle is full then burger goes to waiting list.
//    griddleWaitQueue waitingLine;
    // Size and Maxsize of griddle
    int maxSize;
    int size;
    public griddleQueue(int m){
        maxSize = m;
        size=0;
        griddleQueue = new Vector<Burger>(m);
//        waitingLine = new griddleWaitQueue();
    }
    public boolean isEmpty(){
        return size==0;
//                && waitingLine.isEmpty();
    }
    public boolean isFull(){
        return size>=maxSize;
    }
    public int size(){
        return size;
    }
    public Vector<Burger> enqueue(Burger curr){
        if(size<maxSize){
            griddleQueue.add(curr);
            size++;
        }
        return griddleQueue;
    }
    public Burger dequeue(){
        size--;
        return griddleQueue.remove(0);
    }
    public Burger peekFront(){
        if(isEmpty()){
            return null;
        }
        else{
            return griddleQueue.get(0);
        }
    }
    public Burger peekLast(){
        if(isEmpty()){
            return null;
        }
        else{
            return griddleQueue.get(size-1);
        }
    }
}

class griddleWaitQueue{
    Vector<chefsQueueObject> griddleWaitQueue;
    int size;
    int f;
    int burgers;
    public griddleWaitQueue(){
        size=0;
        burgers = 0;
        f=0;
        griddleWaitQueue = new Vector<chefsQueueObject>();
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public Vector<chefsQueueObject> insert(chefsQueueObject curr){
        int index = 0;
        while(index<size && curr.compareWith(griddleWaitQueue.get(index))==1){
            index++;
        }
        griddleWaitQueue.add(index,curr);
        size++;
        burgers += curr.numberOfBurgers;
        return griddleWaitQueue;
    }

    public Burger removeFromWaitingLine(){
        if(!griddleWaitQueue.isEmpty()){
            chefsQueueObject firstElement = peekFront();
            if(firstElement.numberOfBurgers-1!=0){
                chefsQueueObject replacingElement = new chefsQueueObject(firstElement.id,firstElement.numberOfBurgers-1,firstElement.timeOfOrder,firstElement.queueNum);
                griddleWaitQueue.set(0,replacingElement);
            }
            else{
                griddleWaitQueue.remove(0);
                size--;
            }
            burgers--;
            Burger nextTogetAdded = new Burger(firstElement.id);
            return nextTogetAdded;
        }
        return null;
    }
    public chefsQueueObject peekFront(){
        if(isEmpty()){
            return null;
        }
        else{
            return griddleWaitQueue.get(0);
        }
    }
}

public class MMBurgers implements MMBurgersInterface {
    // number of customers;
    int customerNumber=0;
    // simulation time
    int globalTime = 0;
    //total number of queues
    int K ;
    // maximum number of burgers in griddle
    int griddleSize;
    //griddle
    griddleQueue griddle;
    // griddle waiting line
    griddleWaitQueue waitingLine;
    //billing counter
    HeapOfQueues billCounters;
    // data of customers
    AVLTree customers = new AVLTree();

    public boolean isEmpty(){
        // isempty must return true if my last customers order is delivered
        // change Avl tree with griddle queue
        if(billCounters.isEmpty() && griddle.isEmpty()){
            System.out.println(true);
            return true;
        }
        else{
            System.out.println(false);
            return false;
        }
    }
    public void setK(int k) throws IllegalNumberException{
        if(k<1){
            throw new IllegalNumberException("K is out of given bound");
        }
        else{
            billCounters = new HeapOfQueues(k);
            K = k;
//            billCounters.printer();
        }
    }   
    
    public void setM(int m) throws IllegalNumberException{
        if(m<1){
            throw new IllegalNumberException("Griddle Size cannot be 0 or less!!");
        }else{
            griddle = new griddleQueue(m);
            waitingLine = new griddleWaitQueue();
            griddleSize = m;
        }
    } 

    public void advanceTime(int t) throws IllegalNumberException{
        if(t<globalTime){
            throw new IllegalNumberException("Time cannot be decreased!!");
        }
        else{
            globalTime = t;
            for(int i=1;i<=K;i++){
                BillingQueue currentQ = billCounters.heapOfQueues[i];
                while(!currentQ.isEmpty() && currentQ.peekFront().timeOfEvents[1]<=t){
                    Customer orderPlaced = currentQ.dequeue();
                    // I have to add this customers burgers to my griddle
                    chefsCall(orderPlaced,t);
                }
            }
            addToGriddle();
            // Check same for griddle
            sanitiseGriddle(t);
        }
    } 
    public void chefsCall(Customer currentlyOut,int time){
        int burgers = currentlyOut.numberOfBurgers;
        chefsQueueObject otherBurgers = new chefsQueueObject(currentlyOut.cId,burgers,currentlyOut.timeOfEvents[1],currentlyOut.queueNumber);
        waitingLine.insert(otherBurgers);
//        for(int i=1;i<=burgers;i++) {
//            if (!griddle.isFull() && griddle.waitingLine.isEmpty()) {
//                Burger nextBurger = new Burger(currentlyOut.cId);
//                nextBurger.hasCooked = true;
//                nextBurger.timeOfCooking = currentlyOut.timeOfEvents[1]+10;
//                nextBurger.timeOfDelivery = currentlyOut.timeOfEvents[1]+11;
//                griddle.enqueue(nextBurger);
//            }
//            else{
////                System.out.println("HIII");
////                System.out.println(i);
//                chefsQueueObject otherBurgers = new chefsQueueObject(currentlyOut.cId,burgers+1-i,currentlyOut.timeOfEvents[1],currentlyOut.queueNumber);
//                griddle.waitingLine.insert(otherBurgers);
////                System.out.println("hii");
////                System.out.println(griddle.waitingLine.burgers);
//                break;
//            }
//        }
    }
    public void addToGriddle(){
            while(!griddle.isFull() && !waitingLine.isEmpty()){
                int timeOfOrderPlacing = waitingLine.peekFront().timeOfOrder;
                Burger nextOne = waitingLine.removeFromWaitingLine();
                nextOne.hasCooked = true;
                nextOne.timeOfCooking = timeOfOrderPlacing+10;
                nextOne.timeOfDelivery = nextOne.timeOfCooking+1;
                griddle.enqueue(nextOne);
            }
    }
    public void sanitiseGriddle(int time){
        while(!griddle.griddleQueue.isEmpty() && griddle.griddleQueue.get(0).timeOfCooking<=time){
            Burger burgerObject = griddle.dequeue();
            Customer currentCustomer = customers.search(burgerObject.orderedBy).newCustomer;
            currentCustomer.numberOfBurgersReceived++;
            if(currentCustomer.numberOfBurgersReceived==currentCustomer.numberOfBurgers){
                currentCustomer.timeOfEvents[2]=burgerObject.timeOfDelivery;
            }
            if(!waitingLine.isEmpty()){
                Burger firstInWaitingLine = waitingLine.removeFromWaitingLine();
                firstInWaitingLine.hasCooked = true;
                firstInWaitingLine.timeOfCooking = burgerObject.timeOfCooking+10;
                firstInWaitingLine.timeOfDelivery = firstInWaitingLine.timeOfCooking+1;
                griddle.enqueue(firstInWaitingLine);
                }
            }
        }
    public void arriveCustomer(int id, int t, int numb) throws IllegalNumberException{
        if(t >= globalTime && numb > 0) {
            Customer curr = new Customer(id,numb,t);
            globalTime=t;
            int key = curr.cId;
            if (customers.search(key) != null) {
                throw new IllegalNumberException("Id already exists!!");
            } else {
                customers.insert(key);
                Node treeNode = customers.search(key);
                treeNode.newCustomer = curr;
                customerNumber++;
                advanceTime(t);
                billCounters.min().enqueue(curr);
                curr.queueNumber = billCounters.min().queueName;
                curr.rankOfCustomer = billCounters.min().size;
                curr.timeOfEvents[0]=t;
                curr.timeOfEvents[1]=curr.timeOfEvents[0]+curr.queueNumber * curr.rankOfCustomer;
                billCounters.changeMinQueue();
//                billCounters.printer();
            }
        }
        else{
            if(t < globalTime) {
                throw new IllegalNumberException("Time cannot be decreased!!");
            }if(numb<=0){
                throw new IllegalNumberException("Number of burgers cannot be 0 or less!!");
                }
            }
    }

    public int customerState(int id, int t) throws IllegalNumberException{
        if(t<globalTime){
            throw new IllegalNumberException("Time cannot be decreased!!");
        }else{
            advanceTime(t);
            Node customer = customers.search(id);
            if(customer == null){
                System.out.println(0);
                return 0;
            }
            else{
                Customer currentCustomer = customer.newCustomer;
                // order not yet still in the queue
                if(currentCustomer.timeOfEvents[1]>t){
                    System.out.println(currentCustomer.queueNumber);
                    return currentCustomer.queueNumber;
                }else{
                    if(currentCustomer.timeOfEvents[2] == -1){
                        System.out.println(K+1);
                        return K+1;
                    }else{
                        if(currentCustomer.timeOfEvents[2]>t){
                            System.out.println(K+1);
                            return K+1;
                        }
                        else{
                            System.out.println(K+2);
                            return K+2;
                        }
                    }
                }
            }
        }
    } 

    public int griddleState(int t) throws IllegalNumberException{
        if(t<globalTime){
            throw new IllegalNumberException("Time cannot be decreased!!");
        }else{
            advanceTime(t);
            System.out.println(griddle.size());
            return griddle.size();
        }
    } 

    public int griddleWait(int t) throws IllegalNumberException{
        if(t<globalTime){
            throw new IllegalNumberException("Time cannot be decreased!!");
        }else{
            advanceTime(t);
            System.out.println(waitingLine.burgers);
            return waitingLine.burgers;
        }
    } 

    public int customerWaitTime(int id) throws IllegalNumberException{
        Node customer = customers.search(id);
        if(customer == null){
            throw new IllegalNumberException("This customer does not exists!!");
        }else{
            Customer customeR = customer.newCustomer;
            System.out.println(customeR.timeOfEvents[2]-customeR.timeOfEvents[0]);
            return customeR.timeOfEvents[2]-customeR.timeOfEvents[0];
        }
    } 

	public float avgWaitTime(){
        float sum=0;
        Queue<Node> traversalQ = new LinkedList<>();
        if(customers.root!=null){
            traversalQ.add(customers.root);
        }
        while(!traversalQ.isEmpty()){
            Node randomCustomerNode = traversalQ.remove();
            sum+= randomCustomerNode.newCustomer.timeOfEvents[2]- randomCustomerNode.newCustomer.timeOfEvents[0];
            if(randomCustomerNode.left!=null){
                traversalQ.add(randomCustomerNode.left);
            }
            if(randomCustomerNode.right!=null){
                traversalQ.add(randomCustomerNode.right);
            }
        }
        float averageWaitTime = sum/customerNumber;
        System.out.println(averageWaitTime);
        return averageWaitTime;
    }
}
