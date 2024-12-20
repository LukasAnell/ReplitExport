from collections import deque
import numpy as np 


message=input("Write a message:")

wordqueue=message.split()
queue=deque(wordqueue)
print(wordqueue)


for i in range(1):
  temp=wordqueue.pop(0) #store the removed item in the temporary variable 'temp'
print(wordqueue)
print(temp)


display = np.chararray((4,10)) #create a 2d array that is to store the letters in the words from the queue
display[:] = '*'
display

print(display)
display[0, 0] = temp #add the word from the temp variable to fill the array (each character in each sequential position in the array)
print(display)



  


