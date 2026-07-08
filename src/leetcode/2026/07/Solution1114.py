import threading


class Foo(object):
    def __init__(self):
        # second() waits on _first_done, third() waits on _second_done.
        self._first_done = threading.Semaphore(0)
        self._second_done = threading.Semaphore(0)


    def first(self, printFirst):
        """
        :type printFirst: method
        :rtype: void
        """
        
        # printFirst() outputs "first". Do not change or remove this line.
        printFirst()
        self._first_done.release()


    def second(self, printSecond):
        """
        :type printSecond: method
        :rtype: void
        """
        self._first_done.acquire()
        # printSecond() outputs "second". Do not change or remove this line.
        printSecond()
        self._second_done.release()
            
            
    def third(self, printThird):
        """
        :type printThird: method
        :rtype: void
        """
        self._second_done.acquire()
        # printThird() outputs "third". Do not change or remove this line.
        printThird()

if __name__ == "__main__":
    foo = Foo()

    t1 = threading.Thread(target=foo.first, args=(lambda: print("first"),))
    t2 = threading.Thread(target=foo.second, args=(lambda: print("second"),))
    t3 = threading.Thread(target=foo.third, args=(lambda: print("third"),))

    # Start in intentionally wrong order; output still remains first-second-third.
    t2.start()
    t3.start()
    t1.start()

    t1.join()
    t2.join()
    t3.join()

