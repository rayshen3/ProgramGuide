#!/usr/bin/env python
# -*- coding: utf-8 -*-
#socket server

import socket
import datetime

now = datetime.datetime.now()
def main(port,ipaddr):
		serversock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		serversock.bind((ipaddr,port))
		serversock.listen(5)
		while True:
			try:
				print "Waiting For ChouChou coming ..."
				Connect,Ipadd = serversock.accept()
				print '...  Connected from:', ipaddr+':'+str(port)
				Connect.settimeout(500)
				buf = Connect.recv(1024)
				receive = buf
				if(str.isupper(receive)):
					result = str.lower(receive)
				elif(str.islower(receive)):
					result = str.upper(receive)
				elif(isinstance(int(receive),int)):
					result = 'Error: Please input str... The '+str(receive)+' is int'
				else:
					result = 'Error: Only Can Use Str Type, Please Retry.....'
			except Exception, e:
				result = e

			Connect.send('The Result is: %s' %(result))
			Connect.close()
			print '...  This Connection Is End'




if("__main__" == __name__):
	main(2000,"192.168.45.70")
