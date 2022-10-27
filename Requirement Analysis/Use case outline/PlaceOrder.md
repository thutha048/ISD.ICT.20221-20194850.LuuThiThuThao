Basic flow of the event:
1. Software calls the use case "View cart"
2. Customer request to place an order in the cart view
3. Software checks if the ordered quantity is greater than the quantity in inventory
4. Customer updates and submits the delivery information and delivery instructions (if need be)
5. Software validates customer input
6. Software checks if customer has chosen to place a rush order
7. Software calculates shipping fees 
8. Software displays the invoice
9. Customer confirms the invoice
10. Software saves the order payment
11. Software proceeds to the order payment. Call the Use case "Pay Order"


Alternative flow of the event:
3.1. If the condition is not satisfied, Software asks customer must update the cart and shows the available quantity for each of those products.
Return to step 2
4.1. If customer chooses to place a rush order, insert use case "Place rush order", then go to step 7
5.1. If a mandatory field is left blank or there exists invalid input, return to step 4
6.1. If customer has chosen to place a rush order, software changes the formula to calculate the shipping fees, the resume at step 7.