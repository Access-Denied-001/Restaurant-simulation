# McMohans-restaurant-simulation

### Problem Statement - 

We want to simulate a burger restaurant with large customer base effectively by using appropriate Data storage and algoithms. The restaurant has k billing counters numbered from 1 
to k. Since it is a hit amongst youngsters, we get a lot of traffic leading to long billing queues as well as food preparation. We would like to know certain statistics like
average wait time, average queue length, a specific customers wait time, queue length of individual queues from 1 to k, number of customers serviced by a queue attender, status of
a specific customer, so that proper steps can be taken to improve to improve customer satisfaction. We want a simulation, as it is cost & time efficient and it allows for experimentation on the assumed model.

### Process Information - 

    1. The customers arrive randomly. A new customer always joins the billing queue with smalles length. 
    If there are multiple queues with the smalles length, then the lowest numbered queue of those will be chosen by the customer. 
    If two customer arrive then assume that one customer has already joined a queue, then second arrives (they don't join some queue simultaneously). 

    2. Servicing employees in the queue are not equally efficient, so the billing queue i employee will take i units of time to service a person.
     People will be leaving queue almost sort of randomly(function cannot be predicted easily). 
     
    3. After the order has beem billed then it goes to the chef who cooks burger on a griddle with limited size M (set at start of simulation),
    and an infinetly long waiting griddle. Each burger gets cooked in 10 units of time, when a burger is cooked then it is taken off from the griddle
    immediately and delivered to the customer in 1 unit of time. Once the customer gets the order he/she is marked out of the restaurant immediately.
    (Its a take-away restaurant, not a dine-in). 
    
### The simulation is driven by events. Events in simulation environment are arrival/departure of a customer, completion of payment for an order, completion of one or more burgers, etc. For each customer we have to maintain their states: waiting in queue, waiting for food, or left the restaurant(completion of order(/s)). Maintain a global clock, which will move forward by 1 unit and is discrete in nature starts from 0.

If there are multiple events happening at the same instant, the events are executed in the following manner:

    1. Billing specialist prints an order and sends it to the chef, customer leaves the queue waits and for the order to get completed. 
    2. A cooked burger is removed from the griddle.
    3. The chef puts another burger on the griddle.
    4. A newly arrived customer joins the queue.
    5. Cooked burgers are then delivered to the customers.
    
If there is a query at a time "t" then, every above mentioned queries should be updated till t and then the asked query can be answered (like state of a customer,etc).

### Read A3.pdf for role of individual methods

We used AVL balanced search trees for customer records, then we used heaps to order queues as priority of queue differs according to its name and number of customers in it, and some custom queues for implementing burger placing and to implement individual queues.

Example-
    
    Let K = 3 (number of queues in restaurant)
    Let M = 6 (griddle size)
    
    At t-0
        Customer1 comes to order 3 burgers --> Goes to queue 1 (length 0-->1)
        Customer2  comes to order 4 burgers --> Goes to queue 2 (length 0-->1)
        Customer3 comes to order 5 burgers ---> Goes to queue 3 (length 0-->1)
    
    Billing specialistt will take 1 units for queue1, 2 units for queue2, 3 units for queue3. 
    
    Events numbered according time,
    
    1. Customer1 waits in queue1 for 1 unit of time.
    2. At t=1, order of customer1 is sent to chef, and 3 out of 3 are put on the griddle.
    3. At t=2, order of customer2 is sent to chef, and 3 out of 4 are put on the griddle , 1 is on waiting queue.
    4. At t=3, order of customer3 is sent to chef, and all are sent to waiting queue.
                                    |
                     As burgers take 10 units toget cooked
                                    |         
    5. At t=11, 3 burgers of customer1 are cooked and 1 burger of customer2 and 2 burgers of customer3 are put on the griddle.
    6. At t=12, 3 burgers of customer2 are cooked and 3 burgers of customer3 are put on griddle, then 3 burgers of customer1 
    are delivered (delivery of burgers take 1 unit time).
    7. At t=13, 3 burgers of customer2 is delivered.
    8. At t=21, 1 burger of customer2 and 2 burgers of customer3 gets cooked.
    9. At t=22, 2 burgers of customer3 are delivered, and remaining 3 burgers gets cooked. 1 burger of customer2 is delivered and 
    customer2 leaves the restaurant. 2 burgers of customer3 are delivered.
    10. At t=23, 3 burgers of customer3 are delivered and customer3 leaves the restaurant.
    
    Finish time of customer1 =  12 units.
    Finish time of customer2 = 22 units.
    Finsh time of customer3 = 23 units.
    
    Avg. wait time = (12+22+23)/3 = 19.
    
### Now, check  MMBurgers.java for source code, and all other java files are related to certain exceptions. 
inputinstruction.txt contains commands on how to run the script.
