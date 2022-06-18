
import csv

#Create a class
class Item:
    pay_rate = 0.8
    all = []
    def __init__(self, name: str,price: float,quantity: float):
        #print(f"An instance created: {name}")
        # Run validation to the received arguments
        assert price >=0
        assert quantity >=0

        #Assign to self object
        self.name = name
        self.price = price
        self.quantity = quantity

        #Actions to execute
       # Item.all.append(self)
    

    def calculate_total_price(self):
        return self.price * self.quantity
    def apply_discount(self):
        self.price = self.price * self.pay_rate
    @classmethod    
    def instantiate_from_csv(cls):
        with open('data.csv', 'r') as f:
            reader = csv.DictReader(f)
         #convert to list
            items=list(reader)

        for item in items:
           
            Item(
                name=str(item.get('name')),
                price=float(item.get('price')),
                quantity=int(item.get('quantity')),
            )
           

    def __repr__(self):
        return f"Item('{self.name}',{self.price},{self.quantity})"


#print(Item.all)

Item.instantiate_from_csv()
print(Item.all)