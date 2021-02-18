import random

reorderPoint = 10
reorderQuantity = 100
stock = 200
noOfDays = 180
totalCost = 0
dueDate = None
orderDelay = 3
orderCost = 75
# flag
orderPlaced = False


for day in range(noOfDays):
    # variables
    today = day+1
    todaysDemand = random.randint(0,99)
    
    # checking if any order would be recieved today
    if(today == dueDate):
        stock += reorderQuantity
        orderPlaced = False
        dueDate = None

    #shortage and reorder
    if((todaysDemand > stock)) :
        totalCost += (todaysDemand - stock)*18
        stock = 0
        # cost for reordering

    # selling
    if (stock >= todaysDemand):
        stock -= todaysDemand
        # cost for storing
        totalCost += stock

    # reordering stock
    if(stock < reorderPoint and orderPlaced == False):
        dueDate = today + orderDelay 
        orderPlaced = True
        totalCost += reorderQuantity*orderCost

    print("Day-- ",today,"\n","    todaysDemand: ",todaysDemand,"stock: ",stock, "    total Cost: ", totalCost , "    dueDate" , dueDate,"\n")    
  
     


    


