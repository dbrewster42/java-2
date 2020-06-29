1. Prevent the Meal Class from allowing multiples of the SAME item from being added to it.
//will put if statement inside the addSide() method of Meal, checking to see if side already exists(other items already done)

2. There should be limits for Toppings (ex: pickles x1 or extra pickles x2 allowed, but not pickles x3, pickles x4, etc.)
///every time I add a topping I will have to loop through the ArrayList of existing toppings and see if it exists, then if it does, I will have to start an inner loop and make sure it doesn't exist a second time.

3. Prevent the bread, meat, side, topping and meal classes from being instantiated or modified in the Main.main() method. The only class that should be instantiated is the order class. 
///everything but the meal class is done but my Main is doing the job of what Order is supposed to (aka encapsulating the rest of the classes). I feel confident in my ability to do this, but I think it will be alot of work to fix this, I will probably leave as is

4. should only allow "healthy" topping choices (no bacon, no cheese, etc.)
// will add boolean field to Toppings and then HealthyBurger type will only be able to add if the topping boolean is True.
// this is the biggest issue 