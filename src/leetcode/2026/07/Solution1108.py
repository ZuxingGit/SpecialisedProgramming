class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """
        return address.replace('.', '[.]')
    
# Test case
solution = Solution()
# Example test case
address = "1.1.1.1"
print(solution.defangIPaddr(address))

address = "255.100.50.0"
print(solution.defangIPaddr(address))