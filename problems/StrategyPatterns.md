#DesignPatterns
--
are the principles for Object Oriented Programming, with their help we are able to design manageable, reusable, scalable
systems

##Strategy design patterns
-- 

1. Let's say we have a Vehicle system in which out base class is Vehicle and we have multiple derived classes SportsCar
   and Truck and OffRoadingVehicle.
2. now there's method drive in our base class implementing normal drive.
3. but in the derived classes we have to implement the drive method in a different way.
4. this driving mode needs to be overridden by sports car and offroading vehicle because they want special type of
   driving. which is same for both, also imagine some other vehicles are coming in future which also needs to implement
   special type or there is another method in vehicle which in future will be overridden by multiple classes and few of
   them will be implementing that in same manner. This will lead duplicate of code at multiple locations.

##Solution
--

1. Lets extract this method into a separate class and implement the drive method in that new drive interface.
2. This will create a has a relationship between the Vehicle and the new Interface. Now we can extend this drive
   interface to multiple classes and
   implement the drive method in that class. As NormalDrive, SportsCarDrive and OffRoadingDrive etc.
3. This will overcome our issue of code duplication where earlier multiple child classes were implementing the same
   method instead of using paren class method. Otherwise code duplicate would have kept on increasing as more and more.
