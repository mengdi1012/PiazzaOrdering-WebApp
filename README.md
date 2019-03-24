# a2-starter

- Pair Programming  
    - Pizza features  
        - Roles: driver-jaysonpan navigator-mengdishi  
        - Process: By discussion, we plan to use Factory Method Degisn Pattern to support creation of different types of pizzas. Jayson is charge of coding the related classes. Mengdi is helping with specific implementing details, like type of variable, whether to use enumeration to store topping options and also some advice about the formatting style of code.

    - Delivery features:  
        - Roles: driver-mengdishi navigator-jaysonpan 
        - Process: By discussion, we plan to use Adapter Design Pattern to support connecting our application with other 3rd party delivery api. Mengdi is charge of coding the related classes. Jayson is helping with giving design advices and also help resolve issues reported by sonarlint.

    - Reflection:  
        - Positives: 
            -	Many mistakes are detected at the time when we are typed. Especially for spelling mistake and syntax issues.
            -	Very helpful when driver forgot about how to use an API function or parameters, it is very effective to get a                 face-to-face instruction instead searching online. 
            -	Solves problems faster, able to share directly our knowledge and thinking.
            -	More enjoyable working experience compare with working alone in front of a computer.


        - Negatives:
            - Hard to find common free time of at least 2 hours for both
            - Easier to get distraction than alone
            - Low coding speed, easy to be disturbed by other questions

- Program design
    - Design Patterns   
        - Factory Method Design Pattern in creation of pizza. We have 4 default pizza type classes: pepperoni, margherita, vegetarian, Neapolitan. Each of them have different preparations(different default toppings).
        - Adapter Design Pattern in sending delivery request.
        Since Uber Eats and Foodora require different format of delivery details one is JSON, one is CSV. Hence we create a DeliveryServiceAdapter which will sending delivery request of delivery details in different format based on the DeliveryType - (Inhouse, Uber Eats, Foodora) like following:
            - Inhouse(Pizza parlour’s in-house delivery person):  
            Pizza parlour’s in-house delivery person
            a2.DeliveryDetail@6d6f6e28
            (Since we just pass in the DeliveryDetail object)

            - Uber Eats - get delivery detail in JSON:     
            {  
            Address:10 St.george Street,   
            Order Details: {orderNumber=0, pizzas=[Pizza{type=Pepperoni, size=Small, toppings =Pepperon } ], drinks=Coke },   
            Order Number: 0  
            }
            
            - Foodora - get delivery detail in CSV: 10 St.george Street,{orderNumber=2, pizzas=[Pizza{type=Margherita, size=Medium, toppings =Mushrooms } ], drinks=Pepsi },2
        - Builder Design Pattern in Pizza Instantiation and order instantiation. Since pizza and order are complex object containing many elements, we decide to create corresponding Builder class for them.
        - Singleton Design Pattern for order manager. As in real life, we need a single system to process all order requests, including store current orders, assign unique order number to new order etc. Hence, it should be only one instance.
    - Relationships between objects  
    We strict follow the requirements of code cohesion and decoupling. We create a lof of classes with a single, well-focused purpose, like pricer - which is instantiated with a menu and can calculate the total price of an order. At first we put it inside the order, but it creates extra dependencies between order and menu when order already depends on many other objects like pizza and drink. We also apply Factory Method Design Pattern to remove coupling.
    - Function design  
    We use standard and intuitive function name in our project. We also decompose complex functions into simpler sub-functions. We use less comment and we don't have  commented out code left.

- Line Coverage  
    With main: 69% line coverage  
    Without main: 91% line coverage    
    (A lot of command-line interface code in main)  

- Data persistence  
    We have two persistent file: "menu.csv", custom types of pizza under custom_recipe like "Cheese, Hawaii"  
    menu.csv is for storing the menu information for different pizzas, drinks and extra toppings  
    custom_recipe is for custom pizza type with file name be the new pizza type name, content is the default toppings  
    Both of the files support editing directly, any changes will be reflected by our application  
    

- Code Craftsmanship  
    We try our best to follow the clean coding requirements. 
    We also use SonarLint to help us find improper coding. 

- Instruction  
    Direct execute the main function in PizzaParlour.
    Strict follow the prompt in command line.  
    (note: case insensitive)  
    here is a sample step flow:

#
Welcome to 301 Pizza!:   
Please choose your service 1-new order or 2-current order  
>1 

Would you like to order in, or make a delivery order?: (type 'order in' or 'delivery')  
>delivery

Here is our menu:    
small margherita 6.0  
chicken 2.0  
....  

Please choose one of the following type of piazza or type # if enough: [Pepperoni] [Margherita] [Vegetarian] [Neapolitan] [Custom]   
>custom 

Please choose one of the following CUSTOM pizzas: [Cheese] [Hawaii]   
>cheese

Please choose one of the following size: Small Medium Large   
>medium 

Please choose one of the following toppings or type # if enough [Olives] [Tomatoes] [Mushrooms] [Jalapenos] [Chicken] [Beef] [Pepperon]   
>olives

Please choose one of the following toppings or type # if enough [Olives] [Tomatoes] [Mushrooms] [Jalapenos] [Chicken] [Beef] [Pepperon]   
>\# 

make preparation for cheese  
Please choose one of the following type of piazza or type # if enough: [Pepperoni] [Margherita] [Vegetarian] [Neapolitan] [Custom]   
>\#

Please choose one of the following drinks or type # if enough [Coke] [Diet Coke] [Coke Zero] [Pepsi] [Diet Pepsi] [Dr. Pepper] [Water] [Juice]   
>diet coke 

Please choose one of the following drinks or type # if enough [Coke] [Diet Coke] [Coke Zero] [Pepsi] [Diet Pepsi] [Dr. Pepper] [Water] [Juice]   
>\# 

Here is the detail of your order: {orderNumber=1, pizzas=[Pizza{type=cheese, size=Medium, toppings =Olives Tomatoes Olives } ], drinks=Diet Coke }  
The total price is 9.0  
Please choose one of the following delivery method[Pickup] [Store Delivery] [Uber Eats] [Foodora]   
>Uber eats

Please enter your address  
>10 stgeorge

Uber Eats - get delivery detail in JSON:   
{  
Address:10 stgeorge,   
Order Details: {orderNumber=1, pizzas=[Pizza{type=cheese, size=Medium, toppings =Olives Tomatoes Olives } ], drinks=Diet Coke },   
Order Number: 1  
}  
Thank you, we will delivery your order to you  
Order finished! press 1 to back to main page, other keys to   exit  


 



