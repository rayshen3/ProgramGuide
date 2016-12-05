#couding:utf-8
#!/usr/bin/env python
#2013-05-15
#
#multithread test
from time import sleep
import time
import thread


def testone(sec):
    print "testone is start at %s" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
    for i in xrange(sec):
        print "The testone: %d times" %(i+1)
        sleep(1)
    print "testone is end at %s" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))

def testtwo(sec):
    print "testtwo is start at %s" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
    for i in xrange(sec):
        print "The testtwo: %d times" %(i+1)
        sleep(1)
    print "testtwo is end at %s" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))

def main():
    print "==============Process start at %s =============\n" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
    thread.start_new_thread(testone,(3,))
    thread.start_new_thread(testtwo,(3,))
    sleep(6)
    print "\n==============Process end at %s ==============" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))

if(__name__ == '__main__'):
    main()
