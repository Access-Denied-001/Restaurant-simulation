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
