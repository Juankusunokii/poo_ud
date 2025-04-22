
"""
This file has an example of a Scientific Calculator file.

"""
import math
class calc:
    
    def __init__(self):
        self.memory = 0.0

    def square (self, a1:float) -> float:
        """This method makes an squared to a number.
        
        Args:
            a1(float):The number which gonna be squared
           
        Returns:
            the number squared
        """
        return a1 ** 2
    
    def raiz (self, a1:float)-> float:
        """This method makes an square root to a number.
        
        Args:
            a1(float):The number which gonna be square root
           
        Returns:
            the number squared
        """
        return math.sqrt(a1)
