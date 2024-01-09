Question 1
What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?
Think about the method calls in main 
- does trimToSize() exist in LinkedList?
- Should Main know about what concrete type of List Storage provides?

Programmet skulle krascha eftersom trimToSize() inte finns i linked list. 
Lösningen bör vara att använda sig av List interfacet som både Linked List och ArrayList implementerar, 
samt att vårat main inte bör veta vilken typ av lista som används. Dvs main får bara kalla på metoder från 
List-interfacet, inte några specifika LinkedList- eller ArrayList-funktioner.

