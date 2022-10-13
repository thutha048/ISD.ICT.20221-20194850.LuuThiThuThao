Basic flow of the event:
1. Customer chooses place a rush order 
2. Software checks if there is media and the shipping address that are supported to place rush order
3. Software displays the screen for rush order if the shipping address and some media support placing rush order
4. Customer updates rush order info 
5. Software checks if the input of rush order info is valid
6. Software changes the formula to calculate the shipping fees if the input is valid


Alternative flow of the event:
3.1. If there is no support either from any media or address, Software notifies the customer
    3.1.1. Customer updates delivery information, goes to step 1
6.1. If the input is invalid, return to step 4